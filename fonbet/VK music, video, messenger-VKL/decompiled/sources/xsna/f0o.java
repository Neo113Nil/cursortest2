package xsna;

/* compiled from: DonutLevelLimit.kt */
/* loaded from: classes16.dex */
public final class f0o {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public f0o(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0o)) {
            return false;
        }
        f0o f0oVar = (f0o) obj;
        return this.a == f0oVar.a && this.b == f0oVar.b && this.c == f0oVar.c && this.d == f0oVar.d && this.e == f0oVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevelLimit(titleMaxLength=");
        sb.append(this.a);
        sb.append(", descriptionMaxLength=");
        sb.append(this.b);
        sb.append(", priceMin=");
        sb.append(this.c);
        sb.append(", priceMax=");
        sb.append(this.d);
        sb.append(", levelsMaxCount=");
        return vu5.b(sb, this.e, ')');
    }
}
