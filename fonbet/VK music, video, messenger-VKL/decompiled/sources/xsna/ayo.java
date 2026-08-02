package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Size;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.view.ColorProgressBar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.libvideo.design.view.timer.LiveTimerView;
import com.vk.log.L;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.az20;
import xsna.bex0;
import xsna.c8p;
import xsna.dz40;
import xsna.er9;
import xsna.ez60;
import xsna.ikv0;
import xsna.o0r0;
import xsna.q4r;
import xsna.qn60;
import xsna.tj50;
import xsna.tlo0;
import xsna.xal;
import xsna.xoq;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ayo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ayo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.vk.core.compose.component.semantics.a, com.vk.core.view.components.placeholder.VkPlaceholder$a$a] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v26 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        c1r c1rVar;
        Object obj2;
        ArrayList<PrivacySetting> arrayList;
        ArrayList<PrivacySetting> arrayList2;
        Map observeLocalGalleryContentChangePaginated$lambda$19;
        int i = this.b;
        int i2 = 6;
        int i3 = 4;
        int i4 = 1;
        Integer num = 0;
        PrivacySetting privacySetting = null;
        r7 = null;
        PrivacySetting privacySetting2 = null;
        num = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b bVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b) obj3;
                wxo wxoVar = bVar.k;
                wxoVar.getClass();
                wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.ERROR_API, null, 6);
                bVar.l.b(new g.e(true));
                return s3q0.a;
            case 1:
                c8p.b bVar2 = c8p.n1;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj3).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 2:
                ((gpq) obj3).c(new xoq.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 3:
                g5r g5rVar = (g5r) obj3;
                q4r q4rVar = (q4r) obj;
                if (!(q4rVar instanceof q4r.a)) {
                    if (q4rVar instanceof q4r.b) {
                        g5rVar.getClass();
                        return new d1r(Collections.singletonList(new FeedItem.Pagination.a(true)), null);
                    }
                    if (!(q4rVar instanceof q4r.c) && !(q4rVar instanceof q4r.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g5rVar.getClass();
                    return new d1r(Collections.singletonList(new FeedItem.Pagination.b(true)), null);
                }
                q4r.a aVar = (q4r.a) q4rVar;
                g5rVar.getClass();
                ea90 ea90Var = aVar.d;
                gwx gwxVar = aVar.b;
                FeedItem.Pagination a = g5r.a(ea90Var.b, false);
                FeedItem.Pagination a2 = g5r.a(aVar.e.b, true);
                if (a != null && a2 != null) {
                    list = j5g.v0(a2, j5g.u0(gwxVar.a, Collections.singletonList(a)));
                } else if (a != null) {
                    list = j5g.u0(gwxVar.a, Collections.singletonList(a));
                } else if (a2 != null) {
                    list = j5g.v0(a2, gwxVar.a);
                } else if (!gwxVar.a.isEmpty() || aVar.f.a) {
                    list = gwxVar.a;
                } else {
                    ClipFeedTab clipFeedTab = g5rVar.a;
                    list = clipFeedTab instanceof ClipFeedTab.UserSubscriptions ? Collections.singletonList(new FeedItem.Pagination.Empty(FeedItem.Pagination.Empty.EmptyType.USER_SUBSCRIPTIONS)) : clipFeedTab instanceof ClipFeedTab.Playlist ? Collections.singletonList(new FeedItem.Pagination.Empty(FeedItem.Pagination.Empty.EmptyType.PLAYLIST)) : clipFeedTab instanceof ClipFeedTab.CoauthorInvitations ? Collections.singletonList(new FeedItem.Pagination.Empty(FeedItem.Pagination.Empty.EmptyType.COAUTHOR_INVITATIONS)) : Collections.singletonList(new FeedItem.Pagination.Empty(FeedItem.Pagination.Empty.EmptyType.DEFAULT));
                }
                String str = aVar.h;
                if (str != null && (c1rVar = aVar.b().get(str)) != null) {
                    num = Integer.valueOf(c1rVar.b);
                }
                return new d1r(list, num);
            case 4:
                return Boolean.valueOf(epx.f(((LaunchForResultInfo) obj).Ab(), ((FragmentEntry) obj3).d));
            case 5:
                ((evs) obj3).y().bk(a1t0.a);
                return s3q0.a;
            case 6:
                tys tysVar = (tys) obj3;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = tysVar.p;
                Bundle bundle = (signUpDataHolder != null ? signUpDataHolder : null).K;
                if (bundle != null) {
                    m63.m(bundle, authExternalFlowOutResponseDto.d());
                }
                rys rysVar = (rys) tysVar.a;
                if (rysVar != null) {
                    rysVar.e();
                }
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                s9u s9uVar = ((yv50) obj3).F;
                if (s9uVar != null) {
                    try {
                        vnv B0 = xa4.O().B0();
                        exc0.i(B0);
                        try {
                            s9uVar.a.d0(B0);
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        }
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(dd80.f((UIBlockList) obj, new lwh((UIBlockGroupFilter) obj3, 16)) != null);
            case 9:
                ((nav) obj3).a.g();
                return s3q0.a;
            case 10:
                ((xal.d) obj3).getClass();
                return s3q0.a;
            case 11:
                return Integer.valueOf(((w2w) obj3).I0().system().r(((Long) obj).longValue()));
            case 12:
                Map map = (Map) obj;
                x6y x6yVar = ((i2y) obj3).a;
                JsApiMethodType jsApiMethodType = JsApiMethodType.CHECK_ALLOWED_SCOPES;
                JSONObject jSONObject = new JSONObject();
                ArrayList arrayList3 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList3.add(new JSONObject(pn00.k(new Pair(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, entry.getKey()), new Pair("allowed", entry.getValue()))));
                }
                jSONObject.put("result", new JSONArray((Collection) arrayList3));
                bex0.a.b(x6yVar, jsApiMethodType, jSONObject, null, 12);
                return s3q0.a;
            case 13:
                ggj ggjVar = (ggj) obj;
                float floatValue = ((p6z) obj3).a.d().floatValue();
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) / 2.0f) & 4294967295L);
                er9.b a0 = ggjVar.a0();
                long d = a0.d();
                a0.a().e();
                try {
                    a0.a.i(floatToRawIntBits, floatValue, floatValue);
                    ggjVar.s1();
                    nq.b(a0, d);
                    return s3q0.a;
                } catch (Throwable th) {
                    nq.b(a0, d);
                    throw th;
                }
            case 14:
                int i5 = LiveTimerView.y;
                ((Ref$LongRef) obj3).element -= 1000;
                return s3q0.a;
            case 15:
                doz dozVar = (doz) obj3;
                Iterator it = ((ArrayList) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        ked0 ked0Var = (ked0) obj2;
                        if (!epx.f(ked0Var.a, "lives") || (arrayList2 = ked0Var.b) == null || arrayList2.size() <= 0) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ked0 ked0Var2 = (ked0) obj2;
                if (ked0Var2 != null && (arrayList = ked0Var2.b) != null) {
                    Iterator<PrivacySetting> it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            PrivacySetting next = it2.next();
                            if (epx.f(next.b, dozVar.u)) {
                                privacySetting = next;
                            }
                        }
                    }
                    privacySetting2 = privacySetting;
                }
                if (privacySetting2 != null) {
                    return privacySetting2;
                }
                throw new IllegalStateException("no lives privacy settings received");
            case 16:
                observeLocalGalleryContentChangePaginated$lambda$19 = LocalGalleryProvider.observeLocalGalleryContentChangePaginated$lambda$19((LocalGalleryProvider) obj3, (List) obj);
                return observeLocalGalleryContentChangePaginated$lambda$19;
            case 17:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) obj3;
                hvp hvpVar = (hvp) obj;
                VkPlaceholder vkPlaceholder = marketAllReviewsFragment.T;
                if (vkPlaceholder != null) {
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(tq.h(tlo0.Companion, hvpVar.a), new tlo0.f(hvpVar.b), (com.vk.core.compose.component.semantics.a) num, 10));
                    vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(hvpVar.c), new nuv(marketAllReviewsFragment, 4), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, null, 1660), (VkPlaceholder.a.C0854a) num, i2));
                }
                return s3q0.a;
            case 18:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj3;
                ColorProgressBar colorProgressBar = marketEditAlbumCoverFragment.X;
                if (colorProgressBar == null) {
                    colorProgressBar = null;
                }
                colorProgressBar.setVisibility(0);
                LinearLayout linearLayout = marketEditAlbumCoverFragment.Y;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                f4m.j(linearLayout);
                TextView textView = marketEditAlbumCoverFragment.U;
                f4m.j(textView != null ? textView : null);
                return s3q0.a;
            case 19:
                ((zak0) ((az20) obj3).m).setValue((az20.a) obj);
                return s3q0.a;
            case 20:
                int i6 = ModalReactionsFragment.G0;
                ((ModalReactionsFragment) obj3).a0();
                return s3q0.a;
            case 21:
                ((com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj3).e(b.g.a);
                return s3q0.a;
            case 22:
                return ((if40) obj3).c.d((List) obj, true);
            case 23:
                ((rw40) obj3).x.b(MusicHapticEvent.SUCCESS);
                return s3q0.a;
            case 24:
                tj50.a aVar2 = (tj50.a) obj;
                oj4 oj4Var = ((my40) obj3).h;
                oj4Var.getClass();
                ij4 ij4Var = ij4.b;
                ao8 ao8Var = ao8.d;
                return new dz40.b(new dz40.f(aVar2.a(ij4Var, ao8Var), aVar2.a(jj4.b, ao8Var), aVar2.a(kj4.b, ao8Var), aVar2.a(lj4.b, ao8Var), aVar2.a(new wh1(i3), ao8Var), aVar2.a(new g54(i4), ao8Var), aVar2.a(new com.vk.movika.sdk.base.observable.s(i3), ao8Var), aVar2.a(mj4.b, ao8Var), aVar2.a(nj4.b, ao8Var)), aVar2.a(new ej4(1, oj4Var, oj4.class, "composeCovers", "composeCovers(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$Covers;", 0), ao8Var), aVar2.a(new k60(i3), ao8Var), aVar2.a(new n82(oj4Var, 5), ao8Var), aVar2.a(new ob(i3), ao8Var), aVar2.a(new fj4(1, oj4Var, oj4.class, "composeChips", "composeChips-SLYZRjA(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Ljava/util/Set;", 0), ao8Var), new dz40.m(aVar2.a(new mo1(2), ao8Var), aVar2.a(new qb(5), ao8Var)), aVar2.a(new gj4(1, oj4Var, oj4.class, "composePlaybackQueue", "composePlaybackQueue(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$PlaybackQueueData$AudioBook;", 0), ao8Var), aVar2.a(hj4.b, ao8Var), aVar2.a(dj4.b, ao8Var));
            case 25:
                hs50 hs50Var = (hs50) obj3;
                Integer num2 = (Integer) obj;
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6();
                if (myTargetNativeAdEntry != null) {
                    hs50Var.E.a(num2.intValue(), myTargetNativeAdEntry);
                }
                return s3q0.a;
            case 26:
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj3;
                qn60.c cVar = (qn60.c) obj;
                ArrayList arrayList4 = cVar.a;
                og50 og50Var = cVar.b;
                List<NewsEntry> list2 = newsEntriesContainer.c;
                NewsEntriesContainer.Info info = newsEntriesContainer.b;
                return new xg60(arrayList4, og50Var, list2, info.b, info.c, info.e);
            case 27:
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) obj3;
                ?? r0 = newsfeedFilterListFragment2.T;
                com.vk.feed.settings.impl.presentation.filtered.tab.f fVar = (com.vk.feed.settings.impl.presentation.filtered.tab.f) obj;
                int i7 = NewsfeedFilterListFragment2.X;
                if (fVar instanceof f.c.a) {
                    FilteredSourceType filteredSourceType = newsfeedFilterListFragment2.W;
                    ((o0r0) newsfeedFilterListFragment2.R.getValue()).m(newsfeedFilterListFragment2.kn(), NewsfeedFilterListFragment2.d.$EnumSwitchMapping$0[(filteredSourceType != null ? filteredSourceType : null).ordinal()] == 1 ? fkq0.e(((f.c.a) fVar).a) : ((f.c.a) fVar).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (fVar instanceof f.d.a) {
                    j03.l(((f.d.a) fVar).a);
                } else if (fVar instanceof f.d.b) {
                    Context requireContext = newsfeedFilterListFragment2.requireContext();
                    ikv0.a aVar3 = new ikv0.a(requireContext);
                    aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                    aVar3.u = new ikv0.d(requireContext.getString(R.string.return_to_feed_success_message), (String) null, (ikv0.d.a) null, 6);
                    aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext.getString(R.string.cancel), new defpackage.y(17, newsfeedFilterListFragment2, (f.d.b) fVar));
                    aVar3.n();
                } else if (fVar instanceof f.b.a) {
                    ysg0 ysg0Var = (ysg0) r0.getValue();
                    FilteredSourceType filteredSourceType2 = newsfeedFilterListFragment2.W;
                    ysg0Var.a(new ez60.a(filteredSourceType2 != null ? filteredSourceType2 : null, ((f.b.a) fVar).b));
                } else if (fVar instanceof f.a) {
                    f.a aVar4 = (f.a) fVar;
                    ((bj60) newsfeedFilterListFragment2.U.getValue()).getClass();
                    if (aVar4 instanceof f.a.b) {
                        bj60.a(new MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile(((f.a.b) aVar4).a.b));
                    } else if (aVar4 instanceof f.a.C1064a) {
                        bj60.a(new MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton(((f.a.C1064a) aVar4).a.b));
                    } else {
                        if (!(aVar4 instanceof f.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bj60.a(new MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton(((f.a.c) aVar4).a.b));
                    }
                } else if (fVar.equals(f.e.a.a)) {
                    ((ysg0) r0.getValue()).a(ez60.b.a.a);
                } else {
                    if (!fVar.equals(f.e.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ysg0) r0.getValue()).a(ez60.b.C2842b.a);
                }
                return s3q0.a;
            case 28:
                int i8 = el70.g1;
                L.e("Closing rooms closed notification because rooms are open or call is not alive");
                ((el70) obj3).tn();
                return s3q0.a;
            default:
                Boolean bool = (Boolean) ((tt80) obj3).e.get();
                bool.getClass();
                return bool;
        }
    }
}
