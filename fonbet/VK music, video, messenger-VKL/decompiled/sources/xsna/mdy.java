package xsna;

/* compiled from: KeyInputModifier.kt */
/* loaded from: classes11.dex */
final class mdy extends d730<ody> {
    public final izs<hdy, Boolean> a;
    public final izs<hdy, Boolean> b;

    /* JADX WARN: Multi-variable type inference failed */
    public mdy(izs<? super hdy, Boolean> izsVar, izs<? super hdy, Boolean> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdy)) {
            return false;
        }
        mdy mdyVar = (mdy) obj;
        return this.a == mdyVar.a && this.b == mdyVar.b;
    }

    public final int hashCode() {
        izs<hdy, Boolean> izsVar = this.a;
        int hashCode = (izsVar != null ? izsVar.hashCode() : 0) * 31;
        izs<hdy, Boolean> izsVar2 = this.b;
        return hashCode + (izsVar2 != null ? izsVar2.hashCode() : 0);
    }

    @Override // xsna.d730
    public final ody r() {
        ody odyVar = new ody();
        odyVar.p = this.a;
        odyVar.q = this.b;
        return odyVar;
    }

    @Override // xsna.d730
    public final void s(ody odyVar) {
        ody odyVar2 = odyVar;
        odyVar2.p = this.a;
        odyVar2.q = this.b;
    }
}
