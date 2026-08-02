package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public final /* synthetic */ class ehk0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ibk0 b;
    public final /* synthetic */ fhk0 c;
    public final /* synthetic */ wrs0 w;

    public /* synthetic */ ehk0(ibk0 ibk0Var, fhk0 fhk0Var, wrs0 wrs0Var) {
        this.b = ibk0Var;
        this.c = fhk0Var;
        this.w = wrs0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        wrs0 wrs0Var = this.w;
        fhk0 fhk0Var = this.c;
        ibk0 ibk0Var = this.b;
        switch (i) {
            case 0:
                fhk0Var.b.a(ibk0Var, wrs0Var);
                break;
            default:
                if (ibk0Var instanceof n9k0) {
                    int u = tje.u(24, view.getContext());
                    ibk0Var = n9k0.c((n9k0) ibk0Var, new m9k0(view, -u, u));
                }
                fhk0Var.b.a(ibk0Var, wrs0Var);
                break;
        }
    }

    public /* synthetic */ ehk0(fhk0 fhk0Var, ibk0 ibk0Var, wrs0 wrs0Var) {
        this.c = fhk0Var;
        this.b = ibk0Var;
        this.w = wrs0Var;
    }
}
