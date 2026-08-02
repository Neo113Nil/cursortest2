package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: StoryUploadAnimationPulse.kt */
/* loaded from: classes6.dex */
public final class bkm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ckm0 b;

    public bkm0(ckm0 ckm0Var) {
        this.b = ckm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.b.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.b.c.onStart();
    }
}
