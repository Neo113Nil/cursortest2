package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.products_multipicker.api.MarketMultiPickerSource;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemPicker;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: MarketMultiPickerAnalytics.kt */
/* loaded from: classes18.dex */
public final class a810 {
    public final Integer a;
    public final CommonMarketStat$TypeRefSource b;

    /* compiled from: MarketMultiPickerAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketMultiPickerSource.values().length];
            try {
                iArr[MarketMultiPickerSource.CLIP_POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketMultiPickerSource.POSTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a810(Integer num, MarketMultiPickerSource marketMultiPickerSource) {
        this.a = num;
        int i = marketMultiPickerSource == null ? -1 : a.$EnumSwitchMapping$0[marketMultiPickerSource.ordinal()];
        this.b = i != 1 ? i != 2 ? null : CommonMarketStat$TypeRefSource.POST : CommonMarketStat$TypeRefSource.CLIPS;
    }

    public final void a(Long l, Long l2, boolean z) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEMS_MULTIPICKER;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketItemPicker(CommonMarketStat$TypeMarketItemPicker.EventName.VIEW_PRODUCT_TAB, l2, z ? CommonMarketStat$TypeMarketItemPicker.TabName.COMMUNITY : CommonMarketStat$TypeMarketItemPicker.TabName.BOOKMARKS, l, this.a, this.b), 63), 2);
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
    }
}
