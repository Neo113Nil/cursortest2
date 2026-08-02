package com.ybsdk.core.design.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.Fragment;
import com.ybsdk.core.design.widget.ModalView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.ce0;
import defpackage.hc;
import defpackage.m6;
import defpackage.wd2;
import defpackage.yi;

/* loaded from: classes2.dex */
public class AnimUtils {

    public static class AnimationStartEndListener extends AnimatorListenerAdapter {
        private final Runnable onAnimationEnd;
        private final Runnable onAnimationStart;

        public AnimationStartEndListener(Runnable runnable, Runnable runnable2) {
            this.onAnimationStart = runnable;
            this.onAnimationEnd = runnable2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.onAnimationEnd.run();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.onAnimationEnd.run();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.onAnimationStart.run();
        }
    }

    public static ViewPropertyAnimator a(float f, View view) {
        view.animate().cancel();
        return view.animate().alpha(f).setDuration(200L);
    }

    public static void b(ModalView modalView, int i, int i2, long j) {
        int color = modalView.getContext().getColor(i);
        int color2 = modalView.getContext().getColor(i2);
        m6 m6Var = new m6(7, modalView);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2));
        ofObject.setDuration(j);
        ofObject.setStartDelay(0L);
        ofObject.addUpdateListener(new yi(2, m6Var));
        ofObject.start();
    }

    public static ValueAnimator c(int i, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getHeight(), i);
        ofInt.addUpdateListener(new wd2(view, 0));
        ofInt.setDuration(200L);
        return ofInt;
    }

    public static ViewPropertyAnimator d(float f, View view) {
        return view.animate().translationY(f).setDuration(200L);
    }

    public static ValueAnimator e(YbButtonView ybButtonView, int i) {
        ybButtonView.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(ybButtonView.getWidth(), i);
        ofInt.addUpdateListener(new yi(1, ybButtonView));
        ofInt.setDuration(200L);
        return ofInt;
    }

    public static ViewPropertyAnimator f(View view) {
        return a(1.0f, view);
    }

    public static ViewPropertyAnimator g(View view) {
        view.animate().cancel();
        view.setVisibility(0);
        return a(1.0f, view);
    }

    public static ViewPropertyAnimator h(View view, Fragment fragment, Runnable runnable) {
        return a(0.0f, view).withEndAction(new hc(18, fragment, runnable));
    }

    public static ViewPropertyAnimator i(View view, BaseMvvmFragment baseMvvmFragment) {
        return h(view, baseMvvmFragment, new ce0(view, 3));
    }
}
