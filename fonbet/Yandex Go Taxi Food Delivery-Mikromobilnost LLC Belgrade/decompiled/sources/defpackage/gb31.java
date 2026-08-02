package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class gb31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9o b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ int w;

    public /* synthetic */ gb31(y9o y9oVar, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = y9oVar;
        this.c = f530Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        f530 f530Var = this.c;
        y9o y9oVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                oe91.a(y9oVar, f530Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                re91.e(y9oVar, f530Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
