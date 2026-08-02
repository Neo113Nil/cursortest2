package xsna;

import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: SearchFeatureQueryInputBinding.kt */
/* loaded from: classes16.dex */
public final class urh0 {
    public final CatalogSearchQueryViewHolder a;
    public vrh0.a b;
    public boolean c;
    public SearchQuery d;

    public urh0(CatalogSearchQueryViewHolder catalogSearchQueryViewHolder) {
        this.a = catalogSearchQueryViewHolder;
    }

    public final SearchQuery a(String str) {
        SearchQuery searchQuery = this.d;
        if (searchQuery != null) {
            if (!epx.f(searchQuery.b, str)) {
                searchQuery = null;
            }
            if (searchQuery != null) {
                return searchQuery;
            }
        }
        return new SearchQuery(str, SearchInputMethod.Keyboard, null, null, 12, null);
    }

    public final void b(SearchQuery searchQuery, boolean z) {
        this.d = searchQuery;
        if (z || this.b == null) {
            this.c = true;
            this.a.zf(searchQuery.b, true);
            this.c = false;
        }
    }
}
