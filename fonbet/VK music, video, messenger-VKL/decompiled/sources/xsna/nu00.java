package xsna;

import com.vk.dto.market.catalog.CatalogMarketSorting;

/* compiled from: MarketCatalogEvents.kt */
/* loaded from: classes16.dex */
public final class nu00 extends lu00 {
    public final String b;
    public final CatalogMarketSorting c;

    public nu00(String str, CatalogMarketSorting catalogMarketSorting) {
        super(str);
        this.b = str;
        this.c = catalogMarketSorting;
    }

    @Override // xsna.lu00
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu00)) {
            return false;
        }
        nu00 nu00Var = (nu00) obj;
        return epx.f(this.b, nu00Var.b) && epx.f(this.c, nu00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CatalogMarketSorting catalogMarketSorting = this.c;
        return hashCode + (catalogMarketSorting == null ? 0 : catalogMarketSorting.hashCode());
    }

    public final String toString() {
        return "MarketCatalogActionChangeSorting(entryPointToken=" + this.b + ", newSorting=" + this.c + ')';
    }
}
