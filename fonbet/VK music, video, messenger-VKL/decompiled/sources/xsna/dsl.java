package xsna;

/* compiled from: DeferredDiscoverConfig.kt */
/* loaded from: classes.dex */
public final class dsl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public dsl(long j, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsl)) {
            return false;
        }
        dsl dslVar = (dsl) obj;
        return this.a == dslVar.a && this.b == dslVar.b && this.c == dslVar.c && this.d == dslVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDiscoverConfig(defer=");
        sb.append(this.a);
        sb.append(", awaitPreInflate=");
        sb.append(this.b);
        sb.append(", initOnDemand=");
        sb.append(this.c);
        sb.append(", fallbackTimeout=");
        return vu5.a(')', this.d, sb);
    }
}
