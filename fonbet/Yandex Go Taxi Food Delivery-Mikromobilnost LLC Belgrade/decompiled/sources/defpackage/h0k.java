package defpackage;

/* loaded from: classes8.dex */
public final class h0k {
    public static final h0k c = new h0k(new e0k(0), ue20.d);
    public final e0k a;
    public final ue20 b;

    public h0k(e0k e0kVar, ue20 ue20Var) {
        this.a = e0kVar;
        this.b = ue20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0k)) {
            return false;
        }
        h0k h0kVar = (h0k) obj;
        return this.a.equals(h0kVar.a) && jl40.l(this.b, h0kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplaySettings(paddingsSettings=" + this.a + ", backgroundSettings=" + this.b + ')';
    }
}
