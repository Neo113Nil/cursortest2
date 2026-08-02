package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.video.profile.presentation.h;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e1s0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1s0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                dz20 dz20Var = (dz20) obj;
                if (dz20Var != null) {
                    dz20Var.Ff("menu_video_albums_dialog");
                }
                return s3q0.a;
            case 1:
                c2s0 c2s0Var = (c2s0) obj;
                c2s0Var.d.Qc("video_archival_content");
                c2s0Var.b = null;
                return s3q0.a;
            case 2:
                int i2 = VideoCatalogFragment.l0;
                Bundle arguments = ((VideoCatalogFragment) obj).getArguments();
                Object serializable = arguments != null ? arguments.getSerializable("video_catalog_id") : null;
                return Boolean.valueOf((serializable instanceof VideoCatalogId ? (VideoCatalogId) serializable : null) == VideoCatalogId.SUBSCRIPTIONS);
            case 3:
                int i3 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.timeline_add_fragment_btn);
            case 4:
                return ((VideoQueueComponent) obj).z9();
            case 5:
                return ((AuthBridgeComponent) ((k7m) m7m.f((u4t0) obj)).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 6:
                ((com.vk.video.profile.presentation.c) obj).A.b(h.p.a);
                return s3q0.a;
            case 7:
                ((ihu0) obj).a.g();
                return s3q0.a;
            case 8:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = ((ggu0) ((mov0) obj).e.c).x;
                if (aVar != null) {
                    aVar.e();
                }
                return s3q0.a;
            case 9:
                return LayoutInflater.from(((hgw0) obj).a).inflate(R.layout.voip_call_by_link_media_setting_view, (ViewGroup) null);
            case 10:
                int i4 = VoipCallServiceFragment.Y;
                return new l6h0(((VoipCallServiceFragment) obj).requireContext());
            default:
                int i5 = WriteBar.h0;
                ((WriteBar) obj).O();
                return s3q0.a;
        }
    }
}
