package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import com.vk.api.generated.market.dto.MarketGetContentAttachedItemsContentTypeDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.api.generated.market.dto.MarketGetRecommendedItemsFeatureTypeDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontFieldsDto;
import com.vk.api.generated.market.dto.MarketSearchRevDto;
import com.vk.api.generated.market.dto.MarketSearchSortDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MarketService.kt */
/* loaded from: classes2.dex */
public interface xd10 {
    static /* synthetic */ xy2 A(xd10 xd10Var, UserId userId, Integer num, Integer num2, Integer num3, List list, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 512) != 0) {
            list = null;
        }
        return xd10Var.s(userId, num, num2, num3, list);
    }

    static xy2 e(yd10 yd10Var, Integer num, Integer num2, MarketGetRecommendedItemsFeatureTypeDto marketGetRecommendedItemsFeatureTypeDto, int i) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.getRecommendedItems", new jh(17), new qq(14));
        tfxVar.f(num.intValue(), 0, 200, "count");
        if (num2 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (marketGetRecommendedItemsFeatureTypeDto != null) {
            tfx.o(tfxVar, "feature_type", marketGetRecommendedItemsFeatureTypeDto.i(), 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("enable_groups", bool2.booleanValue());
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 j(xd10 xd10Var, List list, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            bool = null;
        }
        return xd10Var.k(list, bool);
    }

    static xy2 p(yd10 yd10Var, UserId userId, String str, MarketSearchSortDto marketSearchSortDto, MarketSearchRevDto marketSearchRevDto, Integer num, int i) {
        if ((i & 32) != 0) {
            marketSearchSortDto = null;
        }
        if ((i & 64) != 0) {
            marketSearchRevDto = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        Integer num2 = (i & 256) != 0 ? null : 20;
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.search", new ct(14), new dt(15));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        if (marketSearchSortDto != null) {
            tfx.l(tfxVar, "sort", marketSearchSortDto.i(), 0, 0, 12);
        }
        if (marketSearchRevDto != null) {
            tfx.l(tfxVar, "rev", marketSearchRevDto.i(), 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 0, 200, "count");
        }
        return tfxVar;
    }

    static xy2 x(yd10 yd10Var, int i, long j, UserId userId, int i2) {
        Integer num = (i2 & 8) != 0 ? null : 20;
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.getItemReview", new ur(22), new vr(19));
        tfx.l(tfxVar, "id", i, 0, 0, 12);
        tfx.m(tfxVar, "item_id", j, 0L, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "comments_limit", num.intValue(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx B(int i) {
        tfx tfxVar = new tfx("market.restoreCommunityReview", new pq(13), new j8(16));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        return tfxVar;
    }

    default tfx C(List list) {
        tfx tfxVar = new tfx("market.getById", new rq(16), new sq(15));
        tfxVar.i("item_ids", list);
        tfxVar.j("extended", true);
        return tfxVar;
    }

    default tfx D(int i) {
        tfx tfxVar = new tfx("market.getOrderPaymentURL", new dt(16), new et(22));
        tfx.l(tfxVar, "order_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx a(UserId userId, int i, int i2, String str, String str2, String str3) {
        tfx tfxVar = new tfx("market.addToCart", new wr(24), new xr(21));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfxVar.f(i2, 1, 1000, "quantity");
        if (str != null) {
            tfx.o(tfxVar, "from", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "ads_label", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx b(int i, List list, Integer num) {
        tfx tfxVar = new tfx("market.getCommunityReview", new yq(20), new io.reactivex.rxjava3.internal.operators.mixed.j(18));
        tfx.l(tfxVar, "id", i, 0, 0, 12);
        if (num != null) {
            tfx.l(tfxVar, "comments_limit", num.intValue(), 0, 0, 8);
        }
        if (list != null) {
            tfxVar.i("comments_profile_fields", list);
        }
        return tfxVar;
    }

    default tfx c(int i, UserId userId) {
        tfx tfxVar = new tfx("market.delete", new kq(21), new lq(20));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx d(int i, String str, List list, UserId userId) {
        tfx tfxVar = new tfx("market.editComment", new io.reactivex.rxjava3.internal.operators.observable.n0(25), new dr(19));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "comment_id", i, 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "message", str, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("attachments", list);
        }
        return tfxVar;
    }

    default tfx f(List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("market.getCounters", new vr(18), new wr(23));
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MarketCountersFilterDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filter", arrayList);
        }
        return tfxVar;
    }

    default tfx g(int i, UserId userId) {
        tfx tfxVar = new tfx("market.unpinCommunityReview", new eq0(16), new k73(17));
        tfx.n(tfxVar, "community_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        return tfxVar;
    }

    default tfx h(Integer num, Integer num2, Integer num3, Integer num4) {
        tfx tfxVar = new tfx("market.getAbandonedCarts", new sq(14), new tq(16));
        tfxVar.f(num.intValue(), 0, 100, SignalingProtocol.KEY_OFFSET);
        tfxVar.f(num2.intValue(), 0, 10, "count");
        tfxVar.f(num3.intValue(), 0, 10, "preview_items_count");
        if (num4 != null) {
            tfx.l(tfxVar, "first_cart_id", num4.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    default tfx i(UserId userId, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("market.getStorefront", new u11(23), new v11(16));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MarketGetStorefrontFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx k(List list, Boolean bool) {
        tfx tfxVar = new tfx("market.getById", new at(20), new bt(16));
        tfxVar.i("item_ids", list);
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        return tfxVar;
    }

    default tfx l(UserId userId, int i, MarketGetContentAttachedItemsContentTypeDto marketGetContentAttachedItemsContentTypeDto) {
        tfx tfxVar = new tfx("market.getContentAttachedItems", new cq(19), new dq(20));
        tfx.n(tfxVar, "content_owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "content_id", i, 0, 0, 12);
        tfx.o(tfxVar, "content_type", marketGetContentAttachedItemsContentTypeDto.i(), 0, 0, 12);
        return tfxVar;
    }

    default tfx m(UserId userId, long j, int i) {
        tfx tfxVar = new tfx("market.restoreItemReview", new jq(22), new kq(22));
        tfx.l(tfxVar, "id", i, 0, 0, 12);
        tfx.m(tfxVar, "item_id", j, 0L, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    default tfx n(UserId userId, int i, Integer num, Integer num2, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("market.getComments", new io.reactivex.rxjava3.subjects.b(23), new io.reactivex.rxjava3.subjects.c(24));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfxVar.j("need_likes", true);
        tfxVar.j("allow_group_comments", true);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfxVar.f(num2.intValue(), 0, 100, "count");
        tfxVar.j("extended", true);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx o(UserId userId, Integer num) {
        tfx tfxVar = new tfx("market.getCommunityReviewFriends", new et(21), new gp(21));
        tfx.n(tfxVar, "community_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        return tfxVar;
    }

    default tfx q(UserId userId) {
        tfx tfxVar = new tfx("market.getCartTotalQuantity", new w11(22), new t11(20));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        return tfxVar;
    }

    default tfx r(UserId userId) {
        tfx tfxVar = new tfx("market.getCommunityExternalLinkDetails", new dr(20), new kr(25));
        tfx.n(tfxVar, "community_id", userId, 1L, 0L, 8);
        return tfxVar;
    }

    default tfx s(UserId userId, Integer num, Integer num2, Integer num3, List list) {
        tfx tfxVar = new tfx("market.get", new pm0(20), new tf3(17));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 12);
        }
        tfxVar.f(num2.intValue(), 0, 200, "count");
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        if (list != null) {
            tfxVar.i("fields", list);
        }
        return tfxVar;
    }

    default tfx t(UserId userId, long j, int i) {
        tfx tfxVar = new tfx("market.deleteItemReview", new l4(23), new nq(16));
        tfx.l(tfxVar, "id", i, 0, 0, 12);
        tfx.m(tfxVar, "item_id", j, 0L, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    default tfx u(List list) {
        tfx tfxVar = new tfx("market.geocodingReverse", new pr(21), new qr(18));
        tfxVar.i(CampaignEx.JSON_KEY_AD_Q, list);
        return tfxVar;
    }

    default tfx v(int i) {
        tfx tfxVar = new tfx("market.deleteCommunityReview", new lq(21), new mq(22));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        return tfxVar;
    }

    default tfx w(UserId userId, MarketGetEditUrlTypeDto marketGetEditUrlTypeDto) {
        tfx tfxVar = new tfx("market.getEditUrl", new r11(19), new sf3(17));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (marketGetEditUrlTypeDto != null) {
            tfx.o(tfxVar, "type", marketGetEditUrlTypeDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx y(UserId userId) {
        tfx tfxVar = new tfx("market.getSettings", new or(21), new pr(22));
        tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        return tfxVar;
    }

    default tfx z(int i, UserId userId, int i2) {
        tfx tfxVar = new tfx("market.removeFromCart", new xr(20), new io.reactivex.rxjava3.processors.b(20));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfxVar.f(i2, 1, 1000, "quantity");
        return tfxVar;
    }
}
