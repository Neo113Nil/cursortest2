package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8b0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ k8b0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                String str = this.c;
                String str2 = this.d;
                V0 = ((hyg0) obj).V0("\n        SELECT \n            playlist.id,\n            playlist.uid,\n            playlist.pid,\n            playlist.downloading_state,\n            playlist.json_raw \n        FROM playlist\n        INNER JOIN playlists_to_tracks ON playlist.pid = playlists_to_tracks.playlist_id\n        WHERE playlists_to_tracks.music_track_id = ? AND playlists_to_tracks.uid = ?\n    ");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i = (int) V0.getLong(0);
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i2 = (int) V0.getLong(3);
                        if (i2 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i2 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i2 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i2 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList.add(new uab0(i, downloadingState, b, l2, V0.l2(4)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                String str3 = this.c;
                String str4 = this.d;
                V0 = ((hyg0) obj).V0("DELETE FROM user_values WHERE name = ? AND storage_name = ?");
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

    public /* synthetic */ k8b0(String str, String str2, m8b0 m8b0Var) {
        this.c = str;
        this.d = str2;
    }
}
