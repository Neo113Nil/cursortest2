package xsna;

/* compiled from: ForgotId.kt */
/* loaded from: classes6.dex */
public final class x7s {
    public final String a;
    public final long b;

    public x7s(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7s)) {
            return false;
        }
        x7s x7sVar = (x7s) obj;
        return epx.f(this.a, x7sVar.a) && this.b == x7sVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForgotId(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        return vu5.a(')', this.b, sb);
    }
}
