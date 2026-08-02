package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ uf5(String str, String str2, int i) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        switch (this.b) {
            case 0:
                String str = this.c;
                String str2 = this.d;
                V0 = ((hyg0) obj).V0("DELETE FROM auto_download_track WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                }
            default:
                String str3 = this.c;
                String str4 = this.d;
                V0 = ((hyg0) obj).V0("DELETE FROM meta WHERE name = ? AND storage_name = ?");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                }
        }
    }
}
