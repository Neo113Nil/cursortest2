package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class pha implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yha b;
    public final /* synthetic */ tls c;

    public /* synthetic */ pha(yha yhaVar, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = yhaVar;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        yha yhaVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                zib1.a(yhaVar, tlsVar, fidVar, vng.O(1));
                break;
            default:
                zib1.c(yhaVar, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
