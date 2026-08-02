package xsna;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.di.scope.SingletonScope;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.Peer;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.di.VkVideoLiveSDKComponent;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.messagetemplates.impl.details.TemplateDetailsFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLEngine;
import kotlin.text.Regex;
import xsna.c9p0;
import xsna.rhw0;
import xsna.sx40;
import xsna.vwo0;
import xsna.xn50;
import xsna.yno0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        com.vk.video.ui.discovery.minimizable.m mVar;
        int i = this.b;
        boolean z = false;
        Float f = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                m6n0 m6n0Var = (m6n0) obj;
                Photo photo = m6n0Var.f;
                List<PhotoTag> list = m6n0Var.e;
                if (photo != null && list != null) {
                    m6n0Var.g = list.size();
                    oea0 oea0Var = new oea0(photo, list, photo.r, (String) null, (String) null);
                    oea0Var.k = true;
                    oea0Var.p();
                }
                m6n0Var.a.invoke();
                dw20 dw20Var = m6n0Var.d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                m6n0Var.d = null;
                m6n0Var.e = null;
                m6n0Var.f = null;
                m6n0Var.b.invoke(Integer.valueOf(m6n0Var.g));
                return s3q0.a;
            case 1:
                Iterator it = ((ymn0) obj).c().entrySet().iterator();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
                    while (it.hasNext()) {
                        floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
                    }
                    f = Float.valueOf(floatValue);
                }
                return Float.valueOf(f != null ? f.floatValue() : Float.POSITIVE_INFINITY);
            case 2:
                return ByteBuffer.allocate(((SSLEngine) ((srn0) obj).a).getSession().getApplicationBufferSize());
            case 3:
                TemplateDetailsFragment templateDetailsFragment = (TemplateDetailsFragment) obj;
                Integer num = (Integer) templateDetailsFragment.O.getValue();
                l7m d = m7m.d(templateDetailsFragment);
                return new e9o0(num, ((ImCmdCoroutinesExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) templateDetailsFragment.N.getValue(), d).a(fpf0.a(ImCmdCoroutinesExecutorScopedComponent.class))).g());
            case 4:
                return ((yno0) obj).new b();
            case 5:
                TimelineView timelineView = (TimelineView) obj;
                if (timelineView.g.c == vwo0.a.IDLE && !timelineView.t.isInProgress()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ((fuv0) obj).show();
                return s3q0.a;
            case 7:
                ((izs) ((zak0) ((c9p0.e) obj).d).getValue()).invoke(new sx40.o0(PlayerContext.TOP));
                return s3q0.a;
            case 8:
                Regex regex = hgr0.X;
                return ((hgr0) obj).un();
            case 9:
                return (ViewGroup) ((lor0) obj).a.findViewById(R.id.nativeads_rating_section);
            case 10:
                List<xuy> f2 = ((xvy) obj).j().f();
                ArrayList arrayList = new ArrayList(c5g.u(f2, 10));
                Iterator<T> it2 = f2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((xuy) it2.next()).getIndex()));
                }
                return arrayList;
            case 11:
                int i2 = VideoCommentsThreadInPlayerFragment.Q;
                return new gcg(((VideoMinimizablePlayerComponent) m7m.d((VideoCommentsThreadInPlayerFragment) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3());
            case 12:
                ebs0 videoClickActionCallback = ((hgs0) obj).getVideoClickActionCallback();
                if (videoClickActionCallback != null) {
                    videoClickActionCallback.bk(ea80.a);
                }
                return s3q0.a;
            case 13:
                return ((DonutVideoComponent) ((VideoItemSliderVh) obj).b0.getValue()).J();
            case 14:
                int i3 = VideoLiveFragment.i0;
                return ((VideoPip2Component) m7m.d((VideoLiveFragment) obj).d(SingletonScope.a).a(fpf0.a(VideoPip2Component.class))).L3();
            case 15:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                com.vk.video.ui.discovery.minimizable.m mVar2 = videoMinimizableDiscoveryFragment.J0;
                if ((mVar2 == null || !mVar2.g()) && (mVar = videoMinimizableDiscoveryFragment.J0) != null) {
                    com.vk.video.ui.discovery.minimizable.m.m(mVar, false, 1);
                }
                return s3q0.a;
            case 16:
                return (VkVideoLiveSDKComponent) ((f8m) obj).a(fpf0.a(VkVideoLiveSDKComponent.class));
            case 17:
                VideoOverlayView.b.b((VideoOverlayView.a) obj);
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return ((VkVideoLiveSDKComponent) ((k7m) m7m.c((VideoView) obj)).a(fpf0.a(VkVideoLiveSDKComponent.class))).F0();
            case 19:
                uxt0 uxt0Var = (uxt0) obj;
                return new kp00((nr00) uxt0Var.V.getValue(), uxt0Var.q, uxt0Var.g);
            case 20:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                return aVar.Gn(aVar.requireContext());
            case 21:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar2 = ((ggu0) obj).x;
                if (aVar2 != null) {
                    return Integer.valueOf((int) (aVar2.e.a() / 1000));
                }
                return null;
            case 22:
                FragmentActivity activity = ((lgv0) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 23:
                yzv0 yzv0Var = (yzv0) obj;
                kos0 kos0Var = (kos0) yzv0Var.f.getValue();
                if (kos0Var != null) {
                    return yzv0Var.b.Af().c(s490.h(kos0Var)).b;
                }
                return null;
            default:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i4 = VoipCallServiceFragment.Y;
                rhw0.x xVar = rhw0.x.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, xVar);
                return s3q0.a;
        }
    }
}
