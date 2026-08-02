package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.miniapps.impl.b;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import xsna.djc;
import xsna.gpu;
import xsna.p1s;
import xsna.rv9;
import xsna.u1s;
import xsna.uuf;
import xsna.vrm;
import xsna.wqs0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ie3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ie3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.dto.common.VideoFile, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.vk.auth.main.b] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // xsna.gzs
    public final Object invoke() {
        npf h;
        ExposedFunction invoke$lambda$30;
        fvk initialize$lambda$220$lambda$20;
        int i = this.b;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b.a aVar = (b.a) obj;
                l8r0 l8r0Var = ((AppsCatalogFragment) obj2).S;
                if (l8r0Var != null) {
                    l8r0Var.a(aVar.a, aVar.b, aVar.c);
                }
                return s3q0.a;
            case 1:
                com.vk.auth.verification.base.b bVar = (com.vk.auth.verification.base.b) obj2;
                String str = (String) obj;
                CheckPresenterInfo checkPresenterInfo = bVar.x;
                if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
                    com.vk.auth.main.e eVar = bVar.o;
                    (eVar != null ? eVar : null).l();
                } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
                    com.vk.auth.main.b bVar2 = bVar.d;
                    (bVar2 != null ? bVar2 : 0).K0(str, ((CheckPresenterInfo.Validation) checkPresenterInfo).c);
                } else if (!(checkPresenterInfo instanceof CheckPresenterInfo.Auth) && !(checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) && !(checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 2:
                ((izs) obj2).invoke(new rv9.a.e(((CartItem.b) obj).c));
                return s3q0.a;
            case 3:
                ((izs) obj2).invoke(new rv9.i.C3635i((a.C0919a) obj));
                return s3q0.a;
            case 4:
                ftb ftbVar = ((cxb) obj2).x;
                ftbVar.e(new vrm(ftbVar.d, new vrm.a.b((Peer) obj), false, ftbVar.f));
                return s3q0.a;
            case 5:
                io.reactivex.rxjava3.subjects.e eVar2 = frd.a;
                VideoFile a = ((s2f) ((hwe) obj2).c.getValue()).a((SdkVideoFile) obj);
                if (frd.a()) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    yg5 e = b.C1208b.a().e(a, null);
                    VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                    sht0 sht0Var = videoAutoPlay != null ? videoAutoPlay.l0 : null;
                    dbn dbnVar = sht0Var instanceof dbn ? (dbn) sht0Var : null;
                    if (dbnVar != null) {
                        asu0.a.getClass();
                        asu0.n().execute(new crd(dbnVar));
                    }
                }
                return s3q0.a;
            case 6:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i2 = ClipsWrapperFragment.Q0;
                ppf o = ((uuf.d) obj2).o();
                if (o != null && (h = o.h()) != null) {
                    xn50.a.c(clipsWrapperFragment, h);
                }
                return s3q0.a;
            case 7:
                ((izs) obj2).invoke(new a.b(((CommunityData) obj).d));
                return s3q0.a;
            case 8:
                cih cihVar = (cih) obj2;
                return new thh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) obj, false);
            case 9:
                CommunityProfileViewState.Data.c cVar = (CommunityProfileViewState.Data.c) obj2;
                qth qthVar = (qth) obj;
                boolean z2 = cVar == null || (cVar instanceof CommunityProfileViewState.Data.c.AbstractC1625c.a) || (cVar instanceof CommunityProfileViewState.Data.c.AbstractC1625c.b);
                aq0 aq0Var = qthVar.e;
                auh auhVar = qthVar.d;
                if (!Boolean.TRUE.booleanValue()) {
                    auhVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2);
                    return s3q0.a;
                }
                auhVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2);
                qthVar.b(0);
                return s3q0.a;
            case 10:
                u1s.d dVar = (u1s.d) ((yn50) obj);
                ((t1s) obj2).O(new p1s.h(dVar.a, dVar.c));
                return s3q0.a;
            case 11:
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                Iterator<OneVideoPlayer.c> it = ((one.video.player.j) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().x(oneVideoPlayer);
                }
                return s3q0.a;
            case 12:
                ((cgt) obj2).a.invoke(new djc.f(((r7t) obj).e.a));
                return s3q0.a;
            case 13:
                invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$30;
            case 14:
                return new xph((guh) obj2, ((o0z) obj).b);
            case 15:
                ((izs) obj2).invoke((UserId) obj);
                return s3q0.a;
            case 16:
                return ((s290) ((jd10) obj2).l.getValue()).a(((VideoFileOld) obj).w2());
            case 17:
                ((com.vk.im.ui.components.msg_list.c) obj2).o.a((Dialog) obj);
                return s3q0.a;
            case 18:
                f840 f840Var = (f840) obj2;
                return new b500(f840Var.a, (y400) obj, f840Var.j);
            case 19:
                ((bq60) obj2).a(new wp60((RecyclerView.e0) obj));
                return s3q0.a;
            case 20:
                ((izs) obj2).invoke(new OrderListAction.d(((OrdersListItem.Order) obj).b));
                return s3q0.a;
            case 21:
                ubb0 ubb0Var = (ubb0) obj2;
                UserId userId = (UserId) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", efz.b(userId.b, " query albums", new StringBuilder("uid="))});
                }
                List<uab0> j = ubb0Var.c.j(String.valueOf(userId.b));
                ArrayList arrayList = new ArrayList(c5g.u(j, 10));
                for (uab0 uab0Var : j) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList.add(playlist);
                }
                return arrayList;
            case 22:
                PublishFragmentInternalComponent publishFragmentInternalComponent = (PublishFragmentInternalComponent) obj;
                PublishFragmentInternalComponent.a aVar2 = PublishFragmentInternalComponent.v;
                PublishState publishState = (PublishState) ((gzs) obj2).invoke();
                if (publishState != null) {
                    return publishState;
                }
                PublishArguments publishArguments = publishFragmentInternalComponent.a.a;
                if (publishArguments instanceof PublishArguments.Upload) {
                    PublishArguments.Upload upload = (PublishArguments.Upload) publishArguments;
                    return new PublishState(new PublishState.Upload(upload.b), null, null, null, false, null, upload.c.c, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, false, -66, 2047, null);
                }
                if (publishArguments instanceof PublishArguments.Edit) {
                    return new PublishState(new PublishState.Edit(r3, z, 3, r3), null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, false, -2, 2047, null);
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                jdf0 jdf0Var = (jdf0) obj2;
                kdf0 kdf0Var = (kdf0) obj;
                iru iruVar = jdf0Var.G;
                RecyclerPaginatedView recyclerPaginatedView = jdf0Var.F;
                Object a0 = j5g.a0(iruVar.y0());
                gpu.a aVar3 = a0 instanceof gpu.a ? (gpu.a) a0 : null;
                GroupSuggestion groupSuggestion = aVar3 != null ? aVar3.a : null;
                if (((ArrayList) iruVar.y0()).isEmpty() || groupSuggestion != j5g.a0(kdf0Var.h.l)) {
                    GroupsSuggestions groupsSuggestions = kdf0Var.h;
                    iruVar.setItems(jdf0.c7(groupsSuggestions.k, groupsSuggestions.l));
                    com.vk.lists.c cVar2 = jdf0Var.H;
                    if (cVar2 != null) {
                        cVar2.s(kdf0Var.h.k);
                    }
                    RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(0);
                    }
                } else {
                    iruVar.notifyItemRangeChanged(0, iruVar.getItemCount());
                }
                if (jdf0Var.H == null) {
                    c.h hVar = new c.h(jdf0Var);
                    hVar.l = false;
                    hVar.k = kdf0Var.h.k;
                    hVar.i = 20;
                    jdf0Var.H = com.vk.lists.f.a(hVar, recyclerPaginatedView);
                }
                return s3q0.a;
            case 24:
                hs4 hs4Var = ((com.vk.reefton.trackers.a) obj).d;
                ((vof0) obj2).a(new hs4(hs4Var.a, hs4Var.b, hs4Var.c, hs4Var.d, hs4Var.e, hs4Var.f, hs4Var.g, hs4Var.h));
                return s3q0.a;
            case 25:
                initialize$lambda$220$lambda$20 = ServiceProvider.initialize$lambda$220$lambda$20((UnityAdsModule) obj2, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$20;
            case 26:
                ((Tooltip) obj2).g((ojg) obj);
                return s3q0.a;
            case 27:
                VideoAutoPlay videoAutoPlay2 = (VideoAutoPlay) obj;
                StringBuilder a2 = t33.a("cdn_host= \"", (String) obj2, "\", VideoFile.ovid is null (isGif= ");
                a2.append(videoAutoPlay2.u.x5());
                a2.append(" isMessage= ");
                a2.append(videoAutoPlay2.u.Sa());
                a2.append(" hasOnlyExternalUrls= ");
                a2.append(VideoAutoPlay.j1(videoAutoPlay2.u));
                a2.append(") in ");
                a2.append(videoAutoPlay2.u);
                return a2.toString();
            default:
                ((izs) obj2).invoke(new wqs0.j((BlockId.CompositeId) obj));
                return s3q0.a;
        }
    }

    public /* synthetic */ ie3(Tooltip tooltip, Tooltip.g gVar, ojg ojgVar) {
        this.b = 26;
        this.c = tooltip;
        this.d = ojgVar;
    }
}
