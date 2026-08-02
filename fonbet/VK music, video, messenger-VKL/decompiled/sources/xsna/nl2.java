package xsna;

import android.animation.Animator;

/* compiled from: AnimatedSharingControlView.kt */
/* loaded from: classes5.dex */
public final class nl2 implements Animator.AnimatorListener {
    public final /* synthetic */ gzs<s3q0> b;
    public final /* synthetic */ gzs<s3q0> c;

    public nl2(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.b = gzsVar;
        this.c = gzsVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
