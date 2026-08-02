package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class k7a implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ k7a(long j, lzr lzrVar, String str, String str2) {
        this.b = str;
        this.w = lzrVar;
        this.x = str2;
        this.c = j;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t691.b((f530) obj4, (lna) obj3, this.b, this.c, (fid) obj, vng.O(3073));
                break;
            default:
                lzr lzrVar = (lzr) obj4;
                String str = (String) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    web1.e(null, null, null, this.b, null, 0L, lzrVar, null, null, 0, false, 0, null, str, null, null, null, null, false, this.c, 0, false, 0, false, null, false, btsVar, 0, 0, 0, 266305399);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ k7a(f530 f530Var, lna lnaVar, String str, long j, int i) {
        this.w = f530Var;
        this.x = lnaVar;
        this.b = str;
        this.c = j;
    }
}
