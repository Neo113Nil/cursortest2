package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPaginationInProductTile;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;
import xsna.ksd0;

/* compiled from: ClassifiedsCatalogClickDelegate.kt */
/* loaded from: classes16.dex */
public final class zfc {
    public final b5a a;
    public final ksd0 b;
    public final Context c;
    public final MarketAnalyticsParams d;
    public final sz00 e;
    public final izs<hwh0, SearchStatsLoggingInfo> f;
    public final gzs<CommonMarketStat$TypeRefSource> g;
    public final q9h h;
    public final rml0 i;
    public final d9a j;

    public /* synthetic */ zfc(b5a b5aVar, q3a q3aVar, ksd0 ksd0Var, Activity activity, MarketAnalyticsParams marketAnalyticsParams, sz00 sz00Var, tm0 tm0Var, q9h q9hVar, rml0 rml0Var, int i) {
        this(b5aVar, q3aVar, ksd0Var, activity, marketAnalyticsParams, sz00Var, (i & 64) != 0 ? null : tm0Var, (wqf) null, q9hVar, rml0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l3a l3aVar) {
        CallProducerButton callProducerButton;
        ksd0 ksd0Var;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        CommonMarketStat$TypeRefSource invoke;
        MarketUtmData marketUtmData;
        String str;
        Object obj;
        CommonMarketStat$TypeRefSource invoke2;
        boolean z = l3aVar instanceof tu00;
        izs<hwh0, SearchStatsLoggingInfo> izsVar = this.f;
        gzs<CommonMarketStat$TypeRefSource> gzsVar = this.g;
        b5a b5aVar = this.a;
        Context context = this.c;
        MarketAnalyticsParams marketAnalyticsParams = this.d;
        if (z) {
            tu00 tu00Var = (tu00) l3aVar;
            UIBlock uIBlock = tu00Var.a;
            Integer num = tu00Var.c;
            Good good = tu00Var.b;
            String a = cqm0.a(((dfp0) uIBlock).r());
            if (a == null) {
                a = good.d0;
            }
            String str2 = a;
            if (uIBlock instanceof UIBlockMarketItem) {
                obj = new UIBlockMarketItem.a(good, str2, num);
                str = str2;
            } else if (uIBlock instanceof UIBlockMarketGroupInfoItem) {
                UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = (UIBlockMarketGroupInfoItem) uIBlock;
                CatalogLink catalogLink = (CatalogLink) j5g.b0(num.intValue(), uIBlockMarketGroupInfoItem.y.e);
                String str3 = catalogLink != null ? catalogLink.e : null;
                if (str3 == null) {
                    str3 = "";
                }
                str = str2;
                obj = new UIBlockMarketGroupInfoItem.a(uIBlockMarketGroupInfoItem.z.c.b, tu00Var.b, str3, str);
            } else {
                str = str2;
                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException(String.valueOf(uIBlock)));
                obj = null;
            }
            if (obj != null) {
                b5aVar.a(new cfp0(uIBlock, obj));
            }
            if (marketAnalyticsParams == null || (invoke2 = marketAnalyticsParams.d) == null) {
                invoke2 = gzsVar != null ? gzsVar.invoke() : CommonMarketStat$TypeRefSource.MARKETPLACE;
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = invoke2;
            Good good2 = tu00Var.b;
            Integer num2 = marketAnalyticsParams != null ? marketAnalyticsParams.e : null;
            Long l = marketAnalyticsParams != null ? marketAnalyticsParams.f : null;
            MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = marketAnalyticsParams != null ? marketAnalyticsParams.g : null;
            Integer num3 = tu00Var.c;
            this.e.e(context, new rz00(good2, commonMarketStat$TypeRefSource2, str, num3, izsVar != null ? izsVar.invoke(new hwh0(uIBlock, num3)) : null, num2, l, mobileOfficialAppsMarketStat$ReferrerItemType, null, null, marketAnalyticsParams != null ? marketAnalyticsParams.j : null, null, null, null, null, null, 64256));
            return;
        }
        if (l3aVar instanceof ru00) {
            UIBlock uIBlock2 = ((ru00) l3aVar).a;
            if (uIBlock2 instanceof UIBlockMarketGroupInfoItem) {
                UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem2 = (UIBlockMarketGroupInfoItem) uIBlock2;
                UserId userId = uIBlockMarketGroupInfoItem2.z.c;
                b5aVar.a(new cfp0(uIBlock2, new UIBlockMarketGroupInfoItem.a(userId.b, null, null, uIBlockMarketGroupInfoItem2.B)));
                rml0.a(this.i, context, fkq0.e(userId), new MarketAnalyticsParams(new MarketUtmData(null, null, null, null, null, null, "marketplace", 56, null), null, null, null, null, null, null, false, null, false, false, null, false, 8190, null), 24);
                return;
            }
            return;
        }
        if (l3aVar instanceof vu00) {
            vu00 vu00Var = (vu00) l3aVar;
            if (marketAnalyticsParams == null || (invoke = marketAnalyticsParams.d) == null) {
                invoke = gzsVar != null ? gzsVar.invoke() : CommonMarketStat$TypeRefSource.MARKETPLACE;
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource3 = invoke;
            long j = vu00Var.a;
            UserId userId2 = vu00Var.b;
            String str4 = (marketAnalyticsParams == null || (marketUtmData = marketAnalyticsParams.b) == null) ? null : marketUtmData.h;
            int i = vu00Var.c;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(userId2.b), null, null, null, 56, null);
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource3, null, null, new CommonMarketStat$TypeMarketPaginationInProductTile(Integer.valueOf(i + 1), str4), 57), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            return;
        }
        if (!(l3aVar instanceof uu00)) {
            if (l3aVar instanceof su00) {
                this.h.b(context, ((su00) l3aVar).a);
                return;
            }
            return;
        }
        uu00 uu00Var = (uu00) l3aVar;
        Good good3 = uu00Var.b;
        View view = uu00Var.a;
        Integer num4 = uu00Var.d;
        UIBlock uIBlock3 = uu00Var.c;
        List<CallProducerButton> list = good3.n0;
        if (list == null || (callProducerButton = (CallProducerButton) j5g.a0(list)) == null || (ksd0Var = this.b) == null) {
            return;
        }
        ProductTileCtaButtonType.a aVar = ProductTileCtaButtonType.Companion;
        int i2 = callProducerButton.b;
        aVar.getClass();
        ProductTileCtaButtonType a2 = ProductTileCtaButtonType.a.a(i2);
        ksd0.b a3 = msd0.a(good3);
        String str5 = callProducerButton.k;
        String str6 = callProducerButton.d;
        UserId userId3 = callProducerButton.i;
        InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
        String str7 = inaccessibilityMessage != null ? inaccessibilityMessage.b : null;
        String str8 = inaccessibilityMessage != null ? inaccessibilityMessage.c : null;
        Boolean bool = callProducerButton.f;
        ksd0.c.b bVar = new ksd0.c.b(userId3, str6, str7, str8, callProducerButton.l, bool != null ? bool.booleanValue() : true);
        if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource = marketAnalyticsParams.d) == null) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.MARKETPLACE;
        }
        ksd0Var.a(context, new ksd0.c(view, a2, a3, str5, bVar, num4, new ksd0.c.a(commonMarketStat$TypeRefSource, marketAnalyticsParams != null ? marketAnalyticsParams.j : null, izsVar != null ? izsVar.invoke(new hwh0(uIBlock3, num4)) : null), new fh1(7, this, good3), false));
    }

    public zfc(b5a b5aVar, q3a q3aVar, ksd0 ksd0Var, Context context, MarketAnalyticsParams marketAnalyticsParams, sz00 sz00Var, izs izsVar, wqf wqfVar, q9h q9hVar, rml0 rml0Var) {
        this.a = b5aVar;
        this.b = ksd0Var;
        this.c = context;
        this.d = marketAnalyticsParams;
        this.e = sz00Var;
        this.f = izsVar;
        this.g = wqfVar;
        this.h = q9hVar;
        this.i = rml0Var;
        this.j = new d9a(q3aVar);
    }
}
