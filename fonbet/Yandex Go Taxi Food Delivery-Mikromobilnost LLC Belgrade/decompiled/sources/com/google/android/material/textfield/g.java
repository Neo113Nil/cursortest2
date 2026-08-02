package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.wh;

/* loaded from: classes11.dex */
public abstract class g {
    public final TextInputLayout a;
    public final EndCompoundLayout b;
    public final Context c;
    public final CheckableImageButton d;

    public g(EndCompoundLayout endCompoundLayout) {
        this.a = endCompoundLayout.textInputLayout;
        this.b = endCompoundLayout;
        this.c = endCompoundLayout.getContext();
        this.d = endCompoundLayout.getEndIconView();
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof c;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(wh whVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public final void p() {
        this.b.refreshIconState(false);
    }

    public void q() {
    }

    public void r() {
    }
}
