package yads;

/* loaded from: classes10.dex */
public final class tw1 implements fv {
    public final ix1 a;

    public tw1(ix1 ix1Var) {
        this.a = ix1Var;
    }

    @Override // yads.fv
    public final void a(jg1 jg1Var, hv hvVar) {
        this.a.setClickListener(new sw1(jg1Var, hvVar));
    }
}
