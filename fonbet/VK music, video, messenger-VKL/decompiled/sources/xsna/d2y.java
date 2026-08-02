package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.channels.dto.ChannelsJoinResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.instantjobs.InstantJob;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.multiaccount.api.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.ddz;
import xsna.f6h0;
import xsna.fmc0;
import xsna.kjw;
import xsna.qn60;
import xsna.tsb0;
import xsna.xs00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d2y implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d2y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        StoryEntry storyEntry;
        int i = this.b;
        int i2 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((i2y) obj3).a.A(JsApiMethodType.CHECK_ALLOWED_SCOPES, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 1:
                ((i330) obj3).b((ddz.b) obj);
                return s3q0.a;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((gcp0) obj3).invoke(bool, Boolean.TRUE);
                return s3q0.a;
            case 3:
                ((nxz) obj3).k.i((List) obj, true);
                return s3q0.a;
            case 4:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) obj3;
                xs00 xs00Var = (xs00) obj;
                int i3 = MarketAllReviewsFragment.d0;
                if (xs00Var instanceof xs00.f) {
                    xs00.f fVar = (xs00.f) xs00Var;
                    ImageViewer.b((ImageViewer) marketAllReviewsFragment.Z.getValue(), fVar.b, fVar.a, marketAllReviewsFragment.requireContext(), new ms00(), false, null, 496);
                } else if (xs00Var instanceof xs00.d) {
                    xs00.d dVar = (xs00.d) xs00Var;
                    new CreateMarketItemReviewFragment.a(new CreateMarketItemReviewArguments(dVar.a, dVar.b, dVar.c, null, null, null, null, null, 248, null)).g(111722, marketAllReviewsFragment);
                } else if (xs00Var instanceof xs00.a) {
                    xs00.a aVar = (xs00.a) xs00Var;
                    ((ajg0) marketAllReviewsFragment.W.getValue()).n(marketAllReviewsFragment.requireContext(), new CreateCommunityReviewArgs(aVar.a, aVar.b, null, null, null, 28, null));
                } else if (xs00Var instanceof xs00.b) {
                    xs00.b bVar = (xs00.b) xs00Var;
                    new CreateMarketItemReviewFragment.a(new CreateMarketItemReviewArguments(bVar.a, bVar.b, null, null, null, null, null, Integer.valueOf(bVar.c), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null)).g(111722, marketAllReviewsFragment);
                } else if (xs00Var instanceof xs00.c) {
                    ((d0i) marketAllReviewsFragment.Y.getValue()).d(marketAllReviewsFragment.requireContext(), ((xs00.c) xs00Var).a);
                } else {
                    if (!(xs00Var instanceof xs00.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xs00.e eVar = (xs00.e) xs00Var;
                    ((sz00) marketAllReviewsFragment.X.getValue()).d(marketAllReviewsFragment.requireContext(), new qz00(eVar.a, eVar.b, CommonMarketStat$TypeRefSource.MARKET_REVIEW_SECTION, null, null, null, null, null, null, null, null, null, null, 1048568));
                }
                return s3q0.a;
            case 5:
                MasksWrap masksWrap = (MasksWrap) obj3;
                int i4 = MasksWrap.e0;
                masksWrap.p();
                com.vk.lists.c cVar = masksWrap.u;
                if (cVar != null) {
                    cVar.p(true);
                }
                return s3q0.a;
            case 6:
                ((zak0) ((dr20) obj3).h).setValue((String) obj);
                return s3q0.a;
            case 7:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof r14) && ((Collection) obj3).contains(Integer.valueOf(((r14) instantJob).d)));
            case 8:
                Throwable th = (Throwable) obj;
                com.vk.im.ui.components.msg_list.a.P0.a(th);
                vm30 vm30Var = ((com.vk.im.ui.components.msg_list.a) obj3).o;
                if (vm30Var != null) {
                    vm30Var.H(th);
                }
                return s3q0.a;
            case 9:
                ArrayList arrayList = new ArrayList((List) obj);
                arrayList.remove((f.c) obj3);
                return arrayList;
            case 10:
                ((MusicPageInfoBlockVh) obj3).m = null;
                return s3q0.a;
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                View view = ((NewsfeedFilterListFragment2) obj3).Q;
                (view != null ? view : null).setVisibility(booleanValue ? 0 : 8);
                return s3q0.a;
            case 12:
                ka70 ka70Var = (ka70) obj3;
                ButtonsSwipeView buttonsSwipeView = ka70Var.s;
                int maxRightScrollOffset = buttonsSwipeView.getMaxRightScrollOffset();
                if (buttonsSwipeView.getScrollX() < maxRightScrollOffset) {
                    ja70 ja70Var = new ja70(ka70Var, maxRightScrollOffset, r5);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    buttonsSwipeView.postOnAnimation(ja70Var);
                } else {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 13:
                rwr.b((rwr) obj3);
                return s3q0.a;
            case 14:
                OnePassPromoFragment onePassPromoFragment = (OnePassPromoFragment) obj3;
                int i5 = OnePassPromoFragment.R;
                ((ej80) onePassPromoFragment.N.getValue()).a();
                onePassPromoFragment.eo();
                FragmentActivity activity = onePassPromoFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 15:
                ra90 ra90Var = (ra90) obj3;
                ra90Var.j.onNext((List) obj);
                ra90Var.j.onComplete();
                return s3q0.a;
            case 16:
                return new zo90((ViewGroup) obj, ((cp90) obj3).i);
            case 17:
                ((lsb0) obj3).U(tsb0.e.a);
                return s3q0.a;
            case 18:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "post_view_fragment_toolbar_back_tag");
                qgi0.h(tgi0Var, ((PostFragment) obj3).getString(R.string.accessibility_back));
                return s3q0.a;
            case 19:
                com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b bVar2 = (com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b) obj3;
                com.vk.newsfeed.api.posting.author.a aVar2 = (com.vk.newsfeed.api.posting.author.a) obj;
                UserId userId = aVar2.a;
                PostingAuthor.User user = aVar2.b;
                List<PostingAuthor.Community> list = aVar2.c;
                if (fkq0.b(userId)) {
                    List<PostingAuthor.Community> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((PostingAuthor.Community) it.next()).b, userId)) {
                            }
                        }
                    }
                    return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.c(new zcc0(bVar2, r4)), new do3(new wx30(bVar2, 7), 27)).l(new qj4(new kti(bVar2, userId, user, i2), 28));
                }
                return io.reactivex.rxjava3.core.x.k(aVar2);
            case 20:
                Context context = (Context) obj3;
                Throwable th2 = (Throwable) obj;
                iuc0 iuc0Var = iuc0.b;
                if (!((o2i) iuc0.h.getValue()).d(th2, true)) {
                    j03.j(context, th2);
                }
                return s3q0.a;
            case 21:
                pvc0 pvc0Var = (pvc0) obj3;
                VKList vKList = (VKList) obj;
                lwc0 lwc0Var = pvc0Var.f;
                lwc0Var.b.a();
                qn60 qn60Var = lwc0Var.a;
                aic aicVar = new aic();
                pn60 pn60Var = lwc0Var.b;
                xc3 xc3Var = new xc3(vKList, null, pn60Var, pvc0Var.g, null, true, null);
                t7q t7qVar = new t7q(vKList, pn60Var, ((uvc0) pvc0Var.b.getCurrentState()).c);
                Iterator<T> it2 = vKList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (epx.f(((NewsEntry) obj2).Ab(), lwc0Var.h.b)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                return new io.reactivex.rxjava3.internal.operators.single.b(new nvc0(qn60Var, new qn60.b[]{aicVar, xc3Var, t7qVar, new k1g0((NewsEntry) obj2, null, pn60Var)}, r5)).l(new u9c0(new j5b0(vKList, i2), i2));
            case 22:
                u4d0 u4d0Var = (u4d0) obj3;
                u4d0Var.n.a((MediaStoreEntry) u4d0Var.m);
                return s3q0.a;
            case 23:
                tgi0 tgi0Var2 = (tgi0) obj;
                int i6 = ProfileFriendsFragment.k0;
                qgi0.n(tgi0Var2, 0);
                qgi0.h(tgi0Var2, ((ProfileFriendsFragment) obj3).getString(R.string.delete_friends_list_desc));
                return s3q0.a;
            case 24:
                final kjw.a aVar3 = (kjw.a) obj3;
                final Bitmap bitmap = (Bitmap) obj;
                return new io.reactivex.rxjava3.internal.operators.maybe.d(new io.reactivex.rxjava3.functions.n() { // from class: xsna.azd0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        kjw.a aVar4 = aVar3;
                        Bitmap b = kd7.b(bitmap, aVar4.a, aVar4.b, false, false);
                        return b == null ? io.reactivex.rxjava3.internal.operators.maybe.i.b : io.reactivex.rxjava3.core.k.i(b);
                    }
                });
            case 25:
                ube0 ube0Var = (ube0) obj3;
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var != null && (storyEntry = zjm0Var.g) != null) {
                    ube0Var.a.e(new fmc0.m.f(storyEntry.Gb()));
                }
                return s3q0.a;
            case 26:
                ((ChannelsRecommendation) obj3).g = ((ChannelsJoinResponseDto) obj).d().d().i().d();
                return s3q0.a;
            case 27:
                f7h0 f7h0Var = (f7h0) obj3;
                f7h0Var.e.b.b(new f6h0.a((String) obj));
                f7h0Var.e.b.b(f6h0.e.a);
                return s3q0.a;
            case 28:
                ((SearchAuthorCellVh.a) obj3).a.invoke();
                return s3q0.a;
            default:
                int i7 = SearchCommunitiesOnMapFragment.e0;
                ((SearchCommunitiesOnMapFragment) obj3).kn().onBackPressed();
                return s3q0.a;
        }
    }

    public /* synthetic */ d2y(bzd0 bzd0Var, kjw.a aVar) {
        this.b = 24;
        this.c = aVar;
    }
}
