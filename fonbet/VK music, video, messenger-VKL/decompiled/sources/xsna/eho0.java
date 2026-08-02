package xsna;

import androidx.compose.foundation.text.Handle;
import xsna.zbi0;

/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes11.dex */
public final class eho0 implements zdo0 {
    public final /* synthetic */ gho0 a;
    public final /* synthetic */ boolean b;

    public eho0(gho0 gho0Var, boolean z) {
        this.a = gho0Var;
        this.b = z;
    }

    @Override // xsna.zdo0
    public final void a() {
        mjo0 d;
        boolean z = this.b;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        gho0 gho0Var = this.a;
        ((zak0) gho0Var.s).setValue(handle);
        long a = kdi0.a(gho0Var.n(z));
        j1z j1zVar = gho0Var.d;
        if (j1zVar == null || (d = j1zVar.d()) == null) {
            return;
        }
        long e = d.e(a);
        gho0Var.p = e;
        ((zak0) gho0Var.t).setValue(new ov70(e));
        gho0Var.r = 0L;
        gho0Var.u = -1;
        j1z j1zVar2 = gho0Var.d;
        if (j1zVar2 != null) {
            ((zak0) j1zVar2.q).setValue(Boolean.TRUE);
        }
        gho0Var.v(false);
    }

    @Override // xsna.zdo0
    public final void b() {
        gho0 gho0Var = this.a;
        gho0.d(gho0Var, null);
        gho0.c(gho0Var, null);
        gho0Var.v(true);
    }

    @Override // xsna.zdo0
    public final void d(long j) {
        gho0 gho0Var = this.a;
        long f = ov70.f(gho0Var.r, j);
        gho0Var.r = f;
        ((zak0) gho0Var.t).setValue(new ov70(ov70.f(gho0Var.p, f)));
        gho0.e(gho0Var, gho0Var.p(), gho0Var.k().a, false, this.b, zbi0.a.d, true, new xtu(9));
        gho0Var.v(false);
    }

    @Override // xsna.zdo0
    public final void onStop() {
        gho0 gho0Var = this.a;
        gho0.d(gho0Var, null);
        gho0.c(gho0Var, null);
        gho0Var.v(true);
    }

    @Override // xsna.zdo0
    public final void onCancel() {
    }

    @Override // xsna.zdo0
    public final void c(long j, zbi0 zbi0Var) {
    }
}
