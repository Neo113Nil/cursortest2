package xsna;

import com.vk.search.integration.api.SearchDelegate;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: SearchQueryViewFactory.kt */
/* loaded from: classes5.dex */
public final class ayh0 implements vrh0 {
    public final /* synthetic */ emg b;
    public final /* synthetic */ emg c;
    public final /* synthetic */ f0i0 d;

    public ayh0(emg emgVar, f0i0 f0i0Var) {
        this.c = emgVar;
        this.d = f0i0Var;
        this.b = emgVar;
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
        this.c.g(searchQuery);
        String str = searchQuery.b;
        f0i0 f0i0Var = this.d;
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
