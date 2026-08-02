package xsna;

/* compiled from: ContextFlags.kt */
@vby
/* loaded from: classes3.dex */
public final class jnj {
    public final int a;

    public static final String a(int i) {
        return d(i) ? "kids_section" : "unknown";
    }

    public static final boolean b(int i) {
        return (i & 2) != 0;
    }

    public static final boolean c(int i) {
        return d(i) && b(i);
    }

    public static final boolean d(int i) {
        return (i & 1) != 0;
    }

    public static final boolean e(int i) {
        return (i & 8) != 0;
    }

    public static final boolean f(int i) {
        return (i & 4) != 0;
    }

    public static final boolean g(int i) {
        return c(i) || e(i);
    }

    public static final boolean h(int i) {
        return d(i) || e(i);
    }

    public static final boolean i(int i) {
        return c(i) || f(i) || e(i);
    }

    public static final boolean j(int i) {
        return d(i) && !b(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jnj) {
            return this.a == ((jnj) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("ContextFlags(mask=", this.a, ')');
    }
}
