package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.vk.bridges.ImageViewer;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.reviews.api.model.CommunityRepliesArgs;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import com.vk.ecomm.reviews.api.model.MarketItemReviewsArguments;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.friendsreview.ReviewFriendsDialogArgs;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsArgs;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.ReviewOfferViewType;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.dh6;
import xsna.f510;
import xsna.mhg0;
import xsna.qyg;

/* compiled from: ReviewsRouterImpl.kt */
/* loaded from: classes.dex */
public final class bjg0 implements ajg0 {

    /* compiled from: ReviewsRouterImpl.kt */
    /* loaded from: classes18.dex */
    public static final class a extends ImageViewer.b {
        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.ControlsOptions u() {
            return ImageViewer.ControlsOptions.a(super.u(), false, null, false, 252);
        }
    }

    /* compiled from: ReviewsRouterImpl.kt */
    /* loaded from: classes18.dex */
    public static final class b implements dh6.a {
        public final /* synthetic */ j780 b;

        public b(j780 j780Var) {
            this.b = j780Var;
        }

        @Override // xsna.dh6.a
        public final void a() {
            j780 j780Var = this.b;
            if (j780Var != null) {
                j780Var.a();
            }
        }

        @Override // xsna.dh6.a
        public final void b() {
            j780 j780Var = this.b;
            if (j780Var != null) {
                j780Var.b();
            }
        }
    }

    @Override // xsna.ajg0
    public final void a(FragmentImpl fragmentImpl, MarketItemReviewRepliesArgs marketItemReviewRepliesArgs) {
        new MarketItemReviewRepliesFragment.a(marketItemReviewRepliesArgs).g(44, fragmentImpl);
    }

    @Override // xsna.ajg0
    public final void b(CommunityReviewsFragment communityReviewsFragment, CommunityRepliesArgs communityRepliesArgs) {
        new CommunityRepliesFragment.a(communityRepliesArgs).g(33, communityReviewsFragment);
    }

    @Override // xsna.ajg0
    public final void c(Context context, UserId userId, j780 j780Var) {
        new f510.a(context, ReviewOfferViewType.COMMUNITY_MAIN, userId, null, null, new b(j780Var), 24).I0(null);
    }

    @Override // xsna.ajg0
    public final void d(ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments, Context context, izs<? super oig0, s3q0> izsVar) {
        new uig0(reviewsModalBottomSheetArguments, izsVar).a(context);
    }

    @Override // xsna.ajg0
    public final void e(Context context) {
        new f510.a(context, ReviewOfferViewType.MARKET_MAIN, null, null, null, new cjg0(), 28).I0(null);
    }

    @Override // xsna.ajg0
    public final void f(int i, Context context) {
        new f510.a(context, ReviewOfferViewType.ORDER, null, Integer.valueOf(i), null, null, 52).I0(null);
    }

    @Override // xsna.ajg0
    public final void g(Context context, CommunityRepliesArgs communityRepliesArgs) {
        new CommunityRepliesFragment.a(communityRepliesArgs).k(context);
    }

    @Override // xsna.ajg0
    public final void h(Context context) {
        new MarketAllReviewsFragment.a().k(context);
    }

    @Override // xsna.ajg0
    public final void j(UserId userId, Float f, Integer num, Context context) {
        new CommunityReviewsFragment.a(new CommunityReviewsArgs(userId, f, num)).k(context);
    }

    @Override // xsna.ajg0
    public final void k(ListBuilder listBuilder, by5 by5Var, Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = listBuilder.iterator();
        while (it.hasNext()) {
            t10 a2 = cig0.a((ReviewsActionType) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new v70(arrayList, by5Var).a(context);
    }

    @Override // xsna.ajg0
    public final void l(Context context, long j, UserId userId, Integer num) {
        new CreateMarketItemReviewFragment.a(new CreateMarketItemReviewArguments(j, userId, null, null, null, null, null, num, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null)).k(context);
    }

    @Override // xsna.ajg0
    public final void m(Context context, ReviewFriendsDialogArgs reviewFriendsDialogArgs) {
        new mhg0.a(context, reviewFriendsDialogArgs).I0("MARKET_REVIEW_FRIENDS_DIALOG");
    }

    @Override // xsna.ajg0
    public final void n(Context context, CreateCommunityReviewArgs createCommunityReviewArgs) {
        FragmentImpl u;
        dw20 a2 = new qyg.a(context, createCommunityReviewArgs).a();
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || (u = Y.u()) == null) {
            return;
        }
        a2.Td(u.getChildFragmentManager(), null);
    }

    @Override // xsna.ajg0
    public final void o(Context context, int i, long j) {
        new f510.a(context, ReviewOfferViewType.ORDER, null, Integer.valueOf(i), Long.valueOf(j), null, 36).I0(null);
    }

    @Override // xsna.ajg0
    public final void p(Context context, long j, UserId userId, MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams, String str) {
        new MarketItemReviewsFragment.a(new MarketItemReviewsArguments(j, userId, marketCtaButtonAnalyticsParams, str)).k(context);
    }

    @Override // xsna.ajg0
    public final void r(int i, Context context, List list) {
        ImageViewer.b(myc0.d(), i, list, context, new a(), false, null, 496);
    }
}
