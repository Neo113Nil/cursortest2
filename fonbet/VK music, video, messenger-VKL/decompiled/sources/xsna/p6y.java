package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.MusicKidsCatalogVh;
import com.vk.core.apps.BuildInfo;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.fragment.impl.MusicContainerFragment;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONObject;
import xsna.bex0;
import xsna.oa70;
import xsna.ox30;
import xsna.rfa0.b;
import xsna.rub0;
import xsna.rwm0;
import xsna.x1b;
import xsna.xhr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p6y implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationCategoryTab] */
    /* JADX WARN: Type inference failed for: r1v14, types: [xsna.w8i] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        gvv0 view;
        l7m f;
        MusicFragmentComponent musicFragmentComponent;
        xk40 v2;
        switch (this.b) {
            case 0:
                r6y r6yVar = (r6y) this.c;
                return ((JsLocalStorageDelegateComponent) x6y.H().a(fpf0.a(JsLocalStorageDelegateComponent.class))).ab().a(r6yVar, (pp20) r6yVar.Q.getValue(), r6yVar.M(), new maj(r6yVar, 27));
            case 1:
                p7y p7yVar = (p7y) this.c;
                fvv0 fvv0Var = p7yVar.b;
                Activity B0 = (fvv0Var == null || (view = fvv0Var.getView()) == null) ? null : view.B0();
                JSONObject jSONObject = new JSONObject();
                if (B0 == null || c57.c(B0).a(255) == 0) {
                    jSONObject.put("available", true);
                    jSONObject.put("access_requested", true);
                    jSONObject.put("allowed", true);
                    jSONObject.put("stored", p7yVar.c() != null);
                    jSONObject.put("type", "finger");
                    if (B0 == null || (str = b6m.b(B0)) == null) {
                        str = "";
                    }
                    jSONObject.put("device_id", xhr0.a.a(str));
                } else {
                    jSONObject.put("available", false);
                }
                bex0.a.b(p7yVar.a, JsApiMethodType.SECURE_TOKEN_GET_INFO, jSONObject, null, 12);
                return s3q0.a;
            case 2:
                pny pnyVar = (pny) this.c;
                nc b = pnyVar.b();
                wny wnyVar = (wny) b.b;
                if (wnyVar == null) {
                    wnyVar = b.S();
                    b.b = wnyVar;
                }
                return pnyVar.a(wnyVar);
            case 3:
                t3z t3zVar = (t3z) ((k3z) this.c).a;
                if (t3zVar != null) {
                    t3zVar.e();
                }
                return s3q0.a;
            case 4:
                nhz nhzVar = (nhz) this.c;
                nhzVar.j1 = true;
                nhzVar.i1.b();
                nhzVar.dismiss();
                return s3q0.a;
            case 5:
                return new lc00(((gc00) this.c).a);
            case 6:
                return new fk30(((rt30) this.c).e);
            case 7:
                iy30 iy30Var = (iy30) this.c;
                ua90 ua90Var = (ua90) iy30Var.h.getValue();
                ox30 ox30Var = iy30Var.b;
                LayoutInflater layoutInflater = ua90Var.c;
                ?? r3 = ua90Var.i;
                ?? r4 = ua90Var.j;
                mkr0 mkr0Var = ua90Var.b;
                if (ox30Var instanceof ox30.a) {
                    if (!BuildInfo.s()) {
                        ua90Var.d.invoke();
                    }
                    return new com.vk.im.ui.components.msg_search.vc.b(e43.l((rwh0) r4.getValue(), (rwh0) r3.getValue(), (rwh0) ua90Var.k.getValue()), mkr0Var, ua90Var.c, ua90Var.g, ua90Var.f, ua90Var.h);
                }
                if (ox30Var instanceof ox30.d) {
                    return new com.vk.im.ui.components.msg_search.vc.b(e43.l((rwh0) r4.getValue(), (rwh0) r3.getValue()), mkr0Var, ua90Var.c, ua90Var.g, false, null);
                }
                if (ox30Var instanceof ox30.c) {
                    return new com.vk.im.ui.components.msg_search.vc.c(Collections.singletonList((rwh0) r4.getValue()), mkr0Var, layoutInflater);
                }
                if (ox30Var instanceof ox30.b) {
                    return new com.vk.im.ui.components.msg_search.vc.c(Collections.singletonList((rwh0) r3.getValue()), mkr0Var, layoutInflater);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                return Integer.valueOf(e3m.d(R.attr.im_msg_box_margin_start_with_avatar, ((MsgSkeletonViewRedesign.c) this.c).itemView.getContext()));
            case 9:
                MusicContainerFragment musicContainerFragment = (MusicContainerFragment) this.c;
                int i = MusicContainerFragment.T;
                LayoutInflater.Factory kn = musicContainerFragment.kn();
                r1 = kn instanceof w8i ? (w8i) kn : 0;
                return (r1 == 0 || (f = m7m.f(r1)) == null || (musicFragmentComponent = (MusicFragmentComponent) ((k7m) f).a(fpf0.a(MusicFragmentComponent.class))) == null || (v2 = musicFragmentComponent.v2()) == null) ? new zk40() : v2;
            case 10:
                MusicKidsCatalogVh musicKidsCatalogVh = (MusicKidsCatalogVh) this.c;
                return new sl40(musicKidsCatalogVh.b, new qw6(musicKidsCatalogVh, 9));
            case 11:
                MusicOfflineCatalogFragment musicOfflineCatalogFragment = (MusicOfflineCatalogFragment) this.c;
                int i2 = MusicOfflineCatalogFragment.X;
                return ((OfflineAudioComponent) m7m.d(musicOfflineCatalogFragment).a(fpf0.a(OfflineAudioComponent.class))).Ib();
            case 12:
                return ((MarketComponent) ((k7m) m7m.f((fa60) this.c)).a(fpf0.a(MarketComponent.class))).Ob();
            case 13:
                return (androidx.lifecycle.m) ((tc60) this.c).b.getValue();
            case 14:
                NotificationListFragment notificationListFragment = (NotificationListFragment) this.c;
                int i3 = NotificationListFragment.a0;
                notificationListFragment.getFeature().C(new oa70.n(7, r1));
                return s3q0.a;
            case 15:
                dhw0 dhw0Var = (dhw0) this.c;
                if (OKVoipEngine.B != null) {
                    OKVoipEngine.B = dhw0Var;
                }
                return s3q0.a;
            case 16:
                ib80 ib80Var = (ib80) this.c;
                ib80Var.g = null;
                ib80Var.o();
                return s3q0.a;
            case 17:
                return Integer.valueOf(((hh80) this.c).c.size());
            case 18:
                return "LivePlayerImpl.onTransferStart() - state= " + wl80.this.G;
            case 19:
                return ((tw90) this.c).c.a(PerformanceEventType.CHANNEL_POST_ROUND_TRIP) ? new y1b(UUID.randomUUID().toString()) : x1b.a.a;
            case 20:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i4 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().i3();
            case 21:
                return ((rfa0) this.c).new b();
            case 22:
                tub0 tub0Var = (tub0) this.c;
                return new bnj(cmi0.b("kotlinx.serialization.Polymorphic", rub0.a.a, new SerialDescriptor[0], new af50(tub0Var, 11)), tub0Var.a);
            case 23:
                com.vk.newsfeed.common.util.j jVar = (com.vk.newsfeed.common.util.j) this.c;
                return new com.vk.newsfeed.common.util.e((a2o) jVar.d.getValue(), jVar.F());
            case 24:
                w3c0 w3c0Var = (w3c0) this.c;
                int i5 = rwm0.g;
                int i6 = w3c0Var.Q;
                return rwm0.a.e(i6, i6);
            case 25:
                PostingComponentImpl postingComponentImpl = (PostingComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = PostingComponentImpl.j;
                return new z2t0(new uft0(), ((VideoApiHelperComponent) postingComponentImpl.b.getValue()).N4());
            case 26:
                return ((CommunityNewsfeedComponent) ((k7m) m7m.f((pgc0) this.c)).mo408a(fpf0.a(CommunityNewsfeedComponent.class))).Q3();
            case 27:
                return ((BridgeComponent) ((k7m) m7m.f((rhc0) this.c)).a(fpf0.a(BridgeComponent.class))).ob();
            case 28:
                sbc0 sbc0Var = ((ikc0) this.c).x;
                return Boolean.valueOf((sbc0Var != null ? sbc0Var : null).R > 0);
            default:
                xvy xvyVar = (xvy) this.c;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                if (xuyVar != null && xuyVar.getIndex() == xvyVar.j().d() - 1) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
        }
    }
}
