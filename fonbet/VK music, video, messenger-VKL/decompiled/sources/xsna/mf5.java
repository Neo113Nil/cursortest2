package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ mf5(String str, String str2, int i) {
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
                V0 = ((hyg0) obj).V0("\n        SELECT EXISTS(\n            SELECT 1 FROM auto_download_track\n            WHERE uid = ?\n                AND mid = ?\n                AND auto_download_type = 0\n        )\n    ");
                boolean z = true;
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    Boolean bool = null;
                    if (V0.step()) {
                        Integer valueOf = V0.isNull(0) ? null : Integer.valueOf((int) V0.getLong(0));
                        if (valueOf != null) {
                            if (valueOf.intValue() == 0) {
                                z = false;
                            }
                            bool = Boolean.valueOf(z);
                        }
                    }
                    return bool;
                } finally {
                }
            default:
                String str3 = this.c;
                String str4 = this.d;
                V0 = ((hyg0) obj).V0("UPDATE playlists_to_tracks SET playlist_id = ? WHERE playlist_id == ?");
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
