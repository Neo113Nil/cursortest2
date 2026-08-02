package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class jzo0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vzo0 b;

    public /* synthetic */ jzo0(vzo0 vzo0Var, int i) {
        this.a = i;
        this.b = vzo0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vzo0 vzo0Var = this.b;
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
                    m9b1.b(ebp0Var, vzo0Var.g.a, null, null, xya1.e(btsVar).g.b, 0, 0, vzo0Var.g.b, null, null, 0, 0, null, btsVar, intValue & 14, 0, 32630);
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
                    tzo0 tzo0Var = vzo0Var.f;
                    m9b1.b(ebp0Var2, tzo0Var.a, null, null, null, 0, 0, tzo0Var.b, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 32638);
                    break;
                }
        }
        return zy11Var;
    }
}
