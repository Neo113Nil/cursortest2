package xsna;

/* compiled from: SessionGenerator.kt */
/* loaded from: classes.dex */
public final class iti0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public iti0(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iti0)) {
            return false;
        }
        iti0 iti0Var = (iti0) obj;
        return epx.f(this.a, iti0Var.a) && epx.f(this.b, iti0Var.b) && this.c == iti0Var.c && this.d == iti0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return vu5.a(')', this.d, sb);
    }
}
