package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: PathToSnapshotConverter.kt */
/* loaded from: classes4.dex */
public final class xq90 implements vap<hq90, hak0<hq90>> {
    public final int a;
    public final RectF b = new RectF();

    public xq90(int i) {
        this.a = i;
    }

    @Override // xsna.vap
    public final hak0 a(uap uapVar) {
        hq90 hq90Var = (hq90) uapVar;
        RectF rectF = this.b;
        fa8.a(hq90Var, rectF);
        int b = an10.b(rectF.left);
        int i = this.a;
        int i2 = b - i;
        if (i2 < 0) {
            i2 = 0;
        }
        int b2 = an10.b(rectF.top) - i;
        if (b2 < 0) {
            b2 = 0;
        }
        int b3 = an10.b(rectF.right) + i;
        if (b3 < 0) {
            b3 = 0;
        }
        int b4 = an10.b(rectF.bottom) + i;
        int i3 = b4 >= 0 ? b4 : 0;
        if (b3 == 0 || i3 == 0) {
            return null;
        }
        float f = i2;
        float f2 = b2;
        Bitmap a = pak0.a(hq90Var, b3, i3);
        if (a == null) {
            return null;
        }
        hak0 hak0Var = new hak0(hq90Var, Bitmap.createBitmap(a, i2, b2, b3 - i2, i3 - b2), new kif0(r1.getWidth(), r1.getHeight()), this);
        hak0Var.f.setTranslate(f, f2);
        return hak0Var;
    }
}
