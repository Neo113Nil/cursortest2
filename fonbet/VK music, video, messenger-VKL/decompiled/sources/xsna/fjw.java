package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fjw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ fjw(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT COUNT(DISTINCT p.pid) FROM playlist p\n        INNER JOIN playlists_to_tracks ptt on ptt.playlist_id = p.pid\n        AND ptt.uid = ?\n        INNER JOIN audio_track t on t.mid = ptt.music_track_id\n        WHERE t.json_raw LIKE '%\"moosic_audio\"%'\n        AND p.type = 0\n        AND p.uid = ?\n    ");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str);
                    int i = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
