package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.discover.carousel.products.ProductCarouselPromoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeMarketCarouselClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAliexpressBlockCarouselViewItem;
import com.vk.stat.scheme.SchemeStat$TypeAliexpressPromoViewItem;
import com.vk.stat.scheme.SchemeStat$TypeAliexpressView;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.hzp0;

/* compiled from: AnalyticsFacade.kt */
/* loaded from: classes18.dex */
public final class zx1 {
    public static void a(ProductCarousel productCarousel) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLICK_ITEM;
        String str = productCarousel.l;
        if (str == null) {
            str = "";
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, 0L, productCarousel.r, str, null, 34, null), new MobileOfficialAppsFeedStat$TypeMarketCarouselClick(MobileOfficialAppsFeedStat$TypeMarketCarouselClick.Type.BLOCK_CAROUSEL_CLICK, new MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem(MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem.Type.SHOW_ALL_CLICK), null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void b(ProductCarouselItem productCarouselItem) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLICK_ITEM;
        String str = productCarouselItem.o;
        if (str == null) {
            str = "";
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, 0L, productCarouselItem.k, str, null, 34, null), new MobileOfficialAppsFeedStat$TypeMarketCarouselClick(MobileOfficialAppsFeedStat$TypeMarketCarouselClick.Type.BLOCK_CAROUSEL_CLICK, new MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem(MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem.Type.ITEM_CLICK), null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void c(ProductCarouselPromoItem productCarouselPromoItem) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        Integer num = productCarouselPromoItem.h;
        int intValue = num != null ? num.intValue() : -1;
        String str = productCarouselPromoItem.i;
        if (str == null) {
            str = "";
        }
        new hzp0.a(schemeStat$EventItem, intValue, new SchemeStat$TypeAliexpressView(SchemeStat$TypeAliexpressView.Type.BLOCK_CAROUSEL_VIEW, new SchemeStat$TypeAliexpressBlockCarouselViewItem(SchemeStat$TypeAliexpressBlockCarouselViewItem.Type.PROMO_VIEW, str, null, new SchemeStat$TypeAliexpressPromoViewItem(null, null, 3, null), 4, null), null)).a();
    }
}
