package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.music.mixsettings.MixSettingsEntity;
import java.util.ArrayList;
import xsna.p4v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8b0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;

    public /* synthetic */ l8b0(String str) {
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT id, uid, pid, downloading_state, json_raw FROM playlist WHERE uid = ? ORDER BY id");
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
            default:
                MixSettingsEntity mixSettingsEntity = (MixSettingsEntity) obj;
                mixSettingsEntity.f();
                p4v0.a.b(mixSettingsEntity, this.c);
                return mixSettingsEntity;
        }
    }
}
