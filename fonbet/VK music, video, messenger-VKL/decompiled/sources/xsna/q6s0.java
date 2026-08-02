package xsna;

import android.app.Activity;
import android.widget.TextView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.libvideo.videobottomsheet.impl.VideoBottomSheetComponentImpl;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import xsna.hpe0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6s0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q6s0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((VideoMinimizablePlayerComponent) ((VideoBottomSheetComponentImpl) obj).b.getValue()).P7();
            case 1:
                int i2 = VideoFragment.c0;
                return ((VideoPlaybackSpeedComponent) m7m.d((VideoFragment) obj).mo408a(fpf0.a(VideoPlaybackSpeedComponent.class))).m0();
            case 2:
                return (ucg0) ((VideoItemListLargeVh) obj).S.getValue();
            case 3:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                c.i iVar = c.i.b;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, iVar);
                return s3q0.a;
            case 4:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                return Boolean.valueOf((mVar.r || mVar.x || mVar.v) ? false : true);
            case 5:
                ((cys0) obj).b0.invoke(a.f0.b);
                return s3q0.a;
            case 6:
                return (AuthBridgeComponent) ((g8m) obj).a(fpf0.a(AuthBridgeComponent.class));
            case 7:
                hat0 hat0Var = (hat0) obj;
                QualitySettingsType t0 = fxc0.B().t0();
                gpt0 gpt0Var = gpt0.a;
                Activity activity = hat0Var.c;
                int i4 = hat0Var.e;
                hpe0.c cVar = new hpe0.c(new gpe0(R.id.video_quality_new_auto, gpt0.u(activity, emi.q(t0), i4, R.string.video_quality_new_auto), activity.getString(R.string.video_quality_new_auto_subtitle), QualitySettingsType.AUTO, emi.q(t0)));
                hpe0.c cVar2 = new hpe0.c(new gpe0(R.id.video_quality_new_high, gpt0.u(activity, emi.s(t0), i4, R.string.video_quality_new_high), activity.getString(R.string.video_quality_new_high_subtitle), QualitySettingsType.HIGH, emi.s(t0)));
                hpe0.c cVar3 = new hpe0.c(new gpe0(R.id.video_quality_new_econom, gpt0.u(activity, emi.r(t0), i4, R.string.video_quality_new_econom), activity.getString(R.string.video_quality_new_econom_subtitle), QualitySettingsType.ECONOM, emi.r(t0)));
                QualitySettingsType qualitySettingsType = QualitySettingsType.OTHER;
                return e43.l(hpe0.b.a, cVar, cVar2, cVar3, new hpe0.c(new gpe0(R.id.video_quality_new_other, gpt0.u(activity, qualitySettingsType == t0, i4, R.string.video_quality_new_other), null, qualitySettingsType, qualitySettingsType == t0)));
            case 8:
                return (VideoEndView) ((pgt0) obj).findViewById(R.id.end_view);
            case 9:
                return ((mkt0) obj).a;
            case 10:
                return Boolean.valueOf(((VideoView) obj).r0);
            case 11:
                return (zia) ((xhu0) obj).b.getValue();
            default:
                com.vk.channels.impl.comments.h hVar = (com.vk.channels.impl.comments.h) obj;
                TextView textView = (TextView) hVar.b().findViewById(R.id.im_comment_reply_bar_to);
                bwt0.i0(textView, new xvl0(hVar, 25));
                return textView;
        }
    }
}
