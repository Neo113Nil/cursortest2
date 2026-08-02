package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class n2l0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w2l0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ n2l0(tls tlsVar, w2l0 w2l0Var) {
        this.c = tlsVar;
        this.b = w2l0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        w2l0 w2l0Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new v6k0(12, tlsVar);
                        btsVar.o0(Q);
                    }
                    ohb1.b(null, false, null, (sls) Q, wwg.S(-1389839932, true, new pdf0(15, w2l0Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    break;
                }
                break;
            default:
                num.getClass();
                ut91.g(w2l0Var, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ n2l0(w2l0 w2l0Var, tls tlsVar, int i) {
        this.b = w2l0Var;
        this.c = tlsVar;
    }
}
