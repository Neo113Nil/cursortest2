package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.lym0;

/* compiled from: SubscriptionAdapter.kt */
/* loaded from: classes6.dex */
public final class lxm0 extends zoj0<lym0, vif0<?>> {
    public final iml0 e;

    public lxm0(ListDataSet listDataSet, iml0 iml0Var) {
        super(listDataSet);
        this.e = iml0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        lym0 lym0Var = (lym0) this.c.c(i);
        if (lym0Var != null) {
            return lym0Var.a;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        lym0 lym0Var = (lym0) this.c.c(i);
        if (lym0Var == null) {
            return;
        }
        if (lym0Var instanceof lym0.b) {
            ((mym0) vif0Var).V5(lym0Var);
        } else if (lym0Var instanceof lym0.a) {
            ((aq8) vif0Var).V5(lym0Var);
        } else {
            if (!(lym0Var instanceof lym0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            ((w3z) vif0Var).V5(lym0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new mym0(viewGroup);
        }
        if (i == 2) {
            return new aq8(viewGroup, this.e);
        }
        if (i == 3) {
            return new w3z(viewGroup);
        }
        throw new Exception();
    }
}
