package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class hez0 extends RecyclerView.Adapter {
    public final ArrayList c;
    public final ogz0 d;

    public hez0(ArrayList arrayList, ogz0 ogz0Var) {
        this.c = arrayList;
        this.d = ogz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        zjz0 zjz0Var = (zjz0) e0Var;
        qcz0 qcz0Var = (qcz0) this.c.get(i);
        zjz0Var.m = qcz0Var;
        qcz0Var.b(zjz0Var.l, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ogz0 ogz0Var = this.d;
        ogz0Var.getClass();
        eiz0 eiz0Var = new eiz0(ogz0Var.c, ogz0Var.a, ogz0Var.d);
        eiz0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new zjz0(eiz0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        zjz0 zjz0Var = (zjz0) e0Var;
        qcz0 qcz0Var = zjz0Var.m;
        if (qcz0Var != null) {
            qcz0Var.a(zjz0Var.l);
        }
        zjz0Var.m = null;
        return super.onFailedToRecycleView(zjz0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        zjz0 zjz0Var = (zjz0) e0Var;
        qcz0 qcz0Var = zjz0Var.m;
        if (qcz0Var != null) {
            qcz0Var.a(zjz0Var.l);
        }
        zjz0Var.m = null;
        super.onViewRecycled(zjz0Var);
    }
}
