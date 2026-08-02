package xsna;

/* compiled from: HorizontalBounds.kt */
@vby
/* loaded from: classes17.dex */
public final class ncv {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ncv) {
            return this.a == ((ncv) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalBounds(left=");
        long j = this.a;
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", right=");
        sb.append(Float.intBitsToFloat((int) j));
        sb.append(')');
        return sb.toString();
    }
}
