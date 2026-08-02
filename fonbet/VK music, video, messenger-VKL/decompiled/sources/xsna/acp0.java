package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import xsna.bcp0;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class acp0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ acp0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                bcp0.a aVar = bcp0.w;
                return ((ClipsViewerAdapterComponent) m7m.d((bcp0) obj).a(fpf0.a(ClipsViewerAdapterComponent.class))).e0();
            case 1:
                return (ClipEditComponent) ((kzq0) obj).a.a(fpf0.a(ClipEditComponent.class));
            case 2:
                FragmentActivity activity = ((p8r0) obj).a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 3:
                return (AppCompatTextView) ((xwr0) obj).findViewById(R.id.video_play_again);
            case 4:
                int i2 = VideoCatalogFragment.l0;
                cn o = o25.a().o();
                xwk.e().m(((VideoCatalogFragment) obj).kn(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65055));
                return s3q0.a;
            case 5:
                return ((OnboardingComponent) ((k7m) m7m.f((gcs0) obj)).a(fpf0.a(OnboardingComponent.class))).Yd();
            case 6:
                View view = ((VideoItemListSmallVh) obj).D;
                return (DonutVideoComponent) ((k7m) m7m.c(view != null ? view : null)).a(fpf0.a(DonutVideoComponent.class));
            case 7:
                VideoOpenTelemetryComponentImpl videoOpenTelemetryComponentImpl = (VideoOpenTelemetryComponentImpl) obj;
                qcy<Object>[] qcyVarArr = VideoOpenTelemetryComponentImpl.f;
                if (videoOpenTelemetryComponentImpl.Ya()) {
                    return new ns80(new bpn0(new cqr0(videoOpenTelemetryComponentImpl, 7)));
                }
                return null;
            case 8:
                int i3 = VideoRelatedVideosFragment.n0;
                return (DonutVideoComponent) m7m.d((VideoRelatedVideosFragment) obj).a(fpf0.a(DonutVideoComponent.class));
            case 9:
                return ((xvy) obj).j();
            case 10:
                fpu0 fpu0Var = (fpu0) obj;
                int i4 = fpu0.c0;
                return new w1l(fpu0Var.requireContext().getApplicationContext(), new i8n0(fpu0Var, 15), new prq0(fpu0Var, 21), new wmd0(fpu0Var, 25));
            case 11:
                return (TextView) ((oxw0) obj).findViewById(R.id.voip_schedule_call_button_schedule_call);
            default:
                int i5 = WriteBar.h0;
                return ((WriteBar) obj).findViewById(R.id.divider_top_writebar);
        }
    }
}
