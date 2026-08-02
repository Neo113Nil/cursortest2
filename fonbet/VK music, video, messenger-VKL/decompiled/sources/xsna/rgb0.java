package xsna;

import android.util.LruCache;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rgb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ rgb0(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT \n        p.*, \n        (\n            SELECT COUNT(*) \n            FROM podcast_to_episodes\n            WHERE uid = ? AND podcast_owner_id = p.owner_id\n        ) as episodes_count,\n        (\n            SELECT SUM(episode.duration)\n            FROM episode\n            INNER JOIN podcast_to_episodes \n            ON episode.mid = podcast_to_episodes.mid \n            AND episode.uid = podcast_to_episodes.uid\n            WHERE podcast_to_episodes.uid = ? \n            AND podcast_to_episodes.podcast_owner_id = p.owner_id\n        ) as episodes_duration\n        FROM podcast p \n        WHERE uid = ? \n        ORDER BY id\n    ");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str);
                    V0.D3(3, str);
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
                    int k15 = egi.k(V0, "episodes_count");
                    int i2 = k14;
                    int k16 = egi.k(V0, "episodes_duration");
                    int i3 = k13;
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        ArrayList arrayList2 = arrayList;
                        int i4 = k12;
                        int i5 = (int) V0.getLong(k15);
                        long j = V0.getLong(k16);
                        int i6 = k16;
                        int i7 = k15;
                        int i8 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        int i9 = (int) V0.getLong(k3);
                        UserId b2 = fwx0.b(V0.l2(k4));
                        String l2 = V0.isNull(k5) ? null : V0.l2(k5);
                        int i10 = (int) V0.getLong(k6);
                        String l22 = V0.isNull(k7) ? null : V0.l2(k7);
                        Thumb e = l22 == null ? null : i7o0.e(l22);
                        boolean z = ((int) V0.getLong(k8)) != 0;
                        String l23 = V0.isNull(k9) ? null : V0.l2(k9);
                        boolean z2 = ((int) V0.getLong(k10)) != 0;
                        boolean z3 = ((int) V0.getLong(k11)) != 0;
                        String l24 = V0.isNull(i4) ? null : V0.l2(i4);
                        int i11 = k11;
                        int i12 = i3;
                        String str2 = l24;
                        int i13 = k;
                        int i14 = (int) V0.getLong(i12);
                        if (i14 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i14 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i14 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i14 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i14 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i15 = i2;
                        arrayList2.add(new wkb0(new ugb0(i8, b, i9, b2, l2, i10, e, z, l23, z2, z3, str2, downloadingState2, V0.l2(i15)), i5, j));
                        arrayList = arrayList2;
                        k12 = i4;
                        k = i13;
                        k15 = i7;
                        k16 = i6;
                        i3 = i12;
                        i2 = i15;
                        k11 = i11;
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                int i16 = ProductsSelectionBottomSheet.u1;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            default:
                bpn0 bpn0Var = c7r0.a;
                ((LruCache) c7r0.b.getValue()).put(str, (AnimatedStickerInfo) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ rgb0(String str, sgb0 sgb0Var) {
        this.b = 0;
        this.c = str;
    }
}
