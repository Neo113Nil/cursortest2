package xsna;

/* compiled from: StorefrontAlbumsState.kt */
/* loaded from: classes18.dex */
public final class r3p0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;

    public r3p0() {
        this(0);
    }

    public static r3p0 a(r3p0 r3p0Var, boolean z, boolean z2, int i, int i2, boolean z3, int i3) {
        if ((i3 & 1) != 0) {
            z = r3p0Var.a;
        }
        boolean z4 = z;
        if ((i3 & 2) != 0) {
            z2 = r3p0Var.b;
        }
        boolean z5 = z2;
        if ((i3 & 4) != 0) {
            i = r3p0Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = r3p0Var.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z3 = r3p0Var.e;
        }
        r3p0Var.getClass();
        return new r3p0(i4, i5, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3p0)) {
            return false;
        }
        r3p0 r3p0Var = (r3p0) obj;
        return this.a == r3p0Var.a && this.b == r3p0Var.b && this.c == r3p0Var.c && this.d == r3p0Var.d && this.e == r3p0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarState(isCartEnabled=");
        sb.append(this.a);
        sb.append(", canEdit=");
        sb.append(this.b);
        sb.append(", cartCount=");
        sb.append(this.c);
        sb.append(", bookmarksCount=");
        sb.append(this.d);
        sb.append(", isBookmarksEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ r3p0(int i) {
        this(0, 0, false, false, false);
    }

    public r3p0(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
    }
}
