package xsna;

/* compiled from: PlaylistHeaderComponentsData.kt */
/* loaded from: classes3.dex */
public final class g9b0 {
    public final aab0 a;
    public final f9b0 b;

    public g9b0(aab0 aab0Var, f9b0 f9b0Var) {
        this.a = aab0Var;
        this.b = f9b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9b0)) {
            return false;
        }
        g9b0 g9b0Var = (g9b0) obj;
        return epx.f(this.a, g9b0Var.a) && epx.f(this.b, g9b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistHeaderComponentsData(subtitleComponent=" + this.a + ", buttonsComponent=" + this.b + ')';
    }
}
