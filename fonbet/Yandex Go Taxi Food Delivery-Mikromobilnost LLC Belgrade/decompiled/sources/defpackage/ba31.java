package defpackage;

/* loaded from: classes8.dex */
public final class ba31 implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    public ba31(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ba31 ba31Var = (ba31) obj;
        int compareUnsigned = Integer.compareUnsigned(this.a, ba31Var.a);
        if (compareUnsigned != 0) {
            return compareUnsigned;
        }
        int compareUnsigned2 = Integer.compareUnsigned(this.b, ba31Var.b);
        return compareUnsigned2 != 0 ? compareUnsigned2 : Integer.compareUnsigned(this.c, ba31Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba31)) {
            return false;
        }
        ba31 ba31Var = (ba31) obj;
        return this.a == ba31Var.a && this.b == ba31Var.b && this.c == ba31Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) tq11.a(this.a));
        sb.append('.');
        sb.append((Object) tq11.a(this.b));
        sb.append('.');
        sb.append((Object) tq11.a(this.c));
        return sb.toString();
    }
}
