package defpackage;

/* loaded from: classes10.dex */
public final class h0y {
    public final int a;
    public final int b;
    public final boolean c;

    public h0y(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0y)) {
            return false;
        }
        h0y h0yVar = (h0y) obj;
        return this.a == h0yVar.a && this.b == h0yVar.b && this.c == h0yVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return unr0.u(sb, this.c, ')');
    }
}
