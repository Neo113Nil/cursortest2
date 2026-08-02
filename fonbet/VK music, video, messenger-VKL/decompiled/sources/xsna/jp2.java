package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: Animator.kt */
/* loaded from: classes8.dex */
public final class jp2 implements Animator.AnimatorListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ l2u0 c;

    public jp2(View view, l2u0 l2u0Var) {
        this.b = view;
        this.c = l2u0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.b;
        view.setAlpha(1.0f);
        view.setVisibility(this.c.isVisible() ? 0 : 8);
        view.setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
