package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import defpackage.bk2;
import defpackage.mj2;
import defpackage.n85;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final float DEFAULT_MOCK_PHASE_FRACTION = -1.0f;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            drawableWithAnimatedVisibilityChange.setGrowFraction(f.floatValue());
        }
    };
    private List<Animatable2Compat.a> animationCallbacks;
    final n85 baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Animatable2Compat.a internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    private ValueAnimator showAnimator;
    private int totalAlpha;
    private float mockPhaseFraction = -1.0f;
    final Paint paint = new Paint();
    Rect clipBounds = new Rect();
    bk2 animatorDurationScaleProvider = new bk2();

    public DrawableWithAnimatedVisibilityChange(Context context, n85 n85Var) {
        this.context = context;
        this.baseSpec = n85Var;
        setAlpha(255);
    }

    private void cancelAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        Animatable2Compat.a aVar = this.internalAnimationCallback;
        if (aVar != null) {
            aVar.a(this);
        }
        List<Animatable2Compat.a> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator<Animatable2Compat.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        Animatable2Compat.a aVar = this.internalAnimationCallback;
        if (aVar != null) {
            aVar.b(this);
        }
        List<Animatable2Compat.a> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator<Animatable2Compat.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    private void endAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z;
    }

    private boolean isDeterminateDrawable() {
        return this instanceof DeterminateDrawable;
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = ofFloat;
            ofFloat.setDuration(500L);
            this.showAnimator.setInterpolator(mj2.b);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = ofFloat2;
            ofFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(mj2.b);
            setHideAnimator(this.hideAnimator);
        }
    }

    private void setHideAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            ny61.g("Cannot set hideAnimator while the current hideAnimator is running.");
        } else {
            this.hideAnimator = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
                }
            });
        }
    }

    private void setShowAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            ny61.g("Cannot set showAnimator while the current showAnimator is running.");
        } else {
            this.showAnimator = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
                }
            });
        }
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    public float getGrowFraction() {
        n85 n85Var = this.baseSpec;
        if (n85Var.g == 0 && n85Var.h == 0) {
            return 1.0f;
        }
        return (this.mockHideAnimationRunning || this.mockShowAnimationRunning) ? this.mockGrowFraction : this.growFraction;
    }

    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getPhaseFraction() {
        float f = this.mockPhaseFraction;
        if (f > 0.0f) {
            return f;
        }
        if (this.baseSpec.b(isDeterminateDrawable()) && this.baseSpec.m != 0) {
            bk2 bk2Var = this.animatorDurationScaleProvider;
            ContentResolver contentResolver = this.context.getContentResolver();
            bk2Var.getClass();
            float a = bk2.a(contentResolver);
            if (a > 0.0f) {
                boolean isDeterminateDrawable = isDeterminateDrawable();
                n85 n85Var = this.baseSpec;
                float uptimeMillis = (SystemClock.uptimeMillis() % r6) / ((int) ((((isDeterminateDrawable ? n85Var.j : n85Var.k) * 1000.0f) / n85Var.m) * a));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public void registerAnimationCallback(Animatable2Compat.a aVar) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (this.animationCallbacks.contains(aVar)) {
            return;
        }
        this.animationCallbacks.add(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowFraction(float f) {
        if (this.growFraction != f) {
            this.growFraction = f;
            invalidateSelf();
        }
    }

    public void setInternalAnimationCallback(Animatable2Compat.a aVar) {
        this.internalAnimationCallback = aVar;
    }

    public void setMockHideAnimationRunning(boolean z, float f) {
        this.mockHideAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    public void setMockPhaseFraction(float f) {
        this.mockPhaseFraction = f;
    }

    public void setMockShowAnimationRunning(boolean z, float f) {
        this.mockShowAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        bk2 bk2Var = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        bk2Var.getClass();
        return setVisibleInternal(z, z2, z3 && bk2.a(contentResolver) > 0.0f);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        maybeInitializeAnimators();
        if (isVisible() || z) {
            ValueAnimator valueAnimator = z ? this.showAnimator : this.hideAnimator;
            ValueAnimator valueAnimator2 = z ? this.hideAnimator : this.showAnimator;
            if (!z3) {
                if (valueAnimator2.isRunning()) {
                    cancelAnimatorsWithoutCallbacks(valueAnimator2);
                }
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                } else {
                    endAnimatorsWithoutCallbacks(valueAnimator);
                }
                return super.setVisible(z, false);
            }
            if (!valueAnimator.isRunning()) {
                boolean z4 = !z || super.setVisible(z, false);
                n85 n85Var = this.baseSpec;
                if (!z ? n85Var.h != 0 : n85Var.g != 0) {
                    endAnimatorsWithoutCallbacks(valueAnimator);
                    return z4;
                }
                if (z2 || !valueAnimator.isPaused()) {
                    valueAnimator.start();
                    return z4;
                }
                valueAnimator.resume();
                return z4;
            }
        }
        return false;
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.a aVar) {
        List<Animatable2Compat.a> list = this.animationCallbacks;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.animationCallbacks.remove(aVar);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }
}
