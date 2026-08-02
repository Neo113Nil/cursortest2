package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment.e;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.HashSet;
import xsna.rhw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j8n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j8n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String i;
        Object obj;
        Object parcelable;
        gvw0 gvw0Var;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                int i3 = SuperAppFragment.o0;
                return ((VkClientMultiAccountComponent) m7m.d((SuperAppFragment) obj2).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 1:
                return ((com.vk.superapp.ui.a) obj2).b.getActivity();
            case 2:
                eqv eqvVar = new eqv((mwo0) obj2);
                eqvVar.k = 255;
                return eqvVar;
            case 3:
                bpn0 bpn0Var = ((jrp0) obj2).d;
                long j = 1000;
                long longValue = ((Number) ((r500) bpn0Var.getValue()).c.getValue()).longValue() / j;
                long longValue2 = ((Number) ((r500) bpn0Var.getValue()).c.getValue()).longValue() % j;
                StringBuilder sb = new StringBuilder();
                sb.append(longValue);
                sb.append(',');
                sb.append((long) (longValue2 / 100.0f));
                return sb.toString();
            case 4:
                return f4m.b(((vrq0) obj2).y);
            case 5:
                RecyclerView recyclerView = ((vxq0) obj2).n().a.n.c;
                if (recyclerView != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.K(0, 0);
                    }
                }
                return s3q0.a;
            case 6:
                return new phg((kzq0) obj2, 11);
            case 7:
                ((b25) ((l0s0) obj2).b.getValue()).getClass();
                return s3q0.a;
            case 8:
                ((com.vk.libvideo.autoplay.background.controller.f) obj2).D();
                return s3q0.a;
            case 9:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) obj2;
                int i4 = VideoCatalogFragment.l0;
                ComFeatures comFeatures = ComFeatures.COM_JOIN_FULL_SOURCE;
                comFeatures.getClass();
                if (!com.vk.toggle.b.A.a(comFeatures)) {
                    return null;
                }
                Bundle arguments = videoCatalogFragment.getArguments();
                String string = arguments != null ? arguments.getString("ref_screen") : null;
                String string2 = arguments != null ? arguments.getString("ref_source") : null;
                if (arguments == null || (i = arguments.getString("source")) == null) {
                    FullSourceJoinApi.EntryServiceType entryServiceType = videoCatalogFragment.R.a;
                    i = entryServiceType != null ? entryServiceType.i() : null;
                }
                return new FullSourceJoinApi(cqm0.m("video_channel"), string != null ? cqm0.m(string) : null, cqm0.m("video_channel"), string2 != null ? cqm0.m(string2) : null, i != null ? cqm0.m(i) : null, null);
            case 10:
                VideoControlsBarView.a aVar = ((VideoControlsBarView) obj2).b;
                if (aVar != null) {
                    aVar.f();
                }
                return s3q0.a;
            case 11:
                int i5 = VideoEditTimelineView.H;
                ((VideoEditTimelineView) obj2).e5();
                return s3q0.a;
            case 12:
                return VideoEpisodesFragment.jo((VideoEpisodesFragment) obj2);
            case 13:
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj2).d().m1();
            case 14:
                Object obj3 = VideoItemListSmallVh.c0;
                return ((DonutVideoComponent) ((VideoItemListSmallVh) obj2).X.getValue()).J();
            case 15:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                VideoMinimizableDiscoveryFragment.b bVar = videoMinimizableDiscoveryFragment.U;
                FrameLayout frameLayout = (bVar != null ? bVar : null).g;
                hqa0 Ed = ((AdPixelStatsComponent) videoMinimizableDiscoveryFragment.ko().i.getValue()).Ed();
                Context requireContext = videoMinimizableDiscoveryFragment.requireContext();
                HashSet hashSet = iah0.a;
                return new h31(frameLayout, Ed, videoMinimizableDiscoveryFragment.new e(), fnj.d(requireContext), videoMinimizableDiscoveryFragment.ko().Gf());
            case 16:
                return (DonutVideoComponent) ((k7m) m7m.c(((com.vk.libvideo.offline.ui.a) obj2).itemView)).a(fpf0.a(DonutVideoComponent.class));
            case 17:
                qcy<Object>[] qcyVarArr2 = VideoOpenTelemetryComponentImpl.f;
                return ((VideoOpenTelemetryComponentImpl) obj2).i();
            case 18:
                int i6 = VideoProfileFragmentOld.p0;
                Bundle requireArguments = ((VideoProfileFragmentOld) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("VideoProfileFragment.user_id", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("VideoProfileFragment.user_id");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                UserId userId = (UserId) obj;
                return userId == null ? UserId.d : userId;
            case 19:
                return VideoRelatedVideosFragment.no((VideoRelatedVideosFragment) obj2);
            case 20:
                qcy<Object>[] qcyVarArr3 = VideoView.T0;
                return ((CastComponent) ((k7m) m7m.c((VideoView) obj2)).a(fpf0.a(CastComponent.class))).L7();
            case 21:
                return new fs2((vtt0) obj2, 18);
            case 22:
                ggu0 ggu0Var = (ggu0) obj2;
                if (ggu0Var.q) {
                    ggu0Var.q = false;
                    Context context = ggu0Var.b;
                    Activity b = gnj.b(context);
                    if (b != null) {
                        b.setRequestedOrientation(1);
                    }
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).b0(context);
                }
                ggu0Var.c.m(true);
                return s3q0.a;
            case 23:
                return ((fpu0) obj2).Dn();
            case 24:
                ((VkExpandableText) obj2).q();
                return s3q0.a;
            case 25:
                return ((hgw0) obj2).a().findViewById(R.id.call_by_link_media_setting_disabled_on_join_view);
            case 26:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                int i7 = VoipCallServiceFragment.Y;
                rhw0.v vVar = rhw0.v.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, vVar);
                return s3q0.a;
            case 27:
                return new pow0(((sow0) obj2).c);
            case 28:
                Integer c = ((yix0) obj2).b.getState().c();
                return Integer.valueOf(c != null ? c.intValue() : 0);
            default:
                WhiteboardFragment whiteboardFragment = (WhiteboardFragment) obj2;
                int i8 = WhiteboardFragment.R;
                LayoutInflater.Factory kn = whiteboardFragment.kn();
                evw0 evw0Var = kn instanceof evw0 ? (evw0) kn : null;
                if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
                    gvw0Var = new gvw0(whiteboardFragment.requireContext(), new ivw0());
                }
                return new ilx0(gvw0Var);
        }
    }

    public /* synthetic */ j8n0(l0s0 l0s0Var, Context context) {
        this.b = 7;
        this.c = l0s0Var;
    }
}
