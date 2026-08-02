package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoAutoPlaySeekBarGradientDrawable.kt */
/* loaded from: classes2.dex */
public final class a4s0 extends Drawable {
    public final float[] a;
    public final int[] b;
    public final Object c;

    public a4s0(Context context) {
        int color = context.getColor(R.color.vk_black);
        this.a = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.02f, 0.08f, 0.32f, 0.38f, 0.4f};
        this.b = new int[]{l8g.g(color, 0), l8g.g(color, 5), l8g.g(color, 20), l8g.g(color, 82), l8g.g(color, 97), l8g.g(color, 102)};
        this.c = msy.a(LazyThreadSafetyMode.NONE, new qjo0(this, 4));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), (Paint) this.c.getValue());
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Paint) this.c.getValue()).setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().height(), this.b, this.a, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
