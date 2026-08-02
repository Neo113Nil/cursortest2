package yads;

/* loaded from: classes10.dex */
public final class p51 extends f {
    public final s51 d;

    public p51(int i, s51 s51Var) {
        super(s51Var.size(), i);
        this.d = s51Var;
    }

    @Override // yads.f
    public final Object a(int i) {
        return this.d.get(i);
    }
}
