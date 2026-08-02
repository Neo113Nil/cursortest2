package xsna;

import android.animation.Animator;
import android.view.View;

/* compiled from: Animator.kt */
/* loaded from: classes8.dex */
public final class kp2 implements Animator.AnimatorListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public kp2(View view, float f) {
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f = this.c;
        View view = this.b;
        view.setAlpha(f);
        view.setVisibility(0);
        view.setEnabled(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
