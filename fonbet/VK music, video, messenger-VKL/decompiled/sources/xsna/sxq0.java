package xsna;

import android.content.Context;
import android.widget.ImageView;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.di.scope.SingletonScope;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sxq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sxq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new AtomicReference(((vxq0) obj).d.c);
            case 1:
                int i2 = VideoCatalogFragment.l0;
                return (VideoAdFreeSubscriptionComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(VideoAdFreeSubscriptionComponent.class));
            case 2:
                int i3 = VideoCatalogRootVh.M0;
                return ((CastComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj)).a(fpf0.a(CastComponent.class))).L7();
            case 3:
                int i4 = VideoContainerActivity.B;
                return (VideoPip2Component) ((k7m) m7m.f((VideoContainerActivity) obj)).d(SingletonScope.a).a(fpf0.a(VideoPip2Component.class));
            case 4:
                VideoItemListSmallVh videoItemListSmallVh = (VideoItemListSmallVh) obj;
                Object obj2 = VideoItemListSmallVh.c0;
                if (!jjc.d().a()) {
                    Object obj3 = VideoItemListSmallVh.c0;
                    UIBlockVideo uIBlockVideo = videoItemListSmallVh.j;
                    if (uIBlockVideo != null) {
                        Context e = videoItemListSmallVh.e();
                        if (uIBlockVideo.L) {
                            g7s0.X(videoItemListSmallVh.n, e, uIBlockVideo.B, null, null, null, null, 60);
                        } else if (uIBlockVideo.H) {
                            w1s0.h(uIBlockVideo.B);
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 5:
                return ((VoipCallComponent) ((k7m) m7m.f((z2x0) obj)).a(fpf0.a(VoipCallComponent.class))).L1();
            case 6:
                int i5 = WriteBar.h0;
                return (ImageView) ((WriteBar) obj).findViewById(R.id.writebar_templates);
            default:
                return ((c1y0) obj).b().getButtonCollapse();
        }
    }
}
