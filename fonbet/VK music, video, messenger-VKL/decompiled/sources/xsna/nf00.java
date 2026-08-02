package xsna;

/* compiled from: MainOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class nf00 {
    public final boolean a;
    public final hr00 b;
    public final tgg c;
    public final boolean d;
    public final boolean e;
    public final cv f;

    public nf00(boolean z, hr00 hr00Var, tgg tggVar, boolean z2, boolean z3, cv cvVar) {
        this.a = z;
        this.b = hr00Var;
        this.c = tggVar;
        this.d = z2;
        this.e = z3;
        this.f = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf00)) {
            return false;
        }
        nf00 nf00Var = (nf00) obj;
        return this.a == nf00Var.a && epx.f(this.b, nf00Var.b) && epx.f(this.c, nf00Var.c) && this.d == nf00Var.d && this.e == nf00Var.e && epx.f(this.f, nf00Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "MainOverlayMappingData(visible=" + this.a + ", adsState=" + this.b + ", adsData=" + this.c + ", isMarketAdFocused=" + this.d + ", descriptionExpanded=" + this.e + ", actionButtonState=" + this.f + ')';
    }
}
