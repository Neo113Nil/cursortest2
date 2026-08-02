package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class kvx0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ kvx0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    jeb1.f(this.b, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.b, btsVar, 48, 0, 16380);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    jeb1.f(this.b, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar2).g.a, btsVar2, 48, 48, 14332);
                    break;
                }
        }
        return zy11Var;
    }
}
