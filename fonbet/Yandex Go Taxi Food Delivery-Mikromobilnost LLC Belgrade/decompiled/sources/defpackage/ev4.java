package defpackage;

/* loaded from: classes6.dex */
public final class ev4 {
    public final wp2 a;
    public final nvi0 b;
    public final int c;
    public final float d;
    public final n4v e;

    public ev4(wp2 wp2Var, ovi0 ovi0Var, int i, float f, n4v n4vVar) {
        this.a = wp2Var;
        this.b = ovi0Var;
        this.c = i;
        this.d = f;
        this.e = n4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev4)) {
            return false;
        }
        ev4 ev4Var = (ev4) obj;
        return jl40.l(this.a, ev4Var.a) && jl40.l(this.b, ev4Var.b) && this.c == ev4Var.c && Float.compare(this.d, ev4Var.d) == 0 && jl40.l(this.e, ev4Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nvi0 nvi0Var = this.b;
        int c = g8e.c(this.d, oyr.b(this.c, (hashCode + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31, 31), 31);
        n4v n4vVar = this.e;
        return Boolean.hashCode(false) + ((c + (n4vVar == null ? 0 : n4vVar.hashCode())) * 31);
    }

    public final String toString() {
        return "BarUiState(appColor=" + this.a + ", barPointerRemoteImage=" + this.b + ", color=" + this.c + ", offset=" + this.d + ", target=" + this.e + ", drawCenter=false)";
    }
}
