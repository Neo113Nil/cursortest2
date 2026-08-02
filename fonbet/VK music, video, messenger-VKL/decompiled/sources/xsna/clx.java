package xsna;

import java.util.Map;

/* compiled from: InternalRequestListener.kt */
/* loaded from: classes12.dex */
public final class clx implements w7g0, yhd0 {
    public final z9s a;
    public final y9s b;
    public final v7g0 c;
    public final w7g0 d;

    public clx(z9s z9sVar, y9s y9sVar) {
        this.a = z9sVar;
        this.b = y9sVar;
        this.c = z9sVar;
        this.d = y9sVar;
    }

    @Override // xsna.w7g0
    public final void a(ozi0 ozi0Var) {
        v7g0 v7g0Var = this.c;
        if (v7g0Var != null) {
            v7g0Var.i(ozi0Var.b, ozi0Var.e, ozi0Var.c, ozi0Var.v());
        }
        w7g0 w7g0Var = this.d;
        if (w7g0Var != null) {
            w7g0Var.a(ozi0Var);
        }
    }

    @Override // xsna.yhd0
    public final void b(uhd0 uhd0Var, String str, Throwable th, Map map) {
        z9s z9sVar = this.a;
        if (z9sVar != null) {
            z9sVar.f(uhd0Var.getId(), str, th, map);
        }
        y9s y9sVar = this.b;
        if (y9sVar != null) {
            y9sVar.b(uhd0Var, str, th, map);
        }
    }

    @Override // xsna.w7g0
    public final void c(uhd0 uhd0Var, Throwable th) {
        v7g0 v7g0Var = this.c;
        if (v7g0Var != null) {
            v7g0Var.k(uhd0Var.r(), uhd0Var.getId(), th, uhd0Var.v());
        }
        w7g0 w7g0Var = this.d;
        if (w7g0Var != null) {
            w7g0Var.c(uhd0Var, th);
        }
    }

    @Override // xsna.w7g0
    public final void d(uhd0 uhd0Var) {
        v7g0 v7g0Var = this.c;
        if (v7g0Var != null) {
            v7g0Var.e(uhd0Var.r(), uhd0Var.getId(), uhd0Var.v());
        }
        w7g0 w7g0Var = this.d;
        if (w7g0Var != null) {
            w7g0Var.d(uhd0Var);
        }
    }

    @Override // xsna.yhd0
    public final void e(uhd0 uhd0Var, String str, boolean z) {
        z9s z9sVar = this.a;
        if (z9sVar != null) {
            z9sVar.c(uhd0Var.getId(), str, z);
        }
        y9s y9sVar = this.b;
        if (y9sVar != null) {
            y9sVar.e(uhd0Var, str, z);
        }
    }

    @Override // xsna.yhd0
    public final void f(uhd0 uhd0Var, String str, Map map) {
        z9s z9sVar = this.a;
        if (z9sVar != null) {
            z9sVar.b(uhd0Var.getId(), str, map);
        }
        y9s y9sVar = this.b;
        if (y9sVar != null) {
            y9sVar.f(uhd0Var, str, map);
        }
    }

    @Override // xsna.yhd0
    public final void g(uhd0 uhd0Var, String str) {
        z9s z9sVar = this.a;
        if (z9sVar != null) {
            z9sVar.g(uhd0Var.getId(), str);
        }
        y9s y9sVar = this.b;
        if (y9sVar != null) {
            y9sVar.g(uhd0Var, str);
        }
    }

    @Override // xsna.w7g0
    public final void h(uhd0 uhd0Var) {
        v7g0 v7g0Var = this.c;
        if (v7g0Var != null) {
            v7g0Var.d(uhd0Var.getId());
        }
        w7g0 w7g0Var = this.d;
        if (w7g0Var != null) {
            w7g0Var.h(uhd0Var);
        }
    }

    @Override // xsna.yhd0
    public final boolean i(uhd0 uhd0Var, String str) {
        z9s z9sVar = this.a;
        Boolean valueOf = z9sVar != null ? Boolean.valueOf(z9sVar.j(uhd0Var.getId())) : null;
        if (!epx.f(valueOf, Boolean.TRUE)) {
            y9s y9sVar = this.b;
            valueOf = y9sVar != null ? Boolean.valueOf(y9sVar.i(uhd0Var, str)) : null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // xsna.yhd0
    public final void j(uhd0 uhd0Var) {
        z9s z9sVar = this.a;
        if (z9sVar != null) {
            z9sVar.h(uhd0Var.getId());
        }
        y9s y9sVar = this.b;
        if (y9sVar != null) {
            y9sVar.j(uhd0Var);
        }
    }

    @Override // xsna.yhd0
    public final void k(uhd0 uhd0Var, String str) {
        z9s z9sVar = this.a;
        if (z9sVar != null) {
            z9sVar.a(uhd0Var.getId(), str);
        }
        y9s y9sVar = this.b;
        if (y9sVar != null) {
            y9sVar.k(uhd0Var, str);
        }
    }
}
