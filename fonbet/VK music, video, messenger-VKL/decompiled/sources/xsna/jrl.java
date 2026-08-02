package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DefaultViewerScreenViewDelegate.kt */
/* loaded from: classes15.dex */
public final class jrl extends AnimatorListenerAdapter {
    public final /* synthetic */ ic3 b;

    public jrl(ic3 ic3Var) {
        this.b = ic3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.run();
    }
}
