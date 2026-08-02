package xsna;

import android.graphics.Bitmap;
import xsna.mbf;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jh9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ jh9(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((Bitmap) obj);
                break;
            case 1:
                this.c.invoke(new mbf.b.d((zoa) obj));
                break;
            case 2:
                this.c.invoke(new o9t.n((mhp0) obj));
                break;
            default:
                this.c.invoke(obj);
                break;
        }
        return s3q0.a;
    }
}
