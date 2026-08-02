package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketViewItemItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Locale;
import xsna.hzp0;

/* compiled from: MarketAnalyticsFacade.kt */
/* loaded from: classes18.dex */
public final class mt00 {

    /* compiled from: MarketAnalyticsFacade.kt */
    public static final class a {
        public final int a;
        public final UserId b;
        public final boolean c;
        public final CommonMarketStat$TypeRefSource d;
        public final Long e;
        public final String f;
        public final Integer g;
        public final Integer h;
        public final Long i;
        public final MobileOfficialAppsMarketStat$ReferrerItemType j;
        public final String k;

        public a(int i, UserId userId, boolean z, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Long l, Integer num, Integer num2, Long l2, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, int i2) {
            l = (i2 & 16) != 0 ? null : l;
            num = (i2 & 64) != 0 ? null : num;
            num2 = (i2 & 128) != 0 ? null : num2;
            l2 = (i2 & 256) != 0 ? null : l2;
            mobileOfficialAppsMarketStat$ReferrerItemType = (i2 & 512) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType;
            str = (i2 & 1024) != 0 ? null : str;
            this.a = i;
            this.b = userId;
            this.c = z;
            this.d = commonMarketStat$TypeRefSource;
            this.e = l;
            this.f = null;
            this.g = num;
            this.h = num2;
            this.i = l2;
            this.j = mobileOfficialAppsMarketStat$ReferrerItemType;
            this.k = str;
        }
    }

    /* compiled from: MarketAnalyticsFacade.kt */
    public static final class b {
        public final Integer a;
        public final Long b;
        public final CommonMarketStat$TypeRefSource c;
        public final Long d;
        public final Integer e;
        public final String f;
        public final Integer g;
        public final Long h;
        public final MobileOfficialAppsMarketStat$ReferrerItemType i;
        public final String j;
        public final CommonMarketStat$TypeMarketContextContent.Type k;
        public final Integer l;
        public final Long m;
        public final String n;
        public final String o;
        public final Integer p;
        public final Long q;
        public final CommonMarketStat$TypeMarketContextContent.Type r;

        public b(Integer num, Long l, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Long l2, Integer num2, String str, Integer num3, Long l3, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str2, CommonMarketStat$TypeMarketContextContent.Type type, Integer num4, Long l4, String str3, String str4, Integer num5, Long l5, CommonMarketStat$TypeMarketContextContent.Type type2) {
            this.a = num;
            this.b = l;
            this.c = commonMarketStat$TypeRefSource;
            this.d = l2;
            this.e = num2;
            this.f = str;
            this.g = num3;
            this.h = l3;
            this.i = mobileOfficialAppsMarketStat$ReferrerItemType;
            this.j = str2;
            this.k = type;
            this.l = num4;
            this.m = l4;
            this.n = str3;
            this.o = str4;
            this.p = num5;
            this.q = l5;
            this.r = type2;
        }
    }

