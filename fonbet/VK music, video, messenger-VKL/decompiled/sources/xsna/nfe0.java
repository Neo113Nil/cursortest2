package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nfe0 implements gzs {
    public final /* synthetic */ ofe0 b;
    public final /* synthetic */ LinearLayoutManager c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ nfe0(ofe0 ofe0Var, LinearLayoutManager linearLayoutManager, int i, int i2) {
        this.b = ofe0Var;
        this.c = linearLayoutManager;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ofe0 ofe0Var = this.b;
        RecyclerView recyclerView = ofe0Var.g;
        if (recyclerView != null) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = this.c;
            if (layoutManager != linearLayoutManager) {
                recyclerView = null;
            }
            if (recyclerView != null) {
                if (recyclerView.getScrollState() == 2) {
                    linearLayoutManager.scrollToPosition(this.d);
                } else {
                    pfe0 pfe0Var = (pfe0) j5g.j0(ofe0Var.n.keySet());
                    linearLayoutManager.K(this.e, pfe0Var != null ? linearLayoutManager.getBottomDecorationHeight(pfe0Var.getView()) : 0);
                }
            }
        }
        return Boolean.TRUE;
    }
}
