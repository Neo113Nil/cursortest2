package xsna;

import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import java.util.List;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class wzk0 extends vcr<CatalogMarketStatusOption> {
    public final String e;
    public CatalogMarketStatusOption f;
    public final CatalogMarketStatusOption g;
    public final List<CatalogMarketStatusOption> h;

    public wzk0(String str, CatalogMarketStatusOption catalogMarketStatusOption, CatalogMarketStatusOption catalogMarketStatusOption2, List<CatalogMarketStatusOption> list) {
        super(9, catalogMarketStatusOption, catalogMarketStatusOption2);
        this.e = str;
        this.f = catalogMarketStatusOption;
        this.g = catalogMarketStatusOption2;
        this.h = list;
    }

    @Override // xsna.vcr
    public final CatalogMarketStatusOption b() {
        return this.g;
    }

    @Override // xsna.vcr
    public final CatalogMarketStatusOption d() {
        return this.f;
    }

    @Override // xsna.vcr
    public final void e(CatalogMarketStatusOption catalogMarketStatusOption) {
        this.f = null;
    }
}
