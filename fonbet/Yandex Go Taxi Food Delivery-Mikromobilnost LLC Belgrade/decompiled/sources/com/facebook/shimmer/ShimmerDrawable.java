package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import defpackage.g8e;
import defpackage.ktr0;

/* loaded from: classes.dex */
public final class ShimmerDrawable extends Drawable {
    private final Rect mDrawRect;
    private final Matrix mShaderMatrix;
    private ktr0 mShimmer;
    private final Paint mShimmerPaint;
    private final ValueAnimator.AnimatorUpdateListener mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.shimmer.ShimmerDrawable.1
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerDrawable.this.invalidateSelf();
        }
    };
    private ValueAnimator mValueAnimator;

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.mShimmerPaint = paint;
        this.mDrawRect = new Rect();
        this.mShaderMatrix = new Matrix();
        paint.setAntiAlias(true);
    }

    private float offset(float f, float f2, float f3) {
        return g8e.b(f2, f, f3, f);
    }

    private void updateShader() {
        ktr0 ktr0Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (ktr0Var = this.mShimmer) == null) {
            return;
        }
        int i = ktr0Var.g;
        if (i <= 0) {
            i = Math.round(ktr0Var.i * width);
        }
        ktr0 ktr0Var2 = this.mShimmer;
        int i2 = ktr0Var2.h;
        if (i2 <= 0) {
            i2 = Math.round(ktr0Var2.j * height);
        }
        ktr0 ktr0Var3 = this.mShimmer;
        boolean z = true;
        if (ktr0Var3.f != 1) {
            int i3 = ktr0Var3.c;
            if (i3 != 1 && i3 != 3) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            if (!z) {
                i2 = 0;
            }
            ktr0 ktr0Var4 = this.mShimmer;
            radialGradient = new LinearGradient(0.0f, 0.0f, i, i2, ktr0Var4.b, ktr0Var4.a, Shader.TileMode.CLAMP);
        } else {
            float max = (float) (Math.max(i, i2) / Math.sqrt(2.0d));
            ktr0 ktr0Var5 = this.mShimmer;
            radialGradient = new RadialGradient(i / 2.0f, i2 / 2.0f, max, ktr0Var5.b, ktr0Var5.a, Shader.TileMode.CLAMP);
        }
        this.mShimmerPaint.setShader(radialGradient);
    }

    private void updateValueAnimator() {
        boolean z;
        if (this.mShimmer == null) {
            return;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.mValueAnimator.cancel();
            this.mValueAnimator.removeAllUpdateListeners();
        } else {
            z = false;
        }
        ktr0 ktr0Var = this.mShimmer;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (ktr0Var.t / ktr0Var.s) + 1.0f);
        this.mValueAnimator = ofFloat;
        ofFloat.setRepeatMode(this.mShimmer.r);
        this.mValueAnimator.setRepeatCount(this.mShimmer.q);
        ValueAnimator valueAnimator2 = this.mValueAnimator;
        ktr0 ktr0Var2 = this.mShimmer;
        valueAnimator2.setDuration(ktr0Var2.s + ktr0Var2.t);
        this.mValueAnimator.addUpdateListener(this.mUpdateListener);
        if (z) {
            this.mValueAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float offset;
        float offset2;
        if (this.mShimmer == null || this.mShimmerPaint.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.mShimmer.m));
        float width = (this.mDrawRect.width() * tan) + this.mDrawRect.height();
        float height = (tan * this.mDrawRect.height()) + this.mDrawRect.width();
        ValueAnimator valueAnimator = this.mValueAnimator;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.mShimmer.c;
        if (i != 1) {
            if (i == 2) {
                offset2 = offset(height, -height, animatedFraction);
            } else if (i != 3) {
                offset2 = offset(-height, height, animatedFraction);
            } else {
                offset = offset(width, -width, animatedFraction);
            }
            f = offset2;
            offset = 0.0f;
        } else {
            offset = offset(-width, width, animatedFraction);
        }
        this.mShaderMatrix.reset();
        this.mShaderMatrix.setRotate(this.mShimmer.m, this.mDrawRect.width() / 2.0f, this.mDrawRect.height() / 2.0f);
        this.mShaderMatrix.postTranslate(f, offset);
        this.mShimmerPaint.getShader().setLocalMatrix(this.mShaderMatrix);
        canvas.drawRect(this.mDrawRect, this.mShimmerPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        ktr0 ktr0Var = this.mShimmer;
        if (ktr0Var != null) {
            return (ktr0Var.n || ktr0Var.p) ? -3 : -1;
        }
        return -1;
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public void maybeStartShimmer() {
        ktr0 ktr0Var;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null || valueAnimator.isStarted() || (ktr0Var = this.mShimmer) == null || !ktr0Var.o || getCallback() == null) {
            return;
        }
        this.mValueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDrawRect.set(0, 0, rect.width(), rect.height());
        updateShader();
        maybeStartShimmer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setShimmer(ktr0 ktr0Var) {
        this.mShimmer = ktr0Var;
        if (ktr0Var != null) {
            this.mShimmerPaint.setXfermode(new PorterDuffXfermode(this.mShimmer.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        updateShader();
        updateValueAnimator();
        invalidateSelf();
    }

    public void startShimmer() {
        if (this.mValueAnimator == null || isShimmerStarted() || getCallback() == null) {
            return;
        }
        this.mValueAnimator.start();
    }

    public void stopShimmer() {
        if (this.mValueAnimator == null || !isShimmerStarted()) {
            return;
        }
        this.mValueAnimator.cancel();
    }
}
