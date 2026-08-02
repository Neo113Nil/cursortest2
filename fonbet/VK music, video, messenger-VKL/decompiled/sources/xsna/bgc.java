package xsna;

import android.content.Context;
import android.net.Uri;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.common.links.LaunchContext;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsBaseCatalogFragment;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogFragment;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ClassifiedsCatalogLinksHandler.kt */
/* loaded from: classes18.dex */
public final class bgc {
    public static boolean a(peq0 peq0Var) {
        String fragment;
        return (peq0Var.m(0, "/classifieds") || peq0Var.m(0, "/market")) && ((fragment = peq0Var.a.getFragment()) == null || fragment.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, LaunchContext launchContext, peq0 peq0Var) {
        ClassifiedsBaseCatalogFragment.a aVar;
        Double k;
        Double k2;
        Long n;
        Long n2;
        Integer m;
        ClassifiedsBaseCatalogFragment.a aVar2;
        Uri uri = peq0Var.a;
        String queryParameter = uri.getQueryParameter(CampaignEx.JSON_KEY_AD_Q);
        String queryParameter2 = uri.getQueryParameter("section");
        String queryParameter3 = uri.getQueryParameter("category_id");
        Integer m2 = queryParameter3 != null ? arm0.m(10, queryParameter3) : null;
        boolean z = false;
        boolean z2 = true;
        if (queryParameter == null || queryParameter.length() == 0) {
            if (epx.f(queryParameter2, "category") || m2 != null) {
                z = true;
                aVar = new ClassifiedsCatalogSimpleFragment.a();
            } else if (queryParameter2 == null || queryParameter2.length() == 0) {
                z2 = false;
                aVar = new ClassifiedsCatalogFragment.a();
            } else {
                aVar2 = new ClassifiedsCatalogSimpleFragment.a();
            }
            String uri2 = uri.toString();
            if (launchContext != null || (r0 = launchContext.u) == null) {
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.MARKETPLACE;
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = commonMarketStat$TypeRefSource;
            String queryParameter4 = uri.getQueryParameter("traffic_source");
            String queryParameter5 = uri.getQueryParameter("ad_campaign_id");
            MarketAnalyticsParams marketAnalyticsParams = new MarketAnalyticsParams(new MarketUtmData(queryParameter5 == null ? arm0.m(10, queryParameter5) : null, uri.getQueryParameter("ad_campaign"), uri.getQueryParameter("ad_campaign_source"), uri.getQueryParameter("ad_campaign_content"), uri.getQueryParameter("ad_campaign_medium"), uri.getQueryParameter("ad_campaign_term"), queryParameter4), null, commonMarketStat$TypeRefSource2, null, null, null, null, false, uri2, false, false, null, false, 7930, null);
            aVar.C(marketAnalyticsParams);
            if (z) {
                if (queryParameter2 != null) {
                    aVar.F(queryParameter2);
                }
                yfc yfcVar = aVar.m;
                if (m2 != null) {
                    yfcVar.a.putInt("KEY_CATEGORY_ID", m2.intValue());
                }
                String queryParameter6 = uri.getQueryParameter("catalog_context");
                if (queryParameter6 != null) {
                    aVar.D(queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("distance_max");
                if (queryParameter7 != null && (m = arm0.m(10, queryParameter7)) != null) {
                    yfcVar.a.putInt("KEY_DISTANCE_MAX", m.intValue());
                }
                String queryParameter8 = uri.getQueryParameter("price_min");
                if (queryParameter8 != null && (n2 = arm0.n(queryParameter8)) != null) {
                    yfcVar.a.putLong("KEY_PRICE_MIN", n2.longValue());
                }
                String queryParameter9 = uri.getQueryParameter("price_max");
                if (queryParameter9 != null && (n = arm0.n(queryParameter9)) != null) {
                    yfcVar.a.putLong("KEY_PRICE_MAX", n.longValue());
                }
                String queryParameter10 = uri.getQueryParameter("status_id");
                if (queryParameter10 != null) {
                    yfcVar.a.putString("KEY_STATUS_ID", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("sorting_option_id");
                if (queryParameter11 != null) {
                    yfcVar.a.putString("KEY_SORTING_OPTION_ID", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter(O6.s);
                if (queryParameter12 != null && (k2 = arm0.k(queryParameter12)) != null) {
                    yfcVar.a.putDouble("KEY_LATITUDE", k2.doubleValue());
                }
                String queryParameter13 = uri.getQueryParameter("long");
                if (queryParameter13 != null && (k = arm0.k(queryParameter13)) != null) {
                    yfcVar.a.putDouble("KEY_LONGITUDE", k.doubleValue());
                }
                String queryParameter14 = uri.getQueryParameter("location_title");
                if (queryParameter14 != null) {
                    yfcVar.a.putString("KEY_LOCATION_NAME", queryParameter14);
                }
            }
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = ((queryParameter != null || queryParameter.length() == 0) && !z2) ? (queryParameter2 != null || queryParameter2.length() == 0) ? MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_MAIN : MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SECTION : MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH;
            MarketUtmData marketUtmData = marketAnalyticsParams.b;
            mt00.f(uri2, mobileOfficialAppsCoreNavStat$EventScreen, new ywo(new zwo(marketUtmData == null ? marketUtmData.b : null, marketUtmData == null ? marketUtmData.c : null, marketUtmData == null ? marketUtmData.d : null, marketUtmData != null ? marketUtmData.e : null, marketUtmData == null ? marketUtmData.f : null, marketUtmData == null ? marketUtmData.g : null, marketUtmData == null ? marketUtmData.h : null), marketAnalyticsParams.d, marketAnalyticsParams.j));
            aVar.k(context);
        }
        ClassifiedsCatalogFragment.a aVar3 = new ClassifiedsCatalogFragment.a();
        aVar3.n.a.putString("KEY_SEARCH_QUERY", queryParameter);
        aVar2 = aVar3;
        z2 = false;
        z = true;
        aVar = aVar2;
        String uri22 = uri.toString();
        if (launchContext != null) {
        }
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource3 = CommonMarketStat$TypeRefSource.MARKETPLACE;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource22 = commonMarketStat$TypeRefSource3;
        String queryParameter42 = uri.getQueryParameter("traffic_source");
        String queryParameter52 = uri.getQueryParameter("ad_campaign_id");
        MarketAnalyticsParams marketAnalyticsParams2 = new MarketAnalyticsParams(new MarketUtmData(queryParameter52 == null ? arm0.m(10, queryParameter52) : null, uri.getQueryParameter("ad_campaign"), uri.getQueryParameter("ad_campaign_source"), uri.getQueryParameter("ad_campaign_content"), uri.getQueryParameter("ad_campaign_medium"), uri.getQueryParameter("ad_campaign_term"), queryParameter42), null, commonMarketStat$TypeRefSource22, null, null, null, null, false, uri22, false, false, null, false, 7930, null);
        aVar.C(marketAnalyticsParams2);
        if (z) {
        }
        if (queryParameter != null) {
        }
        MarketUtmData marketUtmData2 = marketAnalyticsParams2.b;
        if (marketUtmData2 == null) {
        }
        mt00.f(uri22, mobileOfficialAppsCoreNavStat$EventScreen, new ywo(new zwo(marketUtmData2 == null ? marketUtmData2.b : null, marketUtmData2 == null ? marketUtmData2.c : null, marketUtmData2 == null ? marketUtmData2.d : null, marketUtmData2 != null ? marketUtmData2.e : null, marketUtmData2 == null ? marketUtmData2.f : null, marketUtmData2 == null ? marketUtmData2.g : null, marketUtmData2 == null ? marketUtmData2.h : null), marketAnalyticsParams2.d, marketAnalyticsParams2.j));
        aVar.k(context);
    }
}
