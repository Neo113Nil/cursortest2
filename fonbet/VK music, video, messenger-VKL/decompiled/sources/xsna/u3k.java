package xsna;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.b;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.FrameLayoutSwiped;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.home.HomeFragment2;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.bsm;
import xsna.d7q;
import xsna.dz40;
import xsna.mms;
import xsna.qn60;
import xsna.xey;
import xsna.xn50;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        UiTrackingScreen uiTrackingScreen;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        ExposedFunction invoke$lambda$16;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                dz40.g gVar = (dz40.g) obj;
                boolean z = gVar.c;
                ArrayList arrayList = gVar.a;
                return Integer.valueOf((!z || arrayList.isEmpty()) ? arrayList.size() : arrayList.size() + 2);
            case 1:
                CreateMarketItemReviewFragment createMarketItemReviewFragment = (CreateMarketItemReviewFragment) obj;
                return new z8k(createMarketItemReviewFragment, (yf9) createMarketItemReviewFragment.Q.getValue(), new CreateMarketItemReviewFragment.c(1, createMarketItemReviewFragment, CreateMarketItemReviewFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), ((BridgeComponent) m7m.d(createMarketItemReviewFragment).a(fpf0.a(BridgeComponent.class))).p().e());
            case 2:
                return new bsm.f((bsm) obj);
            case 3:
                return ((fum) obj).g.a();
            case 4:
                y6n y6nVar = (y6n) obj;
                mo60 mo60Var = y6nVar.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) y6nVar.c.getValue()).cc());
            case 5:
                e9n e9nVar = (e9n) obj;
                qn60 qn60Var = e9nVar.a;
                w6n w6nVar = e9nVar.i;
                List list = (List) w6nVar.k.getValue();
                pn60 pn60Var = e9nVar.b;
                xc3 xc3Var = new xc3(list, null, pn60Var, e9nVar.c, null, true, null);
                ?? r8 = w6nVar.k;
                xwi xwiVar = new xwi(new t7q((List) r8.getValue(), pn60Var, w6nVar.c), w6nVar.d);
                NewsEntry newsEntry = (NewsEntry) j5g.a0((List) r8.getValue());
                s1q s1qVar = w6nVar.f;
                Object f = qn60Var.f(xc3Var, xwiVar, new xwi(new k1g0(newsEntry, s1qVar, pn60Var), s1qVar != null));
                String str = w6nVar.a;
                String str2 = w6nVar.b;
                List list2 = (List) r8.getValue();
                ur60 ur60Var = ur60.h;
                sq60 sq60Var = sq60.i;
                boolean z2 = f instanceof Result.Failure;
                qn60.c cVar = (qn60.c) (z2 ? null : f);
                List list3 = cVar != null ? cVar.a : EmptyList.b;
                qn60.c cVar2 = (qn60.c) (z2 ? null : f);
                return new l8n(str, str2, list2, ur60.a(ur60Var, sq60.a(sq60Var, list3, null, cVar2 != null ? cVar2.b : d9x.a, false, false, null, null, 250), null, null, null, false, false, 62), w6nVar.e, w6nVar.f, w6nVar.g, w6nVar.c, w6nVar.d);
            case 6:
                return new o6a0(new ei90((naa0) ((com.vk.attachpicker.screen.h) obj).r.getValue()));
            case 7:
                c6q c6qVar = (c6q) obj;
                Context context = c6qVar.h;
                npl nplVar = new npl(context, (d7q.b) c6qVar.a.d.getValue());
                z9l z9lVar = new z9l(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                b.a aVar = new b.a();
                fxc0.z(!aVar.o);
                aVar.b = z9lVar;
                aVar.b(480000, 600000, 2500, 5000);
                fxc0.z(!aVar.o);
                androidx.media3.exoplayer.b.i(60000, 0, "backBufferDurationMs", "0");
                aVar.n = 60000;
                aVar.c(true);
                androidx.media3.exoplayer.b a = aVar.a();
                ExoPlayer.b bVar = new ExoPlayer.b(context);
                bVar.d(nplVar);
                bVar.b(a);
                fxc0.z(!bVar.y);
                bVar.y = true;
                androidx.media3.exoplayer.l lVar = new androidx.media3.exoplayer.l(bVar);
                lVar.A(new jwa0(c6qVar.m, 1.0f));
                lVar.setVolume(c6qVar.n);
                lVar.y();
                androidx.media3.exoplayer.c cVar3 = lVar.c;
                cVar3.X();
                cVar3.t.G(c6qVar.q);
                lVar.c(new d6q(c6qVar));
                lVar.y();
                cVar3.X();
                cVar3.D.a().getClass();
                return lVar;
            case 8:
                return "setConfig: config= " + ((mrk0) obj);
            case 9:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.common.recycler.holders.a) obj)).a(fpf0.a(NewsFeedComponent.class))).X5();
            case 10:
                qcy<Object>[] qcyVarArr = FragmentImpl.M;
                if ((((FragmentImpl) obj) instanceof o0q0) || (uiTrackingScreen = UiTracker.j.b) == null) {
                    return null;
                }
                if (uiTrackingScreen.a == MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE) {
                    uiTrackingScreen = null;
                }
                if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
                    return null;
                }
                return com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
            case 11:
                return Integer.valueOf(Math.round(((FrameLayoutSwiped) obj).getResources().getDisplayMetrics().density * 48.0f));
            case 12:
                int i2 = FriendsAndFollowersRootFragment.Z;
                h3p0.b((FriendsAndFollowersRootFragment) obj);
                return s3q0.a;
            case 13:
                ((tms) obj).a.a(new mms.b(false));
                return s3q0.a;
            case 14:
                FriendsImportFragment friendsImportFragment = (FriendsImportFragment) obj;
                int i3 = FriendsImportFragment.a0;
                return new com.vk.friends.recommendations.impl.presentation.a(friendsImportFragment, FriendsRequestsComponent.K5((FriendsRequestsComponent) m7m.d(friendsImportFragment).mo408a(fpf0.a(FriendsRequestsComponent.class)), new nss(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IMPORT_ADDRESS_BOOK.name(), MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IMPORT, cis.k, true), new njw(new x3i(friendsImportFragment, 11), new gzn(5), new ocg(friendsImportFragment, 23)), null, friendsImportFragment.kn(), friendsImportFragment.V, null, null, 100));
            case 15:
                ((s3t) obj).c.invoke();
                return s3q0.a;
            case 16:
                return ((y4u) obj).i.B0();
            case 17:
                com.vk.catalog2.common.ui.holders.group.a aVar2 = ((GroupCellVh) obj).o;
                if (aVar2 != null) {
                    com.vk.catalog2.common.ui.holders.group.a.d(aVar2, false, null, null, 6);
                }
                return s3q0.a;
            case 18:
                invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$16;
            case 19:
                return Float.valueOf((((xuy) j5g.a0(((fxu) obj).b.j().f())) != null ? r1.getSize() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 4.0f);
            case 20:
                int i4 = y2v.m1;
                return ((BiometricsLockComponent) ((k7m) m7m.f((y2v) obj)).a(fpf0.a(BiometricsLockComponent.class))).H();
            case 21:
                m5v m5vVar = (m5v) obj;
                m5vVar.q.b(NarrativePublishEventType.ADD_TO_BOOKMARKS, m5vVar.p, m5vVar.q6());
                m5vVar.n.E4(m5vVar.q6());
                return s3q0.a;
            case 22:
                int i5 = HomeFragment2.x0;
                return new b1j((HomeFragment2) obj, 24);
            case 23:
                x6y x6yVar = (x6y) obj;
                return new c6y(x6yVar, x6yVar.M());
            case 24:
                ((xey) obj).G(xey.b.b);
                return s3q0.a;
            case 25:
                return new BaseInputConnection(((k1z) obj).a, false);
            case 26:
                return ((ListGroupCallView) obj).F.animate().setDuration(300L);
            case 27:
                int i6 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = ((LocalMediaPickerFragmentOld) obj).fo();
                if (fo != null) {
                    fo.C(PostingAction.MediaPicker.OpenCamera.b);
                }
                return s3q0.a;
            case 28:
                return ((MarketComponent) ((k7m) m7m.f((v710) obj)).a(fpf0.a(MarketComponent.class))).l7();
            default:
                xn50.a.c(((f910) obj).d, z710.k.b);
                return s3q0.a;
        }
    }
}
