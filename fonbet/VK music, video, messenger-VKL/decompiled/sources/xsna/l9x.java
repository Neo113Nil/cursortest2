package xsna;

/* compiled from: IntRect.kt */
/* loaded from: classes11.dex */
public final class l9x {
    public static final l9x e = new l9x(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public l9x(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & 4294967295L) | (((d() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9x)) {
            return false;
        }
        l9x l9xVar = (l9x) obj;
        return this.a == l9xVar.a && this.b == l9xVar.b && this.c == l9xVar.c && this.d == l9xVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return vu5.b(sb, this.d, ')');
    }
}
