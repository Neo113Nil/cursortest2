package xsna;

import com.vk.api.generated.market.dto.MarketCatalogFilterDto;
import com.vk.api.generated.market.dto.MarketCatalogSortingDto;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class igr {
    public final MarketCatalogFilterDto a;
    public final MarketCatalogSortingDto b;
    public final String c;

    public igr(MarketCatalogFilterDto marketCatalogFilterDto, MarketCatalogSortingDto marketCatalogSortingDto, String str) {
        this.a = marketCatalogFilterDto;
        this.b = marketCatalogSortingDto;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igr)) {
            return false;
        }
        igr igrVar = (igr) obj;
        return epx.f(this.a, igrVar.a) && epx.f(this.b, igrVar.b) && epx.f(this.c, igrVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FiltersStateData(filters=");
        sb.append(this.a);
        sb.append(", sorting=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
