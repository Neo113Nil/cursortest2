package com.yandex.messaging.input.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import defpackage.zq60;

/* loaded from: classes15.dex */
public final class c {
    public final InputMethodManager a;
    public EditText c;
    public View d;
    public Keyboarder$OnGlobalLayoutListener f;
    public boolean g;
    public boolean h;
    public Keyboarder$KeyboardState b = Keyboarder$KeyboardState.CLOSED;
    public final zq60 e = new zq60();

    public c(Context context) {
        new Rect();
        this.a = (InputMethodManager) context.getSystemService("input_method");
    }

    public final void a(EditText editText, View view) {
        View view2;
        this.c = editText;
        this.d = view;
        if (this.g && this.f != null && view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
        }
        this.g = false;
        this.f = new Keyboarder$OnGlobalLayoutListener(this, view, 0);
        if (this.g || (view2 = this.d) == null) {
            return;
        }
        this.g = true;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(this.f);
    }

    public final void b() {
        View view = this.d;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
        }
        Keyboarder$OnGlobalLayoutListener keyboarder$OnGlobalLayoutListener = this.f;
        if (keyboarder$OnGlobalLayoutListener != null) {
            keyboarder$OnGlobalLayoutListener.destroy();
            this.f = null;
        }
    }
}
