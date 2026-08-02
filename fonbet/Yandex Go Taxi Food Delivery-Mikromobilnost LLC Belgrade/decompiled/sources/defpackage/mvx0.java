package defpackage;

/* loaded from: classes12.dex */
public final class mvx0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ z611 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cms w;

    public /* synthetic */ mvx0(cms cmsVar, z611 z611Var, int i, int i2) {
        this.a = i2;
        this.w = cmsVar;
        this.b = z611Var;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        z611 z611Var = this.b;
        cms cmsVar = this.w;
        switch (i) {
            case 0:
                ((wls) cmsVar).invoke(z611Var, Integer.valueOf(i2));
                break;
            default:
                ((tls) cmsVar).invoke(new evx0(z611Var, i2));
                break;
        }
        return zy11Var;
    }
}
