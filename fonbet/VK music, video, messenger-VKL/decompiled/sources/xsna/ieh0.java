package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ScrimBottomDrawable.kt */
/* loaded from: classes17.dex */
public class ieh0 extends Drawable {
    public static final int[] f = {0, n8g.l(-16777216, 5), n8g.l(-16777216, 15), n8g.l(-16777216, 30), n8g.l(-16777216, 51), n8g.l(-16777216, 73), n8g.l(-16777216, 99), n8g.l(-16777216, 127), n8g.l(-16777216, 155), n8g.l(-16777216, 181), n8g.l(-16777216, 204), n8g.l(-16777216, 224), n8g.l(-16777216, 239), n8g.l(-16777216, 249), -16777216};
    public static final float[] g = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.09f, 0.19f, 0.28f, 0.38f, 0.48f, 0.57f, 0.66f, 0.74f, 0.81f, 0.88f, 0.93f, 0.97f, 0.99f, 1.0f};
    public boolean b;
    public boolean c;
    public final float[] a = new float[8];
    public final Paint d = rqi.b(1, -1);
    public final Path e = new Path();

    public ieh0() {
        a();
    }

    public final void a() {
        this.d.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().bottom, f, g, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f2 = getBounds().top;
        float width = getBounds().width();
        float f3 = getBounds().bottom;
        boolean z = this.b;
        Paint paint = this.d;
        if (!z) {
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, width, f3, paint);
            return;
        }
        if (this.c) {
            float f4 = this.a[0];
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, width, f3, f4, f4, paint);
        } else {
            Path path = this.e;
            path.reset();
            path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, width, f3, this.a, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
