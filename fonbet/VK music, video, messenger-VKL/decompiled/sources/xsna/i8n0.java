package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.core.telemetry.b;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.Attachment;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import xsna.bcp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i8n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i8n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        x64 x64Var;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj;
                int i3 = SuperAppFragment.o0;
                if (!jjc.d().a()) {
                    int i4 = SuperAppFragment.o0;
                    qgj.a(superAppFragment.vo(), new vlc0(superAppFragment, 18));
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 1:
                ((com.vk.im.ui.components.theme_chooser.c) obj).a.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.setOrientation(0);
                return linearLayoutManager.onSaveInstanceState();
            case 2:
                int i5 = TimelineBottomActionsView.z;
                return (RecyclerView) ((TimelineBottomActionsView) obj).findViewById(R.id.timeline_actions_list);
            case 3:
                bcp0.a aVar = bcp0.w;
                return ((BridgeComponent) m7m.d((bcp0) obj).a(fpf0.a(BridgeComponent.class))).x().a();
            case 4:
                ((g7q0) obj).t(true);
                return s3q0.a;
            case 5:
                vrq0 vrq0Var = (vrq0) obj;
                return j5g.v0((Rect) vrq0Var.I.getValue(), vrq0Var.r.getSnowballsForbiddenRectList());
            case 6:
                return ((ClipsViewerComponent) ((kzq0) obj).a.a(fpf0.a(ClipsViewerComponent.class))).Y();
            case 7:
                int i6 = VideoEpisodesFragment.V;
                return Boolean.valueOf(!qq2.d(((VideoEpisodesFragment) obj).requireContext()));
            case 8:
                mps0 mps0Var = (mps0) obj;
                Attachment attachment = mps0Var.c;
                if (attachment != null && (x64Var = mps0Var.i) != null) {
                    x64Var.f(attachment);
                }
                return s3q0.a;
            case 9:
                Object obj2 = VideoItemListSmallVh.c0;
                return ((DonutVideoComponent) ((VideoItemListSmallVh) obj).X.getValue()).wb();
            case 10:
                VideoOpenTelemetryComponentImpl videoOpenTelemetryComponentImpl = (VideoOpenTelemetryComponentImpl) obj;
                qcy<Object>[] qcyVarArr = VideoOpenTelemetryComponentImpl.f;
                return videoOpenTelemetryComponentImpl.Ya() ? new ks80(new wmd0(videoOpenTelemetryComponentImpl, 20), new bpn0(new j8n0(videoOpenTelemetryComponentImpl, 17))) : b.a.a.getSTUB();
            case 11:
                int i7 = VideoRelatedVideosFragment.n0;
                return ((DonutVideoComponent) ((VideoRelatedVideosFragment) obj).W.getValue()).wb();
            case 12:
                int i8 = VideoSkippablePartView.C;
                LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, (Context) obj);
                a.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
                return a;
            case 13:
                return new kv2((vtt0) obj, 15);
            case 14:
                com.vk.auth.ui.password.askpassword.a aVar2 = (com.vk.auth.ui.password.askpassword.a) obj;
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.a(new sqf0(i2));
                aVar2.f = false;
                aVar2.c.g();
                return s3q0.a;
            case 15:
                int i9 = fpu0.c0;
                return ((fpu0) obj).getActivity();
            case 16:
                return (Toolbar) ((hgw0) obj).a().findViewById(R.id.call_by_link_media_setting_toolbar);
            case 17:
                return (Toolbar) ((sow0) obj).d().findViewById(R.id.call_group_selector_toolbar);
            default:
                return (FrameLayout) ((oxw0) obj).findViewById(R.id.voip_schedule_call_content_overlay_loading);
        }
    }
}
