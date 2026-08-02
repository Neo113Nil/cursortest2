package xsna;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class ubm0 implements Animator.AnimatorListener {
    public final /* synthetic */ nxt0 b;
    public final /* synthetic */ mdm c;

    public ubm0(nxt0 nxt0Var, mdm mdmVar) {
        this.b = nxt0Var;
        this.c = mdmVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(8);
        this.c.invoke(animator);
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
