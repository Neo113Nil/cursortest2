package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.emoji2.widget.EmojiEditText;
import defpackage.af4;
import defpackage.xe4;

/* loaded from: classes15.dex */
public class SearchEditText extends EmojiEditText {
    private final af4 mBackKeyPressedHelper;
    private final InputMethodManager mInputMethodManager;

    public SearchEditText(Context context) {
        super(context);
        this.mBackKeyPressedHelper = new af4(this);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        init();
    }

    private void dispatchFocusChanged() {
        InputMethodManager inputMethodManager;
        if (hasWindowFocus() && hasFocus() && (inputMethodManager = this.mInputMethodManager) != null) {
            inputMethodManager.showSoftInput(this, 1);
        }
    }

    private void init() {
        af4 af4Var = this.mBackKeyPressedHelper;
        getVisibility();
        af4Var.b(this);
    }

    @Override // android.widget.TextView
    public void onEditorAction(int i) {
        InputMethodManager inputMethodManager;
        super.onEditorAction(i);
        if (i != 6 || (inputMethodManager = this.mInputMethodManager) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        dispatchFocusChanged();
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.mBackKeyPressedHelper.a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.mBackKeyPressedHelper.a(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        af4 af4Var = this.mBackKeyPressedHelper;
        if (af4Var != null) {
            af4Var.b(view);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        af4 af4Var = this.mBackKeyPressedHelper;
        if (z) {
            af4Var.c();
        } else {
            af4Var.getClass();
        }
        dispatchFocusChanged();
    }

    public void setOnBackClickListener(xe4 xe4Var) {
        af4 af4Var = this.mBackKeyPressedHelper;
        af4Var.b = xe4Var;
        af4Var.c();
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBackKeyPressedHelper = new af4(this);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        init();
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBackKeyPressedHelper = new af4(this);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        init();
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mBackKeyPressedHelper = new af4(this);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        init();
    }
}
