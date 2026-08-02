package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ScrimBottomDrawable.kt */
/* loaded from: classes16.dex */
public final class heh0 extends Drawable {
    public static final int[] b;
    public static final float[] c;
    public final Paint a = rqi.b(1, -1);

    /* compiled from: ScrimBottomDrawable.kt */
    public static final class a {
        public static final int a(a aVar, float f) {
            return n8g.l(-16777216, (int) (255 * f));
        }
    }

    static {
        a aVar = new a();
        b = new int[]{0, a.a(aVar, 0.02f), a.a(aVar, 0.06f), a.a(aVar, 0.12f), a.a(aVar, 0.2f), a.a(aVar, 0.29f), a.a(aVar, 0.39f), a.a(aVar, 0.5f), a.a(aVar, 0.61f), a.a(aVar, 0.71f), a.a(aVar, 0.8f), a.a(aVar, 0.88f), a.a(aVar, 0.94f), a.a(aVar, 0.98f), -16777216};
        c = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.09f, 0.19f, 0.28f, 0.38f, 0.48f, 0.57f, 0.66f, 0.74f, 0.81f, 0.88f, 0.93f, 0.97f, 0.99f, 1.0f};
    }

    public heh0() {
        a();
    }

    public final void a() {
        if (getBounds().isEmpty()) {
            return;
        }
        this.a.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().height(), b, c, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width(), getBounds().height(), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
