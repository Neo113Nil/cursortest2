package yads;

/* loaded from: classes10.dex */
public final class xw2 implements y32 {
    public final ov2 a;
    public final d4 b;

    public xw2(ov2 ov2Var, d4 d4Var) {
        this.a = ov2Var;
        this.b = d4Var;
    }

    @Override // yads.y32
    public final x32 a(n12 n12Var) {
        return new ww2(n12Var, this.b, new qw2(this.a));
    }
}
