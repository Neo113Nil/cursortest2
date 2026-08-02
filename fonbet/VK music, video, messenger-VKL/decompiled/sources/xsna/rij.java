package xsna;

/* compiled from: ContentPositionOffset.kt */
/* loaded from: classes4.dex */
public final class rij {
    public static final rij e = new rij(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public rij() {
        this(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rij)) {
            return false;
        }
        rij rijVar = (rij) obj;
        return this.a == rijVar.a && this.b == rijVar.b && this.c == rijVar.c && this.d == rijVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return rzl.a(this.c, this.d, ", bottom=", ")", odj.a(this.a, this.b, "ContentPositionOffset(left=", ", top=", ", right="));
    }

    public rij(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
