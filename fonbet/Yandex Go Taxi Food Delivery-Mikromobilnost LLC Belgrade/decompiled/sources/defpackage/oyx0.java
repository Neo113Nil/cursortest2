package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.List;

/* loaded from: classes13.dex */
public final class oyx0 implements bms {
    public final /* synthetic */ oz40 A;
    public final /* synthetic */ wls B;
    public final /* synthetic */ List a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ yx40 c;
    public final /* synthetic */ tx40 w;
    public final /* synthetic */ oz40 x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ b z;

    public oyx0(List list, tls tlsVar, yx40 yx40Var, tx40 tx40Var, oz40 oz40Var, tls tlsVar2, b bVar, oz40 oz40Var2, wls wlsVar) {
        this.a = list;
        this.b = tlsVar;
        this.c = yx40Var;
        this.w = tx40Var;
        this.x = oz40Var;
        this.y = tlsVar2;
        this.z = bVar;
        this.A = oz40Var2;
        this.B = wlsVar;
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
            tyx0 tyx0Var = (tyx0) this.a.get(intValue);
            btsVar.e0(421092125);
            int intValue3 = this.c.getIntValue();
            f530 f530Var = c530.a;
            Object obj5 = did.a;
            if (intValue3 == intValue) {
                btsVar.e0(421021258);
                f530 g = s1a1.g(f530Var, 1.0f);
                Object Q = btsVar.Q();
                if (Q == obj5) {
                    Q = new oav0(3, this.w);
                    btsVar.o0(Q);
                }
                f530Var = d.a(g, (tls) Q);
                btsVar.t(false);
            } else {
                btsVar.e0(421167609);
                btsVar.t(false);
            }
            f530 f530Var2 = f530Var;
            tls tlsVar = this.b;
            boolean k = ((((i & 112) ^ 48) > 32 && btsVar.c(intValue)) || (i & 48) == 32) | btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            oz40 oz40Var = this.x;
            if (k || Q2 == obj5) {
                Q2 = new h9m(tlsVar, intValue, oz40Var, 1);
                btsVar.o0(Q2);
            }
            ydb1.a(q791.d(f530Var2, false, null, null, (sls) Q2, 15), wwg.S(-1878900239, true, new krm(intValue, oz40Var), btsVar), wwg.S(904963286, true, new bab(14, tyx0Var), btsVar), wwg.S(-1899185089, true, new s0n0(4, tyx0Var, oz40Var, this.y), btsVar), wwg.S(-155457572, true, new iqm(this.z, intValue, this.A, this.c, this.w, this.B), btsVar), null, SlotSize.L, true, btsVar, 14183856, 32);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
