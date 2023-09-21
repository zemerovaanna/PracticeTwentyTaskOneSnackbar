package com.bignerdranch.android.snackbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var snackbar: Snackbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click(view: View) {
        snackbar = Snackbar.make(view,"Вы нажали кнопку", Snackbar.LENGTH_LONG)
        snackbar.setAction("Next...",View.OnClickListener{
               Toast.makeText(this,"Здравствуйте", Toast.LENGTH_LONG).show()
        }).show()
    }
}