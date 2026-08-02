package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class ej0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sls b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    public /* synthetic */ ej0(sls slsVar, sls slsVar2, sls slsVar3, String str, String str2) {
        this.b = slsVar;
        this.c = slsVar2;
        this.w = slsVar3;
        this.x = str;
        this.y = str2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        int i2 = 2;
        final int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    rma1.b(this.x, this.y, this.b, this.c, this.w, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sic a = qic.a(lr20.c, x4c.H, btsVar2, 48);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    c530 c530Var = c530.a;
                    f530 d = b.d(btsVar2, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a);
                    qje.W(btsVar2, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar);
                    }
                    qje.W(btsVar2, d.d, d);
                    final sls slsVar2 = this.b;
                    boolean k = btsVar2.k(slsVar2);
                    final sls slsVar3 = this.c;
                    boolean k2 = k | btsVar2.k(slsVar3);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    Object obj3 = Q;
                    if (k2 || Q == o430Var) {
                        final boolean z2 = z ? 1 : 0;
                        sls slsVar4 = new sls() { // from class: gj0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = z2;
                                zy11 zy11Var2 = zy11.a;
                                sls slsVar5 = slsVar3;
                                sls slsVar6 = slsVar2;
                                switch (i4) {
                                    case 0:
                                        slsVar6.invoke();
                                        slsVar5.invoke();
                                        break;
                                    default:
                                        slsVar6.invoke();
                                        slsVar5.invoke();
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar2.o0(slsVar4);
                        obj3 = slsVar4;
                    }
                    f530 d2 = q791.d(c530Var, false, null, null, (sls) obj3, 15);
                    a S = wwg.S(1546375601, true, new q0(this.x, i3), btsVar2);
                    e2d.a.getClass();
                    web1.c(d2, 40.0f, false, 0.0f, null, null, S, null, null, e2d.b, null, null, false, btsVar2, 806879232, 0, 7612);
                    dk91.a(0.0f, 0, 7, 0L, btsVar2, null);
                    final sls slsVar5 = this.w;
                    boolean k3 = btsVar2.k(slsVar5) | btsVar2.k(slsVar3);
                    Object Q2 = btsVar2.Q();
                    Object obj4 = Q2;
                    if (k3 || Q2 == o430Var) {
                        sls slsVar6 = new sls() { // from class: gj0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i3;
                                zy11 zy11Var2 = zy11.a;
                                sls slsVar52 = slsVar3;
                                sls slsVar62 = slsVar5;
                                switch (i4) {
                                    case 0:
                                        slsVar62.invoke();
                                        slsVar52.invoke();
                                        break;
                                    default:
                                        slsVar62.invoke();
                                        slsVar52.invoke();
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar2.o0(slsVar6);
                        obj4 = slsVar6;
                    }
                    web1.c(q791.d(c530Var, false, null, null, (sls) obj4, 15), 40.0f, false, 0.0f, null, null, wwg.S(-1504410278, true, new q0(this.y, i2), btsVar2), null, null, e2d.c, null, null, false, btsVar2, 806879232, 0, 7612);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ ej0(String str, String str2, sls slsVar, sls slsVar2, sls slsVar3) {
        this.x = str;
        this.y = str2;
        this.b = slsVar;
        this.c = slsVar2;
        this.w = slsVar3;
    }
}
