package xsna;

import android.animation.Animator;
import xsna.rf0;

/* compiled from: AdFooterHolderV3.kt */
/* loaded from: classes4.dex */
public final class sf0 implements Animator.AnimatorListener {
    public final /* synthetic */ rf0 b;
    public final /* synthetic */ int c;

    public sf0(rf0 rf0Var, int i) {
        this.b = rf0Var;
        this.c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rf0.a aVar = rf0.a.ACTIVE;
        rf0 rf0Var = this.b;
        rf0Var.L = aVar;
        rf0Var.R6().setWithDivider(false);
        rf0Var.T6(this.c);
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
