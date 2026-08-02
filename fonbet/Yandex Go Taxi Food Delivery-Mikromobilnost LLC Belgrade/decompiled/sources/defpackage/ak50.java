package defpackage;

/* loaded from: classes5.dex */
public final class ak50 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tls c;

    public ak50(int i, int i2, tls tlsVar) {
        this.a = i;
        this.b = i2;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            bk50.b(ibp0Var, this.a, this.b, this.c, btsVar, intValue & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
