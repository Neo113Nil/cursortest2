package xsna;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class z7p0 {
    public final boolean a;
    public final int b;
    public final int c;

    public z7p0(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public static z7p0 a(z7p0 z7p0Var, int i, int i2, int i3) {
        boolean z = z7p0Var.a;
        if ((i3 & 2) != 0) {
            i = z7p0Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = z7p0Var.c;
        }
        z7p0Var.getClass();
        return new z7p0(z, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7p0)) {
            return false;
        }
        z7p0 z7p0Var = (z7p0) obj;
        return this.a == z7p0Var.a && this.b == z7p0Var.b && this.c == z7p0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarState(isCartEnabled=");
        sb.append(this.a);
        sb.append(", bookmarksCount=");
        sb.append(this.b);
        sb.append(", cartCount=");
        return vu5.b(sb, this.c, ')');
    }
}
