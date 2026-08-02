package defpackage;

/* loaded from: classes10.dex */
public final class nxi {
    public static final nxi c = new nxi(0, 0);
    public final long a;
    public final long b;

    public nxi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nxi) {
            nxi nxiVar = (nxi) obj;
            return k6w.a(this.a, nxiVar.a) && this.b == nxiVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
