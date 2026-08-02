package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class q140 implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ f440 c;

    public /* synthetic */ q140(tls tlsVar, f440 f440Var) {
        this.b = tlsVar;
        this.c = f440Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f440 f440Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    float f = f440Var.b.b;
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new s140(0, tlsVar);
                        btsVar.o0(Q);
                    }
                    vob1.a(f, null, (sls) Q, btsVar, 0);
                    break;
                }
                break;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    rab1.b(null, wwg.S(75694159, true, new sg0(18, tlsVar), btsVar2), null, null, null, wwg.S(585292235, true, new iu30(2, f440Var, tlsVar), btsVar2), null, btsVar2, 196656, 93);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ q140(f440 f440Var, tls tlsVar) {
        this.c = f440Var;
        this.b = tlsVar;
    }
}
