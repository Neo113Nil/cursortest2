package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import defpackage.lx80;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class a extends lx80 {
    public final float j0;
    public final float k0;
    public final float l0;

    public a(float f, float f2, float f3) {
        this.j0 = f;
        this.k0 = f2;
        this.l0 = f3;
    }

    public static float f0(TransitionValues transitionValues, float f) {
        HashMap hashMap;
        Object obj = (transitionValues == null || (hashMap = transitionValues.a) == null) ? null : hashMap.get("yandex:scale:scaleX");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    public static float g0(TransitionValues transitionValues, float f) {
        HashMap hashMap;
        Object obj = (transitionValues == null || (hashMap = transitionValues.a) == null) ? null : hashMap.get("yandex:scale:scaleY");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // androidx.transition.Visibility
    public final Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        float f = this.j0;
        return e0(i.a(view, viewGroup, this, (int[]) transitionValues2.a.get("yandex:scale:screenPosition")), f0(transitionValues, f), g0(transitionValues, f), f0(transitionValues2, 1.0f), g0(transitionValues2, 1.0f));
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        float f0 = f0(transitionValues, 1.0f);
        float g0 = g0(transitionValues, 1.0f);
        float f = this.j0;
        return e0(h.c(this, view, viewGroup, transitionValues, "yandex:scale:screenPosition"), f0, g0, f0(transitionValues2, f), g0(transitionValues2, f));
    }

    public final ObjectAnimator e0(final View view, float f, float f2, float f3, float f4) {
        if (f == f3 && f2 == f4) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2, f4));
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter(view, scaleX, scaleY) { // from class: com.yandex.div.core.view2.animations.Scale$ScaleAnimatorListener
            private boolean isPivotSet;
            private final float nonTransitionScaleX;
            private final float nonTransitionScaleY;
            private final View view;

            {
                this.view = view;
                this.nonTransitionScaleX = scaleX;
                this.nonTransitionScaleY = scaleY;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                this.view.setScaleX(this.nonTransitionScaleX);
                this.view.setScaleY(this.nonTransitionScaleY);
                if (this.isPivotSet) {
                    this.view.resetPivot();
                }
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                this.view.setVisibility(0);
                a aVar = a.this;
                if (aVar.k0 == 0.5f && aVar.l0 == 0.5f) {
                    return;
                }
                this.isPivotSet = true;
                this.view.setPivotX(r3.getWidth() * a.this.k0);
                this.view.setPivotY(r3.getHeight() * a.this.l0);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void f(final TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        float scaleX = view.getScaleX();
        float scaleY = transitionValues.b.getScaleY();
        transitionValues.b.setScaleX(1.0f);
        transitionValues.b.setScaleY(1.0f);
        Visibility.X(transitionValues);
        transitionValues.b.setScaleX(scaleX);
        transitionValues.b.setScaleY(scaleY);
        Float valueOf = Float.valueOf(1.0f);
        int i = this.h0;
        if (i == 1) {
            hashMap.put("yandex:scale:scaleX", valueOf);
            hashMap.put("yandex:scale:scaleY", valueOf);
        } else if (i == 2) {
            float f = this.j0;
            hashMap.put("yandex:scale:scaleX", Float.valueOf(f));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(f));
        }
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.Scale$captureEndValues$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:scale:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(final TransitionValues transitionValues) {
        float scaleX = transitionValues.b.getScaleX();
        float scaleY = transitionValues.b.getScaleY();
        transitionValues.b.setScaleX(1.0f);
        transitionValues.b.setScaleY(1.0f);
        Visibility.X(transitionValues);
        transitionValues.b.setScaleX(scaleX);
        transitionValues.b.setScaleY(scaleY);
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        int i = this.h0;
        if (i == 1) {
            float f = this.j0;
            hashMap.put("yandex:scale:scaleX", Float.valueOf(f));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(f));
        } else if (i == 2) {
            hashMap.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.Scale$captureStartValues$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:scale:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }
}
