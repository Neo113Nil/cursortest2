package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes8.dex */
public final class gft0 implements Animator.AnimatorListener {
    public final /* synthetic */ eft0 b;

    public gft0(eft0 eft0Var) {
        this.b = eft0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invoke();
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
