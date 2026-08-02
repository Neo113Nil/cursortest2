package xsna;

import android.animation.Animator;

/* compiled from: SearchViewLoaderDelegate.kt */
/* loaded from: classes17.dex */
public final class d0i0 implements Animator.AnimatorListener {
    public final /* synthetic */ mlf0 b;

    public d0i0(mlf0 mlf0Var) {
        this.b = mlf0Var;
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
