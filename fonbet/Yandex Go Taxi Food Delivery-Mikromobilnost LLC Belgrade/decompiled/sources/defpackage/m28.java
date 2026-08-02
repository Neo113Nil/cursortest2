package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class m28 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ int w;

    public /* synthetic */ m28(tls tlsVar, f530 f530Var, int i) {
        this.b = tlsVar;
        this.c = f530Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.b;
        f530 f530Var = this.c;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                qeb1.a(vng.O(i2 | 1), fidVar, tlsVar, f530Var);
                break;
            case 1:
                num.getClass();
                cea1.a(vng.O(i2 | 1), fidVar, tlsVar, f530Var);
                break;
            default:
                num.getClass();
                qe61.a(f530Var, tlsVar, fidVar, vng.O(1), i2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ m28(f530 f530Var, tls tlsVar, int i) {
        this.c = f530Var;
        this.b = tlsVar;
        this.w = i;
    }

    public /* synthetic */ m28(f530 f530Var, tls tlsVar, int i, int i2) {
        this.c = f530Var;
        this.b = tlsVar;
        this.w = i2;
    }
}
