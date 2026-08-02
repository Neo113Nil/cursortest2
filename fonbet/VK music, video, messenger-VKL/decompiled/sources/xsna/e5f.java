package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimExt.kt */
/* loaded from: classes5.dex */
public final class e5f extends AnimatorListenerAdapter {
    public final /* synthetic */ f5f b;
    public final /* synthetic */ uru c;

    public e5f(f5f f5fVar, uru uruVar) {
        this.b = f5fVar;
        this.c = uruVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a.invalidate();
        this.c.b = null;
    }
}
