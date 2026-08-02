package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;

/* compiled from: BubbleDrawable.java */
/* loaded from: classes13.dex */
public final class jl8 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public int c = -1;

    public jl8(Context context) {
        this.b = context.getDrawable(R.drawable.amu_bubble_mask);
        this.a = context.getDrawable(R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.b.draw(canvas);
        canvas.drawColor(this.c, PorterDuff.Mode.SRC_IN);
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.b.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.b.setBounds(rect);
        this.a.setBounds(rect);
    }
}
