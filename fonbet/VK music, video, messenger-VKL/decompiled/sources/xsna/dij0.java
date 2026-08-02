package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: AnimatedSubtitleView.kt */
/* loaded from: classes6.dex */
public final class dij0 extends AnimatorListenerAdapter {
    public final View b;
    public final boolean c;

    public dij0(View view, boolean z) {
        this.b = view;
        this.c = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        this.b.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.setVisibility(0);
    }
}
