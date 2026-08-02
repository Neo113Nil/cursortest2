package xsna;

import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;

/* compiled from: CatalogSearchableWithParamsViewHolder.kt */
/* loaded from: classes16.dex */
public interface xda extends wda {
    static /* synthetic */ void D(xda xdaVar, String str, SearchParams searchParams, SearchInputMethod searchInputMethod, int i) {
        boolean z = (i & 8) == 0;
        if ((i & 16) != 0) {
            searchInputMethod = null;
        }
        xdaVar.v(str, searchParams, null, z, searchInputMethod);
    }

    @Override // xsna.wda
    default void d0(String str, String str2, SearchInputMethod searchInputMethod) {
        v(str, null, str2, false, searchInputMethod);
    }

    void v(String str, SearchParams searchParams, String str2, boolean z, SearchInputMethod searchInputMethod);
}
