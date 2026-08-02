package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.ui.api.SearchQuery;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.b9q0;
import xsna.iax;
import xsna.iqh0;
import xsna.lm6;

/* compiled from: IntegrationSearchResultsDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class jax implements iax, nhl, lm6.b {
    public final iqh0.e b;
    public final arh0 c;
    public final ysg0<iax.a> d;
    public final io.reactivex.rxjava3.subjects.f e;
    public final FragmentImpl f;
    public final Object g;
    public View h;
    public SearchFeatureCatalogRootVh i;

    /* compiled from: IntegrationSearchResultsDelegateImpl.kt */
    public static final /* synthetic */ class a extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((jax) this.receiver).h;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((jax) this.receiver).h = (View) obj;
        }
    }

    /* compiled from: IntegrationSearchResultsDelegateImpl.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((jax) this.receiver).i;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((jax) this.receiver).i = (SearchFeatureCatalogRootVh) obj;
        }
    }

    public jax(iqh0.e eVar, hyh0 hyh0Var, arh0 arh0Var) {
        this.b = eVar;
        this.c = arh0Var;
        ysg0<iax.a> ysg0Var = new ysg0<>();
        this.d = ysg0Var;
        this.e = ysg0Var.a;
        FragmentImpl fragmentImpl = eVar.c;
        this.f = fragmentImpl;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new s1x(this, 1));
        fragmentImpl.getLifecycle().addObserver(this);
    }

    @Override // xsna.lm6.b
    public final String V() {
        kea keaVar;
        UIBlockList uIBlockList;
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        String str = null;
        if (searchFeatureCatalogRootVh != null && (keaVar = searchFeatureCatalogRootVh.r) != null && (uIBlockList = keaVar.l) != null) {
            str = uIBlockList.b;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iax
    public final void a(String str) {
        ?? r0 = this.g;
        ((zqh0) r0.getValue()).e(new SearchQuery(str, null, null, null, 14, null), b9q0.a.a);
        if (str.length() != 0) {
            i(new iax.a.C3043a(str));
        } else {
            ((zqh0) r0.getValue()).b();
            i(iax.a.c.a);
        }
    }

    @Override // xsna.iax
    public final io.reactivex.rxjava3.core.q<iax.a> b() {
        return this.e;
    }

    @Override // xsna.iax
    public final void c() {
        i(iax.a.b.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.search.integration.api.SearchDelegate
    public final View e(Context context, ViewGroup viewGroup) {
        SearchFeatureCatalogRootVh a2 = hyh0.a(this.b, (zqh0) this.g.getValue(), null);
        new b(this, jax.class, "searchResultViewHolder", "getSearchResultViewHolder()Lcom/vk/catalog2/common/ui/mvp/holder/search/SearchFeatureCatalogRootVh;", 0).set(a2);
        View X = a2.X(this.f.getLayoutInflater(), null, null);
        new a(this, jax.class, "searchResultView", "getSearchResultView()Landroid/view/View;", 0).set(X);
        if (viewGroup != null) {
            viewGroup.addView(X);
        }
        dhr0.a.e0(R.attr.vk_ui_background_content, X);
        a2.l0(new tzv(this, 1));
        a2.n0(new lrk(this, 21));
        return X;
    }

    @Override // xsna.rtn0
    public final void g(SearchTab searchTab) {
        CatalogVh catalogVh = this.i;
        rtn0 rtn0Var = catalogVh instanceof rtn0 ? (rtn0) catalogVh : null;
        if (rtn0Var != null) {
            rtn0Var.g(searchTab);
        }
    }

    public final void i(iax.a aVar) {
        this.d.a(aVar);
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final void onConfigurationChanged(Configuration configuration) {
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.onConfigurationChanged(configuration);
        }
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.f.getLifecycle().removeObserver(this);
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.L();
        }
        this.i = null;
        this.h = null;
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.K();
        }
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.M();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iax
    public final void p() {
        ((zqh0) this.g.getValue()).b();
        i(iax.a.d.a);
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final void d() {
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
