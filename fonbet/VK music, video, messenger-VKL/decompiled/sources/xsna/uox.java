package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: IntervalsDrawable.kt */
/* loaded from: classes8.dex */
public final class uox extends Drawable {
    public final float a;
    public List<wjo> b = EmptyList.b;
    public final Paint c;

    public uox(int i, float f) {
        this.a = f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        this.c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int centerY = getBounds().centerY();
        for (int i = 0; i < this.b.size(); i++) {
            float f = this.b.get(i).a;
            float f2 = this.b.get(i).b;
            float f3 = this.a;
            float f4 = centerY - (f3 / 2.0f);
            canvas.drawRect(f, f4, f2, f4 + f3, this.c);
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
