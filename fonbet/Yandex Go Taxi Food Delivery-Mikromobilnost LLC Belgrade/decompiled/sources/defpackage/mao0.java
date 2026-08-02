package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class mao0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yao0 b;

    public /* synthetic */ mao0(yao0 yao0Var, int i) {
        this.a = i;
        this.b = yao0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yao0 yao0Var = this.b;
        switch (i) {
            case 0:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    m9b1.a(ebp0Var, yao0Var.g, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar, intValue & 14, 0, 16382);
                    break;
                }
            default:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    m9b1.a(ebp0Var2, yao0Var.h, null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 16374);
                    break;
                }
        }
        return zy11Var;
    }
}
