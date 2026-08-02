package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class o0f0 implements Animator.AnimatorListener {
    public final /* synthetic */ kg b;

    public o0f0(kg kgVar) {
        this.b = kgVar;
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
