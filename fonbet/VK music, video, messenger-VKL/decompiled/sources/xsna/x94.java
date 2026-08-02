package xsna;

/* compiled from: AudienceResearchEntity.kt */
/* loaded from: classes15.dex */
public final class x94 {
    public final long a;
    public final String b;
    public final long c;
    public final int d;

    public x94(long j, long j2, int i, String str) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x94)) {
            return false;
        }
        x94 x94Var = (x94) obj;
        return this.a == x94Var.a && epx.f(this.b, x94Var.b) && this.c == x94Var.c && this.d == x94Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudienceResearchEntity(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", createdAt=");
        sb.append(this.c);
        sb.append(", attempts=");
        return vu5.b(sb, this.d, ')');
    }
}
