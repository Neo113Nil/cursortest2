package xsna;

import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeGameCatalogItem;

/* compiled from: NavigationAnalyticsModel.kt */
/* loaded from: classes17.dex */
public final class nw50 {
    public final SchemeStat$TypeGameCatalogItem a;
    public final SchemeStat$EventItem b;

    public nw50(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem) {
        this.a = schemeStat$TypeGameCatalogItem;
        this.b = schemeStat$EventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw50)) {
            return false;
        }
        nw50 nw50Var = (nw50) obj;
        return epx.f(this.a, nw50Var.a) && epx.f(this.b, nw50Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.b;
        return hashCode + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode());
    }

    public final String toString() {
        return "NavigationAnalyticsModel(screenInfo=" + this.a + ", eventItem=" + this.b + ')';
    }
}
