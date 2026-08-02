package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes13.dex */
public final class zdc extends AnimatorListenerAdapter {
    public final /* synthetic */ cec b;

    public zdc(cec cecVar) {
        this.b = cecVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a();
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b();
        throw null;
    }
}
