package xsna;

/* compiled from: ProductCardViewState.kt */
/* loaded from: classes18.dex */
public final class ind0 implements lm50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final eld0 e;
    public final ikd0 f;
    public final lkd0 g;
    public final qld0 h;

    public ind0(boolean z, boolean z2, boolean z3, eld0 eld0Var, ikd0 ikd0Var, lkd0 lkd0Var, qld0 qld0Var) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = eld0Var;
        this.f = ikd0Var;
        this.g = lkd0Var;
        this.h = qld0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ind0)) {
            return false;
        }
        ind0 ind0Var = (ind0) obj;
        return this.b == ind0Var.b && this.c == ind0Var.c && this.d == ind0Var.d && epx.f(this.e, ind0Var.e) && epx.f(this.f, ind0Var.f) && epx.f(this.g, ind0Var.g) && epx.f(this.h, ind0Var.h);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        eld0 eld0Var = this.e;
        int hashCode = (b + (eld0Var == null ? 0 : eld0Var.hashCode())) * 31;
        ikd0 ikd0Var = this.f;
        int hashCode2 = (hashCode + (ikd0Var == null ? 0 : ikd0Var.hashCode())) * 31;
        lkd0 lkd0Var = this.g;
        int hashCode3 = (hashCode2 + (lkd0Var == null ? 0 : lkd0Var.hashCode())) * 31;
        qld0 qld0Var = this.h;
        return hashCode3 + (qld0Var != null ? qld0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Content(isRefreshing=" + this.b + ", isBlockingProgress=" + this.c + ", isLoading=" + this.d + ", gallery=" + this.e + ", communityInfo=" + this.f + ", communityMarketInfo=" + this.g + ", mainInfo=" + this.h + ')';
    }
}
