package com.yandex.alicekit.core.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.af4;
import defpackage.xe4;

/* loaded from: classes11.dex */
public class BackHandlingConstraintLayout extends ConstraintLayout {
    private final af4 mBackKeyPressedHelper;

    public BackHandlingConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        af4 af4Var = new af4(this);
        this.mBackKeyPressedHelper = af4Var;
        getVisibility();
        af4Var.b(this);
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return this.mBackKeyPressedHelper.a(i, keyEvent) || super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        af4 af4Var = this.mBackKeyPressedHelper;
        if (af4Var != null) {
            af4Var.b(view);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        af4 af4Var = this.mBackKeyPressedHelper;
        if (z) {
            af4Var.c();
        } else {
            af4Var.getClass();
        }
    }

    public void setOnBackClickListener(xe4 xe4Var) {
        af4 af4Var = this.mBackKeyPressedHelper;
        af4Var.b = xe4Var;
        af4Var.c();
    }

    public BackHandlingConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBackKeyPressedHelper = new af4(this);
    }

    public BackHandlingConstraintLayout(Context context) {
        super(context);
        this.mBackKeyPressedHelper = new af4(this);
    }
}
