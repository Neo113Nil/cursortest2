package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;

/* loaded from: classes11.dex */
public final /* synthetic */ class es60 implements zls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ es60(ola olaVar, hfa0 hfa0Var, z0a0 z0a0Var, String str, tls tlsVar, sls slsVar, tls tlsVar2) {
        this.w = olaVar;
        this.x = hfa0Var;
        this.y = z0a0Var;
        this.z = str;
        this.b = tlsVar;
        this.A = slsVar;
        this.c = tlsVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        Object obj8 = this.w;
        switch (i) {
            case 0:
                ola olaVar = (ola) obj8;
                hfa0 hfa0Var = (hfa0) obj7;
                z0a0 z0a0Var = (z0a0) obj6;
                String str = (String) obj5;
                sls slsVar = (sls) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    c530 c530Var = c530.a;
                    f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 4.0f, 8.0f, 0.0f, 9);
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d = b.d(btsVar, o);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o2);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    iub1.a(olaVar.i.a, hfa0Var, z0a0Var, str, this.b, slsVar, btsVar, 0);
                    CharSequence charSequence = olaVar.i.b;
                    if (charSequence == null) {
                        btsVar.e0(86511742);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(86511743);
                        if (charSequence.length() > 0) {
                            tse0.s(btsVar, 1841737472, c530Var, 16.0f, btsVar);
                            beb1.c(ljs0.c(c530Var, 1.0f), charSequence, this.c, btsVar, 6);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(1841952736);
                            btsVar.t(false);
                        }
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                w0s w0sVar = (w0s) obj8;
                w0s w0sVar2 = (w0s) obj7;
                qor qorVar = (qor) obj6;
                m3u0 m3u0Var = (m3u0) obj5;
                yur yurVar = (yur) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    i.a(w0sVar, w0sVar2, qorVar, m3u0Var, this.b, this.c, yurVar, null, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ es60(w0s w0sVar, w0s w0sVar2, qor qorVar, m3u0 m3u0Var, tls tlsVar, tls tlsVar2, yur yurVar) {
        this.w = w0sVar;
        this.x = w0sVar2;
        this.y = qorVar;
        this.z = m3u0Var;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.A = yurVar;
    }
}
