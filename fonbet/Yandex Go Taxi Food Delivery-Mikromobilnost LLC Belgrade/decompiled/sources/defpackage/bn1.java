package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class bn1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ bn1(ibp0 ibp0Var, int i, int i2, tls tlsVar, int i3) {
        this.a = 2;
        this.x = ibp0Var;
        this.b = i;
        this.c = i2;
        this.y = tlsVar;
        this.w = i3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                dn1.e((sls) obj4, this.b, (zls) obj3, (fid) obj, O, this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(3505);
                peb1.b((CharSequence) obj4, (f530) obj3, this.b, this.c, (fid) obj, O2, this.w);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int O3 = vng.O(this.w | 1);
                bk50.b((ibp0) obj4, this.b, this.c, (tls) obj3, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                xrb1.b((ibp0) obj4, this.b, (f530) obj3, (fid) obj, O4, this.w);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ bn1(CharSequence charSequence, f530 f530Var, int i, int i2, int i3, int i4) {
        this.a = 1;
        this.x = charSequence;
        this.y = f530Var;
        this.b = i;
        this.c = i2;
        this.w = i4;
    }

    public /* synthetic */ bn1(Object obj, int i, Object obj2, int i2, int i3, int i4) {
        this.a = i4;
        this.x = obj;
        this.b = i;
        this.y = obj2;
        this.c = i2;
        this.w = i3;
    }
}
