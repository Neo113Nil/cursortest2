package xsna;

/* compiled from: OverlayViewState.kt */
/* loaded from: classes17.dex */
public final class j390 implements jwk0 {
    public final r390 a;
    public final vf00 b;

    public j390(r390 r390Var, vf00 vf00Var) {
        this.a = r390Var;
        this.b = vf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j390)) {
            return false;
        }
        j390 j390Var = (j390) obj;
        return epx.f(this.a, j390Var.a) && epx.f(this.b, j390Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OverlayViewState(overlayVisibilityState=" + this.a + ", mainOverlayState=" + this.b + ')';
    }
}
