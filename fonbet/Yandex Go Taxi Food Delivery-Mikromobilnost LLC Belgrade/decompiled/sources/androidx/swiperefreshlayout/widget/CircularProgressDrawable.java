package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.g8e;
import defpackage.nvb;

/* loaded from: classes10.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    boolean mFinishing;
    private Resources mResources;
    private final nvb mRing;
    private float mRotation;
    float mRotationCount;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final int[] COLORS = {ModalContentViewContainer.BASE_SHADOW_COLOR};

    public CircularProgressDrawable(Context context) {
        context.getClass();
        this.mResources = context.getResources();
        nvb nvbVar = new nvb();
        this.mRing = nvbVar;
        nvbVar.i = COLORS;
        nvbVar.a(0);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, nvb nvbVar) {
        updateRingColor(f, nvbVar);
        float floor = (float) (Math.floor(nvbVar.m / 0.8f) + 1.0d);
        float f2 = nvbVar.k;
        float f3 = nvbVar.l;
        nvbVar.e = (((f3 - 0.01f) - f2) * f) + f2;
        nvbVar.f = f3;
        float f4 = nvbVar.m;
        nvbVar.g = g8e.b(floor, f4, f, f4);
    }

    private int evaluateColorChange(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r5) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r0) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r1) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r7))));
    }

    private float getRotation() {
        return this.mRotation;
    }

    private void setRotation(float f) {
        this.mRotation = f;
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        nvb nvbVar = this.mRing;
        float f5 = this.mResources.getDisplayMetrics().density;
        float f6 = f2 * f5;
        nvbVar.h = f6;
        nvbVar.b.setStrokeWidth(f6);
        nvbVar.q = f * f5;
        nvbVar.a(0);
        nvbVar.r = (int) (f3 * f5);
        nvbVar.s = (int) (f4 * f5);
    }

    private void setupAnimators() {
        final nvb nvbVar = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.updateRingColor(floatValue, nvbVar);
                CircularProgressDrawable.this.applyTransformation(floatValue, nvbVar, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.applyTransformation(1.0f, nvbVar, true);
                nvb nvbVar2 = nvbVar;
                nvbVar2.k = nvbVar2.e;
                nvbVar2.l = nvbVar2.f;
                nvbVar2.m = nvbVar2.g;
                nvbVar2.a((nvbVar2.j + 1) % nvbVar2.i.length);
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (!circularProgressDrawable.mFinishing) {
                    circularProgressDrawable.mRotationCount += 1.0f;
                    return;
                }
                circularProgressDrawable.mFinishing = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                nvb nvbVar3 = nvbVar;
                if (nvbVar3.n) {
                    nvbVar3.n = false;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.mRotationCount = 0.0f;
            }
        });
        this.mAnimator = ofFloat;
    }

    public void applyTransformation(float f, nvb nvbVar, boolean z) {
        float f2;
        if (this.mFinishing) {
            applyFinishTranslation(f, nvbVar);
            return;
        }
        if (f != 1.0f || z) {
            float f3 = nvbVar.m;
            float f4 = nvbVar.k;
            if (f < 0.5f) {
                f2 = (MATERIAL_INTERPOLATOR.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f4;
            } else {
                float f5 = f4 + 0.79f;
                f4 = f5 - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f5;
            }
            float f6 = (RING_ROTATION * f) + f3;
            float f7 = (f + this.mRotationCount) * GROUP_FULL_ROTATION;
            nvbVar.e = f4;
            nvbVar.f = f2;
            nvbVar.g = f6;
            setRotation(f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        nvb nvbVar = this.mRing;
        Paint paint = nvbVar.b;
        RectF rectF = nvbVar.a;
        float f = nvbVar.q;
        float f2 = (nvbVar.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((nvbVar.r * nvbVar.p) / 2.0f, nvbVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = nvbVar.e;
        float f4 = nvbVar.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((nvbVar.f + f4) * 360.0f) - f5;
        paint.setColor(nvbVar.u);
        paint.setAlpha(nvbVar.t);
        float f7 = nvbVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, nvbVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = nvbVar.c;
        if (nvbVar.n) {
            Path path = nvbVar.o;
            if (path == null) {
                Path path2 = new Path();
                nvbVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (nvbVar.r * nvbVar.p) / 2.0f;
            nvbVar.o.moveTo(0.0f, 0.0f);
            nvbVar.o.lineTo(nvbVar.r * nvbVar.p, 0.0f);
            Path path3 = nvbVar.o;
            float f10 = nvbVar.r;
            float f11 = nvbVar.p;
            path3.lineTo((f10 * f11) / 2.0f, nvbVar.s * f11);
            nvbVar.o.offset((rectF.centerX() + min) - f9, (nvbVar.h / 2.0f) + rectF.centerY());
            nvbVar.o.close();
            paint2.setColor(nvbVar.u);
            paint2.setAlpha(nvbVar.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(nvbVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mRing.t;
    }

    public boolean getArrowEnabled() {
        return this.mRing.n;
    }

    public float getArrowHeight() {
        return this.mRing.s;
    }

    public float getArrowScale() {
        return this.mRing.p;
    }

    public float getArrowWidth() {
        return this.mRing.r;
    }

    public int getBackgroundColor() {
        return this.mRing.d.getColor();
    }

    public float getCenterRadius() {
        return this.mRing.q;
    }

    public int[] getColorSchemeColors() {
        return this.mRing.i;
    }

    public float getEndTrim() {
        return this.mRing.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.mRing.g;
    }

    public float getStartTrim() {
        return this.mRing.e;
    }

    public Paint.Cap getStrokeCap() {
        return this.mRing.b.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.mRing.h;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mRing.t = i;
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        nvb nvbVar = this.mRing;
        nvbVar.r = (int) f;
        nvbVar.s = (int) f2;
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        nvb nvbVar = this.mRing;
        if (nvbVar.n != z) {
            nvbVar.n = z;
        }
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        nvb nvbVar = this.mRing;
        if (f != nvbVar.p) {
            nvbVar.p = f;
        }
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        this.mRing.d.setColor(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.mRing.q = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        nvb nvbVar = this.mRing;
        nvbVar.i = iArr;
        nvbVar.a(0);
        this.mRing.a(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.mRing.g = f;
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        nvb nvbVar = this.mRing;
        nvbVar.e = f;
        nvbVar.f = f2;
        invalidateSelf();
    }

    public void setStrokeCap(Paint.Cap cap) {
        this.mRing.b.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        nvb nvbVar = this.mRing;
        nvbVar.h = f;
        nvbVar.b.setStrokeWidth(f);
        invalidateSelf();
    }

    public void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(CENTER_RADIUS_LARGE, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(CENTER_RADIUS, STROKE_WIDTH, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.mAnimator.cancel();
        nvb nvbVar = this.mRing;
        float f = nvbVar.e;
        nvbVar.k = f;
        float f2 = nvbVar.f;
        nvbVar.l = f2;
        nvbVar.m = nvbVar.g;
        if (f2 != f) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666L);
            this.mAnimator.start();
            return;
        }
        nvbVar.a(0);
        nvb nvbVar2 = this.mRing;
        nvbVar2.k = 0.0f;
        nvbVar2.l = 0.0f;
        nvbVar2.m = 0.0f;
        nvbVar2.e = 0.0f;
        nvbVar2.f = 0.0f;
        nvbVar2.g = 0.0f;
        this.mAnimator.setDuration(1332L);
        this.mAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        nvb nvbVar = this.mRing;
        if (nvbVar.n) {
            nvbVar.n = false;
        }
        nvbVar.a(0);
        nvb nvbVar2 = this.mRing;
        nvbVar2.k = 0.0f;
        nvbVar2.l = 0.0f;
        nvbVar2.m = 0.0f;
        nvbVar2.e = 0.0f;
        nvbVar2.f = 0.0f;
        nvbVar2.g = 0.0f;
        invalidateSelf();
    }

    public void updateRingColor(float f, nvb nvbVar) {
        if (f <= 0.75f) {
            nvbVar.u = nvbVar.i[nvbVar.j];
            return;
        }
        int[] iArr = nvbVar.i;
        int i = nvbVar.j;
        nvbVar.u = evaluateColorChange((f - 0.75f) / 0.25f, iArr[i], iArr[(i + 1) % iArr.length]);
    }
}
