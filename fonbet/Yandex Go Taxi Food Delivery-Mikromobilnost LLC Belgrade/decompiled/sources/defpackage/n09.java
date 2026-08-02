package defpackage;

/* loaded from: classes14.dex */
public final class n09 extends k09 {
    @Override // defpackage.q09
    public final boolean b(k09 k09Var) {
        if (k09Var instanceof o09) {
            return this.a == ((o09) k09Var).a;
        }
        return false;
    }

    @Override // defpackage.q09
    public final boolean c(q09 q09Var) {
        if ((q09Var instanceof m09) || (q09Var instanceof o09)) {
            return this.a == ((k09) q09Var).a;
        }
        return false;
    }

    @Override // defpackage.k09
    public final void d() {
        i09 i09Var = this.d;
        if (i09Var != null) {
            i09Var.run();
        }
    }

    @Override // defpackage.k09
    public final yx01 e() {
        throw new RuntimeException("Unreachable");
    }

    @Override // defpackage.k09
    public final void f() {
        this.a.i().pause();
        i09 i09Var = this.c;
        if (i09Var != null) {
            i09Var.run();
        }
    }
}
