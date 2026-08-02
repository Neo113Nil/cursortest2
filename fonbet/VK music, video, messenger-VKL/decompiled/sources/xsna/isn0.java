package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TabGlowDrawable.kt */
/* loaded from: classes6.dex */
public final class isn0 extends Drawable {
    public final int a;
    public final int b = -1;
    public final float c = 7.0f;
    public final float d = 1.3f;
    public final float e = 0.6f;
    public final float f = 16.0f;
    public final int g;
    public final Paint h;
    public final Matrix i;

    public isn0(int i, int i2) {
        this.a = i;
        this.g = i2;
        Paint paint = new Paint(1);
        paint.setDither(true);
        this.h = paint;
        this.i = new Matrix();
    }

    public static int a(int i, int i2) {
        return (i & 16777215) | (swe0.g(i2, 0, 255) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        float exactCenterX = bounds.exactCenterX();
        float b = bounds.bottom - iah0.b(this.c);
        int i = this.a;
        RadialGradient radialGradient = new RadialGradient(exactCenterX, b, bounds.height() * 0.9f, new int[]{a(i, 187), a(i, 85), a(i, 34), a(i, 13), 0}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.18f, 0.45f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.i;
        matrix.reset();
        matrix.postScale(this.e, this.d, exactCenterX, b);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.h;
        paint.setShader(radialGradient);
        Path path = new Path();
        int i2 = this.g;
        int i3 = i2 & 1;
        float f = this.f;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float b2 = i3 != 0 ? iah0.b(f) : 0.0f;
        float b3 = i3 != 0 ? iah0.b(f) : 0.0f;
        int i4 = i2 & 2;
        float b4 = i4 != 0 ? iah0.b(f) : 0.0f;
        float b5 = i4 != 0 ? iah0.b(f) : 0.0f;
        int i5 = i2 & 4;
        float b6 = i5 != 0 ? iah0.b(f) : 0.0f;
        float b7 = i5 != 0 ? iah0.b(f) : 0.0f;
        int i6 = i2 & 8;
        float b8 = i6 != 0 ? iah0.b(f) : 0.0f;
        if (i6 != 0) {
            f2 = iah0.b(f);
        }
        path.addRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, new float[]{b2, b3, b4, b5, b6, b7, b8, f2}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        paint.setShader(null);
        paint.setColor(this.b);
        canvas.drawCircle(exactCenterX, b, iah0.b(2.0f), paint);
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
