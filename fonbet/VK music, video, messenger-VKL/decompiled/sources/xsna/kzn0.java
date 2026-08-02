package xsna;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;

/* compiled from: TabsSearchFeatureResultCatalogDelegate.kt */
/* loaded from: classes16.dex */
public final class kzn0 implements esh0 {
    public final g3a a;
    public final SearchRequestFactory b;
    public final TabsOrListVh c;

    public kzn0(g3a g3aVar, SearchRequestFactory searchRequestFactory, TabsOrListVh tabsOrListVh) {
        this.a = g3aVar;
        this.b = searchRequestFactory;
        this.c = tabsOrListVh;
    }

    @Override // xsna.esh0
    public final void a() {
        this.a.d();
    }

    @Override // xsna.esh0
    public final void b() {
        this.a.m.e();
    }

    @Override // xsna.esh0
    public final yqh0 c() {
        return null;
    }

    @Override // xsna.esh0
    public final void clear() {
        this.c.i8(lhp.a);
    }

    @Override // xsna.esh0
    public final void d(boolean z) {
        this.a.d();
    }

    @Override // xsna.esh0
    public final void e(dsh0 dsh0Var) {
        String str = dsh0Var.a;
        SearchRequestFactory searchRequestFactory = this.b;
        searchRequestFactory.e = str;
        searchRequestFactory.f = dsh0Var.b;
        String str2 = dsh0Var.d;
        searchRequestFactory.i = str2 != null ? cqm0.a(str2) : null;
        searchRequestFactory.n(dsh0Var.e);
        searchRequestFactory.g = dsh0Var.f;
        searchRequestFactory.h = dsh0Var.g;
        searchRequestFactory.o(dsh0Var.c);
    }

    @Override // xsna.esh0
    public final void f(yqh0 yqh0Var) {
    }
}
