package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: TypingDrawable.kt */
/* loaded from: classes7.dex */
public final class vup0 extends Drawable {
    public static final int e = 4 + 6;
    public static final int f = 4 + 22;
    public static final int g = 4 + 38;
    public static final int h = 4 + 44;
    public final Paint a;
    public volatile boolean b;
    public final boolean c;
    public float d;

    public vup0(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.b = true;
        this.c = qq2.d(context);
        paint.setAntiAlias(true);
        paint.setColor(-1);
    }

    public static float a(float f2) {
        return iah0.a(f2) / 2;
    }

    public final void b(Canvas canvas, float f2, float f3, float f4) {
        Paint paint = this.a;
        paint.setAlpha((int) (((0.6f * f2) + 0.4f) * 255));
        canvas.drawCircle(f3, f4, (a(2) * f2) + a(4), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f2 = 2;
        float f3 = 1;
        b(canvas, (((float) Math.sin(this.d + f2)) + f3) / f2, a(e), getBounds().centerY());
        b(canvas, (((float) Math.sin(this.d + f3)) + f3) / f2, a(f), getBounds().centerY());
        b(canvas, (((float) Math.sin(this.d)) + f3) / f2, a(g), getBounds().centerY());
        this.d += 0.15f;
        if (!this.b || this.c) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) a(18);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) a(h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getAlpha();
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
