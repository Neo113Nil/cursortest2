package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: HeaderController.kt */
/* loaded from: classes16.dex */
public final class kwu extends AnimatorListenerAdapter {
    public final /* synthetic */ lwu b;
    public final /* synthetic */ gzs<s3q0> c;

    public kwu(lwu lwuVar, gzs gzsVar) {
        this.b = lwuVar;
        this.c = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        lwu lwuVar = this.b;
        lwuVar.g.setAlpha(1.0f);
        lwuVar.g.setScaleY(1.0f);
        lwuVar.f.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.b.l = null;
        this.c.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
