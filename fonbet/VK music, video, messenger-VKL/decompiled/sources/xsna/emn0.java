package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import xsna.m28;

/* compiled from: SwipeToDeleteHandler.kt */
/* loaded from: classes2.dex */
public final class emn0 extends r.g {
    public final j38 g;
    public final m28.b h;
    public Integer i;

    public emn0(j38 j38Var, m28.b bVar) {
        super(0, 12);
        this.g = j38Var;
        this.h = bVar;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        if (i == 0) {
            Integer num = this.i;
            if (num != null) {
                int intValue = num.intValue();
                m28.b bVar = this.h;
                if (bVar != null) {
                    m28.this.h.sendEmptyMessageDelayed(intValue, 10000L);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            this.i = null;
            return;
        }
        if (e0Var == null) {
            return;
        }
        hfz hfzVar = this.g.d.get(e0Var.getAdapterPosition());
        g8k0 g8k0Var = hfzVar instanceof g8k0 ? (g8k0) hfzVar : null;
        if (g8k0Var == null) {
            return;
        }
        this.i = Integer.valueOf(g8k0Var.b);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
        m28.b bVar;
        hfz hfzVar = this.g.d.get(e0Var.getAdapterPosition());
        g8k0 g8k0Var = hfzVar instanceof g8k0 ? (g8k0) hfzVar : null;
        if (g8k0Var == null || (bVar = this.h) == null) {
            return;
        }
        int i = g8k0Var.b;
        m28 m28Var = m28.this;
        m28Var.h.removeMessages(i);
        m28.c(m28Var, i);
    }
}
