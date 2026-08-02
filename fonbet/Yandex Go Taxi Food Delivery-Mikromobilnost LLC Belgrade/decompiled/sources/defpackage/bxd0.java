package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class bxd0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pxd0 b;
    public final /* synthetic */ wls c;

    public /* synthetic */ bxd0(pxd0 pxd0Var, wls wlsVar) {
        this.b = pxd0Var;
        this.c = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        c530 c530Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.c;
        pxd0 pxd0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    c530 c530Var2 = c530.a;
                    f530 d = b.d(btsVar, c530Var2);
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
                    wls wlsVar2 = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar2);
                    }
                    qje.W(btsVar, d.d, d);
                    btsVar.e0(92169381);
                    int i2 = 0;
                    for (Object obj3 : pxd0Var.d) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        gxd0.f((String) obj3, pxd0Var.e, wlsVar, btsVar, 0);
                        if (i2 != scc.f(pxd0Var.d)) {
                            btsVar.e0(760652382);
                            c530Var = c530Var2;
                            dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                            btsVar.t(false);
                        } else {
                            c530Var = c530Var2;
                            btsVar.e0(760907047);
                            btsVar.t(false);
                        }
                        c530Var2 = c530Var;
                        i2 = i3;
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                gxd0.e(pxd0Var, wlsVar, (fid) obj, vng.O(49));
                return zy11Var;
        }
    }

    public /* synthetic */ bxd0(pxd0 pxd0Var, wls wlsVar, int i) {
        this.b = pxd0Var;
        this.c = wlsVar;
    }
}
