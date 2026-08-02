package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import xsna.f5h0;

/* compiled from: AlignRightCrop.java */
/* loaded from: classes2.dex */
public final class bt1 extends f5h0.b {
    public static final bt1 a = new bt1();

    @Override // xsna.f5h0.b
    public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        if (f4 > f3) {
            f3 = f4;
        }
        float width = (rect.width() - (i * f3)) + rect.left;
        float f5 = rect.top;
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (width + 0.5f), (int) (f5 + 0.5f));
    }

    public final String toString() {
        return "align_right_crop";
    }
}
