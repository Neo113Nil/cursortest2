package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.graphics.Colormap;
import xsna.zcl;

/* compiled from: LinearGradientDrawable.kt */
/* loaded from: classes7.dex */
public final class LinearGradientDrawable extends Drawable {
    public static final Companion Companion = new Companion(null);
    private final float angle;
    private final Colormap colormap;
    private final Paint paint = new Paint();
    private RectF rect = new RectF();

    /* compiled from: LinearGradientDrawable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final float toRadian(float f) {
            return (float) ((f * 3.141592653589793d) / 180.0f);
        }

        public final LinearGradient createLinearGradient(float f, int[] iArr, float[] fArr, int i, int i2) {
            float f2 = i;
            float f3 = f2 / 2.0f;
            float f4 = i2;
            float f5 = f4 / 2.0f;
            double radian = toRadian(f);
            float abs = Math.abs(f4 * ((float) Math.sin(radian))) + Math.abs(f2 * ((float) Math.cos(radian)));
            float snap$default = LinearGradientDrawableKt.snap$default((((float) Math.cos(radian)) * abs) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);
            float snap$default2 = LinearGradientDrawableKt.snap$default((((float) Math.sin(radian)) * abs) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);
            return new LinearGradient(f3 - snap$default, f5 + snap$default2, f3 + snap$default, f5 - snap$default2, iArr, fArr, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    public LinearGradientDrawable(float f, Colormap colormap) {
        this.angle = f;
        this.colormap = colormap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createLinearGradient(this.angle, this.colormap.getColors(), this.colormap.getPositions(), rect.width(), rect.height()));
        this.rect.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
