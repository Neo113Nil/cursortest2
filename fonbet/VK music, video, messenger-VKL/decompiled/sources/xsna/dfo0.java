package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class dfo0 implements Animator.AnimatorListener {
    public final /* synthetic */ gzs b;

    public dfo0(gzs gzsVar) {
        this.b = gzsVar;
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
