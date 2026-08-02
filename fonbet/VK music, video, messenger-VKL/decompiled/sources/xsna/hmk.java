package xsna;

import android.view.ViewGroup;

/* compiled from: SimpleAdapter.kt */
/* loaded from: classes17.dex */
public final class hmk extends on6 {
    public static final /* synthetic */ int o = 0;
    public final ViewGroup n;

    public hmk(ViewGroup viewGroup) {
        super(viewGroup);
        this.n = viewGroup;
    }

    @Override // xsna.on6
    public final void V5(brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
        this.l = brj0Var;
        this.m = izsVar;
        cpj0 cpj0Var = brj0Var.m;
        if (cpj0Var != null) {
            cpj0Var.a(this.n, brj0Var, izsVar);
        }
    }

    @Override // xsna.on6
    public final void W5() {
        cpj0 cpj0Var;
        brj0 brj0Var = this.l;
        if (brj0Var != null && (cpj0Var = brj0Var.m) != null) {
            cpj0Var.b();
        }
        super.W5();
    }
}
