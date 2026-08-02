package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.R$id;
import xsna.an10;
import xsna.gnp0;
import xsna.izs;
import xsna.s3q0;
import xsna.vlp0;
import xsna.zcl;

/* compiled from: Slide.kt */
/* loaded from: classes7.dex */
public final class Slide extends OutlineAwareVisibility {
    private final int distance;
    private final SlideCalculator slideCalculator;
    private final int slideEdge;
    public static final Companion Companion = new Companion(null);
    private static final Slide$Companion$calculatorLeft$1 calculatorLeft = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorLeft$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(ViewGroup viewGroup, View view, int i) {
            int exactValueBy;
            float translationX = view.getTranslationX();
            exactValueBy = Slide.Companion.exactValueBy(i, view.getRight());
            return translationX - exactValueBy;
        }
    };
    private static final Slide$Companion$calculatorTop$1 calculatorTop = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorTop$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(ViewGroup viewGroup, View view, int i) {
            int exactValueBy;
            float translationY = view.getTranslationY();
            exactValueBy = Slide.Companion.exactValueBy(i, view.getBottom());
            return translationY - exactValueBy;
        }
    };
    private static final Slide$Companion$calculatorRight$1 calculatorRight = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorRight$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(ViewGroup viewGroup, View view, int i) {
            int exactValueBy;
            float translationX = view.getTranslationX();
            exactValueBy = Slide.Companion.exactValueBy(i, viewGroup.getWidth() - view.getLeft());
            return translationX + exactValueBy;
        }
    };
    private static final Slide$Companion$calculatorBottom$1 calculatorBottom = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorBottom$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(ViewGroup viewGroup, View view, int i) {
            int exactValueBy;
            float translationY = view.getTranslationY();
            exactValueBy = Slide.Companion.exactValueBy(i, viewGroup.getHeight() - view.getTop());
            return translationY + exactValueBy;
        }
    };

    /* compiled from: Slide.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int exactValueBy(int i, int i2) {
            return i == -1 ? i2 : i;
        }

        private Companion() {
        }
    }

    /* compiled from: Slide.kt */
    public static abstract class HorizontalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(ViewGroup viewGroup, View view, int i) {
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.kt */
    public interface SlideCalculator {
        float getGoneX(ViewGroup viewGroup, View view, int i);

        float getGoneY(ViewGroup viewGroup, View view, int i);
    }

    /* compiled from: Slide.kt */
    public static abstract class VerticalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(ViewGroup viewGroup, View view, int i) {
            return view.getTranslationX();
        }
    }

    public Slide(int i, int i2) {
        this.distance = i;
        this.slideEdge = i2;
        this.slideCalculator = i2 != 3 ? i2 != 5 ? i2 != 48 ? calculatorBottom : calculatorTop : calculatorRight : calculatorLeft;
    }

    private final Animator createTranslateAnimator(View view, vlp0 vlp0Var, gnp0 gnp0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = gnp0Var.b.getTag(R$id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f5 = (r3[0] - i) + translationX;
            f6 = (r3[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int b = an10.b(f5 - translationX) + i;
        int b2 = an10.b(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(gnp0Var.b, view, b, b2, translationX, translationY);
        vlp0Var.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addPauseListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureEndValues(final gnp0 gnp0Var) {
        super.captureEndValues(gnp0Var);
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.Slide$captureEndValues$1
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
                gnp0.this.a.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0, xsna.vlp0
    public void captureStartValues(final gnp0 gnp0Var) {
        super.captureStartValues(gnp0Var);
        UtilsKt.capturePosition(gnp0Var, new izs<int[], s3q0>() { // from class: com.yandex.div.core.view2.animations.Slide$captureStartValues$1
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
                gnp0.this.a.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // xsna.p4u0
    public Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) gnp0Var2.a.get("yandex:slide:screenPosition");
        return createTranslateAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, iArr), this, gnp0Var2, iArr[0], iArr[1], this.slideCalculator.getGoneX(viewGroup, view, this.distance), this.slideCalculator.getGoneY(viewGroup, view, this.distance), view.getTranslationX(), view.getTranslationY(), getInterpolator());
    }

    @Override // xsna.p4u0
    public Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        int[] iArr = (int[]) gnp0Var.a.get("yandex:slide:screenPosition");
        return createTranslateAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, gnp0Var, "yandex:slide:screenPosition"), this, gnp0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(viewGroup, view, this.distance), this.slideCalculator.getGoneY(viewGroup, view, this.distance), getInterpolator());
    }

    /* compiled from: Slide.kt */
    public static final class TransitionPositionListener extends AnimatorListenerAdapter implements vlp0.i {
        private final View movingView;
        private final View originalView;
        private float pausedX;
        private float pausedY;
        private final int startX;
        private final int startY;
        private final float terminalX;
        private final float terminalY;
        private int[] transitionPosition;

        public TransitionPositionListener(View view, View view2, int i, int i2, float f, float f2) {
            this.originalView = view;
            this.movingView = view2;
            this.terminalX = f;
            this.terminalY = f2;
            this.startX = i - an10.b(view2.getTranslationX());
            this.startY = i2 - an10.b(view2.getTranslationY());
            Object tag = view.getTag(R$id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.transitionPosition = iArr;
            if (iArr != null) {
                view.setTag(R$id.div_transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[]{an10.b(this.movingView.getTranslationX()) + this.startX, an10.b(this.movingView.getTranslationY()) + this.startY};
            }
            this.originalView.setTag(R$id.div_transition_position, this.transitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.pausedX = this.movingView.getTranslationX();
            this.pausedY = this.movingView.getTranslationY();
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.movingView.setTranslationX(this.pausedX);
            this.movingView.setTranslationY(this.pausedY);
        }

        @Override // xsna.vlp0.i
        public void onTransitionEnd(vlp0 vlp0Var) {
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
            vlp0Var.removeListener(this);
        }

        @Override // xsna.vlp0.i
        public void onTransitionCancel(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public void onTransitionPause(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public void onTransitionResume(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public void onTransitionStart(vlp0 vlp0Var) {
        }
    }
}
