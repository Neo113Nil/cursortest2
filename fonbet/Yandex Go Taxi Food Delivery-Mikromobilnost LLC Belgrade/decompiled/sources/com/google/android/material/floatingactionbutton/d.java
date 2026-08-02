package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import defpackage.dk2;
import defpackage.nmg0;

/* loaded from: classes11.dex */
public final class d extends a {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ExtendedFloatingActionButton extendedFloatingActionButton, dk2 dk2Var) {
        super(extendedFloatingActionButton, dk2Var);
        this.g = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void a() {
        this.d.a = null;
        this.g.animState = 0;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final boolean b() {
        boolean isOrWillBeShown;
        isOrWillBeShown = this.g.isOrWillBeShown();
        return isOrWillBeShown;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final int c() {
        return nmg0.mtrl_extended_fab_show_motion_spec;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void e() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void onAnimationStart(Animator animator) {
        dk2 dk2Var = this.d;
        Animator animator2 = dk2Var.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        dk2Var.a = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.animState = 2;
    }
}
