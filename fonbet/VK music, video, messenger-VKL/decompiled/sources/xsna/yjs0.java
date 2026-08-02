package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.log.L;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.voip.VoipCallActivity;
import java.util.List;
import ru.ok.android.utils.Logger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yjs0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ yjs0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 2:
                int i = VideoNewProfileHeaderViewV2.y;
                ((etv0) obj).b(false);
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                qgi0.r((tgi0) obj, "vk_top_bar_search_title");
                return s3q0.a;
            case 6:
                int i2 = VoipCallActivity.P;
                L.j((Throwable) obj, Logger.METHOD_E);
                return s3q0.a;
            case 7:
                int i3 = ngw0.n1;
                return ((pno0) obj).d().toString();
            case 8:
                int i4 = c2x0.o1;
                L.g("VoipShareQRCodeModalDialog", (Throwable) obj);
                return s3q0.a;
            default:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
        }
    }
}
