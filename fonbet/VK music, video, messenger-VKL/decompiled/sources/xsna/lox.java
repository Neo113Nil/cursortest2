package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: IntervalDrawable.kt */
@ozl
/* loaded from: classes8.dex */
public final class lox extends Drawable {
    public final float a;
    public final float b;
    public final Paint c;
    public List<Pair<Float, Float>> d;
    public int e;
    public float f;

    public lox(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        this.c = paint;
        this.d = EmptyList.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int size = this.d.size();
        int i = 0;
        while (i < size) {
            int i2 = this.e;
            float f = this.a;
            float f2 = (i == i2 ? ((this.b - f) * this.f) + f : f) / 2.0f;
            canvas.drawRoundRect(this.d.get(i).i().floatValue(), getBounds().centerY() - f2, this.d.get(i).j().floatValue(), getBounds().centerY() + f2, f / 2.0f, f / 2.0f, this.c);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return this.c.getAlpha() == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
