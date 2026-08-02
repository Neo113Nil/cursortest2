package xsna;

import android.animation.Animator;

/* compiled from: FadeAnimationDelegate.kt */
/* loaded from: classes4.dex */
public final class diq implements Animator.AnimatorListener {
    public final /* synthetic */ eiq b;

    public diq(eiq eiqVar) {
        this.b = eiqVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eiq eiqVar = this.b;
        gzs<s3q0> gzsVar = eiqVar.c;
        if (gzsVar != null) {
            eiqVar.a.setVisibility(4);
            gzsVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        eiq eiqVar = this.b;
        gzs<s3q0> gzsVar = eiqVar.d;
        if (gzsVar != null) {
            eiqVar.a.setVisibility(0);
            gzsVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
