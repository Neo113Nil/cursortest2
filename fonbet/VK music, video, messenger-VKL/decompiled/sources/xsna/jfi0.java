package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import xsna.jsx0;
import xsna.vif0;

/* compiled from: SelectionTouchListener.kt */
/* loaded from: classes4.dex */
public final class jfi0<V extends vif0<T> & jsx0, T> extends yj3<V> {
    public final RecyclerView v;
    public final izs<T, s3q0> w;
    public final izs<T, s3q0> x;
    public boolean y;
    public final LinkedHashSet z;

    /* JADX WARN: Multi-variable type inference failed */
    public jfi0(RecyclerView recyclerView, f5z f5zVar, izs<? super T, s3q0> izsVar, izs<? super T, s3q0> izsVar2) {
        super(recyclerView, new z3z(f5zVar));
        this.v = recyclerView;
        this.w = izsVar;
        this.x = izsVar2;
        this.z = new LinkedHashSet();
    }

    @Override // xsna.yj3
    public final int a(RecyclerView.e0 e0Var) {
        return e0Var.getAbsoluteAdapterPosition();
    }

    @Override // xsna.yj3
    public final boolean d(boolean z) {
        this.z.clear();
        return super.d(false);
    }

    @Override // xsna.yj3
    public final boolean k(int i) {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yj3
    public final void s(int i, jsx0 jsx0Var) {
        vif0 vif0Var = (vif0) jsx0Var;
        if (i == -1 || vif0Var == null) {
            return;
        }
        z(i, vif0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yj3
    public final void v(int i, jsx0 jsx0Var) {
        vif0 vif0Var = (vif0) jsx0Var;
        if (i == -1 || vif0Var == null) {
            return;
        }
        z(i, vif0Var);
    }

    @Override // xsna.yj3
    public final void x(int i, int i2) {
        this.v.nestedScrollBy(0, i2);
    }

    public final void y(int i, boolean z) {
        LinkedHashSet linkedHashSet = this.z;
        if (z) {
            linkedHashSet.add(Integer.valueOf(i));
        } else {
            linkedHashSet.remove(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ITV;)V */
    public final void z(int i, vif0 vif0Var) {
        if (this.y) {
            Integer valueOf = Integer.valueOf(i);
            LinkedHashSet linkedHashSet = this.z;
            if (linkedHashSet.contains(valueOf)) {
                linkedHashSet.remove(Integer.valueOf(i));
                this.x.invoke(vif0Var.m);
            } else {
                linkedHashSet.add(Integer.valueOf(i));
                this.w.invoke(vif0Var.m);
            }
        }
    }
}
