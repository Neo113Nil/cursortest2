package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ffj;

/* compiled from: VkContextMenuAdapter.kt */
/* loaded from: classes17.dex */
public final class snu0<MenuKey> extends zoj0<ffj, rxt0<ffj>> {
    public final cde e;
    public final Object f = pn00.k(new Pair(0, new qzl0(this, 17)), new Pair(2, new eyp0(this)), new Pair(1, new h2h0(this)));

    /* compiled from: VkContextMenuAdapter.kt */
    public interface a<Key> {
        void a(ffj.c<Key> cVar);
    }

    public snu0(cde cdeVar) {
        this.e = cdeVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ffj ffjVar = (ffj) this.c.c(i);
        if (ffjVar instanceof ffj.c) {
            return 0;
        }
        if (ffjVar instanceof ffj.a) {
            return 2;
        }
        if (ffjVar instanceof ffj.b) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((rxt0) e0Var).V5((ffj) this.c.c(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        rxt0 rxt0Var;
        izs izsVar = (izs) this.f.get(Integer.valueOf(i));
        if (izsVar == null || (rxt0Var = (rxt0) izsVar.invoke(viewGroup)) == null) {
            throw new IllegalStateException("wrong view type");
        }
        return rxt0Var;
    }
}
