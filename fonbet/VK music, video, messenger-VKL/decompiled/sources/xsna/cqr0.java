package xsna;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.stories.design.view.editor.verticalization.VerticalizationPickerView;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment.f;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import xsna.m2u0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cqr0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cqr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VerticalizationPickerView.z;
                return ((CommonEditorComponent) ((k7m) m7m.f((VerticalizationPickerView) obj)).a(fpf0.a(CommonEditorComponent.class))).Ha();
            case 1:
                ((exr0) obj).a.c();
                return s3q0.a;
            case 2:
                int i3 = VideoCatalogFragment.l0;
                return ((OnboardingComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(OnboardingComponent.class))).uc();
            case 3:
                int i4 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.timeline_mute_btn);
            case 4:
                View view = ((VideoItemListTabletVh) obj).o;
                if (view == null) {
                    view = null;
                }
                return (DonutVideoComponent) ((k7m) m7m.c(view)).a(fpf0.a(DonutVideoComponent.class));
            case 5:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                return new k31(videoMinimizableDiscoveryFragment.requireContext(), videoMinimizableDiscoveryFragment.new f(), videoMinimizableDiscoveryFragment.ko().Gf());
            case 6:
                return ((DonutVideoComponent) ((com.vk.libvideo.offline.ui.a) obj).x.getValue()).wb();
            case 7:
                qcy<Object>[] qcyVarArr = VideoOpenTelemetryComponentImpl.f;
                return ((VideoOpenTelemetryComponentImpl) obj).i();
            case 8:
                int i6 = VideoProfileFragmentOld.p0;
                return ((VideoProfileFragmentOld) obj).requireArguments().getString("VideoProfileFragment.catalog_url");
            case 9:
                return VideoRelatedVideosFragment.go((VideoRelatedVideosFragment) obj);
            case 10:
                int i7 = VideoUploadFragment.S;
                return ((CameraClipsComponent) ((k7m) m7m.f((VideoUploadFragment) obj)).a(fpf0.a(CameraClipsComponent.class))).sf();
            case 11:
                m2u0 m2u0Var = (m2u0) obj;
                return m2u0Var.new c(m2u0Var.a);
            case 12:
                return ((ggu0) obj).b;
            case 13:
                return (RadioButton) ((View) ((hgw0) obj).h.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_on_join_radio_button);
            case 14:
                return (TextView) ((sow0) obj).d().findViewById(R.id.call_group_selector_placeholder);
            default:
                ((zqk0) obj).r.c();
                return s3q0.a;
        }
    }
}
