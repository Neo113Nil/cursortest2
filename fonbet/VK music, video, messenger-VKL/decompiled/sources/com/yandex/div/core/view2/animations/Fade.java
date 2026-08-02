package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.gnp0;
import xsna.iut0;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: Fade.kt */
/* loaded from: classes7.dex */
public final class Fade extends OutlineAwareVisibility {
    private static final Companion Companion = new Companion(null);
    private final float alpha;

    /* compiled from: Fade.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Fade.kt */
    public static final class FadeAnimatorListener extends AnimatorListenerAdapter {
        private boolean isLayerTypeChanged;
        private final float nonTransitionAlpha;
        private final View view;

        public FadeAnimatorListener(View view, float f) {
            this.view = view;
            this.nonTransitionAlpha = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.view.setAlpha(this.nonTransitionAlpha);
            if (this.isLayerTypeChanged) {
                this.view.setLayerType(0, null);
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.view.setVisibility(0);
            View view = this.view;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (view.hasOverlappingRendering() && this.view.getLayerType() == 0) {
                this.isLayerTypeChanged = true;
                this.view.setLayerType(2, null);
            }
        }
    }

    public Fade(float f) {
        this.alpha = f;
    }

    private final Animator createFadeAnimator(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        ofFloat.addListener(new FadeAnimatorListener(view, view.getAlpha()));
        return ofFloat;
    }

    private final float getCapturedAlpha(gnp0 gnp0Var, float f) {
        HashMap hashMap;
        Object obj = (gnp0Var == null || (hashMap = gnp0Var.a) == null) ? null : hashMap.get("yandex:fade:alpha");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureEndValues(final gnp0 gnp0Var) {
        super.captureEndValues(gnp0Var);
        int mode = getMode();
        if (mode == 1) {
            gnp0Var.a.put("yandex:fade:alpha", Float.valueOf(gnp0Var.b.getAlpha()));
        } else if (mode == 2) {
            gnp0Var.a.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        }
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.Fade$captureEndValues$1
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
                gnp0.this.a.put("yandex:fade:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureStartValues(final gnp0 gnp0Var) {
        super.captureStartValues(gnp0Var);
        int mode = getMode();
        if (mode == 1) {
            gnp0Var.a.put("yandex:fade:alpha", Float.valueOf(this.alpha));
        } else if (mode == 2) {
            gnp0Var.a.put("yandex:fade:alpha", Float.valueOf(gnp0Var.b.getAlpha()));
        }
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.Fade$captureStartValues$1
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
                gnp0.this.a.put("yandex:fade:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0
    public Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var2 == null) {
            return null;
        }
        return createFadeAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, (int[]) gnp0Var2.a.get("yandex:fade:screenPosition")), getCapturedAlpha(gnp0Var, this.alpha), getCapturedAlpha(gnp0Var2, 1.0f));
    }

    @Override // xsna.p4u0
    public Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        return createFadeAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, gnp0Var, "yandex:fade:screenPosition"), getCapturedAlpha(gnp0Var, 1.0f), getCapturedAlpha(gnp0Var2, this.alpha));
    }
}
