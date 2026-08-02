package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class x86 implements Animator.AnimatorListener {
    public final /* synthetic */ b96 b;

    public x86(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b96 b96Var = this.b;
        b96Var.a.setStickersViewTouchesEnabled(true);
        b96Var.a.W(true, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
