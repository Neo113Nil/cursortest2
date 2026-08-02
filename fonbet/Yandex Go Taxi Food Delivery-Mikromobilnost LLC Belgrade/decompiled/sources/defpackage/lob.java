package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final /* synthetic */ class lob implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ tls c;

    public /* synthetic */ lob(ArrayList arrayList, tls tlsVar) {
        this.a = 1;
        this.b = arrayList;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        tls tlsVar = this.c;
        zy11 zy11Var = zy11.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m791.g(arrayList, tlsVar, (fid) obj, vng.O(385));
                return zy11Var;
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530.a);
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
                    btsVar.e0(1772355261);
                    int i2 = 0;
                    for (Object obj3 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        w8e0 w8e0Var = (w8e0) obj3;
                        urb1.b(w8e0Var.a, w8e0Var.b, w8e0Var.c, this.c, btsVar, 0);
                        if (i2 != scc.f(arrayList)) {
                            btsVar.e0(1407787936);
                            bts btsVar2 = btsVar;
                            dk91.a(0.0f, 0, 7, 0L, btsVar2, null);
                            btsVar = btsVar2;
                        } else {
                            btsVar.e0(691765551);
                        }
                        btsVar.t(false);
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
                urb1.a(arrayList, tlsVar, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ lob(ArrayList arrayList, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = arrayList;
        this.c = tlsVar;
    }
}
