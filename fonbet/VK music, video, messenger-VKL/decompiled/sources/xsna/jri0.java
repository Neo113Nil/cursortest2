package xsna;

import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.catalog2.common.ui.mvp.holder.search.suggester.core.SearchServiceWithSuggestCatalogRootVh;

/* compiled from: ServiceSearchRootDelegate.kt */
/* loaded from: classes16.dex */
public abstract class jri0<T> extends o0i0<T> {

    /* compiled from: ServiceSearchRootDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchState.values().length];
            try {
                iArr[SearchState.Search.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchState.Suggestion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.o0i0
    public final boolean d(SearchState searchState) {
        return (((SearchServiceWithSuggestCatalogRootVh) this.b).getState() instanceof vyh0) && super.d(searchState);
    }

    @Override // xsna.o0i0
    public void e(SearchState searchState) {
        ((SearchServiceWithSuggestCatalogRootVh) this.b).i8(vyh0.a);
        super.e(searchState);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    public final void t(bnn0 bnn0Var) {
        String j9;
        boolean z = bnn0Var instanceof vyh0;
        u4a u4aVar = this.c;
        if (z) {
            SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        } else {
            ((wzh0) this).p.reset();
            c().clear();
            SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
            searchStatInfoProvider2.getClass();
            searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Disabled;
        }
        ?? r0 = this.b;
        r0.ca((!z || (j9 = r0.j9()) == null || drm0.N(j9)) ? false : true);
    }
}
