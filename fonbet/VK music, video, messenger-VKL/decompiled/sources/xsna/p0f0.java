package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class p0f0 implements Animator.AnimatorListener {
    public final /* synthetic */ m0f0 b;

    public p0f0(m0f0 m0f0Var) {
        this.b = m0f0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.n = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
