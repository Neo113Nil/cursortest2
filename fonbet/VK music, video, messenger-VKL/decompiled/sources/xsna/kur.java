package xsna;

import android.animation.Animator;

/* compiled from: FlowerView.kt */
/* loaded from: classes18.dex */
public final class kur implements Animator.AnimatorListener {
    public final /* synthetic */ lur b;

    public kur(lur lurVar) {
        this.b = lurVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.l0();
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
