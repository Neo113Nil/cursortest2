package xsna;

/* compiled from: UInt.kt */
@vby
/* loaded from: classes8.dex */
public final class jxp0 implements Comparable<jxp0> {
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(jxp0 jxp0Var) {
        return epx.g(this.b ^ Integer.MIN_VALUE, jxp0Var.b ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jxp0) {
            return this.b == ((jxp0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b & 4294967295L);
    }
}
