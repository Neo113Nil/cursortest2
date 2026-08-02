package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PhotoViewer.kt */
/* loaded from: classes3.dex */
public final class aea0 extends AnimatorListenerAdapter {
    public final /* synthetic */ gzs<s3q0> b;

    public aea0(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.invoke();
    }
}
