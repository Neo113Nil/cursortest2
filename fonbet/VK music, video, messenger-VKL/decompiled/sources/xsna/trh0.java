package xsna;

import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: SearchFeatureQueryInputBinding.kt */
/* loaded from: classes16.dex */
public final class trh0 implements vrh0 {
    public final /* synthetic */ urh0 b;

    public trh0(urh0 urh0Var) {
        this.b = urh0Var;
    }

    @Override // xsna.vrh0
    public final void a(vrh0.a aVar) {
        urh0 urh0Var = this.b;
        vrh0.a aVar2 = urh0Var.b;
        if (aVar2 != null) {
            aVar2.f();
        }
        urh0Var.b = aVar;
    }

    @Override // xsna.vrh0
    public final boolean b() {
        if (!epx.f(this.b.a.c9(), Boolean.TRUE)) {
            return false;
        }
        int i = ify.a;
        return ify.e(ify.c);
    }

    @Override // xsna.vrh0
    public final void d(boolean z) {
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.b.a;
        if (z) {
            catalogSearchQueryViewHolder.K6(true);
        } else {
            catalogSearchQueryViewHolder.om(true);
        }
    }

    @Override // xsna.vrh0
    public final void d0() {
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.b.a;
        Boolean c9 = catalogSearchQueryViewHolder.c9();
        if (c9 == null || !c9.booleanValue()) {
            return;
        }
        catalogSearchQueryViewHolder.Km(0L);
    }

    @Override // xsna.vrh0
    public final void g(SearchQuery searchQuery) {
        this.b.b(searchQuery, true);
    }

    @Override // xsna.vrh0
    public final SearchQuery i() {
        urh0 urh0Var = this.b;
        return urh0Var.a(urh0Var.a.i());
    }

    @Override // xsna.vrh0
    public final void k() {
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.b.a;
        Boolean c9 = catalogSearchQueryViewHolder.c9();
        if (c9 != null) {
            if (!c9.booleanValue()) {
                catalogSearchQueryViewHolder.Ta();
            }
            catalogSearchQueryViewHolder.Fb();
        }
    }

    @Override // xsna.vrh0
    public final void P1(String str) {
    }

    @Override // xsna.vrh0
    public final void e(boolean z) {
    }

    @Override // xsna.vrh0
    public final void f(boolean z) {
    }
}
