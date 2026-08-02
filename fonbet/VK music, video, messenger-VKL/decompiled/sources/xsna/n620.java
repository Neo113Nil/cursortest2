package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.search.ParametrizedSearchFeatureCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.AppBarShadowView;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.search.integration.api.SearchDelegate;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchQuery;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lm6;
import xsna.mzh0;
import xsna.v1h0;
import xsna.vrh0;

/* compiled from: MenuIntegrationSearchDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class n620<P extends SearchParams> implements m620, w8i, nhl, lm6.b {
    public final iqh0 b;
    public final zwh0<P> c;
    public final FragmentImpl d;
    public final Object e;
    public final f0i0 f;
    public final Object g;
    public final bpn0 h;
    public SearchFeatureCatalogRootVh i;
    public View j;
    public srh0 k;
    public final Object l;
    public qlu m;
    public final Object n;

    /* compiled from: MenuIntegrationSearchDelegateImpl.kt */
    public static final class a implements vrh0 {
        public final srh0 b;
        public final f0i0 c;

        public a(srh0 srh0Var, f0i0 f0i0Var) {
            this.b = srh0Var;
            this.c = f0i0Var;
        }

        @Override // xsna.vrh0
        public final void P1(String str) {
            this.b.P1(null);
        }

        @Override // xsna.vrh0
        public final void a(vrh0.a aVar) {
            this.b.a(aVar);
        }

        @Override // xsna.vrh0
        public final boolean b() {
            return this.b.b();
        }

        @Override // xsna.vrh0
        public final void d(boolean z) {
            this.b.d(z);
        }

        @Override // xsna.vrh0
        public final void d0() {
            this.b.d0();
        }

        @Override // xsna.vrh0
        public final void e(boolean z) {
            this.b.e(z);
        }

        @Override // xsna.vrh0
        public final void f(boolean z) {
            this.b.f(z);
        }

        /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
        @Override // xsna.vrh0
        public final void g(SearchQuery searchQuery) {
            this.b.g(searchQuery);
            String str = searchQuery.b;
            f0i0 f0i0Var = this.c;
            SearchDelegate.SearchState searchState = f0i0Var.f;
            f0i0Var.c = drm0.N(str);
            SearchDelegate.SearchState a = f0i0Var.a();
            f0i0Var.f = a;
            if (searchState != a) {
                f0i0Var.a.invoke();
            }
        }

        @Override // xsna.vrh0
        public final SearchQuery i() {
            return this.b.i();
        }

        @Override // xsna.vrh0
        public final void k() {
            this.b.k();
        }
    }

    /* compiled from: MenuIntegrationSearchDelegateImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            n620 n620Var = (n620) this.receiver;
            SearchDelegate.SearchState searchState = n620Var.f.f;
            qlu qluVar = n620Var.m;
            if (qluVar != null) {
                GroupMembersFragment groupMembersFragment = qluVar.a;
                boolean z = searchState != SearchDelegate.SearchState.ACTIVE;
                groupMembersFragment.b0.n(z);
                groupMembersFragment.b0.p(z);
                qluVar.b.setVisibility(z ? 0 : 8);
                AppBarShadowView appBarShadowView = qluVar.d;
                if (appBarShadowView != null) {
                    appBarShadowView.setSeparatorAllowed(z);
                }
                boolean z2 = searchState.compareTo(SearchDelegate.SearchState.EXPANDED) >= 0;
                Toolbar toolbar = qluVar.c;
                int i = z2 ? 0 : qluVar.e;
                if (toolbar.getLayoutParams() instanceof AppBarLayout.d) {
                    ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                    }
                    AppBarLayout.d dVar = (AppBarLayout.d) layoutParams;
                    dVar.a = i;
                    toolbar.setLayoutParams(dVar);
                }
            }
            View view = n620Var.j;
            if (view != null) {
                bwt0.p0(view, searchState == SearchDelegate.SearchState.ACTIVE);
            }
            return s3q0.a;
        }
    }

    public n620(iqh0 iqh0Var, hyh0 hyh0Var, zwh0<P> zwh0Var) {
        this.b = iqh0Var;
        this.c = zwh0Var;
        FragmentImpl a2 = iqh0Var.a();
        this.d = a2;
        ko00 ko00Var = new ko00(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, ko00Var);
        b bVar = new b(0, this, n620.class, "notifyStateChanged", "notifyStateChanged()V", 0);
        mzh0.b bVar2 = mzh0.b.a;
        mzh0 b2 = iqh0Var.b();
        bVar2.getClass();
        if (b2 instanceof mzh0.a) {
            ((mzh0.a) b2).getClass();
        }
        this.f = new f0i0(false, bVar);
        this.g = msy.a(lazyThreadSafetyMode, new fgm(this, 26));
        this.h = new bpn0(new hvz(this, 5));
        this.l = msy.a(lazyThreadSafetyMode, new foi(this, 22));
        this.n = msy.a(lazyThreadSafetyMode, new n1i(this, 23));
        a2.getLifecycle().addObserver(this);
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

    @Override // xsna.m620
    public final boolean a0() {
        srh0 srh0Var = this.k;
        if (srh0Var != null) {
            return srh0Var.c();
        }
        return false;
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final View e(Context context, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m620
    public final void f(Menu menu, Toolbar toolbar, Context context) {
        srh0 srh0Var = this.k;
        if (srh0Var != null) {
            srh0Var.a(null);
        }
        n8q b2 = ((iwh0) this.l.getValue()).b(menu, toolbar, context, false);
        srh0 srh0Var2 = this.k;
        f0i0 f0i0Var = this.f;
        if (srh0Var2 != null) {
            b2.g(srh0Var2.i());
            boolean z = f0i0Var.f != SearchDelegate.SearchState.COLLAPSED;
            b2.e.setExpanded(z);
            MenuItem menuItem = b2.d;
            if (menuItem.isActionViewExpanded() != z) {
                b2.h = true;
                if (z) {
                    menuItem.expandActionView();
                } else {
                    menuItem.collapseActionView();
                }
                b2.h = false;
            }
        }
        new q620(this, n620.class, "searchMenuItem", "getSearchMenuItem()Lcom/vk/search/ui/api/view/SearchFeatureQueryActionMenuItem;", 0).set(b2);
        ((zqh0) this.g.getValue()).f(new a(b2, f0i0Var), this.d.getViewLifecycleOwner());
        b2.j(new u9e(1, this, n620.class, "onMenuItemExpandChanged", "onMenuItemExpandChanged(Z)V", 0, 5));
    }

    public final r620<P> g() {
        return (r620) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m620
    public final void h(qlu qluVar) {
        SearchParams searchParams;
        this.m = qluVar;
        SearchFeatureCatalogRootVh a2 = hyh0.a(this.b, (zqh0) this.g.getValue(), (yzh0) this.n.getValue());
        r620<P> g = g();
        if (g != null && (a2 instanceof ParametrizedSearchFeatureCatalogRootVh)) {
            e15 e15Var = new e15(1, g, lm6.class, "onParamsDescriptionChanged", "onParamsDescriptionChanged(Z)V", 0, 1);
            qrh0 qrh0Var = (qrh0) ((ParametrizedSearchFeatureCatalogRootVh) a2).u.getValue();
            if (qrh0Var != null) {
                qrh0Var.d = e15Var;
            }
        }
        new p620(0, this, n620.class, "searchResultViewHolder", "getSearchResultViewHolder()Lcom/vk/catalog2/common/ui/mvp/holder/search/SearchFeatureCatalogRootVh;", 0).set(a2);
        View X = a2.X(this.d.getLayoutInflater(), null, null);
        new o620(0, this, n620.class, "searchResultView", "getSearchResultView()Landroid/view/View;", 0).set(X);
        dhr0.a.e0(R.attr.vk_ui_background_content, X);
        View view = qluVar.b;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.addView(X, viewGroup.indexOfChild(view) + 1, view.getLayoutParams());
        final r620<P> g2 = g();
        if (g2 != null) {
            ?? r1 = g2.f;
            P p = g2.g;
            yh90 yh90Var = (yh90) r1.getValue();
            lm6.a aVar = new lm6.a(g2);
            FragmentImpl fragmentImpl = g2.a;
            yh90Var.j(aVar, fragmentImpl.getViewLifecycleOwner());
            v1h0 savedStateRegistry = fragmentImpl.getSavedStateRegistry();
            Bundle a3 = savedStateRegistry.a("params");
            if (a3 != null && (searchParams = (SearchParams) a3.getParcelable(g2.c.d)) != null) {
                p.h5(searchParams);
            }
            savedStateRegistry.c("params", new v1h0.b() { // from class: xsna.km6
                @Override // xsna.v1h0.b
                public final Bundle r() {
                    Bundle bundle = new Bundle();
                    r620 r620Var = r620.this;
                    bundle.putParcelable(r620Var.c.d, r620Var.g);
                    return bundle;
                }
            });
            ((yh90) r1.getValue()).h(p.copy());
        }
        SearchDelegate.SearchState searchState = this.f.f;
        qlu qluVar2 = this.m;
        if (qluVar2 != null) {
            GroupMembersFragment groupMembersFragment = qluVar2.a;
            boolean z = searchState != SearchDelegate.SearchState.ACTIVE;
            groupMembersFragment.b0.n(z);
            groupMembersFragment.b0.p(z);
            qluVar2.b.setVisibility(z ? 0 : 8);
            AppBarShadowView appBarShadowView = qluVar2.d;
            if (appBarShadowView != null) {
                appBarShadowView.setSeparatorAllowed(z);
            }
            boolean z2 = searchState.compareTo(SearchDelegate.SearchState.EXPANDED) >= 0;
            Toolbar toolbar = qluVar2.c;
            int i = z2 ? 0 : qluVar2.e;
            if (toolbar.getLayoutParams() instanceof AppBarLayout.d) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                }
                AppBarLayout.d dVar = (AppBarLayout.d) layoutParams;
                dVar.a = i;
                toolbar.setLayoutParams(dVar);
            }
        }
        View view2 = this.j;
        if (view2 != null) {
            bwt0.p0(view2, searchState == SearchDelegate.SearchState.ACTIVE);
        }
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final void onConfigurationChanged(Configuration configuration) {
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.d.getLifecycle().removeObserver(this);
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = null;
        f0i0 f0i0Var = this.f;
        SearchDelegate.SearchState searchState = f0i0Var.f;
        f0i0Var.c = true;
        f0i0Var.d = false;
        f0i0Var.e = false;
        SearchDelegate.SearchState a2 = f0i0Var.a();
        f0i0Var.f = a2;
        if (searchState != a2) {
            f0i0Var.a.invoke();
        }
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.K();
        }
        r620<P> g = g();
        if (g != null) {
            io.reactivex.rxjava3.disposables.c cVar = g.h;
            if (cVar != null) {
                cVar.dispose();
            }
            g.h = null;
        }
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        SearchFeatureCatalogRootVh searchFeatureCatalogRootVh = this.i;
        if (searchFeatureCatalogRootVh != null) {
            searchFeatureCatalogRootVh.M();
        }
        r620<P> g = g();
        if (g != null) {
            g.h = ysg0.b.a.b0(mru0.class).subscribe(new lav(new owv(new g15(1, g, lm6.class, "onParamsReceived", "onParamsReceived(Lcom/vk/search/params/api/SearchParams;)V", 0, 1), 23), 17));
        }
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
