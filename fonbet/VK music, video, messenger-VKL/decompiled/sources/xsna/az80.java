package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: OrientedDrawable.kt */
/* loaded from: classes12.dex */
public final class az80 extends j9s {
    public final Matrix f;
    public final int g;
    public final int h;
    public final Matrix i;
    public final RectF j;

    public az80(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.f = new Matrix();
        this.g = i - (i % 90);
        this.h = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.i = new Matrix();
        this.j = new RectF();
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.g <= 0 && ((i = this.h) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.h;
        return (i == 5 || i == 7 || this.g % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.h;
        return (i == 5 || i == 7 || this.g % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // xsna.j9s, xsna.ujp0
    public final void m(Matrix matrix) {
        o(matrix);
        Matrix matrix2 = this.f;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable == null) {
            return;
        }
        int i = this.h;
        int i2 = this.g;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.f;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.i;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.j;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
