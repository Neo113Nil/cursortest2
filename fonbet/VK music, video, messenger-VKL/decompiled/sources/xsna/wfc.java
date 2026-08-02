package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClassifiedsCatalogAnalyticsFacade.kt */
/* loaded from: classes18.dex */
public final class wfc {
    public static final CommonMarketStat$TypeRefSource a = CommonMarketStat$TypeRefSource.MARKETPLACE;

    /* compiled from: ClassifiedsCatalogAnalyticsFacade.kt */
    public static final class a {
        public final Long a;
        public final Long b;
        public final String c;
        public final String d;
        public final String e;
        public final Integer f;
        public final CommonMarketStat$TypeRefSource g;
        public final String h;

        public a() {
            this(null, null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.b;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.g;
            int hashCode7 = (hashCode6 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
            String str4 = this.h;
            return hashCode7 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TypeMarketGoodClickEventParams(id=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", blockId=");
            sb.append(this.c);
            sb.append(", url=");
            sb.append(this.d);
            sb.append(", trackCode=");
            sb.append(this.e);
            sb.append(", position=");
            sb.append(this.f);
            sb.append(", refSource=");
            sb.append(this.g);
            sb.append(", sourceUrl=");
            return ho8.a(sb, this.h, ')');
        }

        public a(Long l, Long l2, String str, String str2, String str3, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str4) {
            this.a = l;
            this.b = l2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = num;
            this.g = commonMarketStat$TypeRefSource;
            this.h = str4;
        }
    }

    public static CommonMarketStat$TypeAdCampaign a(MarketAnalyticsParams marketAnalyticsParams) {
        MarketUtmData marketUtmData;
        MarketUtmData marketUtmData2;
        MarketUtmData marketUtmData3;
        MarketUtmData marketUtmData4;
        MarketUtmData marketUtmData5;
        MarketUtmData marketUtmData6;
        String str = null;
        Integer num = (marketAnalyticsParams == null || (marketUtmData6 = marketAnalyticsParams.b) == null) ? null : marketUtmData6.b;
        String str2 = (marketAnalyticsParams == null || (marketUtmData5 = marketAnalyticsParams.b) == null) ? null : marketUtmData5.c;
        String str3 = (marketAnalyticsParams == null || (marketUtmData4 = marketAnalyticsParams.b) == null) ? null : marketUtmData4.d;
        String str4 = (marketAnalyticsParams == null || (marketUtmData3 = marketAnalyticsParams.b) == null) ? null : marketUtmData3.f;
        String str5 = (marketAnalyticsParams == null || (marketUtmData2 = marketAnalyticsParams.b) == null) ? null : marketUtmData2.g;
        if (marketAnalyticsParams != null && (marketUtmData = marketAnalyticsParams.b) != null) {
            str = marketUtmData.e;
        }
        return new CommonMarketStat$TypeAdCampaign(num, str2, str3, str4, str5, str);
    }

    public static void b(String str, MobileOfficialAppsMarketStat$TypeMarketClick.b bVar) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, a, null, str, bVar, 41), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    public static void c(a aVar) {
        Integer num = aVar.f;
        if (aVar.g == a) {
            t1q0 t1q0Var = UiTracker.j;
            UiTrackingScreen uiTrackingScreen = t1q0Var.b;
            if ((uiTrackingScreen != null ? uiTrackingScreen.a : null) == MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_SIMILAR) {
                return;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, aVar.a, aVar.b, aVar.d, aVar.e, null, 32, null);
            UiTrackingScreen b = t1q0Var.b();
            SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(schemeStat$EventItem, num, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b != null ? b.a : null, null, null, aVar.h, new MobileOfficialAppsMarketStat$TypeMarketplaceItemClickItem(aVar.c, num != null ? v11.b(1, num) : null), 44));
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, a2, uzp0Var.a).q();
        }
    }
}
