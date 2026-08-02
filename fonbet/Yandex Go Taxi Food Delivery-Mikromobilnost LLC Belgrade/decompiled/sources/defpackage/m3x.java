package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class m3x implements bms {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tls w;

    public m3x(List list, int i, tls tlsVar) {
        this.b = list;
        this.c = i;
        this.w = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.w;
        int i4 = this.c;
        List list = this.b;
        int i5 = 16;
        switch (i3) {
            case 0:
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar).k(u4yVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(i & 1, (i & 147) != 146)) {
                    btsVar.Y();
                    break;
                } else {
                    dae daeVar = (dae) list.get(intValue);
                    btsVar.e0(646505380);
                    boolean k = btsVar.k(tlsVar) | btsVar.k(daeVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new z5(i5, tlsVar, daeVar);
                        btsVar.o0(Q);
                    }
                    z9b1.b(daeVar, (sls) Q, btsVar, 0);
                    if (intValue == i4) {
                        btsVar.e0(646832119);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(646670671);
                        dk91.a(0.5f, 390, 2, 0L, btsVar, an91.m(c530.a, 16.0f, 0.0f, 2));
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                    break;
                }
                break;
            default:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((bts) fidVar2).k(u4yVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= fidVar2.c(intValue3) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    btsVar2.Y();
                    break;
                } else {
                    wj50 wj50Var = (wj50) list.get(intValue3);
                    btsVar2.e0(2131177925);
                    bk50.a(wj50Var, wwg.S(-390483502, true, new ak50(intValue3, i4, tlsVar), btsVar2), btsVar2, 48, 0);
                    btsVar2.t(false);
                    break;
                }
        }
        return zy11Var;
    }

    public m3x(List list, tls tlsVar, int i) {
        this.b = list;
        this.w = tlsVar;
        this.c = i;
    }
}
