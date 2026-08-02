package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: AnimExt.kt */
/* loaded from: classes17.dex */
public final class nje extends AnimatorListenerAdapter {
    public final /* synthetic */ ValueAnimator b;
    public final /* synthetic */ mje c;

    public nje(ValueAnimator valueAnimator, mje mjeVar) {
        this.b = valueAnimator;
        this.c = mjeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.isRunning()) {
            return;
        }
        this.c.a.invoke();
    }
}
