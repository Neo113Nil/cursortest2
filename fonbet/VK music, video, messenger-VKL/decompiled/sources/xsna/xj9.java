package xsna;

import android.graphics.Bitmap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xj9 implements izs {
    public final /* synthetic */ yj9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ xj9(yj9 yj9Var, int i, int i2) {
        this.b = yj9Var;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Bitmap bitmap = (Bitmap) obj;
        this.b.getClass();
        int i2 = this.c;
        return (i2 <= 0 || (i = this.d) <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, i2, i, false);
    }
}
