package xsna;

/* compiled from: TemplatesArguments.kt */
/* loaded from: classes3.dex */
public final class b9o0 {
    public final long a;
    public final long b;

    public b9o0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9o0)) {
            return false;
        }
        b9o0 b9o0Var = (b9o0) obj;
        return this.a == b9o0Var.a && this.b == b9o0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplatesArguments(groupId=");
        sb.append(this.a);
        sb.append(", userId=");
        return vu5.a(')', this.b, sb);
    }
}
