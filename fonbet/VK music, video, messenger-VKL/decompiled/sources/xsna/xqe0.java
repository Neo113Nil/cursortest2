package xsna;

/* compiled from: QueueAccessParams.kt */
/* loaded from: classes5.dex */
public final class xqe0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public xqe0(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqe0)) {
            return false;
        }
        xqe0 xqe0Var = (xqe0) obj;
        return epx.f(this.a, xqe0Var.a) && epx.f(this.b, xqe0Var.b) && epx.f(this.c, xqe0Var.c) && this.d == xqe0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueAccessParams(queueId=");
        sb.append(this.a);
        sb.append(", baseUrl=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", ts=");
        return vu5.a(')', this.d, sb);
    }
}
