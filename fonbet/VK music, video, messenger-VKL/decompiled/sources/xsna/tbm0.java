package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class tbm0 implements Animator.AnimatorListener {
    public final /* synthetic */ izs b;

    public tbm0(izs izsVar) {
        this.b = izsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invoke(animator);
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
