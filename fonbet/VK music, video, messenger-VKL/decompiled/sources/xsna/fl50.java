package xsna;

/* compiled from: MviInlineActor.kt */
/* loaded from: classes3.dex */
public final class fl50 implements ll50<on50, jn50, kn50> {
    public final on50 b;
    public final /* synthetic */ ln50<on50> c;
    public final /* synthetic */ izs<kn50, jn50> d;

    public fl50(on50 on50Var, ln50<on50> ln50Var, izs<kn50, jn50> izsVar) {
        this.c = ln50Var;
        this.d = izsVar;
        this.b = on50Var;
    }

    @Override // xsna.ll50
    public final jn50 a(kn50 kn50Var) {
        return this.d.invoke(kn50Var);
    }

    @Override // xsna.hn50
    public final ln50<on50> d() {
        return this.c;
    }

    @Override // xsna.hn50
    public final on50 getId() {
        return this.b;
    }
}
