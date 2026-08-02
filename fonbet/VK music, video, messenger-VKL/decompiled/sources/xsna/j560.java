package xsna;

/* compiled from: NetworkStatConfigConfig.kt */
/* loaded from: classes11.dex */
public final class j560 {
    public static final a h = new a();
    public static final j560 i = new j560(0);
    public final boolean a;
    public final double b;
    public final double c;
    public final double d;
    public final long e;
    public final long f;
    public final long g;

    /* compiled from: NetworkStatConfigConfig.kt */
    public static final class a {
    }

    public j560() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j560)) {
            return false;
        }
        j560 j560Var = (j560) obj;
        return this.a == j560Var.a && Double.compare(this.b, j560Var.b) == 0 && Double.compare(this.c, j560Var.c) == 0 && Double.compare(this.d, j560Var.d) == 0 && this.e == j560Var.e && this.f == j560Var.f && this.g == j560Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + bh10.a(bh10.a(zjh0.b(this.d, zjh0.b(this.c, zjh0.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStatConfigConfig(enabled=");
        sb.append(this.a);
        sb.append(", commonPart=");
        sb.append(this.b);
        sb.append(", imagesPart=");
        sb.append(this.c);
        sb.append(", audioPart=");
        sb.append(this.d);
        sb.append(", commonSecSub=");
        sb.append(this.e);
        sb.append(", imagesSecSub=");
        sb.append(this.f);
        sb.append(", audioSecSub=");
        return vu5.a(')', this.g, sb);
    }

    public /* synthetic */ j560(int i2) {
        this(false, 1.0d, 1.0d, 1.0d, 0L, 0L, 0L);
    }

    public j560(boolean z, double d, double d2, double d3, long j, long j2, long j3) {
        this.a = z;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }
}
