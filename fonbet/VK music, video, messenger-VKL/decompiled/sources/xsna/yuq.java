package xsna;

import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: FeatureSearchTabFragmentAdapter.kt */
/* loaded from: classes5.dex */
public final class yuq implements vrh0 {
    public Boolean b;
    public Boolean c;
    public final /* synthetic */ zuq d;

    public yuq(zuq zuqVar) {
        this.d = zuqVar;
    }

    @Override // xsna.vrh0
    public final void a(vrh0.a aVar) {
        zuq zuqVar = this.d;
        vrh0.a aVar2 = zuqVar.i;
        if (aVar2 != null) {
            aVar2.f();
        }
        zuqVar.i = aVar;
    }

    @Override // xsna.vrh0
    public final boolean b() {
        if (!this.d.c.w.isFocused()) {
            return false;
        }
        int i = ify.a;
        return ify.e(ify.c);
    }

    @Override // xsna.vrh0
    public final void d(boolean z) {
        VkSearchView vkSearchView = this.d.c;
        if (z) {
            vkSearchView.g5(true);
        } else {
            vkSearchView.Y4(true);
        }
    }

    @Override // xsna.vrh0
    public final void d0() {
        zuq zuqVar = this.d;
        if (zuqVar.c.w.isFocused()) {
            zuqVar.c.d0();
        }
    }

    @Override // xsna.vrh0
    public final void e(boolean z) {
        if (Boolean.valueOf(z).equals(this.c)) {
            return;
        }
        this.c = Boolean.valueOf(z);
        zuq zuqVar = this.d;
        if (!z) {
            zuqVar.c.j5(null);
            return;
        }
        Boolean bool = this.b;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            zuqVar.c.j5(zuqVar.d);
            zuqVar.c.h5(true, booleanValue);
        }
    }

    @Override // xsna.vrh0
    public final void f(boolean z) {
        if (Boolean.valueOf(z).equals(this.b)) {
            return;
        }
        this.b = Boolean.valueOf(z);
        if (epx.f(this.c, Boolean.TRUE)) {
            this.d.c.h5(true, z);
        }
    }

    @Override // xsna.vrh0
    public final void g(SearchQuery searchQuery) {
        zuq zuqVar = this.d;
        sk3<SearchQuery> sk3Var = zuqVar.k;
        while (!sk3Var.isEmpty() && sk3Var.first() != searchQuery) {
            sk3Var.removeFirst();
        }
        if (!sk3Var.isEmpty()) {
            sk3Var.removeFirst();
            return;
        }
        zuqVar.e.b.onNext(new SearchQueryValueHelper.a(searchQuery, SearchQueryValueHelper.ChangeType.SILENT, null));
    }

    @Override // xsna.vrh0
    public final SearchQuery i() {
        return this.d.e.b();
    }

    @Override // xsna.vrh0
    public final void k() {
        VkSearchView vkSearchView = this.d.c;
        if (!vkSearchView.w.isFocused()) {
            vkSearchView.e5();
        }
        vkSearchView.a5();
    }

    @Override // xsna.vrh0
    public final void P1(String str) {
    }
}
