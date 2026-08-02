package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class chk0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ dhk0 b;

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dhk0 dhk0Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                dhk0Var.d(fidVar, vng.O(1));
                break;
            default:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    dhk0Var.d(btsVar, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
