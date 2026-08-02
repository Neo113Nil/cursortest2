package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ora0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ r611 b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ int w;

    public /* synthetic */ ora0(r611 r611Var, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = r611Var;
        this.c = f530Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        f530 f530Var = this.c;
        r611 r611Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                jh91.c(r611Var, f530Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                jh91.d(r611Var, f530Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
