package xsna;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDReorder;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.superapp.ui.VkRoundedTopFrameLayout;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qjo0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qjo0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        kjo0 kjo0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                rjo0 rjo0Var = (rjo0) obj;
                us2 us2Var = rjo0Var.b;
                ljo0 ljo0Var = (ljo0) ((zak0) rjo0Var.a).getValue();
                if (ljo0Var != null && (kjo0Var = ljo0Var.a) != null) {
                    r1 = kjo0Var.a;
                }
                return Boolean.valueOf(epx.f(us2Var, r1));
            case 1:
                y2p0 y2p0Var = (y2p0) obj;
                y2p0Var.a.n2(y2p0Var.b.getContext());
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((UIBlock) obj).i.containsKey(UIBlockActionDnDReorder.class));
            case 3:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj;
                m7q m7qVar = videoAutoPlay.k0;
                sr10 sr10Var = dy2.a;
                return videoAutoPlay.w1(m7qVar, true, epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE), true);
            case 4:
                a4s0 a4s0Var = (a4s0) obj;
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a4s0Var.getBounds().height(), a4s0Var.b, a4s0Var.a, Shader.TileMode.CLAMP));
                return paint;
            case 5:
                return new kng((ics0) obj);
            case 6:
                return (pgt0) ((xcs0) obj).findViewById(R.id.video_end_view_with_similar);
            case 7:
                ((VideoDialog) obj).O0.b();
                return s3q0.a;
            case 8:
                int i2 = VideoFragment.c0;
                return ((VideoSubscriptionComponent) m7m.d((VideoFragment) obj).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0();
            case 9:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                return Boolean.valueOf((mVar.r || mVar.x || !mVar.v) ? false : true);
            case 10:
                return (ucg0) ((pbt0) obj).g.getValue();
            case 11:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return ((View) obj).findViewById(R.id.duration);
            case 12:
                bwt0.p0(((b5u0) obj).b, true);
                return s3q0.a;
            case 13:
                ((gbv0) obj).n(new a6c(), "a6c");
                return s3q0.a;
            case 14:
                int i3 = VkRoundedTopFrameLayout.c;
                return Integer.valueOf(((VkRoundedTopFrameLayout) obj).getHeight());
            case 15:
                ((o0w0) obj).n.invoke();
                return s3q0.a;
            default:
                com.vk.channels.impl.comments.h hVar = (com.vk.channels.impl.comments.h) obj;
                View inflate = View.inflate(hVar.a.getContext(), R.layout.im_comment_reply_bar, null);
                inflate.setBackground(hVar.a.getBackground());
                return inflate;
        }
    }
}
