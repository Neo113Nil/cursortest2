package com.yandex.div.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.aur0;
import defpackage.g8e;
import defpackage.jxi;
import defpackage.mxp0;
import defpackage.ztr0;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$DoubleRef;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001fH\u0017¢\u0006\u0004\b4\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R*\u0010\u000e\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/yandex/div/shimmer/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Lztr0;", "initialConfig", "", "animationStartTime", "<init>", "(Lztr0;J)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "drawRect", "Laur0;", ConfigConstants.CONFIG, "Landroid/graphics/Paint;", "shimmerPaint", "Lzy11;", "drawCustomRoundRect", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Laur0;Landroid/graphics/Paint;)V", "", "start", "percent", "offsetSymmetric", "(FF)F", "updateValueAnimator", "()V", "updateShader", "Landroid/animation/ValueAnimator;", "createValueAnimator", "()Landroid/animation/ValueAnimator;", "", "angle", "normalizeAngle", "(I)I", "stop", "", "isRunning", "()Z", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "J", "value", "Lztr0;", "getConfig", "()Lztr0;", "setConfig", "(Lztr0;)V", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "Landroid/graphics/Matrix;", "shaderMatrix", "Landroid/graphics/Matrix;", "Landroid/graphics/Path;", "customRoundRectPath", "Landroid/graphics/Path;", "", "pathRadii", "[F", "valueAnimator", "Landroid/animation/ValueAnimator;", "isStopped", "Z", "div-shimmer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShimmerDrawable extends Drawable implements Animatable {
    private final long animationStartTime;
    private ztr0 config;
    private final Path customRoundRectPath;
    private final RectF drawRect;
    private boolean isStopped;
    private final float[] pathRadii;
    private final Matrix shaderMatrix;
    private final Paint shimmerPaint;
    private final ValueAnimator.AnimatorUpdateListener updateListener = new mxp0(8, this);
    private ValueAnimator valueAnimator;

    public ShimmerDrawable(ztr0 ztr0Var, long j) {
        this.animationStartTime = j;
        this.config = ztr0Var;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setAntiAlias(true);
        updateShader();
        this.shimmerPaint = paint;
        this.drawRect = new RectF();
        this.shaderMatrix = new Matrix();
        this.customRoundRectPath = new Path();
        this.pathRadii = new float[8];
        this.valueAnimator = createValueAnimator();
    }

    private final ValueAnimator createValueAnimator() {
        this.config.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (0 / r0.d) + 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatMode(1);
        this.config.getClass();
        ofFloat.setStartDelay(0L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(this.config.d);
        ofFloat.setCurrentPlayTime(SystemClock.uptimeMillis() - this.animationStartTime);
        ofFloat.addUpdateListener(this.updateListener);
        return ofFloat;
    }

    private static final float draw$translateHeight(Ref$DoubleRef ref$DoubleRef, ShimmerDrawable shimmerDrawable) {
        float tan = (float) Math.tan(Math.toRadians(ref$DoubleRef.element));
        return (shimmerDrawable.drawRect.width() * Math.abs(tan)) + shimmerDrawable.drawRect.height();
    }

    private static final float draw$translateWidth(Ref$DoubleRef ref$DoubleRef, ShimmerDrawable shimmerDrawable) {
        float tan = (float) Math.tan(Math.toRadians(ref$DoubleRef.element));
        return (shimmerDrawable.drawRect.height() * Math.abs(tan)) + shimmerDrawable.drawRect.width();
    }

    private final void drawCustomRoundRect(Canvas canvas, RectF drawRect, aur0 config, Paint shimmerPaint) {
        Path path = this.customRoundRectPath;
        path.reset();
        float[] fArr = this.pathRadii;
        float f = config.a;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = config.b;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = config.d;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = config.c;
        fArr[6] = f4;
        fArr[7] = f4;
        path.addRoundRect(drawRect, fArr, Path.Direction.CW);
        canvas.drawPath(this.customRoundRectPath, shimmerPaint);
    }

    private final int normalizeAngle(int angle) {
        if (angle < 0) {
            angle += 360;
        }
        return angle % 360;
    }

    private final float offsetSymmetric(float start, float percent) {
        return g8e.b(-start, start, percent, start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateListener$lambda$0(ShimmerDrawable shimmerDrawable, ValueAnimator valueAnimator) {
        if (shimmerDrawable.getCallback() == null) {
            shimmerDrawable.valueAnimator.cancel();
        }
        shimmerDrawable.invalidateSelf();
    }

    private final void updateShader() {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0) {
            return;
        }
        int normalizeAngle = normalizeAngle((int) this.config.c);
        boolean z = (45 <= normalizeAngle && normalizeAngle < 135) || (225 <= normalizeAngle && normalizeAngle < 315);
        float f = z ? 0.0f : width;
        float f2 = z ? height : 0.0f;
        Paint paint = this.shimmerPaint;
        ztr0 ztr0Var = this.config;
        paint.setShader(new LinearGradient(0.0f, 0.0f, f, f2, ztr0Var.a, ztr0Var.b, Shader.TileMode.CLAMP));
    }

    private final void updateValueAnimator() {
        this.valueAnimator.removeAllUpdateListeners();
        this.valueAnimator.cancel();
        this.valueAnimator = createValueAnimator();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float offsetSymmetric;
        float f;
        Shader shader = this.shimmerPaint.getShader();
        if (shader == null) {
            return;
        }
        Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
        ref$DoubleRef.element = this.config.c;
        float floatValue = ((Float) this.valueAnimator.getAnimatedValue()).floatValue();
        int normalizeAngle = normalizeAngle((int) this.config.c);
        float f2 = 0.0f;
        if (45 <= normalizeAngle && normalizeAngle < 135) {
            ref$DoubleRef.element -= 90.0d;
            f = offsetSymmetric(-draw$translateHeight(ref$DoubleRef, this), floatValue);
        } else if (225 > normalizeAngle || normalizeAngle >= 315) {
            if (135 > normalizeAngle || normalizeAngle >= 225) {
                offsetSymmetric = offsetSymmetric(-draw$translateWidth(ref$DoubleRef, this), floatValue);
            } else {
                ref$DoubleRef.element -= 180.0d;
                offsetSymmetric = offsetSymmetric(draw$translateWidth(ref$DoubleRef, this), floatValue);
            }
            f2 = offsetSymmetric;
            f = 0.0f;
        } else {
            ref$DoubleRef.element -= 270.0d;
            f = offsetSymmetric(draw$translateHeight(ref$DoubleRef, this), floatValue);
        }
        this.shaderMatrix.reset();
        this.shaderMatrix.setRotate((float) ref$DoubleRef.element, this.drawRect.width() / 2.0f, this.drawRect.height() / 2.0f);
        this.shaderMatrix.preTranslate(f2, f);
        shader.setLocalMatrix(this.shaderMatrix);
        if (!this.isStopped) {
            start();
        }
        aur0 aur0Var = this.config.e;
        RectF rectF = this.drawRect;
        if (aur0Var != null) {
            drawCustomRoundRect(canvas, rectF, aur0Var, this.shimmerPaint);
        } else {
            canvas.drawRect(rectF, this.shimmerPaint);
        }
    }

    public final ztr0 getConfig() {
        return this.config;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawRect.set(bounds);
        updateShader();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setConfig(ztr0 ztr0Var) {
        this.config = ztr0Var;
        updateShader();
        updateValueAnimator();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.isStopped = false;
        if (this.valueAnimator.isStarted()) {
            return;
        }
        this.valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isStopped = true;
        this.valueAnimator.cancel();
    }
}
