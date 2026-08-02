package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DefaultViewerScreenViewDelegate.kt */
/* loaded from: classes15.dex */
public final class krl extends AnimatorListenerAdapter {
    public final /* synthetic */ js2 b;

    public krl(js2 js2Var) {
        this.b = js2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.run();
    }
}
