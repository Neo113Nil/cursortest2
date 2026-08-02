package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class pxl0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ pxl0(boolean z, int i, int i2, tls tlsVar) {
        this.a = i2;
        this.b = z;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        boolean z = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fu91.b(z, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                qza1.b(z, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
