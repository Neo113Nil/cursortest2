package xsna;

/* compiled from: IntIntPair.kt */
@vby
/* loaded from: classes11.dex */
public final class y8x {
    public final long a;

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vu5.b(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y8x) {
            return this.a == ((y8x) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
