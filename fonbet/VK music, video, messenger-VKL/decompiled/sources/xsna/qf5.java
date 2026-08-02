package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ qf5(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT SUM(auto_download_track.size_in_bytes) FROM auto_download_track WHERE uid = ? AND auto_download_track.auto_download_type = 0");
                try {
                    V0.D3(1, str);
                    int i = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                return Boolean.valueOf(epx.f(this.c, ((qvc) obj).a));
        }
    }
}
