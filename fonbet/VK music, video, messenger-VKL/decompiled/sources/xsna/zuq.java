package xsna;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: FeatureSearchTabFragmentAdapter.kt */
/* loaded from: classes5.dex */
public final class zuq implements izh0 {
    public final Fragment a;
    public final int b;
    public final VkSearchView c;
    public final w2o0 d;
    public final SearchQueryValueHelper e;
    public final zqh0 f;
    public io.reactivex.rxjava3.disposables.c h;
    public vrh0.a i;
    public boolean j;
    public final avq g = new avq();
    public final sk3<SearchQuery> k = new sk3<>();

    public zuq(Fragment fragment, int i, VkSearchView vkSearchView, h94 h94Var, SearchQueryValueHelper searchQueryValueHelper, zqh0 zqh0Var) {
        this.a = fragment;
        this.b = i;
        this.c = vkSearchView;
        this.d = h94Var;
        this.e = searchQueryValueHelper;
        this.f = zqh0Var;
    }

    @Override // xsna.izh0
    public final boolean a0() {
        if (this.j) {
            return false;
        }
        this.f.a0();
        return true;
    }

    @Override // xsna.izh0
    public final void c3() {
        VkSearchView vkSearchView = this.c;
        vkSearchView.setOnActionSearchQueryClick(null);
        vkSearchView.setOnActionClearListener(null);
        vkSearchView.setSecondaryOnEditorActionListener(null);
        vkSearchView.setOnBackClickListener(null);
        vkSearchView.setSecondaryActionListener(null);
        onDestroyView();
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
        this.g.b.e(Lifecycle.State.DESTROYED);
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
    }

    @Override // xsna.izh0
    public final void q1() {
        avq avqVar = this.g;
        avqVar.b.e(Lifecycle.State.RESUMED);
        yuq yuqVar = new yuq(this);
        zqh0 zqh0Var = this.f;
        zqh0Var.f(yuqVar, avqVar);
        zqh0Var.d(new jxb0(this), avqVar);
        fcb fcbVar = new fcb(this, 1);
        VkSearchView vkSearchView = this.c;
        vkSearchView.setSecondaryOnEditorActionListener(fcbVar);
        vkSearchView.setOnActionSearchQueryClick(new k6p(this, 1));
        vkSearchView.setOnActionClearListener(new sbg(this, 17));
        vkSearchView.setOnBackClickListener(new tbg(this, 18));
        vkSearchView.setSecondaryActionListener(new m3g(this, 16));
        this.h = this.e.d(0L, true, true).subscribe(new ji3(new nvg(this, 20), 29));
    }

    @Override // xsna.izh0
    public final void X1(String str, boolean z) {
    }
}
