package xsna;

/* compiled from: StatVideoDebugInfo.kt */
/* loaded from: classes5.dex */
public final class wsk0 {
    public final String a;
    public final int b;
    public final long c;
    public final String d;

    public wsk0(int i, String str, String str2, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsk0)) {
            return false;
        }
        wsk0 wsk0Var = (wsk0) obj;
        return epx.f(this.a, wsk0Var.a) && this.b == wsk0Var.b && this.c == wsk0Var.c && epx.f(this.d, wsk0Var.d);
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatVideoDebugInfo(sessionId=");
        sb.append(this.a);
        sb.append(", vid=");
        sb.append(this.b);
        sb.append(", oid=");
        sb.append(this.c);
        sb.append(", trackCode=");
        return ho8.a(sb, this.d, ')');
    }
}
