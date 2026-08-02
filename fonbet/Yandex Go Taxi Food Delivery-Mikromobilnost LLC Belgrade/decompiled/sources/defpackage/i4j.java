package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class i4j implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dj b;

    public /* synthetic */ i4j(dj djVar) {
        this.b = djVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dj djVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    web1.e(null, null, null, djVar.a, null, 0L, null, null, null, 0, false, Integer.MAX_VALUE, null, djVar.b, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar, 0, 384, 0, 268398583);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                re91.b(djVar, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ i4j(dj djVar, int i) {
        this.b = djVar;
    }
}
