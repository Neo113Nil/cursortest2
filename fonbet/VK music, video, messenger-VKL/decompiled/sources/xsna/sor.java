package xsna;

import android.animation.Animator;

/* compiled from: FlexLayout.kt */
/* loaded from: classes4.dex */
public final class sor implements Animator.AnimatorListener {
    public final /* synthetic */ ror b;
    public final /* synthetic */ gzs<s3q0> c;

    public sor(ror rorVar, gzs<s3q0> gzsVar) {
        this.b = rorVar;
        this.c = gzsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.q = false;
        this.c.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.q = false;
        this.c.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.q = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
