package xsna;

/* compiled from: MainOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class of00 {
    public final boolean a;
    public final jxk0 b;
    public final tgg c;
    public final boolean d;
    public final boolean e;
    public final dv f;

    public of00(boolean z, jxk0 jxk0Var, tgg tggVar, boolean z2, boolean z3, dv dvVar) {
        this.a = z;
        this.b = jxk0Var;
        this.c = tggVar;
        this.d = z2;
        this.e = z3;
        this.f = dvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of00)) {
            return false;
        }
        of00 of00Var = (of00) obj;
        return this.a == of00Var.a && epx.f(this.b, of00Var.b) && epx.f(this.c, of00Var.c) && this.d == of00Var.d && this.e == of00Var.e && epx.f(this.f, of00Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "MainOverlayMappingData(visible=" + this.a + ", adsState=" + this.b + ", adsData=" + this.c + ", isStaticAdFocused=" + this.d + ", descriptionExpanded=" + this.e + ", actionButtonState=" + this.f + ')';
    }
}
