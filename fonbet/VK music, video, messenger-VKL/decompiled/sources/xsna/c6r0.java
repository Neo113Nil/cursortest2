package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: V.java */
/* loaded from: classes8.dex */
public final class c6r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Animator.AnimatorListener d;

    public c6r0(int i, Animator.AnimatorListener animatorListener, View view) {
        this.b = view;
        this.c = i;
        this.d = animatorListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setVisibility(this.c);
        Animator.AnimatorListener animatorListener = this.d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.c;
        View view = this.b;
        view.setVisibility(i);
        j6r0.a.remove(view);
        Animator.AnimatorListener animatorListener = this.d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.setVisibility(this.c);
        Animator.AnimatorListener animatorListener = this.d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
