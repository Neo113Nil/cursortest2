package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.Result;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.consent.VkConsentView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.autoplay.background.controller.c;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.video.ad.g;
import com.vk.video.polls.di.UxPollsComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$DoubleRef;
import xsna.asl0;
import xsna.awn0;
import xsna.gm50;
import xsna.h1p0;
import xsna.ian;
import xsna.iys0;
import xsna.l65;
import xsna.mvu;
import xsna.n3t0;
import xsna.n4;
import xsna.wq10;
import xsna.wwi0;
import xsna.x1t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gqe0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gqe0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MiniPlayerControllersWrapper.VideoInfo a;
        VideoFile videoFile;
        VideoFile videoFile2;
        com.vk.video.ui.discovery.minimizable.m mVar;
        VideoFile videoFile3;
        mnt0 c;
        Uri uri;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return new com.vk.profile.questions.impl.i((ViewGroup) obj, ((com.vk.profile.questions.impl.f) this.c).i);
            case 1:
                return Double.valueOf(((Ref$DoubleRef) this.c).element);
            case 2:
                ((rg50) this.c).C((int) (((tny) obj).a() >> 32));
                return s3q0.a;
            case 3:
                ((kxi0) this.c).h.onNext((wwi0.a) obj);
                return s3q0.a;
            case 4:
                ((p7j0) this.c).a.invoke();
                return s3q0.a;
            case 5:
                ((lmj0) this.c).a.update(new l65.e((aru0) obj));
                return s3q0.a;
            case 6:
                return new u6l0((ViewGroup) obj, (com.vk.stickers.settings.g) this.c);
            case 7:
                ((ncl0) this.c).E(0);
                return s3q0.a;
            case 8:
                return jfl0.l((jfl0) this.c, (iw40) obj);
            case 9:
                dsl0 dsl0Var = (dsl0) this.c;
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                dsl0Var.f = getStoriesResponse.e;
                lrl0 lrl0Var = dsl0Var.a;
                lrl0Var.clear();
                lrl0Var.j(getStoriesResponse);
                dsl0Var.e.a(new asl0.c(getStoriesResponse.c));
                return s3q0.a;
            case 10:
                tim0 tim0Var = (tim0) this.c;
                evu evuVar = tim0Var.g;
                mvu mvuVar = (mvu) obj;
                if (!(mvuVar instanceof mvu.b)) {
                    if (!(mvuVar instanceof mvu.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EditText editText = evuVar.a;
                    tim0Var.q = editText.getText().getSpans(0, editText.getText().length(), evuVar.c.f()).length;
                    return o0m0.c("", false);
                }
                mvu.b bVar = (mvu.b) mvuVar;
                if (bVar.a.length() == 0) {
                    EditText editText2 = evuVar.a;
                    tim0Var.q = editText2.getText().getSpans(0, editText2.getText().length(), evuVar.c.f()).length;
                }
                if (tim0Var.q >= tim0Var.m) {
                    return o0m0.c("", false);
                }
                o0m0 o0m0Var = o0m0.b;
                return o0m0.c(bVar.a, false);
            case 11:
                nhn0 nhn0Var = (nhn0) this.c;
                Result result = (Result) obj;
                if (!nhn0Var.o) {
                    nhn0Var.o = true;
                    xgx0 xgx0Var = xgx0.a;
                    String str = "QR detected " + result.getText();
                    xgx0Var.getClass();
                    xgx0.a(str);
                    pne0 pne0Var = nhn0Var.q;
                    (pne0Var != null ? pne0Var : null).q1(result.getText());
                }
                return s3q0.a;
            case 12:
                ((nvn0) this.c).T(awn0.b.b);
                return s3q0.a;
            case 13:
                ((h1p0.f) this.c).n.toggle();
                return s3q0.a;
            case 14:
                i0q0.f(new m84(19, (ww50) obj, (Bundle) this.c));
                return s3q0.a;
            case 15:
                u9q0 u9q0Var = (u9q0) this.c;
                u9q0Var.j = null;
                u9q0Var.d.onNext(new v9q0(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
                return s3q0.a;
            case 16:
                wrr0 wrr0Var = (wrr0) this.c;
                T t = wrr0Var.l;
                izs<? super com.vk.voip.ui.settings.participants_view.j, s3q0> izsVar = wrr0Var.m;
                if (t != 0 && izsVar != null) {
                    CallSettingsItem.f fVar = (CallSettingsItem.f) t;
                    String str2 = fVar.a;
                    if (fVar.b) {
                        izsVar.invoke(new j.i(str2));
                    } else {
                        izsVar.invoke(new j.c(str2));
                    }
                }
                return s3q0.a;
            case 17:
                com.vk.video.ad.e eVar = (com.vk.video.ad.e) this.c;
                gm50.a.a(eVar, ((g.a) obj).a, new efr0(eVar, i));
                return s3q0.a;
            case 18:
                c.C1211c c1211c = (c.C1211c) this.c;
                n3t0 n3t0Var = (n3t0) obj;
                if (n3t0Var instanceof n3t0.c) {
                    if (((n3t0.c) n3t0Var).b) {
                        c1211c.f();
                    } else {
                        c1211c.g();
                    }
                }
                return s3q0.a;
            case 19:
                gcs0 gcs0Var = (gcs0) this.c;
                VideoStatistic videoStatistic = (VideoStatistic) obj;
                gcs0Var.H = videoStatistic;
                gcs0Var.k8(videoStatistic.i);
                ((d9c0) gcs0Var.e).ua(videoStatistic.i);
                com.vk.lists.c cVar = gcs0Var.P;
                if (cVar != null) {
                    cVar.d();
                }
                return s3q0.a;
            case 20:
                qgi0.h((tgi0) obj, ((VideoMetaViewState.d) this.c).d.b);
                return s3q0.a;
            case 21:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                MiniPlayerControllersWrapper.VideoInfo videoInfo = (MiniPlayerControllersWrapper.VideoInfo) obj;
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                if (videoInfo == null) {
                    a = null;
                } else {
                    PlayerRemoteController.Properties properties = videoInfo.g;
                    boolean c2 = ((UxPollsComponent) videoMinimizableDiscoveryFragment.ko().p.getValue()).o2().c();
                    boolean z = properties.b;
                    properties.getClass();
                    a = MiniPlayerControllersWrapper.VideoInfo.a(videoInfo, null, null, new PlayerRemoteController.Properties(z, c2), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null) {
                    miniPlayerControllersWrapper.h(a);
                }
                if (a != null && videoMinimizableDiscoveryFragment.isResumed()) {
                    ian ianVar = videoMinimizableDiscoveryFragment.Z0;
                    yg5 io2 = videoMinimizableDiscoveryFragment.io();
                    ian.a aVar = ianVar.g;
                    yg5 yg5Var = ianVar.d;
                    if (yg5Var != io2) {
                        if (yg5Var != null) {
                            yg5Var.T(aVar);
                        }
                        ianVar.d = io2;
                        if (io2 != null) {
                            io2.f0(aVar);
                        }
                    }
                }
                com.vk.video.ui.discovery.minimizable.m mVar2 = videoMinimizableDiscoveryFragment.J0;
                if (mVar2 != null) {
                    mVar2.n = (a == null || (videoFile3 = a.b) == null) ? false : videoFile3.T1();
                }
                if (a == null || (videoFile2 = a.b) == null || !videoFile2.W9()) {
                    com.vk.video.ui.discovery.minimizable.m mVar3 = videoMinimizableDiscoveryFragment.J0;
                    if (mVar3 != null) {
                        mVar3.l((a == null || (videoFile = a.b) == null) ? -1.0f : videoFile.E0());
                    }
                } else if (videoMinimizableDiscoveryFragment.Q0 && (mVar = videoMinimizableDiscoveryFragment.J0) != null) {
                    mVar.l(swe0.f(videoFile2.E0(), 1.0f, 1.7777778f));
                }
                if (a == null) {
                    videoMinimizableDiscoveryFragment.I0 = null;
                } else {
                    if (a.b != null) {
                        videoMinimizableDiscoveryFragment.ko().Hf().getClass();
                    }
                    MiniPlayerControllersWrapper miniPlayerControllersWrapper2 = videoMinimizableDiscoveryFragment.X;
                    yks0 yks0Var = miniPlayerControllersWrapper2 != null ? miniPlayerControllersWrapper2.t : null;
                    kz20 kz20Var = miniPlayerControllersWrapper2 != null ? miniPlayerControllersWrapper2.s : null;
                    if (yks0Var != null && kz20Var != null) {
                        FragmentActivity kn = videoMinimizableDiscoveryFragment.kn();
                        qus0 qus0Var = new qus0(videoMinimizableDiscoveryFragment, i);
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                        Lazy a2 = msy.a(lazyThreadSafetyMode, qus0Var);
                        Lazy a3 = msy.a(lazyThreadSafetyMode, new tus0(videoMinimizableDiscoveryFragment, i));
                        Lazy a4 = msy.a(lazyThreadSafetyMode, new orj0(videoMinimizableDiscoveryFragment, 20));
                        dqz0 dqz0Var = new dqz0(videoMinimizableDiscoveryFragment);
                        videoMinimizableDiscoveryFragment.ko().e2().getClass();
                        videoMinimizableDiscoveryFragment.I0 = new q4(new n4(kn, new com.vk.video.ui.discovery.minimizable.i(videoMinimizableDiscoveryFragment), new n4.b(a3, a2, videoMinimizableDiscoveryFragment.ko().V(), ((VideoSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().y.getValue()).g0(), ((VideoPromoComponent) videoMinimizableDiscoveryFragment.ko().C.getValue()).L(), videoMinimizableDiscoveryFragment.n0, dqz0Var, ((VideoMinimizablePlayerComponent) videoMinimizableDiscoveryFragment.ko().a.getValue()).P7(), null, ((VideoShareComponent) videoMinimizableDiscoveryFragment.ko().c.getValue()).p0(), ((VideoShareComponent) videoMinimizableDiscoveryFragment.ko().c.getValue()).S(), new lvs0(videoMinimizableDiscoveryFragment), ((DonutVideoComponent) videoMinimizableDiscoveryFragment.ko().J.getValue()).Qa(), ((DonutVideoComponent) videoMinimizableDiscoveryFragment.ko().J.getValue()).getActionHandler(), a4), yks0Var, kz20Var, new w61(videoMinimizableDiscoveryFragment, 17), new ivs0(videoMinimizableDiscoveryFragment, i2), new pus0(videoMinimizableDiscoveryFragment, i2), videoMinimizableDiscoveryFragment.a1), new wug0(videoMinimizableDiscoveryFragment, 28));
                        tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
                        tts0 tts0Var2 = tts0Var != null ? tts0Var : null;
                        l4x l4xVar = videoMinimizableDiscoveryFragment.N0;
                        g5b0 g5b0Var = tts0Var2.k;
                        if (g5b0Var != null) {
                            g5b0Var.a(l4xVar);
                        }
                    }
                }
                return s3q0.a;
            case 22:
                fys0 fys0Var = (fys0) this.c;
                iys0 iys0Var = (iys0) obj;
                int i4 = fys0.j1;
                if (iys0Var.equals(iys0.c.a)) {
                    fys0Var.hide();
                    gzs<s3q0> gzsVar = fys0Var.i1;
                    (gzsVar != null ? gzsVar : null).invoke();
                } else if (iys0Var.equals(iys0.a.a)) {
                    fys0Var.hide();
                } else {
                    if (!iys0Var.equals(iys0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fys0Var.hide();
                }
                return s3q0.a;
            case 23:
                q2t0 q2t0Var = (q2t0) this.c;
                wci0 wci0Var = (wci0) obj;
                wq10 wq10Var = wci0Var.a;
                if (wq10Var instanceof wq10.c) {
                    q2t0Var.b.e2(new x1t0.d.b(((wq10.c) wq10Var).a.a1(), wci0Var.b));
                }
                return s3q0.a;
            case 24:
                View view = (View) this.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                ent0 ent0Var = e0Var instanceof ent0 ? (ent0) e0Var : null;
                if (ent0Var != null && (c = x5t0.c(ent0Var)) != null) {
                    c.w0(view);
                }
                return s3q0.a;
            case 25:
                ((odt0) this.c).c = null;
                return s3q0.a;
            case 26:
                ((z8u0) this.c).A.a((Photo) obj, null);
                return s3q0.a;
            case 27:
                yau0 yau0Var = (yau0) this.c;
                Context context = yau0Var.e;
                try {
                    uri = Uri.parse(context.getString(R.string.vk_user_agreement_link));
                } catch (Throwable unused) {
                    uri = null;
                }
                if (uri != null) {
                    rex0 rex0Var = e370.j;
                    (rex0Var != null ? rex0Var : null).b(context, uri);
                }
                tau0 d = yau0Var.b.d();
                if (d != null) {
                    d.g("mini_app_vk_connect_launch_screen_view_connect_terms", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_CONNECT_TERMS);
                }
                return s3q0.a;
            case 28:
                VkAuthPasswordView vkAuthPasswordView = (VkAuthPasswordView) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i5 = VkAuthPasswordView.i;
                vkAuthPasswordView.d.setContentDescription(booleanValue ? vkAuthPasswordView.getContext().getString(R.string.vk_auth_hide_pass) : vkAuthPasswordView.getContext().getString(R.string.vk_auth_show_pass));
                return s3q0.a;
            default:
                VkConsentView vkConsentView = ((com.vk.auth.ui.consent.i) this.c).a;
                vkConsentView.d.setVisibility(8);
                vkConsentView.b.setVisibility(0);
                vkConsentView.k.setVisibility(8);
                return s3q0.a;
        }
    }
}
