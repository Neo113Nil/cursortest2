package defpackage;

/* loaded from: classes10.dex */
public final class o951 {
    public final long a;
    public final long b;

    public o951(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o951.class.equals(obj.getClass())) {
            o951 o951Var = (o951) obj;
            if (o951Var.a == this.a && o951Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.a);
        sb.append(", flexIntervalMillis=");
        return b64.o(sb, this.b, '}');
    }
}
