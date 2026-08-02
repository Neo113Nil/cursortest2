package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowProductPin;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.LinkedHashSet;

/* compiled from: FeedGoodsAnalytics.kt */
/* loaded from: classes4.dex */
public final class zzq {
    public final LinkedHashSet a;
    public boolean b;
    public final a c;

    /* compiled from: FeedGoodsAnalytics.kt */
    public static final class a {
        public boolean a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("PhotoViewerConfig(goodsVisible="), this.a, ')');
        }

        public a(int i) {
            this.a = false;
        }
    }

    public zzq() {
        this(false);
    }

    public static void b(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint entryPoint, int i, long j, String str, Integer num, String str2) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(i), Long.valueOf(j), null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(entryPoint, num != null ? v11.b(1, num) : null, str2), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static final void d(int i, long j, SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, Integer num, String str) {
        MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin = new MobileOfficialAppsFeedStat$TypeFeedShowProductPin(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(i), Long.valueOf(j), null, str, null, 40, null), schemeStat$FeedPinEntryPoint, num != null ? v11.b(1, num) : null, null, 8, null);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        new iid0(c, SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, mobileOfficialAppsFeedStat$TypeFeedShowProductPin, 1)).q();
    }

    public final void a(SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, String str, Integer num, String str2) {
        this.a.clear();
        this.b = false;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a = false;
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, null, null, str, null, 46, null), new MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick(schemeStat$FeedPinEntryPoint, num != null ? v11.b(1, num) : null, str2), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public final void c(int i, long j, SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, Integer num, String str) {
        LinkedHashSet linkedHashSet = this.a;
        a aVar = this.c;
        if (aVar == null) {
            if (linkedHashSet.add(Integer.valueOf(i))) {
                d(i, j, schemeStat$FeedPinEntryPoint, num, str);
            }
        } else {
            if (linkedHashSet.contains(Integer.valueOf(i)) || !aVar.a) {
                return;
            }
            linkedHashSet.add(Integer.valueOf(i));
            d(i, j, schemeStat$FeedPinEntryPoint, num, str);
        }
    }

    public zzq(boolean z) {
        this.a = new LinkedHashSet();
        if (z) {
            this.c = new a(0);
        }
    }
}
