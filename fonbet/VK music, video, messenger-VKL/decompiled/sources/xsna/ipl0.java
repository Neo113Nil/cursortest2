package xsna;

/* compiled from: StorefrontViewState.kt */
/* loaded from: classes18.dex */
public final class ipl0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public ipl0(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipl0)) {
            return false;
        }
        ipl0 ipl0Var = (ipl0) obj;
        return this.a == ipl0Var.a && this.b == ipl0Var.b && this.c == ipl0Var.c && this.d == ipl0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontTopBarState(isOwner=");
        sb.append(this.a);
        sb.append(", isCartEnabled=");
        sb.append(this.b);
        sb.append(", bookmarksCount=");
        sb.append(this.c);
        sb.append(", cartCount=");
        return vu5.b(sb, this.d, ')');
    }
}
