package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimationExt.kt */
/* loaded from: classes17.dex */
public final class bp2 extends AnimatorListenerAdapter {
    public final /* synthetic */ gzs<s3q0> b;

    public bp2(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.invoke();
    }
}
