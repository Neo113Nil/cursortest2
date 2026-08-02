package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import xsna.wfu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zt2 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ zt2(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [xsna.ugb0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                return new wfu.a.d(this.c, this.d, (Image) obj);
            default:
                String str = this.c;
                String str2 = this.d;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM podcast WHERE uid = ? AND owner_id = ? LIMIT 1");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "podcast_id");
                    int k4 = egi.k(V0, "owner_id");
                    int k5 = egi.k(V0, "podcast_title");
                    int k6 = egi.k(V0, "playlist_id");
                    int k7 = egi.k(V0, "thumb");
                    int k8 = egi.k(V0, "subtitle_badge");
                    int k9 = egi.k(V0, "subtitle");
                    int k10 = egi.k(V0, "can_subscribe");
                    int k11 = egi.k(V0, "is_subscribed");
                    int k12 = egi.k(V0, "track_code");
                    int k13 = egi.k(V0, "downloading_state");
                    int k14 = egi.k(V0, "json_raw");
                    if (V0.step()) {
                        int i = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        int i2 = (int) V0.getLong(k3);
                        UserId b2 = fwx0.b(V0.l2(k4));
                        String l2 = V0.isNull(k5) ? null : V0.l2(k5);
                        int i3 = (int) V0.getLong(k6);
                        String l22 = V0.isNull(k7) ? null : V0.l2(k7);
                        Thumb e = l22 == null ? null : i7o0.e(l22);
                        boolean z = ((int) V0.getLong(k8)) != 0;
                        String l23 = V0.isNull(k9) ? null : V0.l2(k9);
                        boolean z2 = ((int) V0.getLong(k10)) != 0;
                        boolean z3 = ((int) V0.getLong(k11)) != 0;
                        String l24 = V0.isNull(k12) ? null : V0.l2(k12);
                        int i4 = (int) V0.getLong(k13);
                        if (i4 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i4 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i4 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i4 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i4 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        r17 = new ugb0(i, b, i2, b2, l2, i3, e, z, l23, z2, z3, l24, downloadingState, V0.l2(k14));
                    }
                    return r17;
                } finally {
                    V0.close();
                }
        }
    }

    public /* synthetic */ zt2(String str, String str2, sgb0 sgb0Var) {
        this.c = str;
        this.d = str2;
    }
}