    /* compiled from: MarketAnalyticsFacade.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsCoreNavStat$EventScreen.values().length];
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static MobileOfficialAppsCoreNavStat$EventScreen a(String str) {
        try {
            return MobileOfficialAppsCoreNavStat$EventScreen.valueOf(str.toUpperCase(Locale.getDefault()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static CommonMarketStat$TypeMarketOrdersItem.Source b(String str) {
        try {
            return CommonMarketStat$TypeMarketOrdersItem.Source.valueOf(str.toUpperCase(Locale.getDefault()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static CommonMarketStat$TypeRefSource c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return CommonMarketStat$TypeRefSource.valueOf(str.toUpperCase(Locale.getDefault()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d(Long l, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Long l3, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, Long l4, String str, Integer num2, Long l5, CommonMarketStat$TypeMarketContextContent.Type type, Integer num3, Long l6, CommonMarketStat$TypeMarketContextContent.Type type2, int i) {
        Integer num4 = (i & 4) != 0 ? null : num;
        Long l7 = (i & 32) != 0 ? null : l3;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType2 = (i & 64) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType;
        Long l8 = (i & 128) != 0 ? null : l4;
        String str2 = (i & 256) != 0 ? null : str;
        Integer num5 = (i & 512) != 0 ? null : num2;
        Long l9 = (i & 1024) != 0 ? null : l5;
        CommonMarketStat$TypeMarketContextContent.Type type3 = (i & 2048) != 0 ? null : type;
        Integer num6 = (i & 4096) != 0 ? null : num3;
        Long l10 = (i & 8192) != 0 ? null : l6;
        CommonMarketStat$TypeMarketContextContent.Type type4 = (i & 16384) != 0 ? null : type2;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, l, l2, null, str2, null, 40, null);
        UiTrackingScreen b2 = UiTracker.j.b();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b2 != null ? b2.a : null;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(mobileOfficialAppsCoreNavStat$EventScreen2, commonMarketStat$TypeRefSource, null, new MobileOfficialAppsMarketStat$TypeMarketViewItemItem(valueOf, l2, null, num4 != null ? v11.b(1, num4) : null, l7 != null ? Integer.valueOf((int) l7.longValue()) : null, l8, mobileOfficialAppsMarketStat$ReferrerItemType2, null, new CommonMarketStat$TypeMarketContextContent(type3, num5, l9), new CommonMarketStat$TypeMarketContextContent(type4, num6, l10), 128, null), 24), null).a();
    }

    public static void e(String str, String str2, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKETPLACE_SEARCH, null, null, null, str2, null, 46, null);
        UiTrackingScreen b2 = UiTracker.j.b();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b2 != null ? b2.a : null;
        if (commonMarketStat$TypeRefSource == null) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.MARKETPLACE;
        }
        new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, null, new MobileOfficialAppsMarketStat$TypeMarketplaceSearchViewItem(str2 == null ? "" : str2, str), 24), null).a();
    }

    public static void f(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, ywo ywoVar) {
        String name;
        zwo zwoVar = (zwo) ywoVar.a;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        if (c2 == MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_MAIN || c2 == MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SECTION || c2 == MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH) {
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, str, null, null, 32, null);
        String str2 = (String) ywoVar.c;
        Integer num = zwoVar.a;
        String str3 = zwoVar.b;
        String str4 = zwoVar.c;
        String str5 = zwoVar.e;
        String str6 = zwoVar.f;
        String str7 = zwoVar.d;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) ywoVar.b;
        new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(mobileOfficialAppsCoreNavStat$EventScreen, null, str2, new MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem((commonMarketStat$TypeRefSource == null || (name = commonMarketStat$TypeRefSource.name()) == null) ? null : name.toLowerCase(Locale.ROOT), zwoVar.g, num, str3, str4, str5, str6, str7), 22), null).a();
    }

    public static void g(Long l, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, l, null, str, null, 40, null);
        UiTrackingScreen b2 = UiTracker.j.b();
        SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource, null, null, new com.vk.stat.scheme.g0(), 41), 2);
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b3, uzp0Var.a).q();
    }

    public static void h(a aVar) {
        Integer num = aVar.g;
        UserId userId = aVar.b;
        int i = aVar.a;
        if (aVar.c) {
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, aVar.k, null, 46, null);
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = aVar.d;
            MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem = new MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem(Integer.valueOf(i), Long.valueOf(userId.b), aVar.f, aVar.e, num != null ? v11.b(1, num) : null, aVar.h, aVar.i, aVar.j, null);
            UiTrackingScreen b2 = UiTracker.j.b();
            SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource, null, null, mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem, 56), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b3, uzp0Var.a).q();
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, aVar.k, null, 46, null);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = aVar.d;
        long j = userId.b;
        MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem = new MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem(Integer.valueOf(i), Long.valueOf(j), aVar.f, aVar.e, num != null ? v11.b(1, num) : null, aVar.h, aVar.i, aVar.j, null);
        UiTrackingScreen b4 = UiTracker.j.b();
        SchemeStat$TypeClick b5 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b4 != null ? b4.a : null, commonMarketStat$TypeRefSource2, null, null, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem, 56), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c3, b5, uzp0Var2.a).q();
    }

    public static void i(b bVar) {
        Integer num = bVar.e;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = bVar.c;
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen uiTrackingScreen = t1q0Var.b;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen != null ? uiTrackingScreen.a : null;
        int i = mobileOfficialAppsCoreNavStat$EventScreen == null ? -1 : c.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return;
        }
        if (i == 4 && commonMarketStat$TypeRefSource == CommonMarketStat$TypeRefSource.MARKETPLACE) {
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, bVar.f, null, 46, null);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = bVar.c;
        UiTrackingScreen b2 = t1q0Var.b();
        SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(schemeStat$EventItem, num, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource2, null, bVar.j, new MobileOfficialAppsMarketStat$TypeMarketTransitionToItemItem(bVar.a, bVar.b, bVar.d, num != null ? v11.b(1, num) : null, bVar.g, bVar.h, bVar.i, null, new CommonMarketStat$TypeMarketContextContent(bVar.k, bVar.l, bVar.m), new CommonMarketStat$TypeMarketContextContent(bVar.r, bVar.p, bVar.q), new CommonMarketStat$TypeAdCampaign(null, bVar.n, null, null, null, bVar.o, 29, null), 128, null), 40));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, a2, uzp0Var.a).q();
    }

    public static void j(Long l, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeMarketOrdersItem.Source source) {
        SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null), null, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, null, null, mobileOfficialAppsCoreNavStat$EventScreen, null, new CommonMarketStat$TypeMarketOrdersItem(CommonMarketStat$TypeMarketOrdersItem.EventName.TRANSITION_TO_ORDERS_LIST, source, l, null), 32));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, a2, uzp0Var.a).q();
    }
}
