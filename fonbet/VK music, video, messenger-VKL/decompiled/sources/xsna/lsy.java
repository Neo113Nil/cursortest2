package xsna;

/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes11.dex */
public final class lsy implements ksy {
    public rg50 a;
    public rg50 b;

    @Override // xsna.ksy
    public final q630 a(q630 q630Var) {
        return q630Var.g(new si90(this.a, null, 4));
    }

    @Override // xsna.ksy
    public final q630 b(q630 q630Var) {
        return q630Var.g(new si90(null, this.b, 2));
    }

    @Override // xsna.ksy
    public final q630 d() {
        return new si90(this.a, this.b);
    }

    @Override // xsna.ksy
    public final q630 e(q630 q630Var, phr<Float> phrVar, phr<h9x> phrVar2, phr<Float> phrVar3) {
        return (phrVar == null && phrVar2 == null && phrVar3 == null) ? q630Var : q630Var.g(new osy(phrVar, phrVar2, phrVar3));
    }
}
