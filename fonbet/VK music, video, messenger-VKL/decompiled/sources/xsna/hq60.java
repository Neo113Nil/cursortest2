package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.xn60;
import xsna.yo60;

/* compiled from: NewsfeedListExternalActionActor.kt */
/* loaded from: classes4.dex */
public final class hq60 extends al50<ur60, xn60.a, on50, ds60, qr60, yo60> {
    public hq60(dht dhtVar) {
        super(dhtVar);
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(xn60.a aVar) {
        NewsfeedExternalAction newsfeedExternalAction = aVar.b;
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.c) {
            a(new ds60.b((NewsfeedExternalAction.c) newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.d.a) {
            NewsfeedExternalAction.d.a aVar2 = (NewsfeedExternalAction.d.a) newsfeedExternalAction;
            int i = aVar2.c;
            NewsEntry newsEntry = aVar2.b;
            int i2 = aVar2.d;
            NewsEntry newsEntry2 = aVar2.a;
            hn50 jVar = i == PostActions.ACTION_COPY_LINK.h() ? new ds60.e.j(i2, newsEntry2) : i == PostActions.ACTION_IGNORE.h() ? new ds60.e.u(newsEntry2, newsEntry, i2) : i == PostActions.ACTION_PUSH_SUBSCRIBE.h() ? new ds60.e.g0(newsEntry2) : i == PostActions.ACTION_PUSH_UNSUBSCRIBE.h() ? new ds60.e.h0(newsEntry2) : i == PostActions.ACTION_BAN_SOURCE.h() ? new ds60.e.f(i2, newsEntry2) : i == PostActions.ACTION_BAN_POST_SOURCE.h() ? new ds60.e.C2751e(i2, newsEntry2) : i == PostActions.ACTION_HIDE_AD.h() ? new ds60.e.p(i2, newsEntry2) : i == PostActions.ACTION_HIDE_AD_OPTIONAL_NATIVE_AD.h() ? new ds60.e.s(newsEntry2) : i == PostActions.ACTION_HIDE_AD_HTML.h() ? new ds60.e.q(i2, newsEntry2) : i == PostActions.ACTION_HIDE_AD_PROMO_POST.h() ? new ds60.e.t(i2, newsEntry2) : i == PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD.h() ? new ds60.e.r(newsEntry2) : i == PostActions.ACTION_CANCEL_HIDE_MY_TARGET_NATIVE_AD.h() ? new ds60.e.w0(newsEntry2) : i == PostActions.ACTION_OPEN_ORIGINAL_POST.h() ? new ds60.d.c(i2, newsEntry2) : i == PostActions.ACTION_EDIT.h() ? new ds60.e.m(i2, newsEntry2) : i == PostActions.ACTION_REPORT.h() ? new ds60.e.l0(i2, newsEntry2) : i == PostActions.ACTION_PUBLISH_POSTPONED.h() ? new ds60.e.e0(i2, newsEntry2) : i == PostActions.ACTION_TOGGLE_PINNED.h() ? new ds60.e.s0(newsEntry2) : i == PostActions.ACTION_PUBLISH_DRAFT.h() ? new ds60.e.c0(newsEntry2) : i == PostActions.ACTION_SHOW_AD_DEBUG_INFO.h() ? new ds60.e.o0(newsEntry2) : i == PostActions.ACTION_TOGGLE_COMMENTS.h() ? new ds60.e.q0(newsEntry2) : i == PostActions.ACTION_TOGGLE_FAVE.h() ? new ds60.e.r0(newsEntry2) : i == PostActions.ACTION_CUSTOMIZE_TAGS.h() ? new ds60.e.k(newsEntry2) : i == PostActions.ACTION_ADD_TO_ARCHIVE.h() ? new ds60.e.a(newsEntry2) : i == PostActions.ACTION_REMOVE_FROM_ARCHIVE.h() ? new ds60.e.j0(newsEntry2) : i == PostActions.ACTION_DOUBT_CATEGORY.h() ? new ds60.e.l(newsEntry2) : i == PostActions.ACTION_PUBLISH_SUGGESTED_NOW.h() ? new ds60.e.f0(i2, newsEntry2) : i == PostActions.ACTION_PUBLISH_FREE_COPY.h() ? new ds60.e.d0(i2, newsEntry2) : i == PostActions.ACTION_EDIT_BEST_FRIENDS.h() ? new ds60.e.n(i2, newsEntry2) : i == PostActions.ACTION_WRITE_OWNER.h() ? new ds60.e.x0(i2, newsEntry2) : i == PostActions.ACTION_SHOW_ADVERTISER_INFO.h() ? new ds60.e.p0(i2, newsEntry2) : i == PostActions.ACTION_COPY_AD_MARKER.h() ? new ds60.e.h(i2, newsEntry2) : i == PostActions.ACTION_UNIGNORE.h() ? new ds60.e.v0(newsEntry2) : i == PostActions.ACTION_LIKE.h() ? new ds60.e.w(newsEntry2, newsEntry) : i == PostActions.ACTION_OPEN_PROFILE.h() ? new ds60.d.C2750d(newsEntry2, newsEntry, i2) : i == PostActions.ACTION_SHARE.h() ? new ds60.e.n0(newsEntry2, newsEntry) : i == PostActions.ACTION_OPEN_DISCOVER_MEDIA.h() ? new ds60.d.a() : i == PostActions.ACTION_OPEN_NEWS_TAB.h() ? new ds60.d.b() : i == PostActions.ACTION_LAZY_LOAD_RETRY.h() ? new ds60.e.v(newsEntry2) : i == PostActions.ACTION_SEND_BADGE.h() ? new ds60.e.m0(i2, newsEntry2) : i == PostActions.ACTION_REMOVE.h() ? new ds60.e.i0(i2, newsEntry2) : i == PostActions.ACTION_MARKET_CTA_CHAT_WITH_OWNER.h() ? new ds60.e.z(newsEntry2) : i == PostActions.ACTION_MARKET_CTA_ADD_TO_CART.h() ? new ds60.e.x(newsEntry2) : i == PostActions.ACTION_MARKET_CTA_LINK.h() ? new ds60.e.a0(newsEntry2) : i == PostActions.ACTION_MARKET_CTA_CALL_TO_OWNER.h() ? new ds60.e.y(newsEntry2) : i == PostActions.ACTION_MARKET_CTA_OPEN_CART.h() ? new ds60.e.b0(newsEntry2) : i == PostActions.ACTION_SHOW_STATS.h() ? new ds60.d.f(i2, newsEntry2) : i == PostActions.ACTION_OPEN_RECOMMENDATION_URL.h() ? new ds60.d.e(newsEntry2) : i == PostActions.ACTION_COPY_ADS_URL.h() ? new ds60.e.i(newsEntry2) : i == PostActions.ACTION_BAN_USER.h() ? new ds60.e.g(newsEntry2) : i == PostActions.ACTION_UNBAN_USER.h() ? new ds60.e.u0(newsEntry2) : i == PostActions.ACTION_REMOVE_FROM_MAIN_TAB.h() ? new ds60.e.k0(newsEntry2) : i == PostActions.ACTION_ADD_TO_MAIN_TAB.h() ? new ds60.e.b(newsEntry2) : i == PostActions.ACTION_TOGGLE_PINNED_ON_MAIN_TAB.h() ? new ds60.e.t0(newsEntry2) : i == PostActions.ACTION_ADS_EASY_PROMOTE.h() ? new ds60.e.d(newsEntry2) : i == PostActions.ACTION_ADD_TO_PLAYLIST.h() ? new ds60.e.c(newsEntry2) : i == PostActions.ACTION_EDIT_PLAYLIST.h() ? new ds60.e.o(newsEntry2) : null;
            if (jVar != null) {
                a(jVar);
                return;
            }
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.d.b) {
            NewsfeedExternalAction.d.b bVar = (NewsfeedExternalAction.d.b) newsfeedExternalAction;
            c(new yo60.e.C4117e(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.d.c) {
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.Navigation) {
            c(new yo60.f.b((NewsfeedExternalAction.Navigation) newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.b.a) {
            NewsfeedExternalAction.b.a aVar3 = (NewsfeedExternalAction.b.a) newsfeedExternalAction;
            c(new yo60.f.n(aVar3.a, aVar3.b, aVar3.c, aVar3.d, aVar3.e));
        } else {
            if ((newsfeedExternalAction instanceof NewsfeedExternalAction.e) || (newsfeedExternalAction instanceof fi60) || (newsfeedExternalAction instanceof NewsfeedExternalAction.a)) {
                return;
            }
            if (!(newsfeedExternalAction instanceof ei60)) {
                throw new NoWhenBranchMatchedException();
            }
            a(ds60.f.e.b);
        }
    }
}
