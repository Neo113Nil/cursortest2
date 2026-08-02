package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes8.dex */
public final class ip2 implements Animator.AnimatorListener {
    public final /* synthetic */ lp2 b;

    public ip2(lp2 lp2Var) {
        this.b = lp2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f = null;
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
