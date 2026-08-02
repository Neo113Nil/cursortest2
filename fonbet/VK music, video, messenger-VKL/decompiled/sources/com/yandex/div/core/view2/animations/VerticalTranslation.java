package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.gnp0;
import xsna.iut0;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: VerticalTranslation.kt */
/* loaded from: classes7.dex */
public final class VerticalTranslation extends OutlineAwareVisibility {
    public static final Companion Companion = new Companion(null);
    private final float stableValue;
    private final float translatedValue;

    /* compiled from: VerticalTranslation.kt */
    public static final class AnimationEndListener extends AnimatorListenerAdapter {
        private final View view;

        public AnimationEndListener(View view) {
            this.view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view = this.view;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setClipBounds(null);
        }
    }

    /* compiled from: VerticalTranslation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: VerticalTranslation.kt */
    public static final class TranslationYClipBounds extends Property<View, Float> {
        private final Rect clipBounds;
        private float clipFactor;

        public TranslationYClipBounds(View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.clipBounds = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
            set(view, f.floatValue());
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(this.clipFactor);
        }

        public void set(View view, float f) {
            this.clipFactor = f;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.clipBounds.set(0, (int) ((-f) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f2 = 1;
                this.clipBounds.set(0, 0, view.getWidth(), (int) (((f2 - this.clipFactor) * view.getHeight()) + f2));
            } else {
                this.clipBounds.set(0, 0, view.getWidth(), view.getHeight());
            }
            Rect rect = this.clipBounds;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setClipBounds(rect);
        }
    }

    public VerticalTranslation(float f, float f2) {
        this.translatedValue = f;
        this.stableValue = f2;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureEndValues(final gnp0 gnp0Var) {
        super.captureEndValues(gnp0Var);
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureEndValues$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(int[] iArr) {
                invoke2(iArr);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(int[] iArr) {
                gnp0.this.a.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureStartValues(final gnp0 gnp0Var) {
        super.captureStartValues(gnp0Var);
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureStartValues$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(int[] iArr) {
                invoke2(iArr);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(int[] iArr) {
                gnp0.this.a.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0
    public Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var2 == null) {
            return null;
        }
        float height = view.getHeight();
        float f = this.translatedValue * height;
        float f2 = this.stableValue * height;
        View createOrGetVisualCopy = ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, (int[]) gnp0Var2.a.get("yandex:verticalTranslation:screenPosition"));
        createOrGetVisualCopy.setTranslationY(f);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(createOrGetVisualCopy);
        translationYClipBounds.set(createOrGetVisualCopy, this.translatedValue);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(createOrGetVisualCopy, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2), PropertyValuesHolder.ofFloat(translationYClipBounds, this.translatedValue, this.stableValue));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // xsna.p4u0
    public Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(UtilsKt.getViewForAnimate(this, view, viewGroup, gnp0Var, "yandex:verticalTranslation:screenPosition"), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.stableValue, this.translatedValue * view.getHeight()), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), this.stableValue, this.translatedValue));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }
}
