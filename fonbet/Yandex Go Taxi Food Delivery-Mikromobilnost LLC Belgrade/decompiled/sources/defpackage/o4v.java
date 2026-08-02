package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class o4v implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ o4v(Object obj, String str, f530 f530Var, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = str;
        this.w = f530Var;
        this.x = j;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                p4v.b((pa90) obj3, this.c, this.w, this.x, (fid) obj, O, this.z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                q4v.b((pa90) obj3, this.c, this.w, this.x, (fid) obj, O2, this.z);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                p4v.a((mgv) obj3, this.c, this.w, this.x, (fid) obj, O3, this.z);
                break;
        }
        return zy11Var;
    }
}
