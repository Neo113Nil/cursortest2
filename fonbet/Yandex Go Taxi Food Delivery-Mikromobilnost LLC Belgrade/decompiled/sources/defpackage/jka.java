package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class jka implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj90 b;

    public /* synthetic */ jka(wj90 wj90Var, int i) {
        this.a = i;
        this.b = wj90Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        wj90 wj90Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    qgy.b(wj90Var.a, null, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, 384, 0, 12282);
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
                    qgy.b(wj90Var.a, null, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.b, null, btsVar2, 384, 0, 12282);
                    break;
                }
        }
        return zy11Var;
    }
}
