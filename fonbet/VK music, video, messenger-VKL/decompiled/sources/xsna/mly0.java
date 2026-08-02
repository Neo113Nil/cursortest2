package xsna;

import android.animation.Animator;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mly0 implements Animator.AnimatorListener {
    public final /* synthetic */ lly0 b;

    public mly0(lly0 lly0Var) {
        this.b = lly0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lly0 lly0Var = this.b;
        if (lly0Var.e.isEnabled()) {
            lly0Var.e.setVisibility(8);
        }
        if (lly0Var.h.isEnabled()) {
            lly0Var.h.setVisibility(8);
        }
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
