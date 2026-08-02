package xsna;

import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityReviewClick;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityReviewSendReviewItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityReviewView;
import com.vk.stat.scheme.CommonMarketStat$RatingType;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketCommunityReviewView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.gyh;
import xsna.gzp0;
import xsna.hzp0;

/* compiled from: CommunityReviewsAnalyticsFacadeImpl.kt */
/* loaded from: classes18.dex */
public final class hyh implements gyh {
    @Override // xsna.gyh
    public final void a(gyh.b bVar) {
        long j = bVar.a;
        Integer num = bVar.c;
        Float f = bVar.b;
        CommonMarketStat$RatingType commonMarketStat$RatingType = CommonMarketStat$RatingType.COMMUNITY;
        lig ligVar = null;
        gzp0.a.c(new CommonCommunitiesStat$TypeCommunityReviewClick(CommonCommunitiesStat$TypeCommunityReviewClick.Type.TYPE_COMMUNITY_REVIEW_SEND_REVIEW, ligVar, new CommonCommunitiesStat$TypeCommunityReviewSendReviewItem(bVar.e, bVar.g, bVar.d, bVar.f), f, num, commonMarketStat$RatingType, Long.valueOf(j), 2, null));
    }

    @Override // xsna.gyh
    public final void b(long j, Float f, Integer num) {
        CommonMarketStat$RatingType commonMarketStat$RatingType = CommonMarketStat$RatingType.COMMUNITY;
        CommonCommunitiesStat$TypeCommunityReviewSendReviewItem commonCommunitiesStat$TypeCommunityReviewSendReviewItem = null;
        gzp0.a.c(new CommonCommunitiesStat$TypeCommunityReviewClick(CommonCommunitiesStat$TypeCommunityReviewClick.Type.TYPE_COMMUNITY_REVIEW_CLICK_REVIEW, new lig(), commonCommunitiesStat$TypeCommunityReviewSendReviewItem, f, num, commonMarketStat$RatingType, Long.valueOf(j), 4, null));
    }

    @Override // xsna.gyh
    public final void c(gyh.c cVar) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GROUP;
        long j = cVar.a;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, null, Long.valueOf(j), null, null, null, 58, null);
        CommonMarketStat$RatingType commonMarketStat$RatingType = CommonMarketStat$RatingType.COMMUNITY;
        Float f = cVar.b;
        Integer num = cVar.c;
        Long valueOf = Long.valueOf(j);
        String str = cVar.e;
        Float f2 = cVar.d;
        new hzp0.j(schemeStat$EventItem, new CommonCommunitiesStat$TypeCommunityReviewView(CommonCommunitiesStat$TypeCommunityReviewView.Type.TYPE_COMMUNITY_REVIEW_SHOW_WINDOW_REVIEW, null, new CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem(str, f2 != null ? Integer.valueOf((int) f2.floatValue()) : null, cVar.f), commonMarketStat$RatingType, f, num, valueOf, 2, null)).a();
    }

    @Override // xsna.gyh
    public final void d(gyh.c cVar) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GROUP;
        long j = cVar.a;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, null, Long.valueOf(j), null, null, null, 58, null);
        CommonMarketStat$RatingType commonMarketStat$RatingType = CommonMarketStat$RatingType.COMMUNITY;
        Float f = cVar.b;
        Integer num = cVar.c;
        Long valueOf = Long.valueOf(j);
        new hzp0.n0(schemeStat$EventItem, new CommonMarketStat$TypeMarketCommunityReviewView(CommonMarketStat$TypeMarketCommunityReviewView.Type.TYPE_MARKET_COMMUNITY_REVIEW_UPDATE_SCREEN_SHOW, new zkg(), commonMarketStat$RatingType, f, num, valueOf, null)).a();
    }
}
