package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d;

/* loaded from: classes11.dex */
public final /* synthetic */ class k840 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;

    public /* synthetic */ k840(float f, long j, a aVar) {
        this.b = f;
        this.c = j;
        this.w = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                d.b((f530) obj3, this.b, this.c, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                a aVar = (a) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 j = an91.j(ljs0.p(c530.a, 40.0f, 24.0f, this.b, 0.0f, 8), avz0.a);
                    z910 d = pi6.d(x4c.b, false);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, j);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.f, d);
                    qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                    wls wlsVar = androidx.compose.ui.node.d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
                    sb2.c(new vvf0[]{bfe.a.a(new ldc(this.c)), vqy0.a.a(eq11.a(khc0.d, btsVar))}, aVar, btsVar, 8);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ k840(f530 f530Var, float f, long j, int i) {
        this.w = f530Var;
        this.b = f;
        this.c = j;
    }
}
