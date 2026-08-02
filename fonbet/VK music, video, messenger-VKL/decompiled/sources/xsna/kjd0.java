package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.good.router.model.MarketBusinessOnboardingParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ProductCardArgs.kt */
/* loaded from: classes18.dex */
public final class kjd0 {
    public final UserId a;
    public final long b;
    public final String c;
    public final GoodFragmentAnalyticsParams d;
    public final CommonMarketStat$TypeRefSource e;
    public final MobileOfficialAppsCoreNavStat$EventScreen f;
    public final String g;
    public final MarketBusinessOnboardingParams h;

    public kjd0(UserId userId, long j, String str, GoodFragmentAnalyticsParams goodFragmentAnalyticsParams, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str2, MarketBusinessOnboardingParams marketBusinessOnboardingParams) {
        this.a = userId;
        this.b = j;
        this.c = str;
        this.d = goodFragmentAnalyticsParams;
        this.e = commonMarketStat$TypeRefSource;
        this.f = mobileOfficialAppsCoreNavStat$EventScreen;
        this.g = str2;
        this.h = marketBusinessOnboardingParams;
    }
}
