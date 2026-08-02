package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class vbg implements Animator.AnimatorListener {
    public final /* synthetic */ ubg b;

    public vbg(ubg ubgVar) {
        this.b = ubgVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ubg ubgVar = this.b;
        ubgVar.i6().j.setScaleX(1.0f);
        ubgVar.i6().j.setScaleY(1.0f);
        ubgVar.n = null;
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
