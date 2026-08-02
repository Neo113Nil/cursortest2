package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jzq implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ jzq(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hc50 hc50Var;
        DownloadingState downloadingState;
        int i = this.b;
        String str = this.d;
        String str2 = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                bpn0 bpn0Var = cqm0.a;
                if (str2 == null) {
                    str2 = "";
                }
                qgi0.h(tgi0Var, str2);
                if (str == null) {
                    str = "";
                }
                qgi0.r(tgi0Var, str);
                return s3q0.a;
            default:
                qyg0 V0 = ((hyg0) obj).V0("SELECT id, uid, mid, downloading_state, json_raw FROM audio_track WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str);
                    if (V0.step()) {
                        int i2 = (int) V0.getLong(0);
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i3 = (int) V0.getLong(3);
                        if (i3 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i3 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i3 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i3 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        hc50Var = new hc50(i2, downloadingState, b, l2, V0.l2(4));
                    } else {
                        hc50Var = null;
                    }
                    return hc50Var;
                } finally {
                    V0.close();
                }
        }
    }

    public /* synthetic */ jzq(String str, String str2, fb50 fb50Var) {
        this.c = str;
        this.d = str2;
    }
}
