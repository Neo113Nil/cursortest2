package xsna;

import android.graphics.Rect;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.design.view.timeline.TimelineEditingActionsView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.core.telemetry.a;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.Attachment;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.offline.ui.VideoOfflineExtendedStateView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import xsna.exr0;
import xsna.i8z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class prq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ prq0(VideoCatalogRootVh videoCatalogRootVh, s9s0 s9s0Var) {
        this.b = 7;
        this.c = videoCatalogRootVh;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        x64 x64Var;
        rlt0 m0;
        rlt0 m02;
        Fragment parentFragment;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                vrq0 vrq0Var = (vrq0) obj;
                return j5g.v0((Rect) vrq0Var.I.getValue(), vrq0Var.r.getSnowballsForbiddenRectList());
            case 1:
                return ((AuthBridgeComponent) m7m.d(((vxq0) obj).b).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 2:
                return ((BridgeComponent) ((kzq0) obj).a.a(fpf0.a(BridgeComponent.class))).O().D();
            case 3:
                ((p8r0) obj).a.Rm();
                return s3q0.a;
            case 4:
                exr0.a aVar = ((exr0) obj).a;
                wzs<Boolean, String, s3q0> k = aVar.k();
                if (k == null) {
                    return null;
                }
                ((i8z.b.C3040b) k).invoke(Boolean.valueOf(aVar.W().e.O9()), aVar.W().e.a1());
                return s3q0.a;
            case 5:
                com.vk.libvideo.autoplay.background.controller.f fVar = (com.vk.libvideo.autoplay.background.controller.f) obj;
                fVar.F(fVar.f.a());
                return s3q0.a;
            case 6:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) obj;
                if (((hlu0) videoCatalogFragment.U.getValue()).a()) {
                    ((jlu0) videoCatalogFragment.V.getValue()).e(videoCatalogFragment, MultiAccountEntryPoint.LongTap.d);
                }
                return s3q0.a;
            case 7:
                com.vk.catalog2.common.ui.mvp.holder.video.a aVar2 = ((VideoCatalogRootVh) obj).L0;
                com.vk.core.utils.newtork.b.a.getClass();
                boolean d = com.vk.core.utils.newtork.b.d();
                com.vk.catalog2.common.ui.mvp.holder.video.b bVar = aVar2.d;
                wb7 wb7Var = aVar2.b;
                boolean a = wb7Var.a();
                boolean z2 = aVar2.f;
                if (d && a && !z2) {
                    aVar2.f = true;
                    aVar2.e.a(true);
                    wb7Var.d();
                }
                return s3q0.a;
            case 8:
                int i2 = VideoEditTimelineView.H;
                return (TimelineEditingActionsView) ((VideoEditTimelineView) obj).findViewById(R.id.editing_actions);
            case 9:
                int i3 = VideoEpisodesFragment.V;
                return ((VideoRestrictedUserActionsComponent) m7m.d((VideoEpisodesFragment) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 10:
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj).d().p1();
            case 11:
                mps0 mps0Var = (mps0) obj;
                Attachment attachment = mps0Var.c;
                if (attachment != null && (x64Var = mps0Var.i) != null) {
                    x64Var.c(attachment);
                }
                return s3q0.a;
            case 12:
                Object obj2 = VideoItemListSmallVh.c0;
                return ((DonutVideoComponent) ((VideoItemListSmallVh) obj).X.getValue()).getActionHandler();
            case 13:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                return new mzn(((DonutVideoComponent) videoMinimizableDiscoveryFragment.ko().J.getValue()).s3(), new ujm0(videoMinimizableDiscoveryFragment, 11));
            case 14:
                int i5 = VideoOfflineExtendedStateView.d;
                return new VideoOfflineExtendedStateView.c((VideoOfflineExtendedStateView) obj);
            case 15:
                qcy<Object>[] qcyVarArr2 = VideoOpenTelemetryComponentImpl.f;
                return ((VideoOpenTelemetryComponentImpl) obj).Ya() ? new rhk0() : a.C0777a.a.getSTUB();
            case 16:
                return VideoSkippablePartView.c((VideoSkippablePartView) obj);
            case 17:
                ((alt0) obj).b = true;
                return s3q0.a;
            case 18:
                VideoView videoView = (VideoView) obj;
                if (videoView.b0) {
                    videoView.getViewBinding().r.p1(true);
                }
                VideoPipStateHolder.a.getClass();
                VideoPipStateHolder.b();
                yg5 yg5Var = videoView.I;
                if (yg5Var != null) {
                    videoView.l0();
                    if (yg5Var.isPlaying() || yg5Var.w0()) {
                        yg5Var.c();
                        if (!yg5Var.P0() && (m0 = yg5Var.m0()) != null) {
                            m0.i("pause", "pause");
                        }
                    } else {
                        yg5Var.D();
                        if (yg5Var.a()) {
                            yg5Var.z0(videoView.getViewBinding().c, videoView.getVideoConfig(), null);
                            yg5Var.S(false);
                        } else {
                            videoView.y0(false);
                            if (!yg5Var.P0() && (m02 = yg5Var.m0()) != null) {
                                m02.i("pause", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 19:
                return new gs2((vtt0) obj, 17);
            case 20:
                return ((ggu0) obj).b;
            case 21:
                fpu0 fpu0Var = (fpu0) obj;
                int i6 = fpu0.c0;
                if (fpu0Var.isResumed() && ((parentFragment = fpu0Var.getParentFragment()) == null || !parentFragment.isHidden())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                return ((hgw0) obj).a().findViewById(R.id.call_by_link_media_setting_enabled_view);
            case 23:
                return (VkSearchView) ((sow0) obj).d().findViewById(R.id.call_group_selector_search);
            case 24:
                int i7 = VoipPastCallsFragment.a0;
                h3p0.b((VoipPastCallsFragment) obj);
                return s3q0.a;
            default:
                return (TextView) ((oxw0) obj).findViewById(R.id.voip_schedule_call_toolbar_title);
        }
    }

    public /* synthetic */ prq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
