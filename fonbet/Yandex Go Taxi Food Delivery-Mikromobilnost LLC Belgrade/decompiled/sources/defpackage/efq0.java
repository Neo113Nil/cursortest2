package defpackage;

/* loaded from: classes10.dex */
public final class efq0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jrv b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ awk0 x;
    public final /* synthetic */ cms y;

    public /* synthetic */ efq0(jrv jrvVar, boolean z, boolean z2, awk0 awk0Var, cms cmsVar, int i) {
        this.a = i;
        this.b = jrvVar;
        this.c = z;
        this.w = z2;
        this.x = awk0Var;
        this.y = cmsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        cms cmsVar = this.y;
        jrv jrvVar = this.b;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                bts btsVar = (bts) ((fid) obj2);
                btsVar.e0(-1525724089);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = ly3.i(btsVar);
                }
                zx40 zx40Var = (zx40) Q;
                f530 k = lrv.a(c530Var, zx40Var, jrvVar).k(new cfq0(this.c, zx40Var, null, false, this.w, this.x, (sls) cmsVar));
                btsVar.t(false);
                return k;
            default:
                ((Number) obj3).intValue();
                bts btsVar2 = (bts) ((fid) obj2);
                btsVar2.e0(-1525724089);
                Object Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                    Q2 = ly3.i(btsVar2);
                }
                zx40 zx40Var2 = (zx40) Q2;
                f530 k2 = lrv.a(c530Var, zx40Var2, jrvVar).k(new flz0(this.c, zx40Var2, null, false, this.w, this.x, (tls) cmsVar));
                btsVar2.t(false);
                return k2;
        }
    }
}
