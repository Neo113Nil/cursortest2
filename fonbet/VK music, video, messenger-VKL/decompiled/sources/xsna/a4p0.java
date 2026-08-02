package xsna;

import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: ToolbarVh.kt */
/* loaded from: classes16.dex */
public final class a4p0 implements vrh0.a {
    public final /* synthetic */ ToolbarVh b;

    public a4p0(ToolbarVh toolbarVh) {
        this.b = toolbarVh;
    }

    @Override // xsna.vrh0.a
    public final void b(SearchQuery searchQuery) {
        this.b.L.onNext(searchQuery.b);
    }

    @Override // xsna.vrh0.a
    public final void a() {
    }

    @Override // xsna.vrh0.a
    public final void d() {
    }

    @Override // xsna.vrh0.a
    public final void f() {
    }

    @Override // xsna.vrh0.a
    public final void c(SearchQuery searchQuery) {
    }

    @Override // xsna.vrh0.a
    public final void e(SearchQuery searchQuery) {
    }
}
