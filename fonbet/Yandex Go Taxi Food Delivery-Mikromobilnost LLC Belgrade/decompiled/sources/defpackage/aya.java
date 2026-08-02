package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class aya implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ swa b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ aya(swa swaVar, tls tlsVar, tls tlsVar2, int i, int i2) {
        this.a = i2;
        this.b = swaVar;
        this.c = tlsVar;
        this.w = tlsVar2;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        tls tlsVar2 = this.c;
        swa swaVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                yjb1.a(swaVar, tlsVar2, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                gkb1.a(swaVar, tlsVar2, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
