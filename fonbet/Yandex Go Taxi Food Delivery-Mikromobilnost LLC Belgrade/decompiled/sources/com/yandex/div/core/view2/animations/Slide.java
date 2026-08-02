package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import defpackage.lx80;
import defpackage.m810;
import defpackage.ngh0;
import defpackage.rns0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes11.dex */
public final class Slide extends lx80 {
    public static final e l0 = new e();
    public static final g m0 = new g();
    public static final f n0 = new f();
    public static final d o0 = new d();
    public final int j0;
    public final rns0 k0;

    public static abstract class a implements rns0 {
        @Override // defpackage.rns0
        public final float b(int i, View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    public static abstract class b implements rns0 {
        @Override // defpackage.rns0
        public final float a(int i, View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    public Slide(int i, int i2) {
        this.j0 = i;
        this.k0 = i2 != 3 ? i2 != 5 ? i2 != 48 ? o0 : m0 : n0 : l0;
    }

    public static ObjectAnimator e0(View view, Slide slide, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = transitionValues.b.getTag(ngh0.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f5 = (r2[0] - i) + translationX;
            f6 = (r2[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int b2 = m810.b(f5 - translationX) + i;
        int b3 = m810.b(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(transitionValues.b, view, b2, b3, translationX, translationY);
        slide.a(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addPauseListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    public final Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.a.get("yandex:slide:screenPosition");
        rns0 rns0Var = this.k0;
        int i = this.j0;
        return e0(i.a(view, viewGroup, this, iArr), this, transitionValues2, iArr[0], iArr[1], rns0Var.a(i, view, viewGroup), rns0Var.b(i, view, viewGroup), view.getTranslationX(), view.getTranslationY(), this.w);
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.a.get("yandex:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        rns0 rns0Var = this.k0;
        int i = this.j0;
        return e0(h.c(this, view, viewGroup, transitionValues, "yandex:slide:screenPosition"), this, transitionValues, iArr[0], iArr[1], translationX, translationY, rns0Var.a(i, view, viewGroup), rns0Var.b(i, view, viewGroup), this.w);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void f(final TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.Slide$captureEndValues$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:slide:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(final TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        h.b(transitionValues, new tls() { // from class: com.yandex.div.core.view2.animations.Slide$captureStartValues$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TransitionValues.this.a.put("yandex:slide:screenPosition", (int[]) obj);
                return zy11.a;
            }
        });
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"Lcom/yandex/div/core/view2/animations/Slide$TransitionPositionListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroidx/transition/Transition$TransitionListener;", "Landroid/view/View;", "originalView", "movingView", "", "startX", "startY", "", "terminalX", "terminalY", "<init>", "(Landroid/view/View;Landroid/view/View;IIFF)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationCancel", "(Landroid/animation/Animator;)V", "animator", "onAnimationPause", "onAnimationResume", "Landroidx/transition/Transition;", "transition", "onTransitionStart", "(Landroidx/transition/Transition;)V", "onTransitionEnd", "onTransitionCancel", "onTransitionPause", "onTransitionResume", "Landroid/view/View;", "F", "getTerminalX", "()F", "getTerminalY", CA20Status.STATUS_USER_I, "", "transitionPosition", "[I", "pausedX", "pausedY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
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
            this.startX = i - m810.b(view2.getTranslationX());
            this.startY = i2 - m810.b(view2.getTranslationY());
            Object tag = view.getTag(ngh0.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.transitionPosition = iArr;
            if (iArr != null) {
                view.setTag(ngh0.div_transition_position, null);
            }
        }

        public final float getTerminalX() {
            return this.terminalX;
        }

        public final float getTerminalY() {
            return this.terminalY;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[]{m810.b(this.movingView.getTranslationX()) + this.startX, m810.b(this.movingView.getTranslationY()) + this.startY};
            }
            this.originalView.setTag(ngh0.div_transition_position, this.transitionPosition);
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

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
            transition.K(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }
    }

    public Slide() {
        this(-1, 80);
    }
}
