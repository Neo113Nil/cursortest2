package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.p;
import xsna.mkx;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rhx implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rhx(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, xsna.mkx$b] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                shx shxVar = (shx) this.c;
                gy70 gy70Var = (gy70) this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                final mkx mkxVar = (mkx) shxVar.b;
                final nkx nkxVar = (nkx) gy70Var;
                final long j = shxVar.h;
                ?? r3 = (mkx.b) vhk0.h(mkxVar.j, "OkHttpExecutor", new izs() { // from class: xsna.dkx
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        final mkx mkxVar2 = mkx.this;
                        wdp0 wdp0Var = mkxVar2.j;
                        final nkx nkxVar2 = nkxVar;
                        final long j2 = j;
                        return (mkx.b) vhk0.h(wdp0Var, "OkHttpExecutor Method Profile Stream", new izs() { // from class: xsna.kkx
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
                            /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
                            @Override // xsna.izs
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                long j3;
                                String a;
                                mkx mkxVar3 = mkx.this;
                                nkx nkxVar3 = nkxVar2;
                                p.a t = mkxVar3.t(nkxVar3, j2);
                                t.c.b("X-Get-Processing-Time", "1");
                                okhttp3.p b = t.b();
                                okhttp3.u g = mkxVar3.g(b);
                                vx70.b bVar = new vx70.b(mkxVar3.p(g), g.g, mkxVar3.i(nkxVar3));
                                try {
                                    a = g.s().a("X-Request-Processing-Time");
                                } catch (NumberFormatException unused) {
                                }
                                if (a != null) {
                                    j3 = (long) (Float.parseFloat(a) * 1000);
                                    okhttp3.t tVar = b.d;
                                    return new mkx.b(bVar, j3, tVar == null ? tVar.contentLength() : -1L);
                                }
                                j3 = 0;
                                okhttp3.t tVar2 = b.d;
                                return new mkx.b(bVar, j3, tVar2 == null ? tVar2.contentLength() : -1L);
                            }
                        }, 6);
                    }
                }, 4);
                shxVar.c(((vx70.b) r3.a()).b(), gy70Var);
                ref$ObjectRef.element = r3;
                return (vx70.b) r3.a();
            default:
                a1w a1wVar = (a1w) this.c;
                j3f0 j3f0Var = (j3f0) this.d;
                cbw cbwVar = new cbw(a1wVar, j3f0Var.b(), (gx8) this.e);
                cbwVar.r();
                return cbwVar;
        }
    }
}
