package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class fyz0 {
    public static final eyz0 Companion = new eyz0();
    public final long a;
    public final long b;

    public /* synthetic */ fyz0(int i, long j, long j2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dyz0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyz0)) {
            return false;
        }
        fyz0 fyz0Var = (fyz0) obj;
        return this.a == fyz0Var.a && this.b == fyz0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutParams(startedTimeoutMillis=");
        sb.append(this.a);
        sb.append(", loadedTimeoutMillis=");
        return b64.o(sb, this.b, ')');
    }
}
