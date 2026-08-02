package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class z86 extends AnimatorListenerAdapter {
    public final /* synthetic */ b96 b;

    public z86(b96 b96Var) {
        this.b = b96Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b96 b96Var = this.b;
        b96Var.a.setStickersViewTouchesEnabled(true);
        b96Var.a.W(true, false);
    }
}
