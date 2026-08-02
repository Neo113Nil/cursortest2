package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final /* synthetic */ class j4x0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f6z0 b;

    public /* synthetic */ j4x0(f6z0 f6z0Var) {
        this.b = f6z0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f6z0 f6z0Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 l = an91.l(ljs0.c(c530.a, 1.0f), 40.0f, 16.0f);
                    sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, l);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
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
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    btsVar.e0(452931734);
                    Iterator it = f6z0Var.a.iterator();
                    while (it.hasNext()) {
                        ckb1.c((d6z0) it.next(), btsVar, 0);
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                num.getClass();
                ckb1.d(f6z0Var, fidVar, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ j4x0(f6z0 f6z0Var, int i) {
        this.b = f6z0Var;
    }
}
