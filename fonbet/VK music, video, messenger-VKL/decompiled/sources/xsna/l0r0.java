package xsna;

/* compiled from: AdapterData.kt */
/* loaded from: classes6.dex */
public final class l0r0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public l0r0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0r0)) {
            return false;
        }
        l0r0 l0r0Var = (l0r0) obj;
        return this.a == l0r0Var.a && this.b == l0r0Var.b && this.c == l0r0Var.c && this.d == l0r0Var.d && this.e == l0r0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserViewHolderState(showSelectionIcon=");
        sb.append(this.a);
        sb.append(", showCounter=");
        sb.append(this.b);
        sb.append(", isActiveUser=");
        sb.append(this.c);
        sb.append(", isLogoutSwipeFunctionalEnabled=");
        sb.append(this.d);
        sb.append(", isLocked=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
