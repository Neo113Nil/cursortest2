package yads;

import android.view.View;

/* loaded from: classes10.dex */
public abstract class xz implements View.OnClickListener {
    public final cy1 a;
    public final wx1 b;

    public xz(cy1 cy1Var, wx1 wx1Var) {
        this.a = cy1Var;
        this.b = wx1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        wx1 wx1Var = this.b;
        if (wx1Var != null) {
            wx1Var.a();
            wx1Var.f = false;
        }
        cy1 cy1Var = this.a;
        if (cy1Var.c) {
            cy1Var.a("first_click_on_controls");
            cy1Var.c = false;
        }
    }

    public /* synthetic */ xz(cy1 cy1Var, wx1 wx1Var, int i) {
        this(cy1Var, wx1Var);
    }
}
