package xsna;

import android.animation.Animator;

/* compiled from: GeoLocationItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class wkt implements Animator.AnimatorListener {
    public final /* synthetic */ xkt b;

    public wkt(xkt xktVar) {
        this.b = xktVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xkt xktVar = this.b;
        if (xktVar.r) {
            xktVar.q.p();
        }
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
