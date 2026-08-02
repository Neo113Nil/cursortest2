package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes15.dex */
public class KeyboardAwareEmojiEditText extends AppCompatEditText {
    private final InputMethodManager mInputMethodManager;
    private boolean mKeyboardRequested;

    public KeyboardAwareEmojiEditText(Context context) {
        super(context);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        this.mKeyboardRequested = false;
    }

    private void openKeyboardIfRequested() {
        if (this.mKeyboardRequested && hasFocus() && hasWindowFocus()) {
            this.mInputMethodManager.showSoftInput(this, 1);
            this.mKeyboardRequested = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        openKeyboardIfRequested();
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        openKeyboardIfRequested();
    }

    public void requestFocusAndOpenKeyboard() {
        if (requestFocus()) {
            this.mKeyboardRequested = true;
            openKeyboardIfRequested();
        }
    }

    public KeyboardAwareEmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        this.mKeyboardRequested = false;
    }

    public KeyboardAwareEmojiEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        this.mKeyboardRequested = false;
    }
}
