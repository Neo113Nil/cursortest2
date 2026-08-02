package com.yandex.passport.common.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.kx6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/passport/common/ui/view/CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1 extends AnimatorListenerAdapter {
    final /* synthetic */ CommonSpinner $newCommonSpinner;
    final /* synthetic */ LottieAnimationView $this_apply;
    final /* synthetic */ long $visibilityDelay;

    public CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1(LottieAnimationView lottieAnimationView, long j, CommonSpinner commonSpinner) {
        this.$this_apply = lottieAnimationView;
        this.$visibilityDelay = j;
        this.$newCommonSpinner = commonSpinner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationRepeat$lambda$0(long j, CommonSpinner commonSpinner, LottieAnimationView lottieAnimationView) {
        if (j > 0) {
            commonSpinner.setVisibility(0);
        }
        commonSpinner.startAnimation();
        lottieAnimationView.cancelAnimation();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        super.onAnimationRepeat(animation);
        this.$this_apply.animate().alpha(0.0f).setDuration(500L);
        long j = this.$visibilityDelay;
        CommonSpinner commonSpinner = this.$newCommonSpinner;
        LottieAnimationView lottieAnimationView = this.$this_apply;
        final kx6 kx6Var = new kx6(j, commonSpinner, lottieAnimationView, 7);
        lottieAnimationView.postDelayed(kx6Var, j + 500);
        final LottieAnimationView lottieAnimationView2 = this.$this_apply;
        if (lottieAnimationView2.isAttachedToWindow()) {
            lottieAnimationView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.passport.common.ui.view.CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1$onAnimationRepeat$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    lottieAnimationView2.removeOnAttachStateChangeListener(this);
                    lottieAnimationView2.removeCallbacks(kx6Var);
                }
            });
        } else {
            lottieAnimationView2.removeCallbacks(kx6Var);
        }
    }
}
