package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.api.di.VideoPlaylistVideosComponent;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.log.L;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vk.oauth.tinkoff.verification.VkTinkoffVerificationActivity;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.io.IOException;
import xsna.b78;
import xsna.owm;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pyr0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pyr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        yks0 yks0Var;
        long j;
        int i = this.b;
        String str = null;
        str = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.video.ad.b) obj).f.C(false);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((VideoItemVh) obj).d.J().X1());
            case 2:
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = ((VideoMinimizableDiscoveryFragment) obj).X;
                if (miniPlayerControllersWrapper != null && (yks0Var = miniPlayerControllersWrapper.t) != null) {
                    str = yks0Var.a;
                }
                return str == null ? "" : str;
            case 3:
                return (VideoShareComponent) ((f8m) obj).a(fpf0.a(VideoShareComponent.class));
            case 4:
                gzs<s3q0> gzsVar = ((VideoNewProfileHeaderViewV2) obj).h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 5:
                int i2 = VideoOfflineFragment.f1;
                ((VideoKidsComponent) m7m.d((VideoOfflineFragment) obj).a(fpf0.a(VideoKidsComponent.class))).I4();
                return Boolean.FALSE;
            case 6:
                VideoPlaylistRootVh videoPlaylistRootVh = (VideoPlaylistRootVh) obj;
                return new kkj0(((VideoPlaylistVideosComponent) ((k7m) m7m.f(videoPlaylistRootVh)).mo408a(fpf0.a(VideoPlaylistVideosComponent.class))).U7(), new com.vk.movika.sdk.android.defaultplayer.control.l(videoPlaylistRootVh, 10), new b5t0(videoPlaylistRootVh));
            case 7:
                tet0 tet0Var = (tet0) obj;
                return Boolean.valueOf((((set0) ((zak0) tet0Var.m).getValue()).getContentType() == 3 || ((Boolean) tet0Var.w.getValue()).booleanValue()) ? false : true);
            case 8:
                return ((OnboardingComponent) ((k7m) m7m.f((mht0) ((nht0) obj).c.getValue())).a(fpf0.a(OnboardingComponent.class))).uc();
            case 9:
                VideoUploadTaskNew videoUploadTaskNew = (VideoUploadTaskNew) obj;
                try {
                    Context context = e43.a;
                    j = gbr.c(context != null ? context : null, Uri.parse(videoUploadTaskNew.i)).longValue();
                } catch (IOException e) {
                    L.i(e);
                    j = 0;
                }
                return Long.valueOf(j);
            case 10:
                ((b78.h) obj).a().invoke(sx40.c.b);
                return s3q0.a;
            case 11:
                ((q9u0) obj).O(owm.a.b);
                return s3q0.a;
            case 12:
                VkBannerVh vkBannerVh = (VkBannerVh) obj;
                UIBlockPlaceholder uIBlockPlaceholder = vkBannerVh.l;
                UIBlockAction uIBlockAction = vkBannerVh.p;
                if (uIBlockPlaceholder != null && uIBlockAction != null) {
                    vkBannerVh.c.a(new cfp0(uIBlockPlaceholder, uIBlockAction));
                    vkBannerVh.a(uIBlockPlaceholder, uIBlockAction, true);
                }
                return s3q0.a;
            case 13:
                return ((com.vk.superapp.browser.ui.a) obj).En();
            case 14:
                return ((VideoAdFreeSubscriptionComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(VideoAdFreeSubscriptionComponent.class))).h1();
            case 15:
                VkFriendsPickerActivity vkFriendsPickerActivity = (VkFriendsPickerActivity) obj;
                Toolbar toolbar = vkFriendsPickerActivity.h;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.setVisibility(0);
                BaseVkSearchView baseVkSearchView = vkFriendsPickerActivity.i;
                if (baseVkSearchView == null) {
                    baseVkSearchView = null;
                }
                baseVkSearchView.setVisibility(8);
                BaseVkSearchView baseVkSearchView2 = vkFriendsPickerActivity.i;
                (baseVkSearchView2 != null ? baseVkSearchView2 : null).U4();
                return s3q0.a;
            case 16:
                Boolean bool = (Boolean) ((zak0) ((bi50) obj).d).getValue();
                bool.booleanValue();
                return bool;
            case 17:
                int i3 = VkTinkoffVerificationActivity.q;
                w0m w0mVar = ((VkTinkoffVerificationActivity) obj).f;
                return (jsv0) (w0mVar != null ? w0mVar : null);
            case 18:
                int i4 = VkVideoPickerFragment.V;
                return ((VideoApiHelperComponent) m7m.d((VkVideoPickerFragment) obj).a(fpf0.a(VideoApiHelperComponent.class))).N4();
            default:
                return (ViewGroup) ((ViewStub) ((com.vk.writebar.g) obj).a.findViewById(R.id.writebar_audio_area_viewstub)).inflate();
        }
    }
}
