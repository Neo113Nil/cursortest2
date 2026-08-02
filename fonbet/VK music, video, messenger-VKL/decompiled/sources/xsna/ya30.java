package xsna;

import android.animation.Animator;

/* compiled from: MotionLayoutScene.kt */
/* loaded from: classes7.dex */
public final class ya30 implements Animator.AnimatorListener {
    public final /* synthetic */ gzs<s3q0> b;

    public ya30(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
