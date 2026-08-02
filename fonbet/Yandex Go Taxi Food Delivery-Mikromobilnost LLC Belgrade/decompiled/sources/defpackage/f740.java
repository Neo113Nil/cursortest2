package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class f740 implements wls {
    public final /* synthetic */ sls A;
    public final /* synthetic */ int a;
    public final /* synthetic */ l8v b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ ldc x;
    public final /* synthetic */ ldc y;
    public final /* synthetic */ float z;

    public /* synthetic */ f740(l8v l8vVar, String str, String str2, ldc ldcVar, ldc ldcVar2, float f, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = l8vVar;
        this.c = str;
        this.w = str2;
        this.x = ldcVar;
        this.y = ldcVar2;
        this.z = f;
        this.A = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                pl91.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                tl91.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
