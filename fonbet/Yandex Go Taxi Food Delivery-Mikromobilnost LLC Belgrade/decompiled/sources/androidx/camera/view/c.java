package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.view.PreviewView;
import defpackage.d6z;
import defpackage.lw01;
import defpackage.sgb1;
import defpackage.xdb1;

/* loaded from: classes10.dex */
public final class c {
    public static final PreviewView.ScaleType i = PreviewView.ScaleType.FILL_CENTER;
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public PreviewView.ScaleType h;

    public final Matrix a(int i2, Rect rect, Size size) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.d);
            matrix.postConcat(c(i2, size));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return lw01.d(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    public final Matrix c(int i2, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        d6z.y(null, f());
        if (lw01.e(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size b = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, b.getWidth(), b.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.ScaleType scaleType = this.h;
            switch (b.a[scaleType.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    sgb1.d("PreviewTransform", "Unexpected crop rect: " + scaleType);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i2 == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix a = lw01.a(new RectF(this.b), rectF, this.c, false);
        if (this.f && this.g) {
            boolean d = lw01.d(this.c);
            Rect rect = this.b;
            if (d) {
                a.preScale(1.0f, -1.0f, rect.centerX(), this.b.centerY());
                return a;
            }
            a.preScale(-1.0f, 1.0f, rect.centerX(), this.b.centerY());
        }
        return a;
    }

    public final Matrix d() {
        d6z.y(null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        return lw01.a(rectF, rectF, !this.g ? this.c : -xdb1.g(this.e), false);
    }

    public final RectF e(int i2, Size size) {
        d6z.y(null, f());
        Matrix c = c(i2, size);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        c.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
