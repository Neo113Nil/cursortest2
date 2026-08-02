package xsna;

import com.vk.api.generated.storiesProfileDiscover.dto.StoriesProfileDiscoverGetResponseDto;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.log.L;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.ok.android.utils.Logger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class puq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ puq0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                StoriesProfileDiscoverGetResponseDto storiesProfileDiscoverGetResponseDto = (StoriesProfileDiscoverGetResponseDto) obj;
                bpn0 bpn0Var = new bpn0(new eul0(i));
                new j2r0();
                LinkedHashMap b = j2r0.b(storiesProfileDiscoverGetResponseDto.f());
                new dqu();
                LinkedHashMap b2 = dqu.b(storiesProfileDiscoverGetResponseDto.d());
                ArrayList b3 = esl0.b((esl0) bpn0Var.getValue(), storiesProfileDiscoverGetResponseDto.e(), b590.a(new b590(), null, storiesProfileDiscoverGetResponseDto.f(), storiesProfileDiscoverGetResponseDto.d(), 3), b, b2);
                b3.size();
                DiscoverBlockType discoverBlockType = DiscoverBlockType.DISCOVER;
                break;
            case 1:
                break;
            case 2:
                String str = ((a21) obj).d;
                if (str != null) {
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof fyr0) {
                    ce60.b.getClass();
                    p870.f().e(120, new VideoAttachment(((fyr0) bwr0Var).a));
                }
                break;
            case 5:
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                int i2 = VoipCallActivity.P;
                L.j((Throwable) obj, Logger.METHOD_E);
                break;
            case 10:
                int i3 = VoipCallServiceFragment.Y;
                qgi0.r((tgi0) obj, "VoipCallService.ThreeDots");
                break;
            default:
                ((etv0) obj).b(false);
                break;
        }
        return s3q0.a;
    }
}
