package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzs0 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                if (360 <= intValue && intValue < 720) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 1:
                int intValue2 = ((Integer) obj).intValue();
                int i = VideoProfileCreatorOnboardingItemsView.q;
                return Integer.valueOf(-intValue2);
            case 2:
                qgi0.r((tgi0) obj, "ad_banner_title");
                return s3q0.a;
            case 3:
                return new h7w0(R.layout.vmoji_character_my_sticker_pack_loading_item, (ViewGroup) obj);
            case 4:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM vmoji_promo_in_suggests");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 5:
                return s3q0.a;
            default:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
        }
    }
}
