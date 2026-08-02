package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* compiled from: EmojiDrawable.java */
/* loaded from: classes18.dex */
public abstract class cdp extends Drawable {
    public final Rect a;
    public final Paint b;

    public cdp(int i, int i2, int i3) {
        Rect rect = new Rect();
        this.a = rect;
        this.b = new Paint(2);
        setBounds(0, 0, (i2 * 2) + i, (i3 * 2) + i);
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int i4 = i / 2;
        rect.set(centerX - i4, centerY - i4, centerX + i4, centerY + i4);
    }

    public abstract void a(Canvas canvas, Paint paint, Rect rect);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, this.b, this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdp)) {
            return false;
        }
        cdp cdpVar = (cdp) obj;
        return Objects.equals(this.a, cdpVar.a) && Objects.equals(this.b, cdpVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
