package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class nau implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ome b;

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ome omeVar = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    a.a(omeVar, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                bts btsVar2 = (bts) fidVar;
                if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    boolean z = omeVar instanceof j4v;
                    f530 f530Var = c530.a;
                    if (z) {
                        btsVar2.e0(313545477);
                        Object Q = btsVar2.Q();
                        if (Q == did.a) {
                            Q = new teb(20);
                            btsVar2.o0(Q);
                        }
                        f530Var = fnq0.a(f530Var, (tls) Q);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(313623070);
                        btsVar2.t(false);
                    }
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, f530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    zy11 zy11Var2 = null;
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
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar);
                    }
                    qje.W(btsVar2, d.d, d2);
                    if (omeVar == null) {
                        btsVar2.e0(-967193320);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-967193319);
                        a.a(omeVar, btsVar2, 0);
                        btsVar2.t(false);
                        zy11Var2 = zy11Var;
                    }
                    if (zy11Var2 == null) {
                        btsVar2.e0(1631369184);
                        j76.c(null, null, null, 0.0f, null, btsVar2, 0, 63);
                    } else {
                        btsVar2.e0(1631367789);
                    }
                    btsVar2.t(false);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ nau(ome omeVar) {
        this.b = omeVar;
    }
}
