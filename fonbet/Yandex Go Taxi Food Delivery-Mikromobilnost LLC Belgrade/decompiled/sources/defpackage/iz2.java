package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.gz2;
import defpackage.iz2;

/* loaded from: classes9.dex */
public class iz2 {
    public int a;
    public ObjectAnimator b;

    public final void a() {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.b = null;
    }

    public final void b(Animator.AnimatorListener animatorListener) {
        if (animatorListener == null) {
            return;
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            animatorListener.onAnimationStart(valueAnimator);
            animatorListener.onAnimationEnd(valueAnimator);
            return;
        }
        objectAnimator.addListener(animatorListener);
        if (objectAnimator.isStarted()) {
            animatorListener.onAnimationStart(objectAnimator);
        } else {
            if (objectAnimator.isRunning()) {
                return;
            }
            animatorListener.onAnimationEnd(objectAnimator);
        }
    }

    public final void c(gz2 gz2Var, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator;
        final ez2 ez2Var = (ez2) gz2Var;
        View view = ez2Var.a;
        View view2 = ez2Var.a;
        boolean z = view.getVisibility() == 0;
        int i = this.a;
        if (!z ? i == 2 : i != 1) {
            b(animatorListener);
            return;
        }
        a();
        if (!view2.isAttachedToWindow() || !view2.isLaidOut() || view2.isInEditMode()) {
            ez2Var.a();
            b(animatorListener);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, CaretView.ALPHA_PROPERTY, 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        this.b = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.animation.AppearAnimationHelper$hide$1
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                iz2 iz2Var = this;
                iz2Var.b = null;
                iz2Var.a = 0;
                if (this.cancelled) {
                    return;
                }
                gz2.this.a();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                gz2.this.b();
                this.a = 1;
            }
        });
        if (animatorListener != null && (objectAnimator = this.b) != null) {
            objectAnimator.addListener(animatorListener);
        }
        ObjectAnimator objectAnimator2 = this.b;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    public final void d(gz2 gz2Var, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator;
        final ez2 ez2Var = (ez2) gz2Var;
        View view = ez2Var.a;
        View view2 = ez2Var.a;
        boolean z = view.getVisibility() == 0;
        int i = this.a;
        if (!z ? i != 2 : i == 1 || view2.getAlpha() <= 0.9f) {
            b(animatorListener);
            return;
        }
        a();
        if (!view2.isAttachedToWindow() || !view2.isLaidOut() || view2.isInEditMode()) {
            ez2Var.b();
            view2.setAlpha(1.0f);
            b(animatorListener);
            return;
        }
        if (view2.getVisibility() != 0) {
            view2.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, CaretView.ALPHA_PROPERTY, 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        this.b = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.animation.AppearAnimationHelper$show$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                iz2 iz2Var = this;
                iz2Var.b = null;
                iz2Var.a = 0;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                gz2.this.b();
                this.a = 2;
            }
        });
        if (animatorListener != null && (objectAnimator = this.b) != null) {
            objectAnimator.addListener(animatorListener);
        }
        ObjectAnimator objectAnimator2 = this.b;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }
}
