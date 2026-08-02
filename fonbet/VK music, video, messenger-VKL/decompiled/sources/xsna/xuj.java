package xsna;

/* compiled from: Corners.kt */
/* loaded from: classes17.dex */
public final class xuj {
    public int a;
    public int b;
    public int c;
    public int d;

    public xuj() {
        this(0);
    }

    public static void c(xuj xujVar, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = xujVar.a;
        }
        if ((i5 & 2) != 0) {
            i2 = xujVar.b;
        }
        if ((i5 & 4) != 0) {
            i3 = xujVar.c;
        }
        if ((i5 & 8) != 0) {
            i4 = xujVar.d;
        }
        xujVar.a = i;
        xujVar.b = i2;
        xujVar.c = i3;
        xujVar.d = i4;
    }

    public final boolean a() {
        int i;
        int i2;
        int i3 = this.a;
        return i3 == 0 && i3 == (i = this.b) && i == (i2 = this.d) && this.c == i2;
    }

    public final void b(int i, int i2) {
        if ((i2 & 1) > 0) {
            this.a = i;
        }
        if ((i2 & 2) > 0) {
            this.b = i;
        }
        if ((i2 & 4) > 0) {
            this.c = i;
        }
        if ((i2 & 8) > 0) {
            this.d = i;
        }
        if (i2 == 0) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuj)) {
            return false;
        }
        xuj xujVar = (xuj) obj;
        return this.a == xujVar.a && this.b == xujVar.b && this.c == xujVar.c && this.d == xujVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Corners(topLeft=");
        sb.append(this.a);
        sb.append(", topRight=");
        sb.append(this.b);
        sb.append(", bottomLeft=");
        sb.append(this.c);
        sb.append(", bottomRight=");
        return vu5.b(sb, this.d, ')');
    }

    public xuj(int i) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }
}
