package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class m9y0 extends RecyclerView.Adapter {
    public List c = new ArrayList();
    public final woy0 d;

    public m9y0(woy0 woy0Var) {
        this.d = woy0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        wfy0 wfy0Var = (wfy0) this.c.get(i);
        ajz0 ajz0Var = ((ffy0) e0Var).l;
        ajz0Var.setCard(wfy0Var);
        ajz0Var.setOnClickListeners(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ffy0(new ajz0(viewGroup.getContext()));
    }
}
