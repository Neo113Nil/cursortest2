package xsna;

import com.vk.dto.market.catalog.CatalogMarketFilter;

/* compiled from: MarketCatalogEvents.kt */
/* loaded from: classes16.dex */
public final class mu00 extends lu00 {
    public final String b;
    public final CatalogMarketFilter c;

    public mu00(String str, CatalogMarketFilter catalogMarketFilter) {
        super(str);
        this.b = str;
        this.c = catalogMarketFilter;
    }

    @Override // xsna.lu00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu00)) {
            return false;
        }
        mu00 mu00Var = (mu00) obj;
        return epx.f(this.b, mu00Var.b) && epx.f(this.c, mu00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CatalogMarketFilter catalogMarketFilter = this.c;
        return hashCode + (catalogMarketFilter == null ? 0 : catalogMarketFilter.hashCode());
    }

    public final String toString() {
        return "MarketCatalogActionChangeFilter(entryPointToken=" + this.b + ", newFilter=" + this.c + ')';
    }
}
