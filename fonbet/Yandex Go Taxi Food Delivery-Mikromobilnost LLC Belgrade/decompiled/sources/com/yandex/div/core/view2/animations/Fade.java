package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import defpackage.lx80;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;

/* loaded from: classes11.dex */
public final class Fade extends lx80 {
    public final float j0;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/animations/Fade$FadeAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/view/View;", "view", "", "nonTransitionAlpha", "<init>", "(Landroid/view/View;F)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "Landroid/view/View;", "F", "", "isLayerTypeChanged", "Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FadeAnimatorListener extends AnimatorListenerAdapter {
        private boolean isLayerTypeChanged;
        private final float nonTransitionAlpha;
        private final View view;

        public FadeAnimatorListener(View view, float f) {
            this.view = view;
            this.nonTransitionAlpha = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.view.setAlpha(this.nonTransitionAlpha);
            if (this.isLayerTypeChanged) {
                this.view.setLayerType(0, null);
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.view.setVisibility(0);
            if (this.view.hasOverlappingRendering() && this.view.getLayerType() == 0) {
                this.isLayerTypeChanged = true;
                this.view.setLayerType(2, null);
            }
        }
    }

    public Fade(float f) {
        this.j0 = f;
    }

    public static ObjectAnimator e0(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        float alpha = view.getAlpha();
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        ofFloat.addListener(new FadeAnimatorListener(view, alpha));
        return ofFloat;
    }

    public static float f0(TransitionValues transitionValues, float f) {
        HashMap hashMap;
        Object obj = (transitionValues == null || (hashMap = transitionValues.a) == null) ? null : hashMap.get("yandex:fade:alpha");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // androidx.transition.Visibility
    public final Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return e0(f0(transitionValues, this.j0), f0(transitionValues2, 1.0f), i.a(view, viewGroup, this, (int[]) transitionValues2.a.get("yandex:fade:screenPosition")));
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return e0(f0(transitionValues, 1.0f), f0(transitionValues2, this.j0), h.c(this, view, viewGroup, transitionValues, "yandex:fade:screenPosition"));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void f(final TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        HashMap hashMap = transitionValues.a;
        int i = this.h0;
        if (i == 1) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(transitionValues.b.getAlpha()));
        } else if (i == 2) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(this.j0));
        }
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.Fade$captureEndValues$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:fade:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(final TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        HashMap hashMap = transitionValues.a;
        int i = this.h0;
        if (i == 1) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(this.j0));
        } else if (i == 2) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(transitionValues.b.getAlpha()));
        }
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.Fade$captureStartValues$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:fade:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    public Fade() {
        this(0.0f);
    }
}
