package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.reviews.api.model.CommunityRepliesArgs;
import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.friendsreview.ReviewFriendsDialogArgs;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ReviewsRouter.kt */
/* loaded from: classes.dex */
public interface ajg0 {
    void a(FragmentImpl fragmentImpl, MarketItemReviewRepliesArgs marketItemReviewRepliesArgs);

    void b(CommunityReviewsFragment communityReviewsFragment, CommunityRepliesArgs communityRepliesArgs);

    void c(Context context, UserId userId, j780 j780Var);

    void d(ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments, Context context, izs<? super oig0, s3q0> izsVar);

    void e(Context context);

    void f(int i, Context context);

    void g(Context context, CommunityRepliesArgs communityRepliesArgs);

    void h(Context context);

    void j(UserId userId, Float f, Integer num, Context context);

    void k(ListBuilder listBuilder, by5 by5Var, Context context);

    void l(Context context, long j, UserId userId, Integer num);

    void m(Context context, ReviewFriendsDialogArgs reviewFriendsDialogArgs);

    void n(Context context, CreateCommunityReviewArgs createCommunityReviewArgs);

    void o(Context context, int i, long j);

    void p(Context context, long j, UserId userId, MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams, String str);

    void r(int i, Context context, List list);

    /* compiled from: ReviewsRouter.kt */
    /* loaded from: classes18.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ajg0 STUB = new C2546a();

        public final ajg0 getSTUB() {
            return STUB;
        }

        /* compiled from: ReviewsRouter.kt */
        /* renamed from: xsna.ajg0$a$a, reason: collision with other inner class name */
        public static final class C2546a implements ajg0 {
            @Override // xsna.ajg0
            public final void e(Context context) {
            }

            @Override // xsna.ajg0
            public final void h(Context context) {
            }

            @Override // xsna.ajg0
            public final void a(FragmentImpl fragmentImpl, MarketItemReviewRepliesArgs marketItemReviewRepliesArgs) {
            }

            @Override // xsna.ajg0
            public final void b(CommunityReviewsFragment communityReviewsFragment, CommunityRepliesArgs communityRepliesArgs) {
            }

            @Override // xsna.ajg0
            public final void f(int i, Context context) {
            }

            @Override // xsna.ajg0
            public final void g(Context context, CommunityRepliesArgs communityRepliesArgs) {
            }

            @Override // xsna.ajg0
            public final void m(Context context, ReviewFriendsDialogArgs reviewFriendsDialogArgs) {
            }

            @Override // xsna.ajg0
            public final void n(Context context, CreateCommunityReviewArgs createCommunityReviewArgs) {
            }

            @Override // xsna.ajg0
            public final void c(Context context, UserId userId, j780 j780Var) {
            }

            @Override // xsna.ajg0
            public final void d(ReviewsModalBottomSheetArguments reviewsModalBottomSheetArguments, Context context, izs<? super oig0, s3q0> izsVar) {
            }

            @Override // xsna.ajg0
            public final void k(ListBuilder listBuilder, by5 by5Var, Context context) {
            }

            @Override // xsna.ajg0
            public final void o(Context context, int i, long j) {
            }

            @Override // xsna.ajg0
            public final void r(int i, Context context, List list) {
            }

            @Override // xsna.ajg0
            public final void j(UserId userId, Float f, Integer num, Context context) {
            }

            @Override // xsna.ajg0
            public final void l(Context context, long j, UserId userId, Integer num) {
            }

            @Override // xsna.ajg0
            public final void p(Context context, long j, UserId userId, MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams, String str) {
            }
        }
    }
}
