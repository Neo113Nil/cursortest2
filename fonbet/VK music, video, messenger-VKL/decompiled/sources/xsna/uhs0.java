package xsna;

import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddle;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.offline.VideoDownloadService;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryInternalComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.b78;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uhs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uhs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object[] objArr = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = VideoDownloadService.n;
                return new h9o(((VideoDownloadService) obj).getApplicationContext(), "video_download_channel");
            case 1:
                VideoItemListLargeVh videoItemListLargeVh = (VideoItemListLargeVh) obj;
                FrameLayout frameLayout = videoItemListLargeVh.t;
                return new kis0(new m2u0(frameLayout != null ? frameLayout : null), new tkl(), (lis0) videoItemListLargeVh.g0.getValue());
            case 2:
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                l7m d = m7m.d((VideoMinimizableDiscoveryFragment) obj);
                VideoMinimizableDiscoveryInternalComponent.N.getClass();
                return (VideoMinimizableDiscoveryInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, VideoMinimizableDiscoveryInternalComponent.a.C1969a.a, fpf0.a(VideoMinimizableDiscoveryInternalComponent.class), new zdi(4))).a(fpf0.a(VideoMinimizableDiscoveryInternalComponent.class));
            case 3:
                return (VideoNotificationsPermissionComponent) ((f8m) obj).a(fpf0.a(VideoNotificationsPermissionComponent.class));
            case 4:
                ((cys0) obj).b0.invoke(a.j.b);
                return s3q0.a;
            case 5:
                int i5 = VideoOfflineFragment.f1;
                ydt0 Y = fxc0.B().Y();
                ((VideoOfflineFragment) obj).requireContext();
                Y.getClass();
                return s3q0.a;
            case 6:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return videoView.getViewBinding().r.W3(videoView.getContext());
            case 7:
                ((b78.g) obj).a().invoke(new sx40.m0(false, PlayerContext.MINI));
                return s3q0.a;
            case 8:
                VkFeedPostHeaderSubtitleTextView vkFeedPostHeaderSubtitleTextView = (VkFeedPostHeaderSubtitleTextView) obj;
                return new xxk0(vkFeedPostHeaderSubtitleTextView.F, vkFeedPostHeaderSubtitleTextView.getPaint(), Integer.MAX_VALUE, null, vkFeedPostHeaderSubtitleTextView.getLineSpacingMultiplier(), vkFeedPostHeaderSubtitleTextView.getLineSpacingExtra(), null, 1, 5944).a();
            case 9:
                VkModal vkModal = (VkModal) obj;
                vkModal.f = null;
                gzs<s3q0> gzsVar = vkModal.d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 10:
                int i6 = VkRichCellMiddle.p;
                return new VkButton(((VkRichCellMiddle) obj).getContext(), objArr == true ? 1 : 0, 6, i2);
            case 11:
                euw0 euw0Var = (euw0) obj;
                int i7 = euw0.f1;
                euw0Var.getParentFragmentManager().k0(yfb.b(new Pair("key_on_click_add_by_qr", Boolean.TRUE)), "result_participant_add_user_options");
                euw0Var.dismiss();
                return s3q0.a;
            case 12:
                return ((VoipCallComponent) ((k7m) m7m.f((kvw0) obj)).a(fpf0.a(VoipCallComponent.class))).L1();
            default:
                return (ViewGroup) ((ViewStub) ((y0y0) obj).a.findViewById(R.id.write_bar_comments_layout_viewstub)).inflate();
        }
    }
}
