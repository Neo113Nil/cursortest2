package xsna;

/* compiled from: DialogsDeleteForAllFlagGetCmd.kt */
/* loaded from: classes2.dex */
public final class jnm extends le6<Boolean> {
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Boolean a = w2wVar.I0().b().d().a();
        return Boolean.valueOf(a != null ? a.booleanValue() : false);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jnm);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsDeleteForAllFlagGetCmd()";
    }
}
