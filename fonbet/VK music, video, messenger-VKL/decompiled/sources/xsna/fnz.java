package xsna;

import android.content.Context;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vkontakte.android.data.b;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fnz implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fnz(Context context, int i) {
        this.d = context;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                LikesDeleteResponseDto likesDeleteResponseDto = (LikesDeleteResponseDto) obj;
                gnz.b0(this.c, (UserId) this.d, false);
                break;
            case 1:
                nzk0 nzk0Var = new nzk0((Context) this.d);
                nzk0Var.e = (StatusImagePopup) obj;
                final int i = this.c;
                nzk0Var.g = new gzs() { // from class: xsna.qzk0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        b.d a = io.reactivex.rxjava3.processors.b.a("image_status", "action", "popup_action");
                        a.b(Integer.valueOf(i), "status_id");
                        a.e();
                        return s3q0.a;
                    }
                };
                nzk0Var.h = new gzs() { // from class: xsna.rzk0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        b.d a = io.reactivex.rxjava3.processors.b.a("image_status", "action", "show_popup");
                        a.b(Integer.valueOf(i), "status_id");
                        a.e();
                        return s3q0.a;
                    }
                };
                nzk0Var.S0();
                break;
            default:
                v5b v5bVar = (v5b) this.d;
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ArrayList b = com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b);
                v5bVar.invoke(new rbt0(this.c, 50, videoListWithTotalCount.c, 48, b));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fnz(v5b v5bVar, com.vk.video.ui.discovery.minimizable.related_videos.d dVar, int i) {
        this.d = v5bVar;
        this.c = i;
    }

    public /* synthetic */ fnz(gnz gnzVar, UserId userId, int i) {
        this.d = userId;
        this.c = i;
    }
}
