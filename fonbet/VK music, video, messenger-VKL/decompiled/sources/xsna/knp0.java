package xsna;

import xsna.m5s0;

/* compiled from: TransitioningHelperImpl.kt */
/* loaded from: classes17.dex */
public final class knp0 implements jnp0 {
    public a a;

    /* compiled from: TransitioningHelperImpl.kt */
    public static final class a implements inp0 {
        public final g5s0 a;

        public a(g5s0 g5s0Var) {
            this.a = g5s0Var;
        }

        @Override // xsna.inp0
        public final void a(yg5 yg5Var) {
            qi5 qi5Var = yg5Var != null ? new qi5(yg5Var) : null;
            i5s0 i5s0Var = this.a.a;
            m5s0 m5s0Var = i5s0Var.b;
            if (m5s0Var instanceof m5s0.a) {
                boolean f = epx.f(((m5s0.a) m5s0Var).b, qi5Var);
                m5s0 m5s0Var2 = i5s0Var.b;
                if (m5s0Var2 instanceof m5s0.a) {
                    i5s0Var.b(m5s0.a.a((m5s0.a) m5s0Var2, null, null, false, f, false, 95));
                }
            }
        }
    }

    @Override // xsna.jnp0
    public final void a(g5s0 g5s0Var) {
        a aVar = this.a;
        if (!g5s0Var.equals(aVar != null ? aVar.a : null)) {
            this.a = new a(g5s0Var);
        }
        a aVar2 = this.a;
        if (aVar2 == null || !bmp0.d.add(aVar2)) {
            return;
        }
        aVar2.a(bmp0.a);
    }

    @Override // xsna.jnp0
    public final boolean b(kih0 kih0Var) {
        yg5 yg5Var = bmp0.a;
        return epx.f(bmp0.a, d370.R(kih0Var));
    }

    @Override // xsna.jnp0
    public final void c(g5s0 g5s0Var) {
        a aVar;
        a aVar2 = this.a;
        if (g5s0Var.equals(aVar2 != null ? aVar2.a : null) && (aVar = this.a) != null) {
            bmp0.d.remove(aVar);
        }
    }
}
