package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes11.dex */
public class KeyboardAwareTextInputEditText extends TextInputEditText {
    private boolean mKeyboardRequested;

    public KeyboardAwareTextInputEditText(Context context) {
        super(context);
    }

    private void openKeyboardIfRequested() {
        InputMethodManager inputMethodManager;
        if (this.mKeyboardRequested && hasFocus() && hasWindowFocus() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(this, 1);
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

    public KeyboardAwareTextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardAwareTextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
