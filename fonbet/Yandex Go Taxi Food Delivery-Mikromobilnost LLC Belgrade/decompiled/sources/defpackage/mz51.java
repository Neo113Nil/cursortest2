package defpackage;

/* loaded from: classes2.dex */
public final class mz51 {
    public final String a;
    public final long b;
    public final long c;

    public mz51(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz51)) {
            return false;
        }
        mz51 mz51Var = (mz51) obj;
        return this.a.equals(mz51Var.a) && this.b == mz51Var.b && this.c == mz51Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YbWebScreenState(url=");
        sb.append(this.a);
        sb.append(", startedTimeoutMillis=");
        sb.append(this.b);
        sb.append(", loadedTimeoutMillis=");
        return b64.o(sb, this.c, ')');
    }
}
