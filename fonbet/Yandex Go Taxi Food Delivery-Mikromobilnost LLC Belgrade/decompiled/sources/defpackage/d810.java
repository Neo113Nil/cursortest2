package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class d810 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq11 b;
    public final /* synthetic */ wls c;

    public /* synthetic */ d810(bq11 bq11Var, wls wlsVar, int i) {
        this.a = i;
        this.b = bq11Var;
        this.c = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.c;
        bq11 bq11Var = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    fhe0.a(wwg.S(-241536773, true, new d810(bq11Var, wlsVar, i2), btsVar), btsVar, 6);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    vqy0.a(bq11Var.j, wlsVar, btsVar2, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
