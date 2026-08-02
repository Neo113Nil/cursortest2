package xsna;

/* compiled from: UByte.kt */
@vby
/* loaded from: classes8.dex */
public final class uvp0 implements Comparable<uvp0> {
    public final byte b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(uvp0 uvp0Var) {
        return epx.g(this.b & 255, uvp0Var.b & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uvp0) {
            return this.b == ((uvp0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b & 255);
    }
}
