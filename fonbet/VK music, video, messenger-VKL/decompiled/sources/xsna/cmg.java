package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.lists.RecyclerPaginatedView;
import java.util.ArrayList;

/* compiled from: CommonSearchFeatureResultCatalogDelegate.kt */
/* loaded from: classes16.dex */
public final class cmg implements esh0 {
    public final kea a;
    public final SearchRequestFactory b;
    public final CatalogBasePaginatedListVh c;

    public cmg(kea keaVar, SearchRequestFactory searchRequestFactory, CatalogBasePaginatedListVh catalogBasePaginatedListVh) {
        this.a = keaVar;
        this.b = searchRequestFactory;
        this.c = catalogBasePaginatedListVh;
    }

    @Override // xsna.esh0
    public final void a() {
        kea keaVar = this.a;
        io.reactivex.rxjava3.disposables.c cVar = keaVar.f;
        if (cVar != null) {
            cVar.dispose();
        }
        keaVar.c();
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.c;
        catalogBasePaginatedListVh.clear();
        keaVar.o();
        RecyclerPaginatedView recyclerPaginatedView = catalogBasePaginatedListVh.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.e0();
    }

    @Override // xsna.esh0
    public final void b() {
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.c;
        RecyclerPaginatedView recyclerPaginatedView = catalogBasePaginatedListVh.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        View progressView = recyclerPaginatedView.getProgressView();
        boolean z = false;
        if (progressView != null && progressView.getVisibility() == 0) {
            z = true;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.a.f;
        if (cVar != null) {
            cVar.dispose();
        }
        if (z) {
            RecyclerPaginatedView recyclerPaginatedView2 = catalogBasePaginatedListVh.n;
            (recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null).e0();
        }
    }

    @Override // xsna.esh0
    public final yqh0 c() {
        RecyclerPaginatedView recyclerPaginatedView = this.c.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerPaginatedView.getRecyclerView().getLayoutManager();
        int v = linearLayoutManager.v();
        View findViewByPosition = linearLayoutManager.findViewByPosition(v);
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        kea keaVar = this.a;
        CatalogExtendedData catalogExtendedData = keaVar.M;
        UIBlockList uIBlockList = keaVar.l;
        UIBlockList zb = uIBlockList != null ? uIBlockList.zb() : null;
        com.vk.lists.c cVar = keaVar.d;
        return new yqh0(v, top, new zfa(catalogExtendedData, zb, cVar != null ? cVar.j() : null));
    }

    @Override // xsna.esh0
    public final void clear() {
        this.a.c();
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.c;
        catalogBasePaginatedListVh.clear();
        RecyclerPaginatedView recyclerPaginatedView = catalogBasePaginatedListVh.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.e0();
    }

    @Override // xsna.esh0
    public final void d(boolean z) {
        kea keaVar = this.a;
        io.reactivex.rxjava3.disposables.c cVar = keaVar.f;
        if (cVar != null) {
            cVar.dispose();
        }
        kea.w(keaVar, z, null, false, 6);
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.c;
        if (j5g.O0(catalogBasePaginatedListVh.h.d).isEmpty()) {
            RecyclerPaginatedView recyclerPaginatedView = catalogBasePaginatedListVh.n;
            (recyclerPaginatedView != null ? recyclerPaginatedView : null).e0();
        }
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
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder;
        zfa zfaVar = yqh0Var.c;
        kea keaVar = this.a;
        keaVar.e();
        keaVar.c();
        keaVar.M = zfaVar.a;
        keaVar.l = zfaVar.b;
        com.vk.lists.c cVar = keaVar.d;
        if (cVar != null) {
            cVar.s(zfaVar.c);
        }
        UIBlockList uIBlockList = keaVar.l;
        if (uIBlockList != null && (catalogPaginatedListViewHolder = keaVar.c) != null) {
            catalogPaginatedListViewHolder.N6(uIBlockList);
        }
        UIBlockList uIBlockList2 = keaVar.l;
        ArrayList<UIBlock> arrayList = uIBlockList2 != null ? uIBlockList2.y : null;
        if (arrayList == null || arrayList.isEmpty()) {
            keaVar.o();
        }
        RecyclerPaginatedView recyclerPaginatedView = this.c.n;
        ((LinearLayoutManager) (recyclerPaginatedView != null ? recyclerPaginatedView : null).getRecyclerView().getLayoutManager()).K(yqh0Var.a, yqh0Var.b);
    }
}
