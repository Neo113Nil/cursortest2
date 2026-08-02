package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: MatrixDrawable.java */
/* loaded from: classes.dex */
public final class jn10 extends j9s {
    public int f;
    public int g;

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null && (this.f != drawable.getIntrinsicWidth() || this.g != drawable.getIntrinsicHeight())) {
            q();
        }
        super.draw(canvas);
    }

    @Override // xsna.j9s, xsna.ujp0
    public final void m(Matrix matrix) {
        o(matrix);
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        q();
    }

    @Override // xsna.j9s
    public final Drawable p(Drawable drawable) {
        Drawable p = super.p(drawable);
        q();
        return p;
    }

    public final void q() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.g = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }
}
