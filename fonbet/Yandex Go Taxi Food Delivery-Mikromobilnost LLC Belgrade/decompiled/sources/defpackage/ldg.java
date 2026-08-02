package defpackage;

/* loaded from: classes2.dex */
public final class ldg {
    public final kdg a;
    public final gdg b;

    public ldg(kdg kdgVar, gdg gdgVar) {
        this.a = kdgVar;
        this.b = gdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldg)) {
            return false;
        }
        ldg ldgVar = (ldg) obj;
        return this.a.equals(ldgVar.a) && jl40.l(this.b, ldgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gdg gdgVar = this.b;
        return hashCode + (gdgVar == null ? 0 : gdgVar.hashCode());
    }

    public final String toString() {
        return "DailyContent(topPart=" + this.a + ", bottomPart=" + this.b + ')';
    }
}
