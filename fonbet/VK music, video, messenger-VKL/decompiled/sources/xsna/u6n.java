package xsna;

import com.vk.search.ui.impl.catalog.GlobalSearchGroupsCatalogFragment;
import com.vk.search.ui.impl.catalog.SearchGroupsFeatureCatalogFragment;
import com.vk.toggle.features.SearchFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class u6n implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ u6n(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                SearchFeatures searchFeatures = SearchFeatures.GLOBAL_SEARCH_GROUPS_SUGGESTER;
                searchFeatures.getClass();
                if (com.vk.toggle.b.A.a(searchFeatures)) {
                    return new SearchGroupsFeatureCatalogFragment.a(SearchGroupsFeatureCatalogFragment.class, null, null).f();
                }
                GlobalSearchGroupsCatalogFragment.a aVar = new GlobalSearchGroupsCatalogFragment.a(GlobalSearchGroupsCatalogFragment.class, null, null);
                aVar.j.putString("KEY_AD_CAMPAIGN_SOURCE", str);
                return aVar.f();
            default:
                bpn0 bpn0Var = c7r0.a;
                String f = c7r0.f(str);
                c7r0.j(str, f);
                return f;
        }
    }
}
