package xsna;

/* compiled from: CornerItems.kt */
/* loaded from: classes17.dex */
public final class ruj {
    public int a;
    public int b;
    public int c;

    public ruj() {
        this(0);
    }

    public final void a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruj)) {
            return false;
        }
        ruj rujVar = (ruj) obj;
        rujVar.getClass();
        return this.a == rujVar.a && this.b == rujVar.b && this.c == rujVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, shy.a(this.a, Integer.hashCode(0) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CornerItems(leftTop=0, rightTop=");
        sb.append(this.a);
        sb.append(", rightBottom=");
        sb.append(this.b);
        sb.append(", leftBottom=");
        return vu5.b(sb, this.c, ')');
    }

    public ruj(int i) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}
