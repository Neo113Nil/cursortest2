package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class o701 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ eqs0 b;

    public /* synthetic */ o701(eqs0 eqs0Var, int i) {
        this.a = 0;
        this.b = eqs0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        eqs0 eqs0Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                qrb1.a(eqs0Var, fidVar, vng.O(1));
                break;
            case 1:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qrb1.a(eqs0Var, btsVar, 0);
                    break;
                }
            default:
                int intValue2 = num.intValue();
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qrb1.a(eqs0Var, btsVar2, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ o701(eqs0 eqs0Var, int i, byte b) {
        this.a = i;
        this.b = eqs0Var;
    }
}
