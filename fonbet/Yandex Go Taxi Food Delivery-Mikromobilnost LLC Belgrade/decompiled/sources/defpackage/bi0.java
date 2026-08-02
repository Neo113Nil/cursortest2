package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class bi0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tls c;

    public /* synthetic */ bi0(boolean z, tls tlsVar, int i) {
        this.a = i;
        this.b = z;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        tls tlsVar = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else if (!z) {
                    btsVar.e0(-1973767033);
                    btsVar.t(false);
                    break;
                } else {
                    btsVar.e0(-1973865055);
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new o0(11, tlsVar);
                        btsVar.o0(Q);
                    }
                    xqb1.b(null, (sls) Q, btsVar, 0, 1);
                    btsVar.t(false);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else if (!z) {
                    btsVar2.e0(-465725901);
                    btsVar2.t(false);
                    break;
                } else {
                    btsVar2.e0(-465929633);
                    au2 g = sia1.g();
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new wzl0(5, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    brb1.a(g, (sls) Q2, ohb1.e(btsVar2, kyh0.mt_refresh), null, false, btsVar2, 0, 24);
                    btsVar2.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
