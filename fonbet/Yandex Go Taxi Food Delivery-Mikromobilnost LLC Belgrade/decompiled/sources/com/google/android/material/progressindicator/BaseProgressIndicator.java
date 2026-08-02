package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import defpackage.bk2;
import defpackage.fcm;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.i3w0;
import defpackage.iog0;
import defpackage.k85;
import defpackage.l85;
import defpackage.m85;
import defpackage.n85;
import defpackage.ny61;
import defpackage.vez0;
import defpackage.w4n;
import defpackage.y4n;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class BaseProgressIndicator<S extends n85> extends ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_ProgressIndicator;
    public static final int HIDE_ESCAPE = 3;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    bk2 animatorDurationScaleProvider;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final w4n hideAfterMaxProgressListener;
    private final Animatable2Compat.a hideAnimationCallback;
    boolean initialized;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final Animatable2Compat.a switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(g810.b(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.lastShowStartTime = -1L;
        this.isIndeterminateModeChangeRequested = false;
        this.visibilityAfterHide = 4;
        this.hideAfterMaxProgressListener = new i3w0(this, 2);
        this.delayedShow = new k85(this, 0);
        this.delayedHide = new k85(this, 1);
        this.switchIndeterminateModeCallback = new l85(this);
        this.hideAnimationCallback = new m85(this);
        Context context2 = getContext();
        this.spec = createSpec(context2, attributeSet);
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.BaseProgressIndicator, i, i2, new int[0]);
        this.showDelay = d.getInt(z2i0.BaseProgressIndicator_showDelay, -1);
        this.minHideDelay = Math.min(d.getInt(z2i0.BaseProgressIndicator_minHideDelay, -1), 1000);
        d.recycle();
        this.animatorDurationScaleProvider = new bk2();
        this.isParentDoneInitializing = true;
    }

    private fcm getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().getDrawingDelegate();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().getDrawingDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalHide() {
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(false, false, true);
        if (isNoLongerNeedToBeVisible()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean isNoLongerNeedToBeVisible() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(y4n y4nVar, boolean z, float f, float f2) {
        if (getProgressDrawable() == null || getProgressDrawable().getLevel() != 10000) {
            return;
        }
        hide();
    }

    private void registerAnimationCallbacks() {
        registerSwitchIndeterminateModeCallback();
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
    }

    private void unregisterAnimationCallbacks() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
            getIndeterminateDrawable().getAnimatorDelegate().g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
        }
    }

    public void applyNewVisibility(boolean z) {
        if (this.isParentDoneInitializing) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(visibleToUser(), false, z);
        }
    }

    public abstract S createSpec(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.spec.h;
    }

    @Override // android.widget.ProgressBar
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.spec.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.spec.i;
    }

    @Override // android.widget.ProgressBar
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.spec.g;
    }

    public int getTrackColor() {
        return this.spec.f;
    }

    public int getTrackCornerRadius() {
        return this.spec.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.spec.c;
    }

    public int getTrackThickness() {
        return this.spec.a;
    }

    public int getWaveAmplitude() {
        return this.spec.l;
    }

    public int getWaveSpeed() {
        return this.spec.m;
    }

    public int getWavelengthDeterminate() {
        return this.spec.j;
    }

    public int getWavelengthIndeterminate() {
        return this.spec.k;
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long uptimeMillis = SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i = this.minHideDelay;
        long j = i;
        Runnable runnable = this.delayedHide;
        if (uptimeMillis >= j) {
            runnable.run();
        } else {
            postDelayed(runnable, i - uptimeMillis);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerAnimationCallbacks();
        if (visibleToUser()) {
            internalShow();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.delayedHide);
        removeCallbacks(this.delayedShow);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).hideNow();
        unregisterAnimationCallbacks();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        try {
            fcm currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        applyNewVisibility(i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        applyNewVisibility(false);
    }

    public void registerSwitchIndeterminateModeCallback() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().getAnimatorDelegate().d(this.switchIndeterminateModeCallback);
    }

    public void setAnimatorDurationScaleProvider(bk2 bk2Var) {
        this.animatorDurationScaleProvider = bk2Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().animatorDurationScaleProvider = bk2Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().animatorDurationScaleProvider = bk2Var;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        if (z) {
            getProgressDrawable().addSpringAnimationEndListener(this.hideAfterMaxProgressListener);
        } else {
            getProgressDrawable().removeSpringAnimationEndListener(this.hideAfterMaxProgressListener);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.spec.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.hideNow();
            }
            super.setIndeterminate(z);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.setVisible(visibleToUser(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && visibleToUser()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).getAnimatorDelegate().f();
            }
            this.isIndeterminateModeChangeRequested = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        S s = this.spec;
        if (s.n != f) {
            s.n = f;
            getIndeterminateDrawable().getAnimatorDelegate().c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        } else if (this.initialized) {
            ny61.g("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{vez0.x(getContext(), iog0.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.spec.e = iArr;
        getIndeterminateDrawable().getAnimatorDelegate().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        S s = this.spec;
        if (s.i != i) {
            s.i = i;
            s.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.storedProgress = i;
            this.storedProgressAnimated = z;
            this.isIndeterminateModeChangeRequested = true;
            if (getIndeterminateDrawable().isVisible()) {
                bk2 bk2Var = this.animatorDurationScaleProvider;
                ContentResolver contentResolver = getContext().getContentResolver();
                bk2Var.getClass();
                if (bk2.a(contentResolver) != 0.0f) {
                    getIndeterminateDrawable().getAnimatorDelegate().e();
                    return;
                }
            }
            this.switchIndeterminateModeCallback.a(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof DeterminateDrawable) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevelByFraction(getProgress() / getMax());
            return;
        }
        if (this.initialized) {
            ny61.g("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.spec.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.spec;
        if (s.f != i) {
            s.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.spec;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
            this.spec.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        S s = this.spec;
        if (s.c != f) {
            s.c = Math.min(f, 0.5f);
            this.spec.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        S s = this.spec;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.visibilityAfterHide = i;
        } else {
            ny61.g("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        S s = this.spec;
        if (s.l != i) {
            s.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        getProgressDrawable().setWaveAmplitudeRampProgressMax(f);
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        getProgressDrawable().setWaveAmplitudeRampProgressMin(f);
        invalidate();
    }

    public void setWaveSpeed(int i) {
        this.spec.m = i;
        getProgressDrawable().setEnforcedDrawing(this.spec.m != 0);
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        S s = this.spec;
        if (s.j != i) {
            s.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        S s = this.spec;
        if (s.k != i) {
            s.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void show() {
        int i = this.showDelay;
        Runnable runnable = this.delayedShow;
        if (i <= 0) {
            runnable.run();
        } else {
            removeCallbacks(runnable);
            postDelayed(this.delayedShow, this.showDelay);
        }
    }

    public boolean visibleToUser() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible();
    }
}
