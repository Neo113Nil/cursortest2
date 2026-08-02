package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class dxd0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dbu b;

    public /* synthetic */ dxd0(dbu dbuVar) {
        this.b = dbuVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dbu dbuVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    lhl0 a = khl0.a(lr20.g, x4c.E, btsVar, 54);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    c530 c530Var = c530.a;
                    f530 d = b.d(btsVar, c530Var);
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
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new vld0(8);
                        btsVar.o0(Q);
                    }
                    ymb1.c(dbuVar.a, fnq0.b(c530Var, false, (tls) Q), 0L, null, lzr.E, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
                    String str = dbuVar.b;
                    if (str == null) {
                        btsVar.e0(1197755193);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1197755194);
                        o4b1.b(ua3.b(str, null, null, btsVar, 14), null, null, null, null, 0.0f, null, btsVar, 48, HProv.PP_SAME_MEDIA);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                gxd0.c(dbuVar, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ dxd0(dbu dbuVar, int i) {
        this.b = dbuVar;
    }
}
