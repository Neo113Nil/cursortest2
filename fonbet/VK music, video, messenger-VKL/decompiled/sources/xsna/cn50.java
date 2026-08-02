package xsna;

/* compiled from: MviStoreSaver.kt */
/* loaded from: classes3.dex */
public final class cn50 implements bn50<Object, Object, Object, Object>, mm50<Object, Object, Object> {
    public final /* synthetic */ mm50<Object, Object, Object> b;

    public cn50(mm50<Object, Object, Object> mm50Var) {
        this.b = mm50Var;
    }

    @Override // xsna.mm50
    public final uic G(izs<? super Object, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super Object, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(Object obj) {
        this.b.b(obj);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final Object e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final Object getCurrentState() {
        return this.b.getCurrentState();
    }
}
