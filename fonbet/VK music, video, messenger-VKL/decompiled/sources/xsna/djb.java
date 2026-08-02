package xsna;

import okhttp3.p;
import xsna.mkx;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class djb implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ djb(gkb gkbVar, long j, vcb vcbVar) {
        this.d = gkbVar;
        this.c = j;
        this.e = vcbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long j;
        String a;
        switch (this.b) {
            case 0:
                ((gkb) this.d).b.e(this.c, (vcb) this.e);
                return s3q0.a;
            default:
                mkx mkxVar = (mkx) this.d;
                nkx nkxVar = (nkx) this.e;
                p.a t = mkxVar.t(nkxVar, this.c);
                t.c.b("X-Get-Processing-Time", "1");
                okhttp3.p b = t.b();
                okhttp3.u g = mkxVar.g(b);
                vx70.a aVar = new vx70.a(mkxVar.o(g), g.g, mkxVar.i(nkxVar));
                try {
                    a = g.s().a("X-Request-Processing-Time");
                } catch (NumberFormatException unused) {
                }
                if (a != null) {
                    j = (long) (Float.parseFloat(a) * 1000);
                    long j2 = j;
                    okhttp3.t tVar = b.d;
                    return new mkx.b(aVar, j2, tVar == null ? tVar.contentLength() : -1L);
                }
                j = 0;
                long j22 = j;
                okhttp3.t tVar2 = b.d;
                return new mkx.b(aVar, j22, tVar2 == null ? tVar2.contentLength() : -1L);
        }
    }

    public /* synthetic */ djb(mkx mkxVar, nkx nkxVar, long j) {
        this.d = mkxVar;
        this.e = nkxVar;
        this.c = j;
    }
}
