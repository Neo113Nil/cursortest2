package xsna;

import android.animation.Animator;

/* compiled from: MatrixAnimationHelper.kt */
/* loaded from: classes4.dex */
public final class hn10 implements Animator.AnimatorListener {
    public final /* synthetic */ gzs<s3q0> b;

    public hn10(gzs<s3q0> gzsVar) {
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
