package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: MyTrackerScreen.kt */
/* loaded from: classes3.dex */
public final class mt50 {
    public final MobileOfficialAppsCoreNavStat$EventScreen a;
    public final SchemeStat$EventItem b;

    public mt50(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
        this.b = schemeStat$EventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt50)) {
            return false;
        }
        mt50 mt50Var = (mt50) obj;
        return this.a == mt50Var.a && epx.f(this.b, mt50Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.b;
        return hashCode + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode());
    }

    public final String toString() {
        return "MyTrackerScreen(statScreen=" + this.a + ", statItem=" + this.b + ')';
    }
}
