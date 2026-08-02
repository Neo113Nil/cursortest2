package xsna;

/* compiled from: SublistFilter.kt */
/* loaded from: classes2.dex */
public final class cum0 {
    public final long a;
    public final long b;

    public cum0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cum0)) {
            return false;
        }
        cum0 cum0Var = (cum0) obj;
        return this.a == cum0Var.a && this.b == cum0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SublistFilter(and=");
        sb.append(this.a);
        sb.append(", xor=");
        return vu5.a(')', this.b, sb);
    }
}
