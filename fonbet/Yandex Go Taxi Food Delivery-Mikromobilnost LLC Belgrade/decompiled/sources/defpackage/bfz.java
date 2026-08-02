package defpackage;

/* loaded from: classes4.dex */
public final class bfz extends yez {
    public final Exception a;

    public bfz(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfz) && jl40.l(this.a, ((bfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.sig failed to load with ".concat(kca1.g(this.a));
    }
}
