package xsna;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.catalog2.common.dto.api.video.CatalogMovieItem;
import com.vk.catalog2.common.dto.ui.UiBlockMovie;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.post_settings.g;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.j;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.sharing.core.view.l;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vk.story.viewer.impl.presentation.stories.view.ads.html5.Html5LoadState;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import io.opentelemetry.api.trace.SpanKind;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.l;
import xsna.gm50;
import xsna.lc50;
import xsna.nsh0;
import xsna.pp80;
import xsna.rye;
import xsna.ryv;
import xsna.tj50;
import xsna.uhu;
import xsna.utl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yhu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yhu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue;
        int i = this.b;
        int i2 = 8;
        int i3 = 2;
        r6 = null;
        r6 = null;
        r6 = null;
        pp80 pp80Var = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                uhu.a aVar = ((aiu) obj2).q;
                if (aVar != null) {
                    aVar.a(false);
                }
                return s3q0.a;
            case 1:
                gxu gxuVar = (gxu) obj2;
                gxuVar.v0(gxuVar.h.c());
                return s3q0.a;
            case 2:
                L.j((Throwable) obj, "ideas-publish: render failed");
                ((ptv) obj2).e.e(PublishedKind.STORY);
                return s3q0.a;
            case 3:
                ((nbx) obj2).b();
                return s3q0.a;
            case 4:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2).T((c.l) obj);
                return s3q0.a;
            case 5:
                int i4 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) obj2).Mo();
                return s3q0.a;
            case 6:
                ic10 ic10Var = (ic10) obj2;
                w6e w6eVar = ic10Var.n;
                Context context = ic10Var.p.getContext();
                cxo cxoVar = (cxo) w6eVar.b;
                Good good = cxoVar.r;
                y4u y4uVar = cxoVar.a;
                if (good != null) {
                    UserId userId = good.c;
                    long j = good.b;
                    long j2 = userId.b;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) w6eVar.c;
                    GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
                    LinkedContentAnalyticsParams linkedContentAnalyticsParams = new LinkedContentAnalyticsParams(j, j2, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null);
                    y4uVar.c().getClass();
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(linkedContentAnalyticsParams.b), Long.valueOf(linkedContentAnalyticsParams.c), null, linkedContentAnalyticsParams.e, null, 40, null);
                    UiTrackingScreen b = UiTracker.j.b();
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, linkedContentAnalyticsParams.d, null, linkedContentAnalyticsParams.f, new com.vk.stat.scheme.q(), 41), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b2, uzp0Var.a).q();
                    ((z610) y4uVar.j0.getValue()).a(context, good.b, userId, good.V, linkedContentAnalyticsParams);
                }
                return s3q0.a;
            case 7:
                w920 w920Var = (w920) obj2;
                Throwable th = (Throwable) obj;
                f9w f9wVar = w920Var.g;
                if (!f9wVar.d(LogLevel.ERROR)) {
                    String str = f9wVar.a;
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.w(l, L.LogType.e, th, new Object[]{str, "onUpdateSuccess: MsgHistory update error, " + w920Var.l()}, null, null, 24);
                    }
                }
                return s3q0.a;
            case 8:
                ModalPostReactionsFragment.go((ModalPostReactionsFragment) obj2, false, 13);
                return s3q0.a;
            case 9:
                bn40.f(kmq.class.getSimpleName(), (Boolean) obj);
                Episode episode = ((MusicTrack) obj2).w;
                if (episode != null) {
                    episode.c = true;
                }
                return s3q0.a;
            case 10:
                ((hd50) obj2).d.invoke(lc50.b.a.b);
                return s3q0.a;
            case 11:
                utl0.c.a aVar2 = (utl0.c.a) obj;
                iq50 iq50Var = ((ep50) obj2).getDelegateProvider().l;
                q7r q7rVar = iq50Var.a;
                mkm0 mkm0Var = q7rVar.i0;
                if (aVar2 instanceof utl0.c.a.C3830c) {
                    if (iq50Var.d != Html5LoadState.FINISHED) {
                        iq50Var.d = Html5LoadState.LOADING;
                        MediaAdView mediaAdView = q7rVar.z;
                        if (mediaAdView != null) {
                            bwt0.p0(mediaAdView, false);
                        }
                    }
                } else if (aVar2 instanceof utl0.c.a.b) {
                    iq50Var.c(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.AD_HTML5_GAME_LOADED_SUCCESSFULLY);
                    iq50Var.d = Html5LoadState.FINISHED;
                    MediaAdView mediaAdView2 = q7rVar.z;
                    if (mediaAdView2 != null) {
                        bwt0.p0(mediaAdView2, true);
                    }
                    mkm0Var.c1(false);
                } else {
                    if (!(aVar2 instanceof utl0.c.a.C3829a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iq50Var.d = Html5LoadState.ERROR;
                    MediaAdView mediaAdView3 = q7rVar.z;
                    if (mediaAdView3 != null) {
                        bwt0.p0(mediaAdView3, false);
                    }
                    mkm0Var.Q0();
                    q7rVar.w0.f(null, ((utl0.c.a.C3829a) aVar2).c);
                }
                return s3q0.a;
            case 12:
                View view = (View) obj;
                cjx cjxVar = ((pr50) obj2).E;
                (cjxVar != null ? cjxVar : null).p(view, NativeAdContent.ViewTag.CTA);
                return s3q0.a;
            case 13:
                return new UiBlockMovie(((bi20) obj2).b(), (CatalogMovieItem) obj);
            case 14:
                new oz50(FriendRequestsFragment.class, null, null).k(((RecyclerView) ((ViewGroup) obj2)).getContext());
                return s3q0.a;
            case 15:
                hq80 hq80Var = (hq80) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = hq80Var.j;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                hq80Var.j = cVar;
                return s3q0.a;
            case 16:
                ckv ckvVar = (ckv) obj2;
                phk0 phk0Var = (phk0) obj;
                phk0Var.setAttribute("http.method", ckvVar.a.name());
                phk0Var.setAttribute("url.full", ckvVar.b);
                phk0Var.setAttribute("server.address", ckvVar.i().b());
                phk0Var.d(SpanKind.CLIENT);
                return s3q0.a;
            case 17:
                ((com.vk.photos.root.photoflow.presentation.j) obj2).e.invoke(new a.u(((y7a0) obj).a));
                return s3q0.a;
            case 18:
                sra0 sra0Var = (sra0) obj2;
                yzt0<com.vk.newsfeed.posting.geo_picker.presentation.c> yzt0Var = ((j.a) obj).a;
                b140 b140Var = new b140(sra0Var, i2);
                sra0Var.getClass();
                gm50.a.a(sra0Var, yzt0Var, b140Var);
                return s3q0.a;
            case 19:
                ((v020) obj2).a.j0(new l.b((Surface) obj));
                return s3q0.a;
            case 20:
                PlaylistScreenFragment playlistScreenFragment = (PlaylistScreenFragment) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                h1m l2 = tci.l(playlistScreenFragment.ho());
                nwy nwyVar = playlistScreenFragment.go().j;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[0];
                g47Var.e(l2, (aeb0) nwyVar.c());
                g47Var.a(tci.k(playlistScreenFragment.ho()));
                g47Var.d(new PlaylistScreenFragment.b(playlistScreenFragment.ho()));
                return s3q0.a;
            case 21:
                hib0 hib0Var = (hib0) obj2;
                hib0Var.i.setEnabled(false);
                gjb0 gjb0Var = hib0Var.c;
                if (gjb0Var != null) {
                    gjb0Var.n3(new b810(hib0Var, 16), new h440(hib0Var, 9));
                }
                return s3q0.a;
            case 22:
                com.vk.channels.impl.post_settings.b bVar = (com.vk.channels.impl.post_settings.b) obj2;
                j7c0 j7c0Var = (j7c0) obj;
                pp80 pp80Var2 = j7c0Var.b;
                if (j7c0Var.d.c) {
                    if (pp80Var2 != null) {
                        Integer i5 = j7c0Var.a.i();
                        if (i5 != null) {
                            if (i5.intValue() == -1) {
                                pp80Var = pp80.a.a;
                            } else if (i5.intValue() % 86400 == 0 && 1 <= (intValue = i5.intValue() / 86400) && intValue < 8) {
                                pp80Var = new pp80.b(intValue);
                            }
                        }
                        if (pp80Var == null) {
                            pp80Var = pp80.a.a;
                        }
                        bVar.n(new g.f(pp80Var));
                    }
                } else if (pp80Var2 != null) {
                    Channel b3 = bVar.o.b();
                    if (b3 != null) {
                        bVar.n.a(new ryv.a(b3.A.d, b3.b, false));
                    }
                    bVar.q(new px30(bVar, 21));
                } else {
                    bVar.n(new g.f(pp80.a.a));
                }
                return s3q0.a;
            case 23:
                ((qkc0) obj2).d.getClass();
                PostEditableData postEditableData = ((PostingState.Editing) obj).i;
                PhotoTagsData photoTagsData = postEditableData.r;
                if (photoTagsData != null) {
                    return new d020(photoTagsData, postEditableData.p);
                }
                return null;
            case 24:
                PostingSettingsUserView.a aVar3 = ((PostingSettingsUserView) obj2).w;
                if (aVar3 != null) {
                    aVar3.b();
                }
                return s3q0.a;
            case 25:
                ((zak0) ((sjg0) obj2).m).setValue((String) obj);
                return s3q0.a;
            case 26:
                rye.b bVar2 = (rye.b) obj2;
                bVar2.d.post(new uye(bVar2, ((Integer) obj).intValue() / 100.0f));
                return s3q0.a;
            case 27:
                csh0 csh0Var = (csh0) obj2;
                tj50.a aVar4 = (tj50.a) obj;
                sd9 sd9Var = sd9.d;
                ux40 ux40Var = new ux40(csh0Var, 25);
                aVar4.getClass();
                ThreadType.a aVar5 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.STATE};
                aVar5.getClass();
                ThreadType.a.a(threadTypeArr);
                return new nsh0.a(aVar4.f(sd9Var, null, new izs[]{ash0.b}, new fgk(ux40Var, i3)), aVar4.a(new xka0(csh0Var, 10), ao8.d));
            case 28:
                return new io.reactivex.rxjava3.internal.operators.completable.e(new f8x((com.vk.voip.ui.sessionrooms.d) obj2, (Collection) obj));
            default:
                qfq qfqVar = (qfq) obj;
                l.a aVar6 = ((com.vk.sharing.core.view.f) obj2).D;
                if (aVar6 != null) {
                    aVar6.k2(qfqVar);
                }
                return s3q0.a;
        }
    }
}
