package xsna;

import android.widget.ImageView;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a.b;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.push.rustore.impl.RuStorePushService;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.rustore.di.RuStoreComponent;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import xsna.iv20;
import xsna.jck0.a;
import xsna.pn60;
import xsna.soa0;
import xsna.sqt0;
import xsna.y6c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qkd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qkd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        PublishState.Edit j;
        ISDKDispatchers sdkDispatchers;
        AdRevenueObserver initialize$lambda$220$lambda$147;
        int i = this.b;
        boolean z = false;
        z = false;
        z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((PostingSettingsComponent) ((rkd0) obj).m.getValue()).Nb().a();
            case 1:
                PublishState publishState = (PublishState) obj;
                if (fkq0.b(publishState.h) && (publishState.o() != null || ((j = publishState.j()) != null && j.Z1()))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                am9 am9Var = new am9();
                am9Var.b("brand_action", new yl9(((eme0) obj).k, am9Var, z ? 1 : 0));
                return s3q0.a;
            case 3:
                com.vk.auth.modal.qrwithcode.a aVar = ((QrWithCodeAuthModal) obj).g;
                if (aVar == null) {
                    aVar = null;
                }
                if (aVar.k instanceof b.C0406b) {
                    com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                    iv20.b bVar2 = aVar.d;
                    if (bVar2 == null) {
                        bVar2 = null;
                    }
                    String str = bVar2.f;
                    bVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str));
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.g(SchemeStatSak$EventScreen.QR_CODE_DEVICE_INFO, SchemeStatSak$EventScreen.QR_CODE_DISPLAY_CODE, arrayList, null, 8);
                    aVar.e(aVar.f(), true);
                }
                return s3q0.a;
            case 4:
                int i2 = RuStorePushService.n;
                return (RuStoreComponent) ((k7m) m7m.b((RuStorePushService) obj)).a(fpf0.a(RuStoreComponent.class));
            case 5:
                sdkDispatchers = ((UnityAdsModule) obj).sdkDispatchers();
                return sdkDispatchers;
            case 6:
                initialize$lambda$220$lambda$147 = ServiceProvider.initialize$lambda$220$lambda$147((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$147;
            case 7:
                dfj0 dfj0Var = (dfj0) obj;
                return new xej0(dfj0Var.f, dfj0Var.g);
            case 8:
                return ((jck0) obj).new a();
            case 9:
                hmk0 hmk0Var = (hmk0) obj;
                cwn cwnVar = hmk0Var.d.c;
                if (!cwnVar.b || cwnVar.c) {
                    dmk0 H = hmk0Var.H();
                    boolean z2 = H.b;
                    hmk0Var.c.s(new dmk0(H.a || !z2, !z2, H.c, H.d));
                } else if (!cwnVar.d) {
                    cwnVar.d = true;
                    cwnVar.a.invoke();
                }
                return s3q0.a;
            case 10:
                return on00.f(new Pair(c.g.c, ((jpk0) obj).f()));
            case 11:
                return pw0.c(((kxk0) obj).a);
            case 12:
                int i3 = StickersDatabase_Impl.B;
                return new zbl0((StickersDatabase_Impl) obj);
            case 13:
                return ((Boolean) ((opl0) obj).p.getValue()).booleanValue() ? new uxl0() : new wp5();
            case 14:
                return ((DonutVideoComponent) ((x5n0) obj).t0.getValue()).wb();
            case 15:
                ((q7) obj).b(sls.a);
                return s3q0.a;
            case 16:
                return ((rkq0) obj).b().l();
            case 17:
                vxq0 vxq0Var = (vxq0) obj;
                qn60 qn60Var = new qn60(new zyp0());
                vxq0Var.o().e = qn60Var;
                ?? r1 = vxq0Var.n().b;
                s1c0 s1c0Var = (s1c0) vxq0Var.t.getValue();
                String str2 = (String) ((AtomicReference) vxq0Var.s.getValue()).get();
                bpn0 bpn0Var = vxq0Var.h;
                pn60 pn60Var = new pn60(new pn60.a(s1c0Var, str2, (String) ((AtomicReference) bpn0Var.getValue()).get()), r1);
                vxq0Var.o().f = pn60Var;
                kvq0 n = vxq0Var.n();
                AtomicReference atomicReference = (AtomicReference) bpn0Var.getValue();
                jvq0 jvq0Var = (jvq0) vxq0Var.q.getValue();
                xwq0 xwq0Var = vxq0Var.d;
                jvq0 jvq0Var2 = new jvq0(xwq0Var.c, xwq0Var.a, jvq0Var.c, jvq0Var.d, jvq0Var.e, jvq0Var.f, xwq0Var.b, Boolean.TRUE, xwq0Var.d, xwq0Var.e);
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) n.b.getValue()).Ad().a().p());
                rn60.a(qn60Var);
                qn60Var.e(new soa0(), fpf0.a(soa0.a.class));
                qn60Var.e(new y6c0(), fpf0.a(y6c0.a.class));
                exq0 exq0Var = new exq0(atomicReference);
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) exq0Var);
                eml emlVar = new eml(((BridgeComponent) n.d.getValue()).s());
                mo60 mo60Var = n.a;
                return new jwq0(new fxq0(qn60Var, pn60Var, eh60Var, new s1v(), mo60Var, new AtomicReference(new wn60((byte) 0)), new h0b(new vwq0(), new cwq0(), new tvq0()), cVar, fs60.a(qn60Var, pn60Var, cVar, mo60Var), (a5i) n.e.getValue(), jvq0Var2, new sxy(emlVar, new nsq0(((UserProfileComponent) mo60Var.c().mo408a(fpf0.a(UserProfileComponent.class))).fa()))));
            case 18:
                aor0 aor0Var = (aor0) obj;
                return BigInteger.valueOf(aor0Var.b).shiftLeft(32).or(BigInteger.valueOf(aor0Var.c)).shiftLeft(32).or(BigInteger.valueOf(aor0Var.d));
            case 19:
                return ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj).new b();
            case 20:
                int i4 = VideoActivity.I;
                return ((VideoRestrictedUserActionsComponent) m7m.a((VideoActivity) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 21:
                ImageView imageView = ((VideoCatalogHeaderBrandedVh) obj).q;
                return ((CastComponent) ((k7m) m7m.c(imageView != null ? imageView : null)).a(fpf0.a(CastComponent.class))).L7();
            case 22:
                int i5 = VideoCatalogSearchFragment.X;
                return (VideoAdFreeSubscriptionComponent) m7m.d((VideoCatalogSearchFragment) obj).a(fpf0.a(VideoAdFreeSubscriptionComponent.class));
            case 23:
                ags0 ags0Var = (ags0) obj;
                VkSubnavigationBar vkSubnavigationBar = ags0Var.m;
                boolean z3 = vkSubnavigationBar.canScrollHorizontally(-1) || vkSubnavigationBar.canScrollHorizontally(1);
                if (ags0Var.k != z3) {
                    ags0Var.k = z3;
                    ags0Var.e.d.invoke(Boolean.valueOf(z3));
                }
                return s3q0.a;
            case 24:
                return (ucg0) ((VideoItemSliderVh) obj).V.getValue();
            case 25:
                return (VideoPlaybackSpeedComponent) ((f8m) obj).c(fpf0.a(VideoPlaybackSpeedComponent.class));
            case 26:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((y6t0) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 27:
                int i6 = VideoProfileFragmentOld.p0;
                return Boolean.valueOf(((VideoProfileFragmentOld) obj).requireArguments().getBoolean("VideoProfileFragment.is_own_channel"));
            case 28:
                tet0 tet0Var = (tet0) obj;
                wh50<set0> wh50Var = tet0Var.m;
                VideoSearchFiltersImpl copy = ((set0) ((zak0) wh50Var).getValue()).copy();
                copy.d = !copy.d;
                ((zak0) wh50Var).setValue(copy);
                tet0Var.B();
                return s3q0.a;
            default:
                return new sqt0.i((sqt0) obj);
        }
    }
}
