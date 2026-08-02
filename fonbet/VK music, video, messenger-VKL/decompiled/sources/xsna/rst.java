package xsna;

/* compiled from: GetMessagesArguments.kt */
/* loaded from: classes5.dex */
public final class rst {
    public final String a;
    public final String b;
    public final long c;
    public final int d;

    public rst(String str, String str2, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rst)) {
            return false;
        }
        rst rstVar = (rst) obj;
        return epx.f(this.a, rstVar.a) && epx.f(this.b, rstVar.b) && this.c == rstVar.c && this.d == rstVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetMessagesArguments(pushToken=");
        sb.append(this.a);
        sb.append(", projectId=");
        sb.append(this.b);
        sb.append(", minSyn=");
        sb.append(this.c);
        sb.append(", limit=");
        return vu5.b(sb, this.d, ')');
    }
}
