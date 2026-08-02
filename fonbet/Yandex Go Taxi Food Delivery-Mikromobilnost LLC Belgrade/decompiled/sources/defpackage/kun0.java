package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class kun0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sun0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ kun0(sun0 sun0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = sun0Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        sun0 sun0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                n2b1.g(sun0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                n2b1.f(sun0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 2:
                n2b1.b(sun0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                n2b1.h(sun0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
