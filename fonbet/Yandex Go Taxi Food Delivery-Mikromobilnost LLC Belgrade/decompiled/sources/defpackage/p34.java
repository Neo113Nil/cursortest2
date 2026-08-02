package defpackage;

/* loaded from: classes10.dex */
public final class p34 extends hh3 {
    public final int a;
    public final long b;

    public p34(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.hh3
    public final int a() {
        return this.a;
    }

    @Override // defpackage.hh3
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hh3)) {
            return false;
        }
        hh3 hh3Var = (hh3) obj;
        return this.a == hh3Var.a() && this.b == hh3Var.b();
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return oyr.n(this.b, "}", sb);
    }
}
