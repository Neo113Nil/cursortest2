package xsna;

import com.vk.api.generated.messages.dto.MessagesCallPreviewDto;
import com.vk.api.generated.messages.dto.MessagesGetCallPreviewResponseDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ fk2(int i, String str, Object obj) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer d;
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            case 1:
                MessagesGetCallPreviewResponseDto messagesGetCallPreviewResponseDto = (MessagesGetCallPreviewResponseDto) obj;
                CallId callId = new CallId(messagesGetCallPreviewResponseDto.d());
                MessagesCallPreviewDto f = messagesGetCallPreviewResponseDto.f();
                String title = f != null ? f.getTitle() : null;
                MessagesCallPreviewDto f2 = messagesGetCallPreviewResponseDto.f();
                int intValue = (f2 == null || (d = f2.d()) == null) ? 0 : d.intValue();
                MessagesCallPreviewDto f3 = messagesGetCallPreviewResponseDto.f();
                String valueOf = String.valueOf(f3 != null ? f3.getTitle() : null);
                String valueOf2 = String.valueOf(messagesGetCallPreviewResponseDto.e());
                MessagesCallPreviewDto f4 = messagesGetCallPreviewResponseDto.f();
                return new s89(callId, title, this.c, intValue, new JoinData(valueOf2, valueOf, w89.d(f4 != null ? f4.e() : null)), null);
            default:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT id, uid, pid, downloading_state, json_raw FROM playlist \n        WHERE uid = ? AND type = 1\n    ");
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

    public /* synthetic */ fk2(String str) {
        this.b = 0;
        this.c = str;
    }
}
