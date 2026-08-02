package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: MarketTransitionAnalytics.kt */
/* loaded from: classes18.dex */
public final class bf10 {

    /* compiled from: MarketTransitionAnalytics.kt */
    public static final class a {
        public final Long a;
        public final UserId b;
        public final String c;
        public final CommonMarketStat$TypeRefSource d;
        public final MobileOfficialAppsCoreNavStat$EventScreen e;
        public final Integer f;
        public final Long g;
        public final MobileOfficialAppsMarketStat$ReferrerItemType h;

        public a(Long l, UserId userId, String str, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, Long l2, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType) {
            this.a = l;
            this.b = userId;
            this.c = str;
            this.d = commonMarketStat$TypeRefSource;
            this.e = mobileOfficialAppsCoreNavStat$EventScreen;
            this.f = num;
            this.g = l2;
            this.h = mobileOfficialAppsMarketStat$ReferrerItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h;
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            UserId userId = this.b;
            int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
            int hashCode4 = (hashCode3 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.e;
            int hashCode5 = (hashCode4 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
            Integer num = this.f;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Long l2 = this.g;
            int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
            MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.h;
            return hashCode7 + (mobileOfficialAppsMarketStat$ReferrerItemType != null ? mobileOfficialAppsMarketStat$ReferrerItemType.hashCode() : 0);
        }

        public final String toString() {
            return "Params(goodId=" + this.a + ", ownerId=" + this.b + ", trackCode=" + this.c + ", refSource=" + this.d + ", previousScreen=" + this.e + ", referrerItemId=" + this.f + ", referrerOwnerId=" + this.g + ", referrerItemType=" + this.h + ')';
        }
    }

    public static void a(a aVar) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
        Long l = aVar.a;
        UserId userId = aVar.b;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, l, userId != null ? Long.valueOf(userId.b) : null, null, aVar.c, null, 40, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, aVar.e, aVar.d, null, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(aVar.f, userId != null ? Long.valueOf(userId.b) : null, aVar.h, null, null, 24, null), 40), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
