package xsna;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.channelrestrictions.ChannelRestrictionsComponent;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.Image;
import com.vk.libvideo.api.di.PollDelegateProviderComponent;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.impl.di.VideoAdvertisementsComponentImpl;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ksq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ksq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((CommunityNewsfeedComponent) ((k7m) m7m.f((lsq0) obj)).mo408a(fpf0.a(CommunityNewsfeedComponent.class))).ba();
            case 1:
                return new myr0(((VideoAdvertisementsComponentImpl) obj).a.M3());
            case 2:
                int i2 = VideoCatalogFragment.l0;
                return ((PollDelegateProviderComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(PollDelegateProviderComponent.class))).ld();
            case 3:
                int i3 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.timeline_expand_btn);
            case 4:
                int i4 = VideoErrorView.g;
                return (AppCompatTextView) ((VideoErrorView) obj).findViewById(R.id.retry_text);
            case 5:
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                Image e1 = ((VideoFileAdapter) obj).d().e1();
                if (epx.f(e1, Image.d)) {
                    return null;
                }
                return e1;
            case 6:
                return ((DonutVideoComponent) ((VideoItemListTabletVh) obj).C.getValue()).s3();
            case 7:
                bpn0 bpn0Var = VideoOverlayView.I;
                ((VideoOverlayView.c.h) obj).getClass();
                throw null;
            case 8:
                return ((BridgeComponent) ((k7m) m7m.f((k6t0) obj)).a(fpf0.a(BridgeComponent.class))).id().c();
            case 9:
                int i5 = VideoProfileFragmentOld.p0;
                return (ChannelRestrictionsComponent) ((k7m) m7m.f((VideoProfileFragmentOld) obj)).mo408a(fpf0.a(ChannelRestrictionsComponent.class));
            case 10:
                return ((CameraClipsComponent) ((VideoUploadFragment) obj).Q.getValue()).p9();
            case 11:
                return VideoView.F((VideoView) obj);
            case 12:
                return new vxt0((uxt0) obj);
            case 13:
                ((uxv0) obj).e("cancel", null);
                return s3q0.a;
            case 14:
                return (RadioButton) ((View) ((hgw0) obj).k.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_permanent_radio_button);
            case 15:
                int i6 = VoipCallServiceFragment.Y;
                h3p0.b((VoipCallServiceFragment) obj);
                return s3q0.a;
            case 16:
                return (TextView) ((sow0) obj).d().findViewById(R.id.call_group_selector_error_state_title);
            default:
                return (TextView) ((View) ((uxw0) obj).e.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_on_join_view);
        }
    }
}
