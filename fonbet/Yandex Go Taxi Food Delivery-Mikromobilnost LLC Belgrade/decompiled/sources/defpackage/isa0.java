package defpackage;

/* loaded from: classes14.dex */
public final class isa0 implements Comparable {
    public final long a;
    public final long b;
    public final String c;
    public final zzs w;
    public final String x;

    public isa0(long j, long j2, String str, zzs zzsVar, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.w = zzsVar;
        this.x = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a;
        long j2 = ((isa0) obj).a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isa0) {
            return this.a == ((isa0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder k = x4e.k("PendingMessage{id=", this.a, ", suggestionAlias='", this.c);
        k.append("', location=");
        k.append(this.w);
        k.append(", text='");
        k.append(this.x);
        return g8e.l(this.b, "', createDate=", "}", k);
    }
}
