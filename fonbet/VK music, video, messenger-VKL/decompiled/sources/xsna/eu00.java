package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* compiled from: MarketCardsVisibilityHelper.kt */
/* loaded from: classes17.dex */
public final class eu00 extends RecyclerView.t {
    public final dg1 b;
    public final int c;
    public final LinkedHashMap d = new LinkedHashMap();

    public eu00(dg1 dg1Var, int i) {
        this.b = dg1Var;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int v;
        int x;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (v = linearLayoutManager.v()) > (x = linearLayoutManager.x())) {
            return;
        }
        while (true) {
            RecyclerView.e0 a = wjf0.a(recyclerView, v);
            oo00 oo00Var = a instanceof oo00 ? (oo00) a : null;
            if (oo00Var != null) {
                Long valueOf = Long.valueOf(oo00Var.getItemId());
                LinkedHashMap linkedHashMap = this.d;
                Boolean bool = (Boolean) linkedHashMap.get(valueOf);
                if (!(bool != null ? bool.booleanValue() : false)) {
                    this.b.a(new tq00(recyclerView.getChildAdapterPosition(oo00Var.itemView), this.c));
                    linkedHashMap.put(Long.valueOf(oo00Var.getItemId()), Boolean.TRUE);
                }
            }
            if (v == x) {
                return;
            } else {
                v++;
            }
        }
    }
}
