package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import xsna.gnp0;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: Scale.kt */
/* loaded from: classes7.dex */
public final class Scale extends OutlineAwareVisibility {
    private static final Companion Companion = new Companion(null);
    private final float pivotX;
    private final float pivotY;
    private final float scaleFactor;

    /* compiled from: Scale.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Scale.kt */
    public final class ScaleAnimatorListener extends AnimatorListenerAdapter {
        private boolean isPivotSet;
        private final float nonTransitionScaleX;
        private final float nonTransitionScaleY;
        private final View view;

        public ScaleAnimatorListener(View view, float f, float f2) {
            this.view = view;
            this.nonTransitionScaleX = f;
            this.nonTransitionScaleY = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.view.setScaleX(this.nonTransitionScaleX);
            this.view.setScaleY(this.nonTransitionScaleY);
            if (this.isPivotSet) {
                this.view.resetPivot();
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.view.setVisibility(0);
            if (Scale.this.pivotX == 0.5f && Scale.this.pivotY == 0.5f) {
                return;
            }
            this.isPivotSet = true;
            this.view.setPivotX(Scale.this.pivotX * r3.getWidth());
            this.view.setPivotY(Scale.this.pivotY * r3.getHeight());
        }
    }

    public /* synthetic */ Scale(float f, float f2, float f3, int i, zcl zclVar) {
        this(f, (i & 2) != 0 ? 0.5f : f2, (i & 4) != 0 ? 0.5f : f3);
    }

    private final void captureEndScaleValues(gnp0 gnp0Var) {
        Float valueOf = Float.valueOf(1.0f);
        int mode = getMode();
        if (mode == 1) {
            gnp0Var.a.put("yandex:scale:scaleX", valueOf);
            gnp0Var.a.put("yandex:scale:scaleY", valueOf);
        } else {
            if (mode != 2) {
                return;
            }
            gnp0Var.a.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
            gnp0Var.a.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
        }
    }

    private final void captureStartScaleValues(gnp0 gnp0Var) {
        View view = gnp0Var.b;
        HashMap hashMap = gnp0Var.a;
        int mode = getMode();
        if (mode == 1) {
            hashMap.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
        } else {
            if (mode != 2) {
                return;
            }
            hashMap.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
    }

    private final Animator createScaleAnimator(View view, float f, float f2, float f3, float f4) {
        if (f == f3 && f2 == f4) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2, f4));
        ofPropertyValuesHolder.addListener(new ScaleAnimatorListener(view, view.getScaleX(), view.getScaleY()));
        return ofPropertyValuesHolder;
    }

    private final float getCapturedScaleX(gnp0 gnp0Var, float f) {
        HashMap hashMap;
        Object obj = (gnp0Var == null || (hashMap = gnp0Var.a) == null) ? null : hashMap.get("yandex:scale:scaleX");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    private final float getCapturedScaleY(gnp0 gnp0Var, float f) {
        HashMap hashMap;
        Object obj = (gnp0Var == null || (hashMap = gnp0Var.a) == null) ? null : hashMap.get("yandex:scale:scaleY");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureEndValues(final gnp0 gnp0Var) {
        float scaleX = gnp0Var.b.getScaleX();
        View view = gnp0Var.b;
        float scaleY = view.getScaleY();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        super.captureEndValues(gnp0Var);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        captureEndScaleValues(gnp0Var);
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.Scale$captureEndValues$2
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
                gnp0.this.a.put("yandex:scale:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureStartValues(final gnp0 gnp0Var) {
        float scaleX = gnp0Var.b.getScaleX();
        View view = gnp0Var.b;
        float scaleY = view.getScaleY();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        super.captureStartValues(gnp0Var);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        captureStartScaleValues(gnp0Var);
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.Scale$captureStartValues$2
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
                gnp0.this.a.put("yandex:scale:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0
    public Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var2 == null) {
            return null;
        }
        return createScaleAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, (int[]) gnp0Var2.a.get("yandex:scale:screenPosition")), getCapturedScaleX(gnp0Var, this.scaleFactor), getCapturedScaleY(gnp0Var, this.scaleFactor), getCapturedScaleX(gnp0Var2, 1.0f), getCapturedScaleY(gnp0Var2, 1.0f));
    }

    @Override // xsna.p4u0
    public Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        return createScaleAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, gnp0Var, "yandex:scale:screenPosition"), getCapturedScaleX(gnp0Var, 1.0f), getCapturedScaleY(gnp0Var, 1.0f), getCapturedScaleX(gnp0Var2, this.scaleFactor), getCapturedScaleY(gnp0Var2, this.scaleFactor));
    }

    public Scale(float f, float f2, float f3) {
        this.scaleFactor = f;
        this.pivotX = f2;
        this.pivotY = f3;
    }
}
