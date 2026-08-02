package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import xsna.f5h0;

/* compiled from: CenterCropRectScaleType.kt */
/* loaded from: classes4.dex */
public final class wpa implements f5h0.d {
    public float a;
    public float b;
    public float c;
    public float d;

    @Override // xsna.f5h0.d
    public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        float height;
        float f3;
        float f4 = i;
        float f5 = (this.a / 100.0f) * f4;
        float f6 = (this.b / 100.0f) * f4;
        float f7 = i2;
        float f8 = (this.c / 100.0f) * f7;
        float f9 = f6 - f5;
        float f10 = ((this.d / 100.0f) * f7) - f8;
        float width = rect.width() / f9;
        float height2 = rect.height() / f10;
        if (height2 > width) {
            f3 = (((rect.width() - (f9 * height2)) * 0.5f) + rect.left) - (f5 * height2);
            height = rect.top - (f8 * height2);
            width = height2;
        } else {
            float f11 = rect.left - (f5 * width);
            height = (((rect.height() - (f10 * width)) * 0.5f) + rect.top) - (f8 * width);
            f3 = f11;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f3 + 0.5f), (int) (height + 0.5f));
        return matrix;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !wpa.class.equals(obj.getClass())) {
            return false;
        }
        wpa wpaVar = (wpa) obj;
        return this.a == wpaVar.a && this.b == wpaVar.b && this.c == wpaVar.c && this.d == wpaVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("center_crop_rect (");
        sb.append(this.a);
        sb.append(" - ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(" - ");
        return xq.c(')', this.b, sb);
    }
}
