package xsna;

/* compiled from: RxExt.kt */
/* loaded from: classes17.dex */
public final class gtl {
    public final long a;
    public final long b;
    public final long c;

    public gtl() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtl)) {
            return false;
        }
        gtl gtlVar = (gtl) obj;
        return this.a == gtlVar.a && this.b == gtlVar.b && this.c == gtlVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DelaysSettings(showDelayMs=");
        sb.append(this.a);
        sb.append(", hideDelayMsOnSuccess=");
        sb.append(this.b);
        sb.append(", hideDelayMsOnError=");
        return vu5.a(')', this.c, sb);
    }

    public gtl(int i) {
        long j = (i & 1) != 0 ? 300L : 1000L;
        long j2 = (i & 2) != 0 ? 1000L : 0L;
        long j3 = (i & 4) == 0 ? 0L : 1000L;
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
