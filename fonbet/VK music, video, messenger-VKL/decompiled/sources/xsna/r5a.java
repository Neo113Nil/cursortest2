package xsna;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.search.CatalogGetPeopleSearchRequestFactory;
import com.vk.search.params.api.SearchParams;

/* compiled from: CatalogFriendsGetPeopleSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class r5a extends SearchRequestFactory {
    public final CatalogGetPeopleSearchRequestFactory p;

    public r5a(wba wbaVar, CatalogGetPeopleSearchRequestFactory.SearchPeopleEntrypoint searchPeopleEntrypoint) {
        super(wbaVar, searchPeopleEntrypoint, 4);
        this.p = new CatalogGetPeopleSearchRequestFactory(wbaVar, searchPeopleEntrypoint, null, null, new q5a(1, this, r5a.class, "mapSearchListViewType", "mapSearchListViewType(Lcom/vk/catalog2/common/dto/api/CatalogResponse;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 12);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.internal.operators.observable.m1 g(String str, String str2) {
        return this.p.g(str, str2);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        return this.p.h(str, searchParams, aVar, z);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q i(String str, boolean z) {
        return this.p.h(str, null, this.d, z);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final boolean m() {
        return this.p.j;
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final void n(boolean z) {
        this.p.j = z;
    }
}
