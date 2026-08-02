package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: LikeAnimator.kt */
/* loaded from: classes17.dex */
public final class f6z extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;

    public f6z(View view) {
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        g6z.a.remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g6z.a.remove(this.b);
    }
}
