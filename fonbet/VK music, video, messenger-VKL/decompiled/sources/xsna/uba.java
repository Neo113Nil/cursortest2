package xsna;

import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;

/* compiled from: CatalogPaginationPresenterWrapper.kt */
/* loaded from: classes16.dex */
public final class uba<T> extends tba<T> {
    public final tba<T> g;
    public CatalogPaginatedListViewHolder h;
    public final tnk i;

    /* JADX WARN: Multi-variable type inference failed */
    public uba(tba<T> tbaVar) {
        this.g = tbaVar;
        this.i = tbaVar instanceof tnk ? (tnk) tbaVar : null;
    }

    @Override // xsna.tba
    public final void b(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = this.h;
        if (catalogPaginatedListViewHolder2 != null) {
            catalogPaginatedListViewHolder = catalogPaginatedListViewHolder2;
        }
        this.g.b(catalogPaginatedListViewHolder);
    }

    @Override // xsna.tba
    public final void c() {
        this.g.c();
    }

    @Override // xsna.tba
    public final void d(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2 = this.h;
        if (catalogPaginatedListViewHolder2 != null) {
            catalogPaginatedListViewHolder = catalogPaginatedListViewHolder2;
        }
        this.g.d(catalogPaginatedListViewHolder);
    }

    @Override // xsna.tba
    public final String f() {
        return this.g.f();
    }

    @Override // xsna.tba
    public final boolean g() {
        return this.g.g();
    }

    @Override // xsna.tba
    public final io.reactivex.rxjava3.core.q i(Integer num, String str, boolean z) {
        return this.g.i(num, str, z);
    }

    @Override // xsna.tba
    public final io.reactivex.rxjava3.disposables.c m(io.reactivex.rxjava3.core.q<T> qVar, boolean z, com.vk.lists.c cVar) {
        return this.g.m(qVar, z, cVar);
    }

    @Override // xsna.tba
    public final void o() {
        this.g.o();
    }
}
