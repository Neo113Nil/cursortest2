package com.yandex.fintechsdk.adapters.divkit.sdk.impl.internal.glowingborder;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.fkt;
import defpackage.yso;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 12\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010&R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/yandex/fintechsdk/adapters/divkit/sdk/impl/internal/glowingborder/GlowingBorderDrawable;", "Landroid/graphics/drawable/Drawable;", "", "strokeWidth", "", "animationDuration", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "gradientColors", "", "phaseBezier", "<init>", "(FJF[I[F)V", "Landroid/graphics/Rect;", "bounds", "Landroid/graphics/Canvas;", "canvas", "halfStrokeWidth", "Lzy11;", "drawGlowEffect", "(Landroid/graphics/Rect;Landroid/graphics/Canvas;F)V", "startAnimation", "()V", "draw", "(Landroid/graphics/Canvas;)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "onBoundsChange", "(Landroid/graphics/Rect;)V", "J", "F", "[I", "[F", "Landroid/graphics/Paint;", "borderPaint", "Landroid/graphics/Paint;", "glowPaint", "animationAngle", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "Companion", "fkt", "impl-32-30-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GlowingBorderDrawable extends Drawable {

    @Deprecated
    public static final float ANIMATION_ANGLE_OFFSET = -60.0f;

    @Deprecated
    public static final float ANIMATION_ROTATION_END = 0.0f;

    @Deprecated
    public static final float ANIMATION_ROTATION_START = 360.0f;
    private static final fkt Companion = new fkt();
    private static final int[] GLOW_COLORS = {0, 0, -1, 0, 0};
    private static final float[] GLOW_POSITIONS = {0.0f, 0.3f, 0.5f, 0.7f, 1.0f};

    @Deprecated
    public static final int PHASE_BEZIER_SIZE = 4;
    private float animationAngle;
    private final long animationDuration;
    private ValueAnimator animator;
    private final Paint borderPaint;
    private final float cornerRadius;
    private final Paint glowPaint;
    private final int[] gradientColors;
    private final float[] phaseBezier;

    public GlowingBorderDrawable(float f, long j, float f2, int[] iArr, float[] fArr) {
        this.animationDuration = j;
        this.cornerRadius = f2;
        this.gradientColors = iArr;
        this.phaseBezier = fArr;
        Paint paint = new Paint();
        paint.setColor(-65536);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f);
        this.borderPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeWidth(f);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        this.glowPaint = paint2;
        this.animationAngle = -60.0f;
        startAnimation();
    }

    private final void drawGlowEffect(Rect bounds, Canvas canvas, float halfStrokeWidth) {
        float width = bounds.width() / 2.0f;
        float height = bounds.height() / 2.0f;
        SweepGradient sweepGradient = new SweepGradient(width, height, GLOW_COLORS, GLOW_POSITIONS);
        Matrix matrix = new Matrix();
        matrix.postRotate(this.animationAngle, width, height);
        sweepGradient.setLocalMatrix(matrix);
        this.glowPaint.setShader(sweepGradient);
        float f = this.cornerRadius;
        canvas.drawRoundRect(bounds.left + halfStrokeWidth, bounds.top + halfStrokeWidth, bounds.right - halfStrokeWidth, bounds.bottom - halfStrokeWidth, f, f, this.glowPaint);
    }

    private final void startAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(360.0f, 0.0f);
        ofFloat.setDuration(this.animationDuration);
        float[] fArr = this.phaseBezier;
        ofFloat.setInterpolator(fArr.length == 4 ? new PathInterpolator(fArr[0], fArr[1], fArr[2], fArr[3]) : new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new yso(5, this));
        ofFloat.start();
        this.animator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$3$lambda$2(GlowingBorderDrawable glowingBorderDrawable, ValueAnimator valueAnimator) {
        glowingBorderDrawable.animationAngle = ((Float) valueAnimator.getAnimatedValue()).floatValue() - 60.0f;
        glowingBorderDrawable.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float strokeWidth = this.borderPaint.getStrokeWidth() / 2.0f;
        if (!(this.gradientColors.length == 0)) {
            this.borderPaint.setShader(new LinearGradient(bounds.left + strokeWidth, bounds.top + strokeWidth, bounds.right - strokeWidth, bounds.bottom - strokeWidth, this.gradientColors, (float[]) null, Shader.TileMode.CLAMP));
        }
        float f = this.cornerRadius;
        canvas.drawRoundRect(bounds.left + strokeWidth, bounds.top + strokeWidth, bounds.right - strokeWidth, bounds.bottom - strokeWidth, f, f, this.borderPaint);
        drawGlowEffect(bounds, canvas, strokeWidth);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.borderPaint.setAlpha(alpha);
        this.glowPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.borderPaint.setColorFilter(colorFilter);
        this.glowPaint.setColorFilter(colorFilter);
    }
}
