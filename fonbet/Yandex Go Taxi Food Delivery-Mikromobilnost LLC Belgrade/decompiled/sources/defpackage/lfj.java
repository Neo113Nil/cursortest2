package defpackage;

import androidx.compose.ui.graphics.d;

/* loaded from: classes14.dex */
public final /* synthetic */ class lfj implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ qor b;
    public final /* synthetic */ tls c;

    public /* synthetic */ lfj(qor qorVar, tls tlsVar, int i) {
        this.a = i;
        this.b = qorVar;
        this.c = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        tls tlsVar = this.c;
        qor qorVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ggj ggjVar = (ggj) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= (intValue & 64) == 0 ? ((bts) fidVar).k(ggjVar) : fidVar.e(ggjVar) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 145) != 144)) {
                    btsVar.Y();
                    break;
                } else {
                    qfj.a(ggjVar, this.b, null, this.c, btsVar, (intValue >> 3) & 14);
                    break;
                }
            case 1:
                ggj ggjVar2 = (ggj) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= (intValue2 & 64) == 0 ? ((bts) fidVar2).k(ggjVar2) : fidVar2.e(ggjVar2) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean k = btsVar2.k(qorVar);
                    Object Q = btsVar2.Q();
                    if (k || Q == o430Var) {
                        Q = new r0(qorVar, 1);
                        btsVar2.o0(Q);
                    }
                    f530 F = kp50.F(c530Var, (zls) Q);
                    boolean k2 = btsVar2.k(qorVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new f0(qorVar, 3);
                        btsVar2.o0(Q2);
                    }
                    qfj.d(ggjVar2, d.a(F, (tls) Q2), tlsVar, btsVar2, (intValue2 >> 3) & 14);
                    break;
                }
            default:
                uqf0 uqf0Var = (uqf0) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((bts) fidVar3).k(uqf0Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 145) != 144)) {
                    btsVar3.Y();
                    break;
                } else {
                    boolean k3 = btsVar3.k(qorVar);
                    Object Q3 = btsVar3.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new r0(qorVar, 2);
                        btsVar3.o0(Q3);
                    }
                    f530 F2 = kp50.F(c530Var, (zls) Q3);
                    boolean k4 = btsVar3.k(qorVar);
                    Object Q4 = btsVar3.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new f0(qorVar, 6);
                        btsVar3.o0(Q4);
                    }
                    xnf0.c(uqf0Var, d.a(F2, (tls) Q4), tlsVar, btsVar3, (intValue3 >> 3) & 14);
                    break;
                }
        }
        return zy11Var;
    }
}
