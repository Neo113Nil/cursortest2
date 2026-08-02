package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class hdc extends AnimatorListenerAdapter {
    public final /* synthetic */ jdc b;

    public hdc(jdc jdcVar) {
        this.b = jdcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        jdc jdcVar = this.b;
        jdcVar.g = (jdcVar.g + 4) % jdcVar.f.c.length;
    }
}
