package xsna;

/* compiled from: DrawModifier.kt */
/* loaded from: classes11.dex */
final class ljo extends d730<iw8> {
    public final izs<kw8, jod> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ljo(izs<? super kw8, jod> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljo) {
            return this.a == ((ljo) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final iw8 r() {
        return new iw8(new kw8(), this.a);
    }

    @Override // xsna.d730
    public final void s(iw8 iw8Var) {
        iw8 iw8Var2 = iw8Var;
        iw8Var2.s = this.a;
        iw8Var2.A0();
    }
}
