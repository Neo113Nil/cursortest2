package com.ybsdk.feature.main.internal.screens.products.transitions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import androidx.transition.TransitionValues;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/ybsdk/feature/main/internal/screens/products/transitions/UpliftProductReturnTransition$createAnimator$1$2", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "onAnimationCancel", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpliftProductReturnTransition$createAnimator$1$2 extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup $sceneRoot;
    final /* synthetic */ TransitionValues $startValues;

    public UpliftProductReturnTransition$createAnimator$1$2(ViewGroup viewGroup, TransitionValues transitionValues) {
        this.$sceneRoot = viewGroup;
        this.$startValues = transitionValues;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        ViewGroupOverlay overlay;
        super.onAnimationCancel(animation);
        ViewParent parent = this.$sceneRoot.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (overlay = viewGroup.getOverlay()) == null) {
            return;
        }
        overlay.remove(this.$startValues.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        ViewGroupOverlay overlay;
        ViewParent parent = this.$sceneRoot.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (overlay = viewGroup.getOverlay()) == null) {
            return;
        }
        overlay.remove(this.$startValues.b);
    }
}
