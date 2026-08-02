package xsna;

/* compiled from: UShort.kt */
@vby
/* loaded from: classes8.dex */
public final class vxp0 implements Comparable<vxp0> {
    public final short b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(vxp0 vxp0Var) {
        return epx.g(this.b & 65535, vxp0Var.b & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vxp0) {
            return this.b == ((vxp0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b & 65535);
    }
}
