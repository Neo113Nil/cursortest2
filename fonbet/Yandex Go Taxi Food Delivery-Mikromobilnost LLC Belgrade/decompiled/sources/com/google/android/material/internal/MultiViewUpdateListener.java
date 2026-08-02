package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import defpackage.ak00;
import defpackage.go40;
import java.util.Collection;

/* loaded from: classes11.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final go40 listener;
    private final View[] views;

    public MultiViewUpdateListener(go40 go40Var, Collection<View> collection) {
        this.listener = go40Var;
        this.views = (View[]) collection.toArray(new View[0]);
    }

    public static MultiViewUpdateListener alphaListener(View... viewArr) {
        return new MultiViewUpdateListener(new ak00(21), viewArr);
    }

    public static MultiViewUpdateListener scaleListener(View... viewArr) {
        return new MultiViewUpdateListener(new ak00(19), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static MultiViewUpdateListener translationXListener(View... viewArr) {
        return new MultiViewUpdateListener(new ak00(18), viewArr);
    }

    public static MultiViewUpdateListener translationYListener(View... viewArr) {
        return new MultiViewUpdateListener(new ak00(20), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.views) {
            this.listener.d(valueAnimator, view);
        }
    }

    public static MultiViewUpdateListener alphaListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new ak00(21), collection);
    }

    public static MultiViewUpdateListener scaleListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new ak00(19), collection);
    }

    public static MultiViewUpdateListener translationXListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new ak00(18), collection);
    }

    public static MultiViewUpdateListener translationYListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new ak00(20), collection);
    }

    public MultiViewUpdateListener(go40 go40Var, View... viewArr) {
        this.listener = go40Var;
        this.views = viewArr;
    }
}
