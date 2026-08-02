package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: StickyDateController.kt */
/* loaded from: classes2.dex */
public final class tel0 {
    public final RecyclerView a;
    public final uy90 b;
    public final rfh0 c;
    public boolean d;

    public tel0(RecyclerView recyclerView, qd50 qd50Var, hez hezVar) {
        this.a = recyclerView;
        uy90 uy90Var = new uy90(qd50Var, hezVar);
        this.b = uy90Var;
        this.c = new rfh0(uy90Var);
        qd50Var.f();
    }

    public final void a(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        rfh0 rfh0Var = this.c;
        RecyclerView recyclerView = this.a;
        if (z) {
            recyclerView.addOnScrollListener(rfh0Var);
        } else {
            recyclerView.removeOnScrollListener(rfh0Var);
        }
    }
}
