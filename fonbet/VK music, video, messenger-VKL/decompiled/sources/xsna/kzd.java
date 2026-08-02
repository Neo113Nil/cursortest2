package xsna;

import java.util.concurrent.TimeUnit;
import xsna.lzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kzd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kzd(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                lzd.a aVar = (lzd.a) obj;
                rye ryeVar = aVar.c;
                if (ryeVar != null) {
                    l1 l1Var = new l1(aVar, 27);
                    int i2 = rye.j;
                    ryeVar.n(TimeUnit.SECONDS.toMillis(1L), l1Var, z);
                }
                return s3q0.a;
            default:
                return "#clear db " + ((String) obj) + " succeed: " + z;
        }
    }
}
