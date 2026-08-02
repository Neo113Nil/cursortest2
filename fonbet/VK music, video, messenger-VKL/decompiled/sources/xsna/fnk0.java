package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: SquircleStrokeDrawable.kt */
/* loaded from: classes17.dex */
public final class fnk0 extends Drawable {
    public final double a = 3.9d;
    public final Path b = new Path();
    public final Paint c;
    public final float d;

    public fnk0(float f, int i) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = f;
        mws mwsVar = ink0.a;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setColor(i);
        a(getBounds());
    }

    public final void a(Rect rect) {
        int i;
        int b = an10.b(this.d / 2.0f);
        if (rect != null && rect.width() > (i = b * 2) && rect.height() > i) {
            rect = new Rect(rect.left + b, rect.top + b, rect.right - b, rect.bottom - b);
        }
        Matrix matrix = hnk0.a;
        hnk0.a(this.b, this.a, rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.b, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
