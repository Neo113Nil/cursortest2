package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.lists.RecyclerPaginatedView;

/* compiled from: FeedRootVhUtils.kt */
/* loaded from: classes5.dex */
public final class m4r {
    public static void a(CommonSearchResultsVh commonSearchResultsVh, u4a u4aVar) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerPaginatedView ck = commonSearchResultsVh.ck();
        if (ck == null || (recyclerView = ck.getRecyclerView()) == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        if (lcaVar == null) {
            return;
        }
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        z3a z3aVar = catalogConfiguration instanceof z3a ? (z3a) catalogConfiguration : null;
        if (z3aVar != null) {
            z3aVar.b(lcaVar);
            RecyclerPaginatedView ck2 = commonSearchResultsVh.ck();
            if (ck2 == null || (recyclerView2 = ck2.getRecyclerView()) == null) {
                return;
            }
            recyclerView2.addItemDecoration(new mda(iah0.b(18.0f), 0, new zxn0()));
            recyclerView2.addItemDecoration(new bca());
        }
    }
}
