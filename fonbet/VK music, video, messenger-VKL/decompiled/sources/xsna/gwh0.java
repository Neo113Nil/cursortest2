package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: SearchMarketOutAnalyticsDelegate.kt */
/* loaded from: classes18.dex */
public final class gwh0 {
    public SearchStatsLoggingInfo a;

    /* compiled from: SearchMarketOutAnalyticsDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.values().length];
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_TO_CART_HS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK_2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK_2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gwh0() {
        this(null);
    }

    public final void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        if (searchStatsLoggingInfo != null) {
            SchemeStat$TypeClick Ab = searchStatsLoggingInfo.Ab(action, searchStatsLoggingInfo.f);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, Ab, uzp0Var.a).q();
        }
    }

    public gwh0(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }
}
