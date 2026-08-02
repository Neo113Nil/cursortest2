package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class ir50 implements Animator.AnimatorListener {
    public final /* synthetic */ fr50 b;
    public final /* synthetic */ int c;

    public ir50(fr50 fr50Var, int i) {
        this.b = fr50Var;
        this.c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.L = this.c;
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
