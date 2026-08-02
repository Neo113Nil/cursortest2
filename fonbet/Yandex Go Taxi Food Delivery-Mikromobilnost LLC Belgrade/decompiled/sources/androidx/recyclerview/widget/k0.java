package androidx.recyclerview.widget;

import defpackage.u70;

/* loaded from: classes.dex */
public final class k0 {
    public final /* synthetic */ RecyclerView a;

    public k0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(u70 u70Var) {
        int i = u70Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.mLayout.O0(u70Var.b, u70Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.mLayout.R0(u70Var.b, u70Var.d);
        } else if (i == 4) {
            recyclerView.mLayout.T0(recyclerView, u70Var.b, u70Var.d, u70Var.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.mLayout.Q0(u70Var.b, u70Var.d);
        }
    }
}
