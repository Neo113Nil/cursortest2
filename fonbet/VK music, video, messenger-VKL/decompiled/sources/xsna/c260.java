package xsna;

/* compiled from: NetFallbackWindowConfig.kt */
/* loaded from: classes11.dex */
public final class c260 {
    public static final a d = new a();
    public static final c260 e = new c260(0);
    public final boolean a;
    public final long b;
    public final int c;

    /* compiled from: NetFallbackWindowConfig.kt */
    public static final class a {
    }

    public c260() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c260)) {
            return false;
        }
        c260 c260Var = (c260) obj;
        return this.a == c260Var.a && this.b == c260Var.b && this.c == c260Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetFallbackWindowConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", timeWindowMs=");
        sb.append(this.b);
        sb.append(", exceptionsCount=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ c260(int i) {
        this(false, 1000L, 8);
    }

    public c260(boolean z, long j, int i) {
        this.a = z;
        this.b = j;
        this.c = i;
    }
}
