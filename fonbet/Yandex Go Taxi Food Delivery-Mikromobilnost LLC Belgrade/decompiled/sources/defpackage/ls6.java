package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ls6 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ au2 c;
    public final /* synthetic */ wp2 w;

    public /* synthetic */ ls6(String str, au2 au2Var, wp2 wp2Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = au2Var;
        this.w = wp2Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wp2 wp2Var = this.w;
        au2 au2Var = this.c;
        String str = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xbb1.c(str, au2Var, wp2Var, fidVar, vng.O(385));
                break;
            default:
                afb1.b(str, au2Var, wp2Var, fidVar, vng.O(385));
                break;
        }
        return zy11Var;
    }
}
