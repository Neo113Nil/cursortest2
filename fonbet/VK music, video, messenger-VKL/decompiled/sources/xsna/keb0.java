package xsna;

/* compiled from: CollapsableHeaderViewState.kt */
/* loaded from: classes6.dex */
public final class keb0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final e3p0 e;

    public keb0(String str, boolean z, boolean z2, boolean z3, e3p0 e3p0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = e3p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keb0)) {
            return false;
        }
        keb0 keb0Var = (keb0) obj;
        return epx.f(this.a, keb0Var.a) && this.b == keb0Var.b && this.c == keb0Var.c && this.d == keb0Var.d && epx.f(this.e, keb0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + qoy.b(qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PlaylistToolbarViewState(title=" + this.a + ", hasEditBtn=" + this.b + ", hasSubscribeBtn=" + this.c + ", isSubscribed=" + this.d + ", coverViewState=" + this.e + ')';
    }
}
