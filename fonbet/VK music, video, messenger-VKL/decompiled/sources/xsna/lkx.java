package xsna;

import java.util.Iterator;
import java.util.List;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lkx implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lkx(String str, long j, List list) {
        this.d = str;
        this.c = j;
        this.e = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final mkx mkxVar = (mkx) this.d;
                final qob qobVar = (qob) this.e;
                wdp0 wdp0Var = mkxVar.j;
                final long j = this.c;
                return (vx70.b) vhk0.h(wdp0Var, "OkHttpExecutor Http Stream", new izs() { // from class: xsna.ekx
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        mkx mkxVar2 = mkx.this;
                        okhttp3.u s = mkxVar2.s(qobVar, j);
                        return new vx70.b(mkxVar2.p(s), s.g, null);
                    }
                }, 6);
            default:
                String str = (String) this.d;
                long j2 = this.c;
                List list = (List) this.e;
                qyg0 V0 = ((hyg0) obj).V0(str);
                try {
                    V0.bindLong(1, j2);
                    Iterator it = list.iterator();
                    int i = 2;
                    while (it.hasNext()) {
                        V0.bindLong(i, ((Number) it.next()).intValue());
                        i++;
                    }
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ lkx(mkx mkxVar, qob qobVar, long j) {
        this.d = mkxVar;
        this.e = qobVar;
        this.c = j;
    }
}
