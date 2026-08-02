package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: SquircleColorDrawable.kt */
/* loaded from: classes17.dex */
public final class enk0 extends Drawable {
    public final double a;
    public final Path b;
    public final Paint c;

    public /* synthetic */ enk0(int i) {
        this(3.9d, i);
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
        super.onBoundsChange(rect);
        Matrix matrix = hnk0.a;
        hnk0.a(this.b, this.a, rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public enk0(double d, int i) {
        this.a = d;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.b = path;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.c = paint;
        mws mwsVar = ink0.a;
        if (d >= 2.0d) {
            Matrix matrix = hnk0.a;
            hnk0.a(path, d, getBounds());
        } else {
            throw new IllegalArgumentException("Curvature must be >= 2.0: " + d);
        }
    }
}
