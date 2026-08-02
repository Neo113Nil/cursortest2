package xsna;

import android.graphics.Bitmap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ogr0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ogr0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int i = this.b;
        int i2 = this.c;
        return (i > 0 || i2 > 0) ? kd7.b(bitmap, i, i2, false, false) : bitmap;
    }
}
