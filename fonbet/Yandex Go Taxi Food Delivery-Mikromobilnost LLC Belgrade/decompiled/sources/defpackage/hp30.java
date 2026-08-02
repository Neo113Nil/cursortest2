package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class hp30 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tls c;

    public /* synthetic */ hp30(String str, tls tlsVar) {
        this.a = 1;
        this.b = str;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uob1.d(str, tlsVar, (fid) obj, vng.O(1));
                break;
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else if (str != null) {
                    btsVar.e0(-789023892);
                    au2 g = sia1.g();
                    boolean k = btsVar.k(tlsVar) | btsVar.k(str);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new a91(tlsVar, str, 10);
                        btsVar.o0(Q);
                    }
                    brb1.a(g, (sls) Q, null, null, false, btsVar, 384, 24);
                    btsVar.t(false);
                    break;
                } else {
                    btsVar.e0(-789023893);
                    btsVar.t(false);
                    break;
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ppb1.d(str, tlsVar, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ hp30(String str, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = tlsVar;
    }
}
