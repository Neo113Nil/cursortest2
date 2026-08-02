package xsna;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes11.dex */
final class xny extends d730<moy> {
    public final yzs<ep10, zo10, o6j, dp10> a;

    /* JADX WARN: Multi-variable type inference failed */
    public xny(yzs<? super ep10, ? super zo10, ? super o6j, ? extends dp10> yzsVar) {
        this.a = yzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xny) {
            return this.a == ((xny) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final moy r() {
        moy moyVar = new moy();
        moyVar.p = this.a;
        return moyVar;
    }

    @Override // xsna.d730
    public final void s(moy moyVar) {
        moyVar.p = this.a;
    }
}
