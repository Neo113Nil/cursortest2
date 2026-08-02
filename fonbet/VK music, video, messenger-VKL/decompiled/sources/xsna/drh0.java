package xsna;

import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.search.ui.api.SearchInputMethod;

/* compiled from: SearchFeatureDependentDelegate.kt */
/* loaded from: classes16.dex */
public interface drh0 {
    default io.reactivex.rxjava3.disposables.c P(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
    }

    default boolean S() {
        return true;
    }

    void T(String str, SearchInputMethod searchInputMethod, String str2, String str3);

    default long V() {
        return 500L;
    }

    void a(boolean z, boolean z2);

    CommonSearchResultsVh b(u4a u4aVar, CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory, eg50 eg50Var);

    default void Q() {
    }

    default void n() {
    }

    default void R(String str) {
    }

    default void U(String str) {
    }

    default void O(String str, SearchInputMethod searchInputMethod) {
    }
}
