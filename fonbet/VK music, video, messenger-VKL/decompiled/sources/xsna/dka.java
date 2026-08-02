package xsna;

/* compiled from: CategoriesStore.kt */
/* loaded from: classes18.dex */
public final class dka implements mm50<cka, fja, mja> {
    public final /* synthetic */ um50 b;

    public dka() {
        throw null;
    }

    public dka(um50 um50Var) {
        this.b = um50Var;
    }

    @Override // xsna.mm50
    public final uic G(izs<? super cka, s3q0> izsVar) {
        return this.b.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super mja, s3q0> izsVar) {
        return this.b.d.a(izsVar);
    }

    @Override // xsna.mm50
    public final void b(fja fjaVar) {
        this.b.b(fjaVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final cka getCurrentState() {
        return (cka) this.b.e.b();
    }
}
