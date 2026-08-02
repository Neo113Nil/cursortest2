package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jjl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ jjl(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                qgi0.s((tgi0) obj, new us2(this.c));
                return s3q0.a;
            case 1:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT \n            audio_track.id, \n            audio_track.uid, \n            audio_track.mid, \n            audio_track.downloading_state, \n            audio_track.json_raw\n        FROM audio_track\n        WHERE uid = ?\n    ");
                try {
                    V0.D3(1, str);
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
                        arrayList.add(new hc50(i, downloadingState, b, l2, V0.l2(4)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            default:
                qgi0.e((tgi0) obj, this.c, new c24(0));
                return s3q0.a;
        }
    }

    public /* synthetic */ jjl(String str, fb50 fb50Var) {
        this.b = 1;
        this.c = str;
    }
}
