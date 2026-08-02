package xsna;

/* compiled from: PackageInfo.kt */
/* loaded from: classes5.dex */
public final class e790 {
    public final long a;
    public final String b;
    public final String c;
    public final Long d;

    public e790(String str, long j, String str2, Long l) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = l;
    }

    public static e790 a(e790 e790Var, String str, int i) {
        long j = e790Var.a;
        String str2 = e790Var.b;
        if ((i & 4) != 0) {
            str = e790Var.c;
        }
        return new e790(str2, j, str, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e790)) {
            return false;
        }
        e790 e790Var = (e790) obj;
        return this.a == e790Var.a && epx.f(this.b, e790Var.b) && epx.f(this.c, e790Var.c) && epx.f(this.d, e790Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PackageInfo(id=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", sha=");
        sb.append(this.c);
        sb.append(", invalidatedAt=");
        return iq.b(sb, this.d, ')');
    }
}
