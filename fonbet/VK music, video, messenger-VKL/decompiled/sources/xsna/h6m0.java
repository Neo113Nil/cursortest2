package xsna;

import android.app.Activity;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.video.mvi.VideoCatalogMviVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.dto.common.Good;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.api.di.WarmupComponent;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vk.superapp.browser_events.di.BrowserEventsComponent;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.video.focus.api.VideoFocusComponent;
import com.vk.voip.VoipCallActivity;
import com.vkontakte.android.R;
import xsna.a5u;
import xsna.ddw0;
import xsna.oyr0;
import xsna.ubu0;
import xsna.wd90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h6m0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        l7m a;
        VideoFocusComponent videoFocusComponent;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = StoryMediaPickerFragment.d0;
                ((StoryMediaPickerFragment) obj).getFeature().C(a.c.b);
                return s3q0.a;
            case 1:
                int i3 = StoryStatisticsViewersFragment.f0;
                return ((BridgeComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 2:
                ((uov) ((uy9) obj).c).pause();
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((Number) ((mtk0) obj).getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 4:
                return ((AuthBridgeComponent) m7m.e().a(fpf0.a(AuthBridgeComponent.class))).s();
            case 5:
                ezp0 ezp0Var = (ezp0) obj;
                cxo cxoVar = ezp0Var.a;
                Good good = cxoVar.r;
                if (good != null) {
                    n5g0 n5g0Var = (n5g0) cxoVar.a.H.getValue();
                    a5u.a aVar = ezp0Var.c;
                    n5g0Var.c(aVar.f, "market", null, aVar.d, good.b);
                }
                return s3q0.a;
            case 6:
                mbr mbrVar = (mbr) obj;
                StringBuilder a2 = eq0.a(mbrVar.b.size(), "executeUploading: start uploading events (size ", ", count ", mbrVar.a);
                a2.append(")");
                return a2.toString();
            case 7:
                int i4 = UserProfileFragment.p0;
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f((UserProfileFragment) obj)).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 8:
                ((zwq0) obj).f0(true);
                return s3q0.a;
            case 9:
                RecyclerPaginatedView recyclerPaginatedView = ((u8r0) obj).a.g;
                nwy nwyVar = ((BrowserEventsComponent) ((k7m) m7m.c(recyclerPaginatedView != null ? recyclerPaginatedView : null)).a(fpf0.a(BrowserEventsComponent.class))).a;
                qcy<Object> qcyVar = BrowserEventsComponent.c[0];
                return (t9u0) nwyVar.c();
            case 10:
                ((com.vk.video.ad.b) obj).h.b(oyr0.c.a);
                return s3q0.a;
            case 11:
                r2s0 r2s0Var = (r2s0) obj;
                r2s0Var.f.Qc("video_audio");
                r2s0Var.b = null;
                return s3q0.a;
            case 12:
                VideoCatalogMviVh videoCatalogMviVh = (VideoCatalogMviVh) obj;
                return new m5u0(new ikk0(videoCatalogMviVh, 12), new iud0(9), new irc0(videoCatalogMviVh, 25));
            case 13:
                int i5 = VideoCatalogSearchRootVh.S;
                return ((VideoKidsComponent) ((k7m) m7m.f((VideoCatalogSearchRootVh) obj)).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 14:
                return (WarmupComponent) ((f8m) obj).a(fpf0.a(WarmupComponent.class));
            case 15:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj;
                int i6 = VideoOfflineFragment.f1;
                if (videoOfflineFragment.Jo()) {
                    iiy iiyVar = (iiy) videoOfflineFragment.J0.getValue();
                    videoOfflineFragment.requireContext();
                    iiyVar.getClass();
                } else {
                    ((com.vk.superapp.multiaccount.api.e) videoOfflineFragment.d1.getValue()).j(videoOfflineFragment.kn().getSupportFragmentManager(), MultiAccountEntryPoint.VideoOfflineRelated.d, SwitcherLaunchMode.DefaultMode.b, SwitcherUiMode.Ecoplate.b);
                }
                return s3q0.a;
            case 16:
                return ((VideoPlaylistRootVh) obj).N;
            case 17:
                Activity h = e3m.h(((hbt0) obj).b);
                if (h == null || (a = m7m.a(h)) == null || (videoFocusComponent = (VideoFocusComponent) a.a(fpf0.a(VideoFocusComponent.class))) == null) {
                    return null;
                }
                return videoFocusComponent.b();
            case 18:
                set0 set0Var = (set0) ((zak0) ((tet0) obj).m).getValue();
                if (!set0Var.d() && !set0Var.v() && set0Var.getDuration() == 0 && set0Var.e() == 2 && set0Var.getContentType() == 0 && set0Var.D() == 0) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 19:
                ebs0 ebs0Var = ((sqt0) obj).b;
                if (ebs0Var != null) {
                    ebs0Var.bk(tms0.a);
                }
                return s3q0.a;
            case 20:
                return new ubu0.a((ubu0) obj);
            case 21:
                VkBannerVh vkBannerVh = (VkBannerVh) obj;
                UIBlockPlaceholder uIBlockPlaceholder = vkBannerVh.l;
                UIBlockAction uIBlockAction = vkBannerVh.q;
                if (uIBlockPlaceholder != null && uIBlockAction != null) {
                    vkBannerVh.c.a(new cfp0(uIBlockPlaceholder, uIBlockAction));
                    com.vk.catalog2.common.ui.mvp.util.a aVar2 = vkBannerVh.e;
                    VkBanner vkBanner = vkBannerVh.j;
                    com.vk.catalog2.common.ui.mvp.util.a.e(aVar2, (vkBanner != null ? vkBanner : null).getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
                    vkBannerVh.a(uIBlockPlaceholder, uIBlockAction, false);
                }
                return s3q0.a;
            case 22:
                return ((com.vk.superapp.browser.ui.a) obj).vn();
            case 23:
                return (FrameLayout) ((quu0) obj).findViewById(R.id.feed_link_primary_cell_right);
            case 24:
                wd90 wd90Var = (wd90) obj;
                return Float.valueOf(wd90Var instanceof wd90.b ? ((wd90.b) wd90Var).a : -1.0f);
            case 25:
                ((VkTopBarSearchQueryVh) obj).c.n();
                return s3q0.a;
            case 26:
                ((bdw0) obj).h.b(ddw0.a.a);
                return s3q0.a;
            case 27:
                int i7 = VoipCallActivity.P;
                ((VoipCallActivity) obj).e2(true, null);
                return s3q0.a;
            case 28:
                return ((com.vk.writebar.g) obj).f().findViewById(R.id.writebar_record_dot);
            default:
                ((f3y0) obj).N.o2();
                return s3q0.a;
        }
    }
}
