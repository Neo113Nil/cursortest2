package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0s0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qj4 b;

    public /* synthetic */ e0s0(qj4 qj4Var) {
        this.b = qj4Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qj4 qj4Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ey91.b(qj4Var, fidVar, vng.O(7));
                break;
            default:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    y3b1.c(qj4Var.a, null, qj4Var.b, qj4Var.c, btsVar, 0, 18);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ e0s0(qj4 qj4Var, int i) {
        this.b = qj4Var;
    }
}
