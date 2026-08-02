package defpackage;

import java.util.Map;

/* loaded from: classes15.dex */
public final class pgo {
    public final String a;
    public final long b;
    public final Map c;

    public pgo(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final Map a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgo)) {
            return false;
        }
        pgo pgoVar = (pgo) obj;
        return jl40.l(this.a, pgoVar.a) && this.b == pgoVar.b && jl40.l(this.c, pgoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", additionalCustomKeys=");
        return smw0.n(sb, this.c, ')');
    }
}
