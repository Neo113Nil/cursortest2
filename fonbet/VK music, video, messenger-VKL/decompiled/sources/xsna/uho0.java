package xsna;

import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.posting.presentation.video.a;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.VkMaxUtilityComponent;
import xsna.bcp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class uho0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uho0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (vho0) this.c;
            case 1:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) this.c;
                return new l3p0(toolbarRedesignVh.f, toolbarRedesignVh.i, new h8n0(toolbarRedesignVh, 2), toolbarRedesignVh.y);
            case 2:
                bcp0 bcp0Var = (bcp0) this.c;
                bcp0.a aVar = bcp0.w;
                Bundle arguments = bcp0Var.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("extra_is_child_profile") : false);
            case 3:
                ((ioq0) this.c).w.b();
                return s3q0.a;
            case 4:
                ((p8r0) this.c).b.m();
                return s3q0.a;
            case 5:
                ((com.vk.libvideo.autoplay.background.controller.f) this.c).D();
                return s3q0.a;
            case 6:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) this.c;
                int i = VideoCatalogFragment.l0;
                return ((VkVideoPromoComponent) m7m.d(videoCatalogFragment).a(fpf0.a(VkVideoPromoComponent.class))).d7();
            case 7:
                return VideoEditTimelineView.U4((VideoEditTimelineView) this.c);
            case 8:
                VideoFileAdapter videoFileAdapter = (VideoFileAdapter) this.c;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                return videoFileAdapter.d().e0();
            case 9:
                return ((DonutVideoComponent) ((VideoItemListTabletVh) this.c).C.getValue()).wb();
            case 10:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                if (((Boolean) videoMinimizableDiscoveryFragment.T0.getValue()).booleanValue()) {
                    return new wvs0(videoMinimizableDiscoveryFragment.requireContext());
                }
                return null;
            case 11:
                return ((DonutVideoComponent) ((com.vk.libvideo.offline.ui.a) this.c).x.getValue()).getActionHandler();
            case 12:
                xn50.a.c(((com.vk.posting.presentation.video.f) this.c).c, a.AbstractC1531a.C1532a.b);
                return s3q0.a;
            case 13:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.c;
                int i3 = VideoProfileFragmentOld.p0;
                LayoutInflater.Factory kn = videoProfileFragmentOld.kn();
                if (kn instanceof aeg0) {
                    return (aeg0) kn;
                }
                return null;
            case 14:
                return VideoRelatedVideosFragment.jo((VideoRelatedVideosFragment) this.c);
            case 15:
                VideoTopBarView videoTopBarView = (VideoTopBarView) this.c;
                int i4 = VideoTopBarView.m;
                boolean b = ((AuthBridgeComponent) ((k7m) m7m.c(videoTopBarView)).a(fpf0.a(AuthBridgeComponent.class))).s().b();
                VideoFeatures videoFeatures = VideoFeatures.PLAYER_TECH_BUGREPORT;
                videoFeatures.getClass();
                if (!com.vk.toggle.b.A.a(videoFeatures) && b) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 16:
                VideoUploadFragment videoUploadFragment = (VideoUploadFragment) this.c;
                int i5 = VideoUploadFragment.S;
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f(videoUploadFragment)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 17:
                VkMaxUtilityComponent vkMaxUtilityComponent = (VkMaxUtilityComponent) this.c;
                qcy<Object>[] qcyVarArr2 = VkMaxUtilityComponent.c;
                a1w a1wVar = q1w.a;
                return new com.vk.im.ui.max.a((a1wVar != null ? a1wVar : null).r().h, vkMaxUtilityComponent.a.a);
            case 18:
                return (TextView) ((View) ((hgw0) this.c).h.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_on_join_title);
            case 19:
                return LayoutInflater.from(((sow0) this.c).a).inflate(R.layout.voip_call_group_selector_button_view, (ViewGroup) null);
            case 20:
                return LayoutInflater.from(((uxw0) this.c).a).inflate(R.layout.voip_call_scheduled_media_setting_view, (ViewGroup) null);
            case 21:
                return Integer.valueOf(((AudioManager) ((y6x0) this.c).b.getValue()).getStreamMaxVolume(3));
            default:
                ((qgx0) this.c).c.finish();
                return s3q0.a;
        }
    }
}
