package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import defpackage.dk2;
import defpackage.nmg0;

/* loaded from: classes11.dex */
public final class c extends a {
    public boolean g;
    public final /* synthetic */ ExtendedFloatingActionButton h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ExtendedFloatingActionButton extendedFloatingActionButton, dk2 dk2Var) {
        super(extendedFloatingActionButton, dk2Var);
        this.h = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void a() {
        this.d.a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.animState = 0;
        if (this.g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final boolean b() {
        boolean isOrWillBeHidden;
        isOrWillBeHidden = this.h.isOrWillBeHidden();
        return isOrWillBeHidden;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final int c() {
        return nmg0.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void e() {
        this.h.setVisibility(8);
    }

    @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.g
    public final void f() {
        super.f();
        this.g = true;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void onAnimationStart(Animator animator) {
        dk2 dk2Var = this.d;
        Animator animator2 = dk2Var.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        dk2Var.a = animator;
        this.g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.animState = 1;
    }
}
