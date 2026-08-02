package xsna;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ColorShadowDrawable.kt */
/* loaded from: classes3.dex */
public final class w7g extends Drawable {
    public static final float[] f = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    public final Paint a;
    public final float b;
    public final int c;
    public final Rect d;
    public int[] e;

    public w7g() {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
        this.a = paint;
        this.b = iah0.a(12);
        this.c = iah0.a(8);
        this.d = new Rect();
        this.e = new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 128)};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = this.d;
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.height(), this.e, f, Shader.TileMode.CLAMP);
        Paint paint = this.a;
        paint.setShader(linearGradient);
        paint.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.NORMAL));
        RectF rectF = new RectF(rect);
        float f2 = this.b;
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = this.c;
        int i7 = i6 * 2;
        Rect rect = this.d;
        if (i5 <= i7 || i4 - i2 <= i6 * 2) {
            rect.set(i, i2, i3, i4);
        } else {
            rect.set(i + i6, i2 + i6, i3 - i6, i4 - i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
