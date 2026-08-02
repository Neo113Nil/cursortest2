package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ pf5(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT manifest_url FROM auto_download_track WHERE mid = ?");
                try {
                    V0.D3(1, str);
                    String str2 = null;
                    if (V0.step() && !V0.isNull(0)) {
                        str2 = V0.l2(0);
                    }
                    return str2;
                } finally {
                    V0.close();
                }
            default:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
