package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: StoryViewDialog.java */
/* loaded from: classes6.dex */
public final class vlm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ulm0 b;

    public vlm0(ulm0 ulm0Var) {
        this.b = ulm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.b.invoke(null, null, null, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.b.invoke(null, null, null, null);
    }
}
