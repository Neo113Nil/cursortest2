package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import defpackage.g561;

/* loaded from: classes3.dex */
public final /* synthetic */ class p8m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g561 b;

    public /* synthetic */ p8m(g561 g561Var, int i) {
        this.a = i;
        this.b = g561Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        final g561 g561Var = this.b;
        switch (i) {
            case 0:
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelper$hideOnboarding$lambda$7$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ((LinearLayout) g561.this.d.b).setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            case 1:
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelper$hideOnboarding$lambda$9$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        g561.this.b.setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            case 2:
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelper$hideOnboarding$lambda$11$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ((LinearLayout) g561.this.c.c).setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            case 3:
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelperV2$hideOnboarding$lambda$7$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ((LinearLayout) g561.this.d.b).setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            case 4:
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelperV2$hideOnboarding$lambda$9$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        g561.this.b.setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            default:
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelperV2$hideOnboarding$lambda$11$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ((LinearLayout) g561.this.e.c).setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
        }
    }
}
