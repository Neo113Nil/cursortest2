package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stories.StorySettingsActivity;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import java.util.Optional;
import kotlin.Pair;
import xsna.p4x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l4k0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ l4k0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Boolean bool = null;
        switch (this.b) {
            case 0:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, true, null, 1535);
            case 1:
                return StickerPackPreview.zb((StickerPackPreview) obj, 258047);
            case 2:
                qgi0.r((tgi0) obj, "title_toolbar");
                return s3q0.a;
            case 3:
                return new Pair((VkPaginationList) obj, Boolean.FALSE);
            case 4:
                int i = StorySettingsActivity.P;
                qgi0.r((tgi0) obj, "back_button");
                return s3q0.a;
            case 5:
                L.G("Shake detected!");
                return s3q0.a;
            case 6:
                tdu tduVar = (tdu) obj;
                tduVar.X(vog0.a);
                tduVar.f(true);
                return s3q0.a;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 8:
                return Boolean.valueOf(((Optional) obj).orElse(null) != null);
            case 9:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(com.vk.libvideo.api.minimizable.a.h((VideoMinimizableState) obj));
            case 10:
                VideoMinimizableScreenArgs videoMinimizableScreenArgs = (VideoMinimizableScreenArgs) ((Optional) obj).orElse(null);
                if (videoMinimizableScreenArgs != null && (str = videoMinimizableScreenArgs.b.h) != null) {
                    bool = Boolean.valueOf(brm0.B(str, x9t0.d, false));
                }
                return Boolean.valueOf(epx.f(bool, Boolean.TRUE));
            case 11:
                qgi0.r((tgi0) obj, "ad_banner_right_icon");
                return s3q0.a;
            case 12:
                return ((String) obj).concat("/vksdk/v1");
            case 13:
                int i3 = VkPhotoPickerFragment.r0;
                return Boolean.valueOf(epx.f(((xe6) obj).a, 1));
            case 14:
                vfp vfpVar = new vfp(new View(((ViewGroup) obj).getContext()));
                vfpVar.itemView.setLayoutParams(new LinearLayout.LayoutParams(-1, cn70.b(10)));
                return vfpVar;
            case 15:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            default:
                return Boolean.valueOf(((p4x0.b) obj).c);
        }
    }
}
