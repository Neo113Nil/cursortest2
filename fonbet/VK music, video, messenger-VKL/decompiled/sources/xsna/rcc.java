package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: CircleDrawable.kt */
/* loaded from: classes17.dex */
public final class rcc extends Drawable {
    public final Paint a;
    public final RectF b;
    public int c;
    public float d;
    public boolean e;

    public rcc() {
        this((Object) null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.e;
        Paint paint = this.a;
        if (z) {
            int i = this.c;
            paint.setColor(Color.argb(an10.b(Color.alpha(i) * this.d), Color.red(this.c), Color.green(this.c), Color.blue(this.c)));
            this.e = false;
        }
        canvas.drawOval(this.b, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public rcc(int i) {
        this.a = rqi.b(1, i);
        this.b = new RectF();
        this.c = i;
        this.d = 1.0f;
    }

    public /* synthetic */ rcc(Object obj) {
        this(-16777216);
    }
}
