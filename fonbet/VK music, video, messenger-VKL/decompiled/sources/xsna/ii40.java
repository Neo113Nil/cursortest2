package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ii40(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "MusicDownloadingIndication:pending");
                return s3q0.a;
            case 1:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "NewsfeedCoownersListPendingStatus");
                qgi0.h(tgi0Var2, this.c);
                return s3q0.a;
            default:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT id, uid, pid, downloading_state, json_raw FROM playlist \n        WHERE uid = ? AND type = 0\n    ");
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
                        arrayList.add(new uab0(i, downloadingState, b, l2, V0.l2(4)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
        }
    }

    public /* synthetic */ ii40(String str, m8b0 m8b0Var) {
        this.b = 2;
        this.c = str;
    }
}
