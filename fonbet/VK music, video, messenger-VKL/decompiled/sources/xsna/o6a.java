package xsna;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.search.params.api.SearchParams;

/* compiled from: CatalogGetSearchChannelRequestFactory.kt */
/* loaded from: classes16.dex */
public final class o6a extends SearchRequestFactory {
    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        wga k = k();
        SearchRequestFactory.InputMethod inputMethod = this.k;
        return rsg0.y0(yfb.x(k.k(str, inputMethod != null ? inputMethod.h() : null, aVar != null ? aVar.h() : null)), null, null, 3).U(new j7(new n6a(1, j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 10));
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q i(String str, boolean z) {
        return h(str, null, this.d, z);
    }
}
