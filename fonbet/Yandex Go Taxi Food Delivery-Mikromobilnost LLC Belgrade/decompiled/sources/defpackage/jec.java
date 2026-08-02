package defpackage;

/* loaded from: classes2.dex */
public final class jec {
    public final String a;
    public final gec b;
    public final dec c;
    public final eec d;
    public final fec e;

    public jec(String str, gec gecVar, dec decVar, eec eecVar, fec fecVar) {
        this.a = str;
        this.b = gecVar;
        this.c = decVar;
        this.d = eecVar;
        this.e = fecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jec)) {
            return false;
        }
        jec jecVar = (jec) obj;
        return jl40.l(this.a, jecVar.a) && jl40.l(this.b, jecVar.b) && jl40.l(this.c, jecVar.c) && jl40.l(this.d, jecVar.d) && jl40.l(this.e, jecVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gec gecVar = this.b;
        int hashCode2 = (hashCode + (gecVar == null ? 0 : gecVar.a.hashCode())) * 31;
        dec decVar = this.c;
        int hashCode3 = (hashCode2 + (decVar == null ? 0 : decVar.hashCode())) * 31;
        eec eecVar = this.d;
        int hashCode4 = (hashCode3 + (eecVar == null ? 0 : eecVar.hashCode())) * 31;
        fec fecVar = this.e;
        return hashCode4 + (fecVar != null ? fecVar.hashCode() : 0);
    }

    public final String toString() {
        return "ColorFields(__typename=" + this.a + ", onCheckoutRgbaColor=" + this.b + ", onCheckoutDesignColor=" + this.c + ", onCheckoutLinearGradientColor=" + this.d + ", onCheckoutRadialGradientColor=" + this.e + ')';
    }
}
