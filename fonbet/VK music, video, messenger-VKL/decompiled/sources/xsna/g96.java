package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class g96 extends AnimatorListenerAdapter {
    public final /* synthetic */ b96 b;

    public g96(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a.setEditorTouchesEnabled(true);
    }
}
