package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.market.api.good.router.model.MarketBusinessOnboardingParams;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;

/* compiled from: MarketGoodParams.kt */
/* loaded from: classes18.dex */
public final class rz00 {
    public final Good a;
    public final CommonMarketStat$TypeRefSource b;
    public final String c;
    public final Integer d;
    public final SearchStatsLoggingInfo e;
    public final Integer f;
    public final Long g;
    public final MobileOfficialAppsMarketStat$ReferrerItemType h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final CommonMarketStat$TypeMarketContextContent.Type m;
    public final Integer n;
    public final Long o;
    public final MarketBusinessOnboardingParams p;

    public rz00(Good good, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, Integer num, SearchStatsLoggingInfo searchStatsLoggingInfo, Integer num2, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str2, String str3, String str4, String str5, CommonMarketStat$TypeMarketContextContent.Type type, Integer num3, Long l2, MarketBusinessOnboardingParams marketBusinessOnboardingParams) {
        this.a = good;
        this.b = commonMarketStat$TypeRefSource;
        this.c = str;
        this.d = num;
        this.e = searchStatsLoggingInfo;
        this.f = num2;
        this.g = l;
        this.h = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = type;
        this.n = num3;
        this.o = l2;
        this.p = marketBusinessOnboardingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz00)) {
            return false;
        }
        rz00 rz00Var = (rz00) obj;
        return epx.f(this.a, rz00Var.a) && this.b == rz00Var.b && epx.f(this.c, rz00Var.c) && epx.f(this.d, rz00Var.d) && epx.f(this.e, rz00Var.e) && epx.f(this.f, rz00Var.f) && epx.f(this.g, rz00Var.g) && this.h == rz00Var.h && epx.f(this.i, rz00Var.i) && epx.f(this.j, rz00Var.j) && epx.f(this.k, rz00Var.k) && epx.f(this.l, rz00Var.l) && this.m == rz00Var.m && epx.f(this.n, rz00Var.n) && epx.f(this.o, rz00Var.o) && epx.f(this.p, rz00Var.p);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.e;
        int hashCode4 = (hashCode3 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.g;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.h;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsMarketStat$ReferrerItemType == null ? 0 : mobileOfficialAppsMarketStat$ReferrerItemType.hashCode())) * 31;
        String str2 = this.i;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent.Type type = this.m;
        int hashCode12 = (hashCode11 + (type == null ? 0 : type.hashCode())) * 31;
        Integer num3 = this.n;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.o;
        int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        MarketBusinessOnboardingParams marketBusinessOnboardingParams = this.p;
        return hashCode14 + (marketBusinessOnboardingParams != null ? marketBusinessOnboardingParams.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGoodParams(good=" + this.a + ", source=" + this.b + ", trackCode=" + this.c + ", position=" + this.d + ", searchStatsLoggingInfo=" + this.e + ", referrerItemId=" + this.f + ", referrerOwnerId=" + this.g + ", referrerItemType=" + this.h + ", rootRefScreen=" + this.i + ", refPostId=" + this.j + ", sourceUrl=" + this.k + ", adsLabel=" + this.l + ", contextContentType=" + this.m + ", contextContentId=" + this.n + ", contextContentOwnerId=" + this.o + ", businessOnboardingParams=" + this.p + ')';
    }

    public /* synthetic */ rz00(Good good, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, Integer num, SearchStatsLoggingInfo searchStatsLoggingInfo, Integer num2, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str2, String str3, String str4, String str5, CommonMarketStat$TypeMarketContextContent.Type type, Integer num3, Long l2, MarketBusinessOnboardingParams marketBusinessOnboardingParams, int i) {
        this(good, commonMarketStat$TypeRefSource, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : searchStatsLoggingInfo, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : type, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : l2, (i & 32768) != 0 ? null : marketBusinessOnboardingParams);
    }
}
