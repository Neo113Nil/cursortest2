package defpackage;

/* loaded from: classes9.dex */
public final class ka2 {
    public final long a;

    public ka2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka2) && e3n.d(this.a, ((ka2) obj).a);
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        return Integer.hashCode(0) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.p("LogParams(interval=", e3n.p(this.a), ", maxExamplesByReason=0)");
    }
}
