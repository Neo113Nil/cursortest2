package xsna;

import xsna.b25;

/* compiled from: AuthBridgeAdapter.kt */
/* loaded from: classes17.dex */
public final class e180 implements b25.a {
    public final d80 b;
    public final e25 c;

    public e180(d80 d80Var, e25 e25Var) {
        this.b = d80Var;
        this.c = e25Var;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        d80 d80Var = this.b;
        d80Var.getClass();
        e25 e25Var = this.c;
        if (e25Var.a.b()) {
            i0q0.f(new com.vk.movika.sdk.base.flow.binding.j(8, d80Var, e25Var));
        }
    }

    public final boolean equals(Object obj) {
        boolean z = obj instanceof e180;
        d80 d80Var = this.b;
        return z ? epx.f(d80Var, ((e180) obj).b) : epx.f(d80Var, obj);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
