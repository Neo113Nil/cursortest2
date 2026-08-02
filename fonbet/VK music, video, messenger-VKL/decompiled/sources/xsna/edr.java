package xsna;

/* compiled from: FilterParams.kt */
/* loaded from: classes4.dex */
public final class edr implements g5p {
    public final aa00 a;
    public final int b;
    public final ler c;

    public edr() {
        this(null, 7, 0);
    }

    @Override // xsna.g5p
    public final boolean I() {
        aa00 aa00Var = this.a;
        return aa00Var == null || aa00Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edr)) {
            return false;
        }
        edr edrVar = (edr) obj;
        edrVar.getClass();
        return epx.f(this.a, edrVar.a) && this.b == edrVar.b;
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return this.c;
    }

    public final int hashCode() {
        aa00 aa00Var = this.a;
        return Integer.hashCode(this.b) + ((aa00Var == null ? 0 : aa00Var.hashCode()) * 31);
    }

    public final String toString() {
        return "FilterParams(filterWrapper=null, lutWrapper=" + this.a + ", value=" + this.b + ")";
    }

    public edr(aa00 aa00Var, int i) {
        this.a = aa00Var;
        this.b = i;
        this.c = ler.a;
    }

    public /* synthetic */ edr(aa00 aa00Var, int i, int i2) {
        this((i & 2) != 0 ? null : aa00Var, (i & 4) != 0 ? 0 : 100);
    }
}
