package xsna;

import android.animation.Animator;

/* compiled from: PosterParallaxImageLayer.kt */
/* loaded from: classes4.dex */
public final class nac0 implements Animator.AnimatorListener {
    public final /* synthetic */ pac0 b;

    public nac0(pac0 pac0Var) {
        this.b = pac0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.j = null;
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
