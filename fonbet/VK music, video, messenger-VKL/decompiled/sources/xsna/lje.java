package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import xsna.kje;

/* compiled from: AnimExt.kt */
/* loaded from: classes17.dex */
public final class lje extends AnimatorListenerAdapter {
    public final /* synthetic */ ValueAnimator b;
    public final /* synthetic */ kje c;

    public lje(ValueAnimator valueAnimator, kje kjeVar) {
        this.b = valueAnimator;
        this.c = kjeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kje kjeVar;
        kje.a aVar;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator.isRunning() || (aVar = (kjeVar = this.c).b) == null) {
            return;
        }
        kjeVar.a(aVar);
        valueAnimator.start();
    }
}
