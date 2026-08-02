package defpackage;

import androidx.lifecycle.compose.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class ogd implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zfd b;

    public /* synthetic */ ogd(zfd zfdVar, int i) {
        this.a = i;
        this.b = zfdVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = cgd.a;
        o430 o430Var = did.a;
        zfd zfdVar = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = zfdVar.a;
                        btsVar.o0(Q);
                    }
                    oz40 a = a.a((tpr) Q, obj3, btsVar);
                    boolean k = btsVar.k(zfdVar);
                    Object Q2 = btsVar.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new bgd(zfdVar);
                        btsVar.o0(Q2);
                    }
                    bgd bgdVar = (bgd) Q2;
                    Object value = a.getValue();
                    if (value == obj3) {
                        btsVar.e0(1052798693);
                        btsVar.t(false);
                        break;
                    } else {
                        btsVar.e0(1052606493);
                        zfdVar.a(bgdVar, value, btsVar);
                        btsVar.t(false);
                        break;
                    }
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    Object Q3 = btsVar2.Q();
                    if (Q3 == o430Var) {
                        Q3 = zfdVar.a;
                        btsVar2.o0(Q3);
                    }
                    oz40 a2 = a.a((tpr) Q3, obj3, btsVar2);
                    boolean k2 = btsVar2.k(zfdVar);
                    Object Q4 = btsVar2.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new bgd(zfdVar);
                        btsVar2.o0(Q4);
                    }
                    bgd bgdVar2 = (bgd) Q4;
                    Object value2 = a2.getValue();
                    if (value2 == obj3) {
                        btsVar2.e0(1052798693);
                        btsVar2.t(false);
                        break;
                    } else {
                        btsVar2.e0(1052606493);
                        zfdVar.a(bgdVar2, value2, btsVar2);
                        btsVar2.t(false);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
