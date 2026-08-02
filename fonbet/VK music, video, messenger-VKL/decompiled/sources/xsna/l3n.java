package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: DiscoverMediaForegroundDrawable.kt */
/* loaded from: classes4.dex */
public final class l3n extends Drawable {
    public Drawable a;
    public final Rect b = new Rect();
    public final int c = cn70.b(2);
    public final int d = cn70.b(2);
    public final int e = cn70.b(28);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.a;
        int i = this.e;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : i;
        Drawable drawable2 = this.a;
        int intrinsicHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : i;
        int i2 = i - intrinsicWidth;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i2 / 2;
        int i4 = i - intrinsicHeight;
        int i5 = i4 >= 0 ? i4 : 0;
        int i6 = (rect.right - this.d) - i3;
        int i7 = rect.top + this.c + (i5 / 2);
        Rect rect2 = this.b;
        rect2.set(i6 - intrinsicWidth, i7, i6, intrinsicHeight + i7);
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.setBounds(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
