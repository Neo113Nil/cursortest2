package xsna;

/* compiled from: OnMediaPlaceable.kt */
/* loaded from: classes18.dex */
public final class p880 {
    public final boolean a;
    public final int b;

    public p880() {
        this(false, 0);
    }

    public static p880 a(p880 p880Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = p880Var.a;
        }
        if ((i2 & 2) != 0) {
            i = p880Var.b;
        }
        p880Var.getClass();
        return new p880(z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p880)) {
            return false;
        }
        p880 p880Var = (p880) obj;
        return this.a == p880Var.a && this.b == p880Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaPlaceableState(isOverlayVisible=");
        sb.append(this.a);
        sb.append(", bottomOffset=");
        return vu5.b(sb, this.b, ')');
    }

    public p880(boolean z, int i) {
        this.a = z;
        this.b = i;
    }
}
