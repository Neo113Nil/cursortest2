package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class aj5 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f611 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ ety0 x;

    public /* synthetic */ aj5(f611 f611Var, tls tlsVar, tls tlsVar2, ety0 ety0Var) {
        this.b = f611Var;
        this.c = tlsVar;
        this.w = tlsVar2;
        this.x = ety0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q5b1.b(this.b, this.c, this.w, this.x, (fid) obj, vng.O(1));
                break;
            default:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    q5b1.b(this.b, this.c, this.w, this.x, btsVar, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ aj5(f611 f611Var, tls tlsVar, tls tlsVar2, ety0 ety0Var, int i) {
        this.b = f611Var;
        this.c = tlsVar;
        this.w = tlsVar2;
        this.x = ety0Var;
    }
}
