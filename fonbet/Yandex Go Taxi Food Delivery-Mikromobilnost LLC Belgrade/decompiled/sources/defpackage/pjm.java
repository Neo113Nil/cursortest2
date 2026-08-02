package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import defpackage.pjm;

/* loaded from: classes14.dex */
public final class pjm {
    public final sue0 a;

    public pjm(sue0 sue0Var) {
        this.a = sue0Var;
    }

    public final ValueAnimator a(float f) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(new PathInterpolator(0.4f, -0.4f, 0.4f, 1.1f));
        valueAnimator.addUpdateListener(new mjm(this, f, 0));
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.DriverSectionAnimator$getCollapseAndFadeOutAnimator$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((RideCardDriverSectionView) pjm.this.a.b).setTargetHeight(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return valueAnimator;
    }

    public final ValueAnimator b(float f) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(new PathInterpolator(0.6f, -0.1f, 0.6f, 1.4f));
        valueAnimator.addUpdateListener(new mjm(this, f, 1));
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.DriverSectionAnimator$getExpandAndFadeInAnimator$lambda$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ((RideCardDriverSectionView) pjm.this.a.b).callLayoutInContentAnimations = false;
            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.DriverSectionAnimator$getExpandAndFadeInAnimator$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((RideCardDriverSectionView) pjm.this.a.b).callLayoutInContentAnimations = true;
                ((RideCardDriverSectionView) pjm.this.a.b).setTargetHeight(null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return valueAnimator;
    }

    public final ojm c(float f, float f2, sls slsVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator a = a(f);
        ValueAnimator b = b(f2);
        cn91.g(new t8j(10, slsVar, this), b);
        animatorSet.playSequentially(a, b);
        return new ojm(animatorSet);
    }
}
