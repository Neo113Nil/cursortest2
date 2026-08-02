package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class b0s implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1a0 b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ b0s(q1a0 q1a0Var, f530 f530Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = q1a0Var;
        this.c = f530Var;
        this.w = tlsVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        f530 f530Var = this.c;
        q1a0 q1a0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                mi91.f(q1a0Var, f530Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                mi91.a(q1a0Var, f530Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
