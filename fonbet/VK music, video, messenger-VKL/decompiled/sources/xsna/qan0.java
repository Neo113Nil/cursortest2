package xsna;

/* compiled from: SuperAppQueueAccessParams.kt */
/* loaded from: classes5.dex */
public final class qan0 {
    public final String a;
    public final String b;
    public final String c;
    public long d;

    public qan0(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qan0)) {
            return false;
        }
        qan0 qan0Var = (qan0) obj;
        return epx.f(this.a, qan0Var.a) && epx.f(this.b, qan0Var.b) && epx.f(this.c, qan0Var.c) && this.d == qan0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppQueueAccessParams(queueId=");
        sb.append(this.a);
        sb.append(", baseUrl=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", ts=");
        return vu5.a(')', this.d, sb);
    }
}
