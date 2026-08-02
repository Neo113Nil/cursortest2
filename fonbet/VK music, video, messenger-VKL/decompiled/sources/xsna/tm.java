package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.holders.MusicRecommendedPlaylistVh;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tm(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((tra0.a) obj).q((tra0) this.d, 0, -this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 1:
                jjc.a(new hv00((MusicRecommendedPlaylistVh) this.d, this.c, 1));
                return s3q0.a;
            default:
                String str = (String) this.d;
                int i = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT COUNT(*) \n        FROM audio_track \n        INNER JOIN playlists_to_tracks \n        ON audio_track.mid = playlists_to_tracks.music_track_id\n        AND audio_track.uid = playlists_to_tracks.uid\n        WHERE playlists_to_tracks.uid = ? \n        AND playlists_to_tracks.playlist_id = ? \n        AND audio_track.downloading_state = ?\n    ");
                try {
                    V0.D3(1, str);
                    V0.D3(2, "-2147483648");
                    V0.bindLong(3, i);
                    int i2 = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
