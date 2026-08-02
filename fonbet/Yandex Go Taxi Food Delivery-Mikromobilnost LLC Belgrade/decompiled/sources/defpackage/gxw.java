package defpackage;

/* loaded from: classes2.dex */
public final class gxw {
    public final long a;
    public final long b;

    public gxw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxw)) {
            return false;
        }
        gxw gxwVar = (gxw) obj;
        return this.a == gxwVar.a && this.b == gxwVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollingConfiguration(totalTimeoutMillis=");
        sb.append(this.a);
        sb.append(", retryDelayMillis=");
        return b64.o(sb, this.b, ')');
    }
}
