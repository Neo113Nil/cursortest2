package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i0l implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ i0l(String str, String str2, int i) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.j(tgi0Var, 0);
                qgi0.h(tgi0Var, this.c + ", " + this.d);
                return s3q0.a;
            default:
                String str = this.c;
                String str2 = this.d;
                qyg0 V0 = ((hyg0) obj).V0("SELECT manifest_url FROM episode WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    String str3 = null;
                    if (V0.step() && !V0.isNull(0)) {
                        str3 = V0.l2(0);
                    }
                    return str3;
                } finally {
                    V0.close();
                }
        }
    }
}
