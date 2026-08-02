package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ rf5(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT \n            auto_download_track.id, \n            auto_download_track.uid, \n            auto_download_track.mid, \n            auto_download_track.downloading_state, \n            auto_download_track.size_in_bytes, \n            auto_download_track.auto_download_date,\n            auto_download_track.json_raw\n        FROM auto_download_track\n        WHERE auto_download_track.uid = ? AND auto_download_track.auto_download_type = 0\n    ");
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
                        arrayList.add(new xf5(i, b, l2, downloadingState, V0.isNull(4) ? null : Long.valueOf(V0.getLong(4)), V0.isNull(5) ? null : Long.valueOf(V0.getLong(5)), V0.l2(6)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.j(tgi0Var, 1);
                qgi0.k(tgi0Var, this.c);
                return s3q0.a;
            case 2:
                StringBuilder d = rqi.d(((Long) obj).longValue(), "('", this.c, "', ");
                d.append(')');
                return d.toString();
            case 3:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, this.c);
                qgi0.r(tgi0Var2, "ModalTags.COUNTER");
                return s3q0.a;
            default:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
        }
    }

    public /* synthetic */ rf5(String str, vf5 vf5Var) {
        this.b = 0;
        this.c = str;
    }
}
