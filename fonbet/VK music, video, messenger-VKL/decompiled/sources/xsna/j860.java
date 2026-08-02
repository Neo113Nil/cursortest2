package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewPosterColorAdapter.kt */
/* loaded from: classes4.dex */
public final class j860 extends zoj0<Integer, k860> {
    public final fux<Integer> e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public j860(fux<? super Integer> fuxVar) {
        this.e = fuxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        k860 k860Var = (k860) e0Var;
        k860Var.V5(this.c.c(i));
        boolean z = i == this.f;
        g860 g860Var = k860Var.p;
        if (g860Var.e == z) {
            return;
        }
        g860Var.e = z;
        g860Var.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new k860(viewGroup, this.e, this);
    }
}
