package defpackage;

import com.yandex.go.scooters.ignition.panel.d;
import java.util.List;

/* loaded from: classes13.dex */
public final class lrn0 implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ float c;

    public lrn0(List list, tls tlsVar, float f) {
        this.a = list;
        this.b = tlsVar;
        this.c = f;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            vrn0 vrn0Var = (vrn0) this.a.get(intValue);
            btsVar.e0(1839660968);
            tls tlsVar = this.b;
            boolean k = btsVar.k(tlsVar) | btsVar.k(vrn0Var);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new z5(21, tlsVar, vrn0Var);
                btsVar.o0(Q);
            }
            d.a(vrn0Var, (sls) Q, ljs0.q(c530.a, this.c), btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
