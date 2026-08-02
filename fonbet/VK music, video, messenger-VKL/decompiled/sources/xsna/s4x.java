package xsna;

/* compiled from: WindowInsets.kt */
/* loaded from: classes11.dex */
public final class s4x {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public s4x(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4x)) {
            return false;
        }
        s4x s4xVar = (s4x) obj;
        return this.a == s4xVar.a && this.b == s4xVar.b && this.c == s4xVar.c && this.d == s4xVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vu5.b(sb, this.d, ')');
    }
}
