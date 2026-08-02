package defpackage;

/* loaded from: classes4.dex */
public final class lfz extends yez {
    public final Exception a;
    public final String b;

    public lfz(Exception exc, String str) {
        this.a = exc;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfz)) {
            return false;
        }
        lfz lfzVar = (lfz) obj;
        return jl40.l(this.a, lfzVar.a) && jl40.l(this.b, lfzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Public key for log server " + this.b + " cannot be used with " + kca1.g(this.a);
    }
}
