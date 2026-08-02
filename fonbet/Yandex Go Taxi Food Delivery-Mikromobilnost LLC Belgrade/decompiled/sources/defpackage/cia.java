package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class cia implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bja b;
    public final /* synthetic */ tls c;

    public /* synthetic */ cia(bja bjaVar, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = bjaVar;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        bja bjaVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bjb1.e(bjaVar, tlsVar, fidVar, vng.O(1));
                break;
            default:
                bjb1.b(bjaVar, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
