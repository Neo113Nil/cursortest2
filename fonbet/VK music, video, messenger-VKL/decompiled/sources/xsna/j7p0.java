package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TopBarBonusGradientDrawable.kt */
/* loaded from: classes5.dex */
public final class j7p0 extends Drawable {
    public final float a;
    public final Paint b = new Paint(1);
    public final int[] c = {n8g.l(16766028, 255), n8g.l(16766028, 255), n8g.l(16750126, 255), n8g.l(16734067, 255), n8g.l(16408739, 255)};
    public final float[] d = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.04f, 0.35f, 0.7f, 1.0f};

    public j7p0(float f) {
        this.a = f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float width = rect.width();
        float height = rect.height();
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.b.setShader(new RadialGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.sqrt((height * height) + (width * width)), this.c, this.d, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
