package xsna;

import androidx.compose.foundation.text.Handle;

/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes11.dex */
public final class cho0 implements zdo0 {
    public final /* synthetic */ gho0 a;

    public cho0(gho0 gho0Var) {
        this.a = gho0Var;
    }

    @Override // xsna.zdo0
    public final void b() {
        gho0 gho0Var = this.a;
        gho0.d(gho0Var, null);
        gho0.c(gho0Var, null);
    }

    @Override // xsna.zdo0
    public final void c(long j, zbi0 zbi0Var) {
        mjo0 d;
        gho0 gho0Var = this.a;
        long a = kdi0.a(gho0Var.n(true));
        j1z j1zVar = gho0Var.d;
        if (j1zVar == null || (d = j1zVar.d()) == null) {
            return;
        }
        long e = d.e(a);
        gho0Var.p = e;
        ((zak0) gho0Var.t).setValue(new ov70(e));
        gho0Var.r = 0L;
        ((zak0) gho0Var.s).setValue(Handle.Cursor);
        gho0Var.v(false);
    }

    @Override // xsna.zdo0
    public final void d(long j) {
        mjo0 d;
        vtu vtuVar;
        gho0 gho0Var = this.a;
        gho0Var.r = ov70.f(gho0Var.r, j);
        j1z j1zVar = gho0Var.d;
        if (j1zVar == null || (d = j1zVar.d()) == null) {
            return;
        }
        ((zak0) gho0Var.t).setValue(new ov70(ov70.f(gho0Var.p, gho0Var.r)));
        int a = gho0Var.b.a(d.b(gho0Var.k().a, true));
        long c = jgz.c(a, a);
        if (qko0.b(c, gho0Var.p().b)) {
            return;
        }
        j1z j1zVar2 = gho0Var.d;
        if ((j1zVar2 == null || ((Boolean) ((zak0) j1zVar2.q).getValue()).booleanValue()) && (vtuVar = gho0Var.l) != null) {
            vtuVar.a(9);
        }
        gho0Var.c.invoke(gho0.g(gho0Var.p().a, c));
        gho0Var.x = new qko0(c);
    }

    @Override // xsna.zdo0
    public final void onStop() {
        gho0 gho0Var = this.a;
        gho0.d(gho0Var, null);
        gho0.c(gho0Var, null);
    }

    @Override // xsna.zdo0
    public final void a() {
    }

    @Override // xsna.zdo0
    public final void onCancel() {
    }
}
