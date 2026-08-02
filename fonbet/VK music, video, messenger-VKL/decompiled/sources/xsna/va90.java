package xsna;

/* compiled from: PagerBeyondBoundsModifier.kt */
/* loaded from: classes11.dex */
public final class va90 implements tsy {
    public final mc90 a;
    public final int b;

    public va90(mc90 mc90Var, int i) {
        this.a = mc90Var;
        this.b = i;
    }

    @Override // xsna.tsy
    public final int a() {
        return Math.max(0, this.a.e - this.b);
    }

    @Override // xsna.tsy
    public final int b() {
        int i;
        mc90 mc90Var = this.a;
        if (mc90Var.n().g().size() == 0) {
            return 0;
        }
        int n = egi.n(mc90Var.n());
        int e = mc90Var.n().e() + mc90Var.n().d();
        if (e != 0 && (i = n / e) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // xsna.tsy
    public final boolean c() {
        return !this.a.n().g().isEmpty();
    }

    @Override // xsna.tsy
    public final int d() {
        return Math.min(r0.o() - 1, ((e990) j5g.i0(this.a.n().g())).getIndex() + this.b);
    }

    @Override // xsna.tsy
    public final int getItemCount() {
        return this.a.o();
    }
}
