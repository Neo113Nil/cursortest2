package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundedColorDrawable.kt */
/* loaded from: classes6.dex */
public class pog0 extends Drawable {
    public final Paint a;
    public final RectF b;
    public boolean c;
    public final int d;
    public int e;
    public final float f;

    public pog0(int i, int i2) {
        Paint paint = new Paint();
        this.a = paint;
        this.b = new RectF();
        this.c = true;
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.d = -16777216;
        this.c = true;
        invalidateSelf();
        setAlpha(255);
        this.f = 0;
        invalidateSelf();
        this.d = i;
        this.c = true;
        invalidateSelf();
        this.f = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        if (rectF.right <= rectF.left || rectF.bottom <= rectF.top) {
            return;
        }
        boolean z = this.c;
        Paint paint = this.a;
        if (z) {
            paint.setColor(Color.argb((int) ((this.e / 255.0f) * Color.alpha(this.d)), Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
            this.c = false;
        }
        float f = this.f;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRect(rectF, paint);
        } else {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e = i;
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
