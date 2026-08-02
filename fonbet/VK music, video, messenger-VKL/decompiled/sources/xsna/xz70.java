package xsna;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.search.ui.impl.catalog.GlobalSearchVideosCatalogFragment;

/* compiled from: OldSearchTabFragmentAdapter.kt */
/* loaded from: classes5.dex */
public final class xz70 implements izh0 {
    public final Fragment a;
    public final int b;
    public final DiscoverSearchTabs.SearchTabName c;
    public final DiscoverSearchTabs.a d;
    public final VkSearchView e;
    public final SearchQueryValueHelper f;
    public final SearchParams g;
    public final w2o0 h;
    public final nt8 i;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();
    public final yz70 k = new yz70(this);

    /* compiled from: OldSearchTabFragmentAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverSearchTabs.SearchTabName.values().length];
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchPeople.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchNews.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchGoods.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchGroups.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xz70(Fragment fragment, int i, DiscoverSearchTabs.SearchTabName searchTabName, DiscoverSearchTabs.a aVar, VkSearchView vkSearchView, SearchQueryValueHelper searchQueryValueHelper, SearchParams searchParams, h94 h94Var, nt8 nt8Var) {
        this.a = fragment;
        this.b = i;
        this.c = searchTabName;
        this.d = aVar;
        this.e = vkSearchView;
        this.f = searchQueryValueHelper;
        this.g = searchParams;
        this.h = h94Var;
        this.i = nt8Var;
    }

    @Override // xsna.izh0
    public final void X1(String str, boolean z) {
        SearchQueryValueHelper searchQueryValueHelper = this.f;
        searchQueryValueHelper.b.onNext(new SearchQueryValueHelper.a(new SearchQuery(str, searchQueryValueHelper.b().c, null, null, 12, null), z ? SearchQueryValueHelper.ChangeType.SILENT : SearchQueryValueHelper.ChangeType.MANUAL, null));
    }

    public final void a(SearchQuery searchQuery) {
        String obj = drm0.p0(searchQuery.b).toString();
        SearchInputMethod searchInputMethod = searchQuery.c;
        z1h0 z1h0Var = this.a;
        if (z1h0Var instanceof swh0) {
            ((swh0) z1h0Var).pe(obj, this.g, searchInputMethod);
        } else if (z1h0Var instanceof qwh0) {
            ((qwh0) z1h0Var).j1(obj, searchInputMethod);
        }
    }

    @Override // xsna.izh0
    public final boolean a0() {
        z1h0 z1h0Var = this.a;
        return (z1h0Var instanceof s180) && ((s180) z1h0Var).a0();
    }

    public final void b(boolean z) {
        wzs<Fragment, Activity, s3q0> wzsVar;
        Fragment fragment = this.a;
        if (fragment.isResumed() && (wzsVar = this.d.c) != null) {
            int i = ify.a;
            if (!ify.e(ify.c)) {
                wzsVar.invoke(fragment, fragment.kn());
            } else {
                if (z) {
                    return;
                }
                ify.a(this.k);
                this.e.d0();
            }
        }
    }

    public final void c() {
        int[] iArr = a.$EnumSwitchMapping$0;
        DiscoverSearchTabs.SearchTabName searchTabName = this.c;
        int i = iArr[searchTabName.ordinal()];
        w2o0 w2o0Var = this.h;
        SearchParams searchParams = this.g;
        SearchQueryValueHelper searchQueryValueHelper = this.f;
        boolean z = false;
        VkSearchView vkSearchView = this.e;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            String str = searchQueryValueHelper.b().b;
            if (searchTabName != DiscoverSearchTabs.SearchTabName.SearchGoods || str.length() <= 0) {
                if (searchTabName != DiscoverSearchTabs.SearchTabName.SearchVideo) {
                    vkSearchView.j5(null);
                    return;
                }
                return;
            } else {
                vkSearchView.j5(w2o0Var);
                if (searchParams != null && searchParams.I()) {
                    z = true;
                }
                vkSearchView.h5(true, !z);
                return;
            }
        }
        boolean z2 = searchTabName == DiscoverSearchTabs.SearchTabName.SearchPeople || !drm0.N(searchQueryValueHelper.b().b);
        if (!z2 && (searchParams == null || !searchParams.I())) {
            if (searchParams instanceof VkGroupsSearchParams) {
                ysg0<Object> ysg0Var = ysg0.b;
                VkGroupsSearchParams copy = ((VkGroupsSearchParams) searchParams).copy();
                copy.reset();
                ysg0Var.a(new eru0(copy));
                return;
            }
            if (searchParams instanceof VkPeopleSearchParams) {
                ysg0<Object> ysg0Var2 = ysg0.b;
                VkPeopleSearchParams copy2 = ((VkPeopleSearchParams) searchParams).copy();
                copy2.reset();
                ysg0Var2.a(new mru0(copy2, false));
                return;
            }
            if (searchParams instanceof VkMarketSearchParams) {
                ysg0<Object> ysg0Var3 = ysg0.b;
                VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) searchParams;
                vkMarketSearchParams.getClass();
                VkMarketSearchParams vkMarketSearchParams2 = new VkMarketSearchParams();
                vkMarketSearchParams2.h5(vkMarketSearchParams);
                vkMarketSearchParams2.reset();
                ysg0Var3.a(new jru0(vkMarketSearchParams2));
                return;
            }
            if (searchParams instanceof VkFeedSearchParams) {
                ysg0<Object> ysg0Var4 = ysg0.b;
                VkFeedSearchParams copy3 = ((VkFeedSearchParams) searchParams).copy();
                copy3.reset();
                ysg0Var4.a(new bru0(copy3));
                return;
            }
        }
        vkSearchView.j5(z2 ? w2o0Var : null);
        if (searchParams != null && !searchParams.I()) {
            z = true;
        }
        vkSearchView.h5(z2, z);
    }

    @Override // xsna.izh0
    public final void c3() {
        this.j.dispose();
        VkSearchView vkSearchView = this.e;
        vkSearchView.setOnActionSearchQueryClick(null);
        vkSearchView.setOnActionClearListener(null);
        vkSearchView.setSecondaryOnEditorActionListener(null);
        vkSearchView.setOnBackClickListener(null);
        vkSearchView.setSecondaryActionListener(null);
        Fragment fragment = this.a;
        GlobalSearchVideosCatalogFragment globalSearchVideosCatalogFragment = fragment instanceof GlobalSearchVideosCatalogFragment ? (GlobalSearchVideosCatalogFragment) fragment : null;
        if (globalSearchVideosCatalogFragment != null) {
            dj60 dj60Var = new dj60(this, 1);
            if (globalSearchVideosCatalogFragment.P != null) {
                dj60Var.invoke();
            } else {
                globalSearchVideosCatalogFragment.V = dj60Var;
            }
        }
    }

    @Override // xsna.izh0
    public final int d3() {
        return this.b;
    }

    @Override // xsna.izh0
    public final Fragment g() {
        return this.a;
    }

    @Override // xsna.izh0
    public final void onDestroyView() {
        this.j.dispose();
    }

    @Override // xsna.izh0
    public final void q1() {
        oop oopVar = new oop(this, 1);
        VkSearchView vkSearchView = this.e;
        vkSearchView.setSecondaryOnEditorActionListener(oopVar);
        vkSearchView.setOnActionSearchQueryClick(new hn2(this, 9));
        vkSearchView.setOnActionClearListener(new rf20(this, 7));
        vkSearchView.setOnBackClickListener(new hk70(this, 1));
        vkSearchView.setSecondaryActionListener(new rzp(0, this, xz70.class, "onSecondaryActionClick", "onSecondaryActionClick()V", 0, 1));
        Fragment fragment = this.a;
        GlobalSearchVideosCatalogFragment globalSearchVideosCatalogFragment = fragment instanceof GlobalSearchVideosCatalogFragment ? (GlobalSearchVideosCatalogFragment) fragment : null;
        if (globalSearchVideosCatalogFragment != null) {
            kr50 kr50Var = new kr50(this, 4);
            if (globalSearchVideosCatalogFragment.P != null) {
                kr50Var.invoke();
            } else {
                globalSearchVideosCatalogFragment.V = kr50Var;
            }
        }
        long j = this.c == DiscoverSearchTabs.SearchTabName.SearchGoods ? 500L : 300L;
        SearchQueryValueHelper searchQueryValueHelper = this.f;
        io.reactivex.rxjava3.disposables.c subscribe = searchQueryValueHelper.d(j, false, true).subscribe(new vk40(new m8(1, this, xz70.class, "searchFromCode", "searchFromCode(Lcom/vk/search/ui/api/SearchQuery;)V", 0, 7), 10));
        io.reactivex.rxjava3.disposables.b bVar = this.j;
        bVar.b(subscribe);
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(searchQueryValueHelper.d(0L, false, false).U(new j630(new rvq(16), 8)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new a960(new b810(this, 12), 3)));
        SearchParams searchParams = this.g;
        if (searchParams != null) {
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            fq fqVar = new fq(24);
            fVar.getClass();
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, fqVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k130(this, 10)));
        }
        if (searchParams instanceof VkPeopleSearchParams) {
            bVar.b(ysg0.b.a.b0(mru0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ux00(new c2u(this, 28), 8)));
            return;
        }
        if (searchParams instanceof VkGroupsSearchParams) {
            bVar.b(ysg0.b.a.b0(eru0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tk40(new or50(this, 5), 7)));
        } else if (searchParams instanceof VkMarketSearchParams) {
            bVar.b(ysg0.b.a.b0(jru0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cc20(new fju(this, 17), 10)));
        } else if (searchParams instanceof VkFeedSearchParams) {
            bVar.b(ysg0.b.a.b0(bru0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qg60(new rop(this, 26), 4)));
        }
    }
}
