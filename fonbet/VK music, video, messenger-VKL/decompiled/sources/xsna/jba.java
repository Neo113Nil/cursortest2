package xsna;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.search.params.api.SearchParams;

/* compiled from: CatalogMyAudiosSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class jba extends SearchRequestFactory {
    public final q9a p;
    public final String q;
    public String r;

    public jba(wba wbaVar, laa laaVar, String str) {
        super(wbaVar, (SearchRequestFactory.a) null, 6);
        this.p = laaVar;
        this.q = str;
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        wga k = k();
        String str2 = this.r;
        return this.p.b(rsg0.T(yfb.x(wga.i(k, str, null, null, null, null, str2 != null ? ao8.l(str2) : null, null, this.q, 374))).U(new np1(new iba(1, j(), e3a.class, "mapToSingleSection", "mapToSingleSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 7))).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q i(String str, boolean z) {
        return h(str, null, null, z);
    }
}
