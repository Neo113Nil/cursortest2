package defpackage;

import java.util.ArrayList;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.a;

/* loaded from: classes12.dex */
public final class pob implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ tls c;

    public /* synthetic */ pob(int i, tls tlsVar, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        this.c = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        ArrayList arrayList = this.b;
        switch (i5) {
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
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    lpb lpbVar = (lpb) arrayList.get(intValue);
                    btsVar.e0(1756308161);
                    m791.c(lpbVar, tlsVar, btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
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
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    e31 e31Var = (e31) arrayList.get(intValue3);
                    btsVar2.e0(-83669630);
                    if (e31Var instanceof c31) {
                        btsVar2.e0(1521324189);
                        c31 c31Var = (c31) e31Var;
                        boolean e = btsVar2.e(e31Var) | btsVar2.k(tlsVar);
                        Object Q = btsVar2.Q();
                        if (e || Q == o430Var) {
                            Q = new z5(11, tlsVar, c31Var);
                            btsVar2.o0(Q);
                        }
                        pnm.a(c31Var, (sls) Q, btsVar2, 8);
                        btsVar2.t(false);
                    } else {
                        if (!(e31Var instanceof d31)) {
                            throw unr0.y(1521321633, btsVar2, false);
                        }
                        btsVar2.e0(1521331756);
                        pnm.b((d31) e31Var, btsVar2, 0);
                        btsVar2.t(false);
                    }
                    btsVar2.t(false);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                u4y u4yVar3 = (u4y) obj;
                int intValue5 = ((Number) obj2).intValue();
                fid fidVar3 = (fid) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((bts) fidVar3).k(u4yVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= fidVar3.c(intValue5) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i3 & 1, (i3 & 147) != 146)) {
                    nxo nxoVar = (nxo) arrayList.get(intValue5);
                    btsVar3.e0(144625811);
                    boolean k = btsVar3.k(tlsVar) | btsVar3.k(nxoVar);
                    Object Q2 = btsVar3.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new z5(12, tlsVar, nxoVar);
                        btsVar3.o0(Q2);
                    }
                    iha1.c(nxoVar, (sls) Q2, btsVar3, 0);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                u4y u4yVar4 = (u4y) obj;
                int intValue7 = ((Number) obj2).intValue();
                fid fidVar4 = (fid) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((bts) fidVar4).k(u4yVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= fidVar4.c(intValue7) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i4 & 1, (i4 & 147) != 146)) {
                    mfz0 mfz0Var = (mfz0) arrayList.get(intValue7);
                    btsVar4.e0(-1852791311);
                    a.e(mfz0Var, tlsVar, btsVar4, 0);
                    btsVar4.t(false);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
