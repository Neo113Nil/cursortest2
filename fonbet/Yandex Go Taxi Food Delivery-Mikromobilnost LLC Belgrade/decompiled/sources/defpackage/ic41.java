package defpackage;

/* loaded from: classes8.dex */
public final class ic41 implements f38 {
    public final gvc0 a;
    public final zwf0 b;

    public ic41(gvc0 gvc0Var, zwf0 zwf0Var) {
        this.a = gvc0Var;
        this.b = zwf0Var;
    }

    @Override // defpackage.f38
    public final void c(e38 e38Var) {
        u28 u28Var;
        if (e38Var instanceof c38) {
            u28Var = ((c38) e38Var).a;
        } else {
            if (!(e38Var instanceof d38)) {
                w511.b();
                return;
            }
            u28Var = ((d38) e38Var).a;
        }
        if (!jl40.l(u28Var.c(), "Web")) {
            this.a.c(e38Var);
            return;
        }
        this.b.c("WebCapabilityFilter", "Filtered out WebCapability: " + qoi0.a(u28Var.getClass()).d());
    }
}
