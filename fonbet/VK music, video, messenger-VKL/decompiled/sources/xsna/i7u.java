package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vkontakte.android.R;
import xsna.f6u;

/* compiled from: GoodPreviewView.kt */
/* loaded from: classes18.dex */
public final class i7u implements gm50 {
    public final sop b;
    public final u4e c;
    public final mzp0 d;
    public final f5z e;
    public final View f;
    public final ComposeView g;
    public final RecyclerView h;
    public final View i;
    public final ComposeView j;
    public final n5u k;
    public final SwipeRefreshLayout l;

    public i7u(Context context, sop sopVar, u4e u4eVar, mzp0 mzp0Var, f5z f5zVar) {
        this.b = sopVar;
        this.c = u4eVar;
        this.d = mzp0Var;
        this.e = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.good_preview_fragment, (ViewGroup) null);
        this.f = inflate;
        this.g = (ComposeView) inflate.findViewById(R.id.product_preview_top_bar);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_preview_content);
        this.h = recyclerView;
        this.i = inflate.findViewById(R.id.product_preview_loading_spinner);
        this.j = (ComposeView) inflate.findViewById(R.id.product_preview_error_compose_view);
        n5u n5uVar = new n5u();
        n5uVar.x0(o6u.class, new n1d(sopVar, 20));
        n5uVar.x0(t6u.class, new gmj(sopVar, 15));
        n5uVar.x0(p5u.class, new hxl(sopVar, 7));
        n5uVar.x0(q5u.class, new wik(sopVar, 12));
        n5uVar.x0(v6u.class, new u6(20, sopVar, n5uVar));
        n5uVar.x0(r6u.class, new ci7(26));
        this.k = n5uVar;
        x6u x6uVar = new x6u(sopVar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.l = swipeRefreshLayout;
        inflate.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        h7u h7uVar = new h7u(this, gridLayoutManager);
        h7uVar.c = true;
        gridLayoutManager.x = h7uVar;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(n5uVar);
            recyclerView.addOnScrollListener(x6uVar);
            recyclerView.addItemDecoration(new e7u(gridLayoutManager.x));
            recyclerView.addItemDecoration(new oog0(cn70.c(20), cn70.b(8), n5uVar));
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.g7u
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                i7u.this.c.invoke(f6u.a.a);
            }
        });
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }
}
