package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DiscoverScrimGradientDrawable.kt */
/* loaded from: classes18.dex */
public final class n6n extends Drawable {
    public static final int[] b = {0, n8g.l(-16777216, 5), n8g.l(-16777216, 12), n8g.l(-16777216, 30), n8g.l(-16777216, 51), n8g.l(-16777216, 73), n8g.l(-16777216, 99), n8g.l(-16777216, 127), n8g.l(-16777216, 155), n8g.l(-16777216, 181), n8g.l(-16777216, 204), n8g.l(-16777216, 224), n8g.l(-16777216, 242), n8g.l(-16777216, 249), -16777216};
    public static final float[] c = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.09f, 0.19f, 0.28f, 0.38f, 0.48f, 0.57f, 0.66f, 0.74f, 0.81f, 0.88f, 0.93f, 0.97f, 0.99f, 1.0f};
    public final Paint a = rqi.b(1, -1);

    public n6n() {
        a();
    }

    public final void a() {
        this.a.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().height(), b, c, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width(), getBounds().height(), this.a);
    }

    @Override // android.graphics.drawable.Drawable
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
