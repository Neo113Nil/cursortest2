package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fuh0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fuh0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                qgi0.r((tgi0) obj, "storefront_top_bar_cart_icon");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't get cached full stat", (Throwable) obj));
                break;
            case 5:
                qgi0.r((tgi0) obj, "TitleTags.ERROR");
                break;
            case 6:
                ((etv0) obj).b(false);
                break;
            case 7:
                if (((BaseOkResponseDto) obj) != BaseOkResponseDto.OK) {
                    break;
                } else {
                    break;
                }
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 12:
                int i = VoipCallServiceFragment.Y;
                qgi0.r((tgi0) obj, "VoipCallService.Header");
                break;
            default:
                ((etv0) obj).b(false);
                break;
        }
        return s3q0.a;
    }
}
