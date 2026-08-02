package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ks6 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public /* synthetic */ ks6(f530 f530Var, String str, String str2, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = str;
        this.w = str2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f530 f530Var = this.b;
        String str = this.w;
        String str2 = this.c;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xbb1.d(vng.O(7), fidVar, f530Var, str2, str);
                break;
            case 1:
                afb1.c(vng.O(7), fidVar, f530Var, str2, str);
                break;
            case 2:
                ke91.a(vng.O(1), fidVar, f530Var, str2, str);
                break;
            default:
                csm.e(vng.O(385), fidVar, f530Var, str2, str);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ks6(String str, String str2, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.c = str;
        this.w = str2;
        this.b = f530Var;
    }
}
