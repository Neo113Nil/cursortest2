package xsna;

import java.util.Iterator;
import xsna.f360;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class fkx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fkx(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                mkx mkxVar = (mkx) this.d;
                okhttp3.u s = mkxVar.s((qob) this.e, this.c);
                return new vx70.a(mkxVar.o(s), s.g, null);
            default:
                r9e0 r9e0Var = (r9e0) this.d;
                okhttp3.d dVar = (okhttp3.d) this.e;
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0Var.d.iterator();
                while (it.hasNext()) {
                    it.next().l(dVar, this.c, aVar);
                }
                return s3q0.a;
        }
    }
}
