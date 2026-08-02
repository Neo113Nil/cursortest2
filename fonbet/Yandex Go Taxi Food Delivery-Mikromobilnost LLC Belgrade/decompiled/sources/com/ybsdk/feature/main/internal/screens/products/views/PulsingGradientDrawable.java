package com.ybsdk.feature.main.internal.screens.products.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.ybsdk.core.utils.ColorModel;
import defpackage.cj11;
import defpackage.dj11;
import defpackage.ej11;
import defpackage.fj11;
import defpackage.i3y;
import defpackage.mzf0;
import defpackage.tcc;
import defpackage.vyf0;
import defpackage.x4e;
import defpackage.yso;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001AB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0018¢\u0006\u0004\b,\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00107\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/products/views/PulsingGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Lfj11;", "gradientConfiguration", "<init>", "(Landroid/content/Context;Lfj11;)V", "", "getLeftGradientPointPosition", "()F", "getRightGradientPointPosition", "getTopGradientPointPosition", "getBottomGradientPointPosition", "", "getGradientOpacity", "()I", "getScaleFactor", "getIncreaseWidthFactor", "getIncreaseHeightFactor", "getGradientOffsetXPosition", "getGradientOffsetYPosition", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "isAnimationInProgress", "()Ljava/lang/Boolean;", "startPulse", "()V", "stopPulse", "Landroid/content/Context;", "Lfj11;", "Landroid/graphics/Paint;", "gradientPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Bitmap;", "gradientBitmapWithConfig$delegate", "Li3y;", "getGradientBitmapWithConfig", "()Landroid/graphics/Bitmap;", "gradientBitmapWithConfig", "value", "pulse", "F", "setPulse", "(F)V", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "Companion", "mzf0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PulsingGradientDrawable extends Drawable {
    public static final mzf0 Companion = new mzf0();
    public static final float DEFAULT_SCALE_FACTOR = 1.5f;
    public static final long DURATION = 2000;
    public static final int MAX_ALPHA_OPACITY_FACTOR = 255;
    private ValueAnimator animator;
    private final Context context;
    private final fj11 gradientConfiguration;
    private float pulse;
    private final Paint gradientPaint = new Paint(1);

    /* renamed from: gradientBitmapWithConfig$delegate, reason: from kotlin metadata */
    private final i3y gradientBitmapWithConfig = a.b(LazyThreadSafetyMode.NONE, new vyf0(1, this));

    public PulsingGradientDrawable(Context context, fj11 fj11Var) {
        this.context = context;
        this.gradientConfiguration = fj11Var;
    }

    private final float getBottomGradientPointPosition() {
        return (getBounds().bottom - (getBounds().height() / 2)) + getGradientOffsetYPosition() + getIncreaseHeightFactor();
    }

    private final Bitmap getGradientBitmapWithConfig() {
        return (Bitmap) this.gradientBitmapWithConfig.getValue();
    }

    private final float getGradientOffsetXPosition() {
        ej11 ej11Var;
        fj11 fj11Var = this.gradientConfiguration;
        if (fj11Var == null || (ej11Var = fj11Var.a) == null) {
            return 0.0f;
        }
        return ej11Var.a;
    }

    private final float getGradientOffsetYPosition() {
        ej11 ej11Var;
        fj11 fj11Var = this.gradientConfiguration;
        if (fj11Var == null || (ej11Var = fj11Var.a) == null) {
            return 0.0f;
        }
        return ej11Var.b;
    }

    private final int getGradientOpacity() {
        cj11 cj11Var;
        cj11 cj11Var2;
        fj11 fj11Var = this.gradientConfiguration;
        float f = 1.0f;
        float f2 = (fj11Var == null || (cj11Var2 = fj11Var.c) == null) ? 1.0f : cj11Var2.d;
        if (fj11Var != null && (cj11Var = fj11Var.c) != null) {
            f = cj11Var.c;
        }
        return (int) x4e.b(f - f2, this.pulse, f2, 255.0f);
    }

    private final float getIncreaseHeightFactor() {
        return (((getScaleFactor() * getBounds().height()) - getBounds().height()) * this.pulse) / 2.0f;
    }

    private final float getIncreaseWidthFactor() {
        return (((getScaleFactor() * getBounds().width()) - getBounds().width()) * this.pulse) / 2.0f;
    }

    private final float getLeftGradientPointPosition() {
        return (getBounds().left + getGradientOffsetXPosition()) - getIncreaseWidthFactor();
    }

    private final float getRightGradientPointPosition() {
        return getBounds().right + getGradientOffsetXPosition() + getIncreaseWidthFactor();
    }

    private final float getScaleFactor() {
        cj11 cj11Var;
        fj11 fj11Var = this.gradientConfiguration;
        if (fj11Var == null || (cj11Var = fj11Var.c) == null) {
            return 1.5f;
        }
        return cj11Var.b;
    }

    private final float getTopGradientPointPosition() {
        return ((getBounds().top - (getBounds().height() / 2)) + getGradientOffsetYPosition()) - getIncreaseHeightFactor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap gradientBitmapWithConfig_delegate$lambda$4(PulsingGradientDrawable pulsingGradientDrawable) {
        int height = pulsingGradientDrawable.getBounds().width() > pulsingGradientDrawable.getBounds().height() ? pulsingGradientDrawable.getBounds().height() : pulsingGradientDrawable.getBounds().width();
        Bitmap createBitmap = Bitmap.createBitmap(height, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        fj11 fj11Var = pulsingGradientDrawable.gradientConfiguration;
        if (fj11Var == null) {
            return null;
        }
        ArrayList arrayList = fj11Var.b;
        float height2 = createBitmap.getHeight() / 2.0f;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ColorModel colorModel = ((dj11) it.next()).a;
            Integer valueOf = colorModel != null ? Integer.valueOf(colorModel.get(pulsingGradientDrawable.context)) : null;
            if (valueOf != null) {
                arrayList2.add(valueOf);
            }
        }
        int[] I0 = kotlin.collections.a.I0(arrayList2);
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(((dj11) it2.next()).b));
        }
        RadialGradient radialGradient = new RadialGradient(height2, height2, height2, I0, kotlin.collections.a.G0(arrayList3), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(radialGradient);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.drawCircle(height2, height2, height2, paint);
        return createBitmap;
    }

    private final void setPulse(float f) {
        this.pulse = f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPulse$lambda$8$lambda$7(PulsingGradientDrawable pulsingGradientDrawable, ValueAnimator valueAnimator) {
        pulsingGradientDrawable.setPulse(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getLeftGradientPointPosition(), getTopGradientPointPosition(), getRightGradientPointPosition(), getBottomGradientPointPosition());
        canvas.saveLayer(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, null);
        Bitmap gradientBitmapWithConfig = getGradientBitmapWithConfig();
        if (gradientBitmapWithConfig != null) {
            Paint paint = this.gradientPaint;
            paint.setAlpha(getGradientOpacity());
            canvas.drawBitmap(gradientBitmapWithConfig, (Rect) null, rectF, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Boolean isAnimationInProgress() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            return Boolean.valueOf(valueAnimator.isRunning());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.gradientPaint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.gradientPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void startPulse() {
        cj11 cj11Var;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        fj11 fj11Var = this.gradientConfiguration;
        ofFloat.setDuration((fj11Var == null || (cj11Var = fj11Var.c) == null) ? 2000L : cj11Var.a);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.addUpdateListener(new yso(23, this));
        this.animator = ofFloat;
        ofFloat.start();
    }

    public final void stopPulse() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.animator = null;
    }
}
