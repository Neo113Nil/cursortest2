package xsna;

import android.animation.Animator;

/* compiled from: TopBottomAnimationView.kt */
/* loaded from: classes16.dex */
public final class f8p0 implements Animator.AnimatorListener {
    public final /* synthetic */ g8p0 b;

    public f8p0(g8p0 g8p0Var) {
        this.b = g8p0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        g8p0 g8p0Var = this.b;
        g8p0Var.setScaleY(g8p0Var.c);
        g8p0Var.c *= -1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
