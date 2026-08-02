package xsna;

import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.dto.common.Peer;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.cache.MusicPlayerCacheComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.superapp.health.js.bridge.impl.di.JsHealthDelegateComponentImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.h0k0;
import xsna.pn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qfj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qfj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v72 */
    @Override // xsna.gzs
    public final Object invoke() {
        a1w a1wVar;
        ExposedFunction invoke$lambda$46;
        CatalogMusicTrackLocalState catalogMusicTrackLocalState;
        bh90 bh90Var = null;
        int i = 1;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((zak0) ((rfj) this.c).f).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 1:
                return ((tgl0) this.c).I0().t();
            case 2:
                Peer peer = (Peer) ((DialogsFragment) this.c).W.getValue();
                if (BuildInfo.s() && peer.Ab(Peer.Type.GROUP)) {
                    a1wVar = q1w.b;
                    if (a1wVar == null) {
                        return null;
                    }
                } else {
                    a1wVar = q1w.a;
                    if (a1wVar == null) {
                        return null;
                    }
                }
                return a1wVar;
            case 3:
                DzenArticleFragment dzenArticleFragment = (DzenArticleFragment) this.c;
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                b25 s = ((AuthBridgeComponent) m7m.d(dzenArticleFragment).a(fpf0.a(AuthBridgeComponent.class))).s();
                kbj0 h8 = ((BridgeComponent) m7m.d(dzenArticleFragment).a(fpf0.a(BridgeComponent.class))).h8();
                qdz p = ((LinksBridgeComponent) m7m.d(dzenArticleFragment).a(fpf0.a(LinksBridgeComponent.class))).p();
                NewsfeedRouter l0 = ((NewsFeedComponent) m7m.d(dzenArticleFragment).a(fpf0.a(NewsFeedComponent.class))).l0();
                AudienceResearchComponent audienceResearchComponent = (AudienceResearchComponent) m7m.d(dzenArticleFragment).a(fpf0.a(AudienceResearchComponent.class));
                Bundle requireArguments = dzenArticleFragment.requireArguments();
                return new DzenArticleFragment.c(requireArguments.getString("article_id", ""), requireArguments.getString("entry_point", ""), s, h8, p, l0, audienceResearchComponent);
            case 4:
                return ((EduCommonComponent) ((k7m) m7m.f((z6p) this.c)).mo408a(fpf0.a(EduCommonComponent.class))).g2();
            case 5:
                ((ysp) this.c).j.invoke();
                return s3q0.a;
            case 6:
                return "folders event : " + ((a1s) this.c);
            case 7:
                return ((y4u) this.c).f.u();
            case 8:
                ((x7u) this.c).h6();
                return s3q0.a;
            case 9:
                invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$46;
            case 10:
                f0w f0wVar = (f0w) this.c;
                Trace.beginSection(ndp0.f("lazy ImDatabase.sqliteDbOpenHelper"));
                try {
                    NativeLibLoader nativeLibLoader = NativeLibLoader.a;
                    boolean j = NativeLibLoader.j(nativeLibLoader, NativeLib.SQLITE) ? NativeLibLoader.j(nativeLibLoader, NativeLib.SQLITE_OBSERVER) : false;
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.f();
                    aVar.g(NativeLib.SQLITE_OBSERVER.k());
                    aVar.a(Boolean.valueOf(j), "enabled");
                    aVar.c("screen_info", "StorageManager");
                    bVar.k(aVar.e());
                    rwk rwkVar = new rwk(f0wVar.a, f0wVar.b, f0wVar.c, f0wVar.d, j, f0wVar.l, f0wVar.g);
                    if (f0wVar.f) {
                        f0wVar.t(rwkVar);
                    }
                    Trace.endSection();
                    return rwkVar;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 11:
                d5w d5wVar = (d5w) this.c;
                StringBuilder sb = new StringBuilder("IM_ITEMS_LOADER ImItemListMerger. Merged history. size -> ");
                List<a5w> list = d5wVar.a;
                sb.append(list.size());
                sb.append(" \n ");
                sb.append(j5g.g0(list, "\n", null, null, 0, new f6w(z ? 1 : 0), 30));
                return sb.toString();
            case 12:
                return ((BridgeComponent) m7m.a(((ibx) this.c).s).a(fpf0.a(BridgeComponent.class))).p();
            case 13:
                JsHealthDelegateComponentImpl jsHealthDelegateComponentImpl = (JsHealthDelegateComponentImpl) this.c;
                return new n4y(jsHealthDelegateComponentImpl.a.Wb(), jsHealthDelegateComponentImpl.b.Kc(), jsHealthDelegateComponentImpl.c.H0());
            case 14:
                return ((r6y) this.c).l;
            case 15:
                return ((d1z) this.c).r;
            case 16:
                t200 t200Var = (t200) this.c;
                return "LogoutDelegate Logout started: reason - " + t200Var.a + ", sendAnalytics - " + t200Var.b + ", awaitCleanup - " + t200Var.c + ", userId - " + t200Var.d;
            case 17:
                ((df00) this.c).b(h0k0.c.a);
                return s3q0.a;
            case 18:
                ManagedGroupsListFragment managedGroupsListFragment = (ManagedGroupsListFragment) this.c;
                int i2 = ManagedGroupsListFragment.X;
                return new com.vk.im.popup.b(managedGroupsListFragment.requireContext());
            case 19:
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) this.c;
                int i3 = MarketEditAlbumGoodVariantsFragment.M0;
                FragmentActivity activity = marketEditAlbumGoodVariantsFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 20:
                return new lbb(((rw30) this.c).i);
            case 21:
                return new TimeAndStatusView(((u040) this.c).a, null, 0, 14, 0).getTimeTextViewPaint();
            case 22:
                ArrayList arrayList = ((n540) this.c).e;
                if (!arrayList.isEmpty()) {
                    ?? r2 = arrayList.get(0);
                    float c = ((bh90) r2).a.c();
                    int h = e43.h(arrayList);
                    boolean z2 = r2;
                    if (1 <= h) {
                        while (true) {
                            Object obj = arrayList.get(i);
                            float c2 = ((bh90) obj).a.c();
                            r2 = z2;
                            if (Float.compare(c, c2) < 0) {
                                r2 = obj;
                                c = c2;
                            }
                            if (i != h) {
                                i++;
                                z2 = r2;
                            }
                        }
                    }
                    bh90Var = r2;
                }
                bh90 bh90Var2 = bh90Var;
                return Float.valueOf(bh90Var2 != null ? bh90Var2.a.c() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 23:
                km40 km40Var = (km40) this.c;
                km40Var.dismiss();
                km40Var.g1.b.invoke();
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((MusicMyAudiosCatalogRootVh) this.c).T(false));
            case 25:
                return (MusicPlayerCacheComponent) m7m.e().a(fpf0.a(MusicPlayerCacheComponent.class));
            case 26:
                UIBlockMusicTrack uIBlockMusicTrack = ((MusicTrackCellVh) this.c).p;
                if (uIBlockMusicTrack != null && (catalogMusicTrackLocalState = uIBlockMusicTrack.C) != null) {
                    catalogMusicTrackLocalState.c = true;
                }
                return s3q0.a;
            case 27:
                yc50 yc50Var = (yc50) this.c;
                int i4 = yc50.x1;
                return ((AudioModelsComponent) m7m.d(yc50Var).a(fpf0.a(AudioModelsComponent.class))).r();
            case 28:
                return ((LinksGeneratorComponent) ((k7m) m7m.f((com.vk.dto.newsfeed.entries.a) this.c)).mo408a(fpf0.a(LinksGeneratorComponent.class))).N7();
            default:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                qcy<Object>[] qcyVarArr2 = NewsfeedCustomFragment2.r0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) newsfeedCustomFragment2.fo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0(new pl60(newsfeedCustomFragment2.eo().j)));
                newsfeedCustomFragment2.P = qn60Var;
                pn60 pn60Var = new pn60(new pn60.a((s1c0) newsfeedCustomFragment2.R.getValue(), newsfeedCustomFragment2.ho().get(), newsfeedCustomFragment2.ho().get()), newsfeedCustomFragment2.fo().b);
                newsfeedCustomFragment2.Q = pn60Var;
                rn60.a(qn60Var);
                NewsfeedCustomFragment2.f fVar = new NewsfeedCustomFragment2.f(newsfeedCustomFragment2.ho());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) fVar);
                return new bg60(new wg60(newsfeedCustomFragment2.S, qn60Var, pn60Var, eh60Var, new s1v(), newsfeedCustomFragment2.fo().a, new AtomicReference(new wn60((byte) 0)), newsfeedCustomFragment2.eo(), cVar, new tf60(new ng60(), new wf60(), new sf60()), new o1n(), new lu0(), fs60.a(qn60Var, pn60Var, cVar, newsfeedCustomFragment2.fo().a)));
        }
    }

    public /* synthetic */ qfj(d5w d5wVar, g6w g6wVar) {
        this.b = 11;
        this.c = d5wVar;
    }
}
