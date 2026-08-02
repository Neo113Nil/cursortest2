package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: AdFooterHolderV3.kt */
/* loaded from: classes4.dex */
public final class tf0 implements Animator.AnimatorListener {
    public final /* synthetic */ ValueAnimator b;

    public tf0(ValueAnimator valueAnimator) {
        this.b = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator.getStartDelay() != 1200) {
            valueAnimator.setStartDelay(1200L);
        }
        valueAnimator.start();
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
