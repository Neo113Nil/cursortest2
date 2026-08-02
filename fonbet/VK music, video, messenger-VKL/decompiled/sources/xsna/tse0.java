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

/* compiled from: QuoteDrawable.kt */
/* loaded from: classes15.dex */
public final class tse0 extends Drawable {
    public final Path a = new Path();
    public final Paint b;
    public int[] c;
    public boolean d;
    public float e;

    public tse0() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        this.e = iah0.a(12);
    }

    public final void a() {
        int width = getBounds().width();
        if (width == 0) {
            return;
        }
        this.b.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b() {
        float width = getBounds().width();
        float height = getBounds().height();
        if (width * height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f = this.e;
        float f2 = width - (f * 0.75f);
        float f3 = height - (f / 6.0f);
        Path path = this.a;
        path.reset();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e);
        path.quadTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(f2 - this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.quadTo(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, this.e);
        path.lineTo(f2, f3 - (this.e * 0.75f));
        path.quadTo(f2, f3, width, height);
        float f4 = this.e;
        path.quadTo(width - f4, height, f2 - (f4 * 1.45f), height - iah0.a(6));
        path.quadTo(f2, f3, width * 0.8606322f, f3);
        path.lineTo(this.e, f3);
        path.quadTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 - this.e);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        if (this.d) {
            canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height());
        }
        canvas.drawPath(this.a, this.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        b();
        a();
    }
}
