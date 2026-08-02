package xsna;

import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;

/* compiled from: SearchPageWithParams.kt */
/* loaded from: classes5.dex */
public interface swh0 extends qwh0 {
    @Override // xsna.qwh0
    default void j1(String str, SearchInputMethod searchInputMethod) {
        pe(str, null, searchInputMethod);
    }

    void pe(String str, SearchParams searchParams, SearchInputMethod searchInputMethod);

    default void bd() {
    }
}
