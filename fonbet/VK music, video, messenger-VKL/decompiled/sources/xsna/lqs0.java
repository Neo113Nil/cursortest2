package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.music.bottomsheets.di.RecommendationOnboardingComponent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vk.permission.PermissionHelper;
import com.vk.video.recast.di.RecastDiComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.voip.VoipCallActivity;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.b78;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lqs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lqs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoNotificationsPermissionComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).a(fpf0.a(VideoNotificationsPermissionComponent.class))).V();
            case 1:
                int i3 = VideoLiveFragment.i0;
                return ((VideoShareComponent) m7m.d((VideoLiveFragment) obj).a(fpf0.a(VideoShareComponent.class))).S();
            case 2:
                return (RecastDiComponent) ((f8m) obj).a(fpf0.a(RecastDiComponent.class));
            case 3:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj;
                int i4 = VideoOfflineFragment.f1;
                FragmentActivity activity = videoOfflineFragment.getActivity();
                if (activity != null) {
                    fxc0.B().Y().A(activity, (r27 & 2) != 0 ? null : null, "VIDEO_DOWNLOADS", (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                }
                if (videoOfflineFragment.getParentFragment() == null) {
                    videoOfflineFragment.finish();
                }
                return s3q0.a;
            case 4:
                wh50<set0> wh50Var = ((tet0) obj).m;
                return Boolean.valueOf((((set0) ((zak0) wh50Var).getValue()).p() || ((set0) ((zak0) wh50Var).getValue()).getContentType() == 2) ? false : true);
            case 5:
                Activity activity2 = ((fgt0) obj).c;
                return new k640(activity2, ((InfoBridgeComponent) m7m.a(activity2).a(fpf0.a(InfoBridgeComponent.class))).t().b());
            case 6:
                ((b78.i) obj).a().invoke(new sx40.m0(true, PlayerContext.MINI));
                return s3q0.a;
            case 7:
                VkBannerVh vkBannerVh = (VkBannerVh) obj;
                UIBlockPlaceholder uIBlockPlaceholder = vkBannerVh.l;
                UIBlockAction uIBlockAction = vkBannerVh.o;
                if (uIBlockPlaceholder != null && uIBlockAction != null) {
                    vkBannerVh.c.a(new cfp0(uIBlockPlaceholder, uIBlockAction));
                    vkBannerVh.a(uIBlockPlaceholder, uIBlockAction, true);
                }
                return s3q0.a;
            case 8:
                return ((RecommendationOnboardingComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).mo408a(fpf0.a(RecommendationOnboardingComponent.class))).R8();
            case 9:
                return (VkText) ((quu0) obj).findViewById(R.id.feed_link_primary_cell_title);
            case 10:
                return Float.valueOf(((Number) ((ccn) obj).a.h.getValue()).floatValue());
            case 11:
                int i5 = VkVideoPickerFragment.V;
                UserId userId = (UserId) ((VkVideoPickerFragment) obj).requireArguments().getParcelable("user_id_video");
                return userId == null ? UserId.d : userId;
            case 12:
                int i6 = VoipCallActivity.P;
                com.vk.voip.ui.c.b.getClass();
                ((gvw0) com.vk.voip.ui.c.U0.getValue()).getClass();
                PermissionHelper.a.getClass();
                if (tvo.a((VoipCallActivity) obj, (String[]) Arrays.copyOf(new String[]{"android.permission.BLUETOOTH_CONNECT"}, 1))) {
                    com.vk.voip.ui.a.a.getClass();
                    com.vk.voip.ui.a.f();
                }
                return s3q0.a;
            default:
                return ((com.vk.writebar.g) obj).f().findViewById(R.id.writebar_slide_to_cancel);
        }
    }
}
