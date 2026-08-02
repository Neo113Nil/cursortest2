package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.log.L;

/* compiled from: FeedLikesPlaceholderAdapter.kt */
/* loaded from: classes18.dex */
public final class k1r extends zoj0<Integer, vif0<Integer>> implements mf7 {
    @Override // xsna.mf7
    public final int e0(int i) {
        return 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1110;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        if (vif0Var instanceof j1r) {
            ((j1r) vif0Var).V5(this.c.c(i));
            return;
        }
        L.l("Can't support footer empty holder " + vif0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new j1r(viewGroup);
    }
}
