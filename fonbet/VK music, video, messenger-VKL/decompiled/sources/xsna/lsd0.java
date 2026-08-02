package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeAddItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeAddItemToCart;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ksd0;

/* compiled from: ProductTileCtaButtonDelegateImpl.kt */
/* loaded from: classes18.dex */
public final class lsd0 implements ksd0 {
    public final fy9 a;
    public final kz00 b;
    public final fy00 c;
    public final qdz d;
    public final yd10 e;
    public final sz00 f;
    public final sv9 g;

    /* compiled from: ProductTileCtaButtonDelegateImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductTileCtaButtonType.values().length];
            try {
                iArr[ProductTileCtaButtonType.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTileCtaButtonType.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductTileCtaButtonType.CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductTileCtaButtonType.ADD_TO_CART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductTileCtaButtonType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductTileCtaButtonType.SIMILAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductTileCtaButtonType.GO_TO_CART.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductTileCtaButtonType.PARTNER_LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lsd0(fy9 fy9Var, kz00 kz00Var, fy00 fy00Var, qdz qdzVar, yd10 yd10Var, nw00 nw00Var, sz00 sz00Var, sv9 sv9Var) {
        this.a = fy9Var;
        this.b = kz00Var;
        this.c = fy00Var;
        this.d = qdzVar;
        this.e = yd10Var;
        this.f = sz00Var;
        this.g = sv9Var;
    }

    public static void e(ksd0.c cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        SearchStatsLoggingInfo searchStatsLoggingInfo = cVar.g.c;
        if (searchStatsLoggingInfo != null) {
            SchemeStat$TypeClick Ab = searchStatsLoggingInfo.Ab(action, searchStatsLoggingInfo.f);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, Ab, uzp0Var.a).q();
        }
    }

    @Override // xsna.ksd0
    public final void a(Context context, ksd0.c cVar) {
        ksd0.c.b bVar = cVar.e;
        ksd0.b bVar2 = cVar.c;
        ksd0.c.a aVar = cVar.g;
        switch (a.$EnumSwitchMapping$0[cVar.b.ordinal()]) {
            case 1:
                return;
            case 2:
                UserId userId = bVar.b;
                if (userId == null || !fkq0.c(userId)) {
                    return;
                }
                d(cVar, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER, aVar.b);
                e(cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE);
                c(context, cVar);
                return;
            case 3:
                d(cVar, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK, aVar.b);
                e(cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL);
                String str = bVar.a;
                if (str != null) {
                    this.b.b(context, new jz00(str, bVar2.e, bVar2.f, bVar.e, bVar.c, bVar.d, bVar.b, new f55(this, context, cVar)));
                    return;
                }
                return;
            case 4:
                d(cVar, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART, aVar.b);
                UserId userId2 = bVar2.b;
                long j = bVar2.a;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = aVar.a;
                CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem = CommonMarketStat$TypeEventTypeAddItem.ADD_ITEM;
                iid0 iid0Var = new iid0();
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                UiTrackingScreen b = UiTracker.j.b();
                SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, new MobileOfficialAppsMarketStat$TypeAddItemToCart(userId2.b, commonMarketStat$TypeEventTypeAddItem, Integer.valueOf((int) j), commonMarketStat$TypeRefSource), 1);
                iid0Var.f = c;
                iid0Var.g = b2;
                iid0Var.q();
                e(cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_CART);
                hg1.b(cVar.a, hg1.n(rsg0.w0(yfb.x(this.e.a(fkq0.a(bVar2.b), (int) j, 1, null, null, null))), context, false, null, 62).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new s520(new zo8(this, bVar2, cVar.h, 8), 12), new amt(new pm90(4, this, context), 24)));
                return;
            case 5:
                b(context, cVar);
                return;
            case 6:
                Integer num = cVar.f;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = aVar.a;
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                UiTrackingScreen b3 = UiTracker.j.b();
                SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(schemeStat$EventItem, num, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b3 != null ? b3.a : null, commonMarketStat$TypeRefSource2, null, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem(num), 57));
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c2, a2, uzp0Var.a).q();
                e(cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_SAME);
                String str2 = cVar.d;
                if (str2 != null) {
                    maz.c(this.d.e(), context, str2, LaunchContext.A, null, null, 24);
                    return;
                }
                return;
            case 7:
                e(cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_CART);
                fy9.a(this.a, context, bVar2.b, null, aVar.a, 4);
                return;
            case 8:
                b(context, cVar);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void b(Context context, ksd0.c cVar) {
        d(cVar, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK, cVar.g.b);
        e(cVar, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_LINK);
        String str = cVar.d;
        if (str != null) {
            maz.c(this.d.e(), context, str, LaunchContext.A, null, null, 24);
        }
    }

    public final void c(Context context, ksd0.c cVar) {
        ksd0.c.b bVar = cVar.e;
        UserId userId = bVar.b;
        if (userId != null) {
            String str = bVar.f;
            if (str == null) {
                str = cVar.i ? context.getString(R.string.market_services_chat_greetings) : context.getString(R.string.market_write_to_owner_text);
            }
            String str2 = str;
            ksd0.b bVar2 = cVar.c;
            this.f.a(context, new j910(bVar2.b, userId, str2, bVar2.a, bVar2.g, bVar2.h, bVar2.i));
        }
    }

    public final void d(ksd0.c cVar, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType, String str) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        ksd0.b bVar = cVar.c;
        long j = bVar.a;
        UserId userId = bVar.b;
        String str2 = bVar.c;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = cVar.g.a;
        UiTrackingScreen b = UiTracker.j.b();
        if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        nw00.a(new MarketCtaButtonAnalyticsParams(eventType, j, userId, str2, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, null, cVar.f, null, null, null, null, str, null, null, null, null, null, null, null, null, 2092864, null));
    }
}
