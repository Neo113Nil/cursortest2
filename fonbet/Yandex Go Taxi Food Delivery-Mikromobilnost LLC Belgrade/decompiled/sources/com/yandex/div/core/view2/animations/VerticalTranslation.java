package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import defpackage.lx80;
import defpackage.tls;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* loaded from: classes11.dex */
public final class VerticalTranslation extends lx80 {
    public final float j0;
    public final float k0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$AnimationEndListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimationEndListener extends AnimatorListenerAdapter {
        private final View view;

        public AnimationEndListener(View view) {
            this.view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.view.setTranslationY(0.0f);
            View view = this.view;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            view.setClipBounds(null);
        }
    }

    public VerticalTranslation(float f, float f2) {
        this.j0 = f;
        this.k0 = f2;
    }

    @Override // androidx.transition.Visibility
    public final Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        float height = view.getHeight();
        float f = this.j0;
        float f2 = f * height;
        float f3 = this.k0;
        View a = i.a(view, viewGroup, this, (int[]) transitionValues2.a.get("yandex:verticalTranslation:screenPosition"));
        a.setTranslationY(f2);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(a);
        translationYClipBounds.set(a, f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, height * f3), PropertyValuesHolder.ofFloat(translationYClipBounds, f, f3));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        float height = view.getHeight();
        float f = this.j0;
        View c = h.c(this, view, viewGroup, transitionValues, "yandex:verticalTranslation:screenPosition");
        Property property = View.TRANSLATION_Y;
        float f2 = this.k0;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c, PropertyValuesHolder.ofFloat((Property<?, Float>) property, f2, height * f), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), f2, f));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void f(final TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureEndValues$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:verticalTranslation:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(final TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureStartValues$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:verticalTranslation:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$TranslationYClipBounds;", "Landroid/util/Property;", "Landroid/view/View;", "", "view", "<init>", "(Landroid/view/View;)V", "get", "(Landroid/view/View;)Ljava/lang/Float;", "value", "Lzy11;", "set", "(Landroid/view/View;F)V", "Landroid/graphics/Rect;", "clipBounds", "Landroid/graphics/Rect;", "clipFactor", "F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TranslationYClipBounds extends Property<View, Float> {
        private final Rect clipBounds;
        private float clipFactor;

        public TranslationYClipBounds(View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.clipBounds = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        public void set(View view, float value) {
            this.clipFactor = value;
            if (value < 0.0f) {
                this.clipBounds.set(0, (int) ((-value) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else {
                Rect rect = this.clipBounds;
                if (value > 0.0f) {
                    rect.set(0, 0, view.getWidth(), (int) (((1.0f - this.clipFactor) * view.getHeight()) + 1.0f));
                } else {
                    rect.set(0, 0, view.getWidth(), view.getHeight());
                }
            }
            Rect rect2 = this.clipBounds;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            view.setClipBounds(rect2);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(this.clipFactor);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
            set(view, f.floatValue());
        }
    }

    public VerticalTranslation() {
        this(-1.0f, 0.0f);
    }
}
