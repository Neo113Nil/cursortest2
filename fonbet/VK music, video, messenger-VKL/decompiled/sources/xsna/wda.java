package xsna;

import com.vk.search.ui.api.SearchInputMethod;

/* compiled from: CatalogSearchableViewHolder.kt */
/* loaded from: classes16.dex */
public interface wda {
    static /* synthetic */ void e0(wda wdaVar, String str, String str2, SearchInputMethod searchInputMethod, int i) {
        if ((i & 8) != 0) {
            searchInputMethod = null;
        }
        wdaVar.d0(str, str2, searchInputMethod);
    }

    default boolean c0() {
        return true;
    }

    void d0(String str, String str2, SearchInputMethod searchInputMethod);
}
