package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: AnimationExt.kt */
/* loaded from: classes17.dex */
public final class ap2 extends AnimatorListenerAdapter {
    public final /* synthetic */ ValueAnimator b;
    public final /* synthetic */ gzs<s3q0> c;

    public ap2(ValueAnimator valueAnimator, gzs<s3q0> gzsVar) {
        this.b = valueAnimator;
        this.c = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.removeListener(this);
        this.c.invoke();
    }
}
