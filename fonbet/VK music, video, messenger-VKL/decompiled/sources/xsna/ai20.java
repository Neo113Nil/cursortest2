package xsna;

/* compiled from: MetaInfo.kt */
/* loaded from: classes6.dex */
public final class ai20 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final Long e;

    public ai20(String str, int i, long j, long j2, Long l) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai20)) {
            return false;
        }
        ai20 ai20Var = (ai20) obj;
        return epx.f(this.a, ai20Var.a) && this.b == ai20Var.b && this.c == ai20Var.c && this.d == ai20Var.d && epx.f(this.e, ai20Var.e);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        Long l = this.e;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaInfo(key=");
        sb.append(this.a);
        sb.append(", accessedCounter=");
        sb.append(this.b);
        sb.append(", updatedAt=");
        sb.append(this.c);
        sb.append(", createdAt=");
        sb.append(this.d);
        sb.append(", lastReadAt=");
        return iq.b(sb, this.e, ')');
    }
}
