package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class osm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ osm(s611 s611Var, f530 f530Var, boolean z, boolean z2, sls slsVar, int i) {
        this.a = 2;
        this.x = s611Var;
        this.c = f530Var;
        this.b = z;
        this.w = z2;
        this.z = slsVar;
        this.y = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                psm.a(this.b, (sls) obj4, this.c, this.w, (String) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                fx91.a(this.b, (tls) obj4, this.c, this.w, (String) obj3, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                rgb1.a((s611) obj3, this.c, this.b, this.w, (sls) obj4, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                c1z0.e(this.b, (u3z0) obj4, this.w, (tls) obj3, this.c, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ osm(boolean z, cms cmsVar, f530 f530Var, boolean z2, String str, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.z = cmsVar;
        this.c = f530Var;
        this.w = z2;
        this.x = str;
        this.y = i;
    }

    public /* synthetic */ osm(boolean z, u3z0 u3z0Var, boolean z2, tls tlsVar, f530 f530Var, int i) {
        this.a = 3;
        this.b = z;
        this.z = u3z0Var;
        this.w = z2;
        this.x = tlsVar;
        this.c = f530Var;
        this.y = i;
    }
}
