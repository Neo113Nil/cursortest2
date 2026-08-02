package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: AnimExt.kt */
/* loaded from: classes17.dex */
public final class hje extends AnimatorListenerAdapter {
    public final /* synthetic */ ValueAnimator b;
    public final /* synthetic */ gje c;

    public hje(ValueAnimator valueAnimator, gje gjeVar) {
        this.b = valueAnimator;
        this.c = gjeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.isRunning()) {
            return;
        }
        this.c.b.invoke();
    }
}
