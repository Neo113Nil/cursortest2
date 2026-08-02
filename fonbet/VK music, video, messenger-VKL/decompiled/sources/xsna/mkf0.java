package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class mkf0 implements Animator.AnimatorListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public mkf0(View view, View view2) {
        this.b = view;
        this.c = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(4);
        this.c.setNestedScrollingEnabled(true);
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
