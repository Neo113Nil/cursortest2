package xsna;

/* compiled from: SuperAppMenuV3SeparatorProvider.kt */
/* loaded from: classes6.dex */
public final class z9n0 implements jjv0 {
    public final r9n0 b;

    public z9n0(r9n0 r9n0Var) {
        this.b = r9n0Var;
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        p820 p820Var = (p820) this.b.c.c(i);
        return (p820Var.e() <= 0 || p820Var.d() != 0) ? 0 : 3;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return i == 0 ? iah0.a(4) : iah0.a(0);
    }
}
