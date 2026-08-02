package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.analytics.MarketAnalyticsAdCampaign;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import xsna.gwh0;

/* compiled from: TrackCtaClickHelper.kt */
/* loaded from: classes18.dex */
public final class ffp0 {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType, String str, cxo cxoVar, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str2) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        gwh0 gwh0Var = (gwh0) cxoVar.a.h0.getValue();
        gwh0Var.getClass();
        switch (gwh0.a.$EnumSwitchMapping$0[eventType.ordinal()]) {
            case 1:
            case 2:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_CART_OUT;
                break;
            case 3:
            case 4:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
                break;
            case 5:
            case 6:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_LINK_OUT;
                break;
            case 7:
            case 8:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL_OUT;
                break;
        }
        gwh0Var.a(action);
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
        Good good = cxoVar.r;
        if (good == null || (mobileOfficialAppsCoreNavStat$EventScreen = cxoVar.h) == null) {
            return;
        }
        long j = good.b;
        UserId userId = good.c;
        String str3 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
        Long l = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.g : null;
        Integer num = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.b : null;
        Integer num2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.c : null;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.e : null;
        Long l2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.d : null;
        String str4 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null;
        OwnerResponseTime ownerResponseTime = cxoVar.W;
        Integer valueOf = ownerResponseTime != null ? Integer.valueOf((int) ownerResponseTime.b) : null;
        String str5 = cxoVar.d0;
        nw00.a(new MarketCtaButtonAnalyticsParams(eventType, j, userId, str3, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, l, num, num2, mobileOfficialAppsMarketStat$ReferrerItemType, l2, str, str4, valueOf, null, null, null, (str5 == null || str5.length() == 0) ? null : MarketAnalyticsAdCampaign.AFFILIATE_PROGRAM.h(), cxoVar.d0, str2, cxoVar.k0, 114688, null));
    }

    public static void b(ffp0 ffp0Var, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType, cxo cxoVar, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        ffp0Var.getClass();
        a(eventType, "", cxoVar, commonMarketStat$TypeRefSource, null);
    }
}
