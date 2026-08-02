package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import defpackage.avb;
import defpackage.bk2;
import defpackage.dcm;
import defpackage.eng0;
import defpackage.fcm;
import defpackage.gjy;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.mor;
import defpackage.n85;
import defpackage.niy;
import defpackage.nwt0;
import defpackage.owt0;
import defpackage.pvb;
import defpackage.sb2;
import defpackage.v9j;
import defpackage.vf2;
import defpackage.w4n;
import defpackage.yi;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class DeterminateDrawable<S extends n85> extends DrawableWithAnimatedVisibilityChange {
    private static final int AMPLITUDE_ANIMATION_DURATION_MS = 500;
    static final float FULL_AMPLITUDE_PROGRESS_MAX = 0.9f;
    static final float FULL_AMPLITUDE_PROGRESS_MIN = 0.1f;
    static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    private static final mor INDICATOR_LENGTH_IN_LEVEL = new v9j(0);
    static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final int PHASE_ANIMATION_DURATION_MS = 1000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private final dcm activeIndicator;
    private ValueAnimator amplitudeAnimator;
    private TimeInterpolator amplitudeInterpolator;
    private TimeInterpolator amplitudeOffInterpolator;
    private TimeInterpolator amplitudeOnInterpolator;
    private fcm drawingDelegate;
    private final ValueAnimator phaseAnimator;
    private boolean skipAnimationOnLevelChange;
    private final nwt0 springAnimation;
    private float targetAmplitudeFraction;

    public DeterminateDrawable(Context context, n85 n85Var, fcm fcmVar) {
        super(context, n85Var);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(fcmVar);
        dcm dcmVar = new dcm();
        this.activeIndicator = dcmVar;
        dcmVar.h = true;
        nwt0 nwt0Var = new nwt0(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = nwt0Var;
        owt0 owt0Var = new owt0();
        owt0Var.a(1.0f);
        owt0Var.b(SPRING_FORCE_STIFFNESS);
        nwt0Var.u = owt0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.phaseAnimator = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new vf2(2, this, n85Var));
        if (n85Var.b(true) && n85Var.m != 0) {
            valueAnimator.start();
        }
        setGrowFraction(1.0f);
    }

    public static DeterminateDrawable<pvb> createCircularDrawable(Context context, pvb pvbVar) {
        return createCircularDrawable(context, pvbVar, new avb(pvbVar));
    }

    public static DeterminateDrawable<gjy> createLinearDrawable(Context context, gjy gjyVar) {
        return createLinearDrawable(context, gjyVar, new niy(gjyVar));
    }

    private float getAmplitudeFractionFromLevel(int i) {
        float f = i;
        n85 n85Var = this.baseSpec;
        return (f < n85Var.o * 10000.0f || f > n85Var.p * 10000.0f) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.activeIndicator.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeInitializeAmplitudeAnimator$1(ValueAnimator valueAnimator) {
        this.activeIndicator.e = this.amplitudeInterpolator.getInterpolation(this.amplitudeAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(n85 n85Var, ValueAnimator valueAnimator) {
        if (n85Var.b(true) && n85Var.m != 0 && isVisible()) {
            invalidateSelf();
        }
    }

    private void maybeInitializeAmplitudeAnimator() {
        if (this.amplitudeAnimator != null) {
            return;
        }
        Context context = this.context;
        int i = eng0.motionEasingStandardInterpolator;
        LinearInterpolator linearInterpolator = mj2.a;
        this.amplitudeOnInterpolator = kp50.P(context, i, linearInterpolator);
        this.amplitudeOffInterpolator = kp50.P(this.context, eng0.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.amplitudeAnimator = valueAnimator;
        valueAnimator.setDuration(500L);
        this.amplitudeAnimator.setFloatValues(0.0f, 1.0f);
        this.amplitudeAnimator.setInterpolator(null);
        this.amplitudeAnimator.addUpdateListener(new yi(20, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartAmplitudeAnimator(int i) {
        if (this.baseSpec.b(true)) {
            maybeInitializeAmplitudeAnimator();
            float amplitudeFractionFromLevel = getAmplitudeFractionFromLevel(i);
            float f = this.targetAmplitudeFraction;
            ValueAnimator valueAnimator = this.amplitudeAnimator;
            if (amplitudeFractionFromLevel == f) {
                if (valueAnimator.isRunning()) {
                    return;
                }
                setAmplitudeFraction(amplitudeFractionFromLevel);
                return;
            }
            if (valueAnimator.isRunning()) {
                this.amplitudeAnimator.cancel();
            }
            this.targetAmplitudeFraction = amplitudeFractionFromLevel;
            if (amplitudeFractionFromLevel == 1.0f) {
                this.amplitudeInterpolator = this.amplitudeOnInterpolator;
                this.amplitudeAnimator.start();
            } else {
                this.amplitudeInterpolator = this.amplitudeOffInterpolator;
                this.amplitudeAnimator.reverse();
            }
        }
    }

    private void setAmplitudeFraction(float f) {
        this.activeIndicator.e = f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.activeIndicator.b = f;
        invalidateSelf();
    }

    private void updateSpringMinVisibleChange() {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width <= 0 || height <= 0) {
            return;
        }
        boolean z = this.drawingDelegate instanceof niy;
        nwt0 nwt0Var = this.springAnimation;
        if (z) {
            nwt0Var.e(10000.0f / width);
        } else {
            nwt0Var.e((float) (10000.0d / (Math.min(height, width) * 3.141592653589793d)));
        }
    }

    public void addSpringAnimationEndListener(w4n w4nVar) {
        this.springAnimation.a(w4nVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            canvas.save();
            fcm fcmVar = this.drawingDelegate;
            Rect bounds = getBounds();
            float growFraction = getGrowFraction();
            boolean isShowing = isShowing();
            boolean isHiding = isHiding();
            fcmVar.a.d();
            fcmVar.a(canvas, bounds, growFraction, isShowing, isHiding);
            this.activeIndicator.f = getPhaseFraction();
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setAntiAlias(true);
            dcm dcmVar = this.activeIndicator;
            n85 n85Var = this.baseSpec;
            dcmVar.c = n85Var.e[0];
            int i = n85Var.i;
            fcm fcmVar2 = this.drawingDelegate;
            if (i > 0) {
                if (!(fcmVar2 instanceof niy)) {
                    i = (int) ((sb2.j(getIndicatorFraction(), 0.0f, 0.01f) * i) / 0.01f);
                }
                this.drawingDelegate.d(canvas, this.paint, getIndicatorFraction(), 1.0f, this.baseSpec.f, getAlpha(), i);
            } else {
                fcmVar2.d(canvas, this.paint, 0.0f, 1.0f, n85Var.f, getAlpha(), 0);
            }
            this.drawingDelegate.c(canvas, this.paint, this.activeIndicator, getAlpha());
            this.drawingDelegate.b(this.baseSpec.e[0], getAlpha(), canvas, this.paint);
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public fcm getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.f();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public owt0 getSpringForce() {
        return this.springAnimation.u;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.springAnimation.j();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        float amplitudeFractionFromLevel = getAmplitudeFractionFromLevel(i);
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.j();
            setIndicatorFraction(i / 10000.0f);
            setAmplitudeFraction(amplitudeFractionFromLevel);
            return true;
        }
        updateSpringMinVisibleChange();
        this.springAnimation.g(getIndicatorFraction() * 10000.0f);
        this.springAnimation.i(i);
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.a aVar) {
        super.registerAnimationCallback(aVar);
    }

    public void removeSpringAnimationEndListener(w4n w4nVar) {
        ArrayList arrayList = this.springAnimation.k;
        int indexOf = arrayList.indexOf(w4nVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(fcm fcmVar) {
        this.drawingDelegate = fcmVar;
    }

    public void setEnforcedDrawing(boolean z) {
        if (z && !this.phaseAnimator.isRunning()) {
            this.phaseAnimator.start();
        } else {
            if (z || !this.phaseAnimator.isRunning()) {
                return;
            }
            this.phaseAnimator.cancel();
        }
    }

    public void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public void setSpringForce(owt0 owt0Var) {
        this.springAnimation.u = owt0Var;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        bk2 bk2Var = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        bk2Var.getClass();
        float a = bk2.a(contentResolver);
        if (a == 0.0f) {
            this.skipAnimationOnLevelChange = true;
            return visibleInternal;
        }
        this.skipAnimationOnLevelChange = false;
        this.springAnimation.u.b(SPRING_FORCE_STIFFNESS / a);
        return visibleInternal;
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        this.baseSpec.p = f;
        invalidateSelf();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        this.baseSpec.o = f;
        invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(Animatable2Compat.a aVar) {
        return super.unregisterAnimationCallback(aVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    public static DeterminateDrawable<pvb> createCircularDrawable(Context context, pvb pvbVar, avb avbVar) {
        return new DeterminateDrawable<>(context, pvbVar, avbVar);
    }

    public static DeterminateDrawable<gjy> createLinearDrawable(Context context, gjy gjyVar, niy niyVar) {
        return new DeterminateDrawable<>(context, gjyVar, niyVar);
    }
}
