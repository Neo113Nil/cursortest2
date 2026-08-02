package xsna;

/* compiled from: UsersAndGroupsCount.kt */
/* loaded from: classes8.dex */
public final class n0r0 {
    public int a;
    public int b;

    public n0r0() {
        this(0);
    }

    public final boolean a() {
        return !(this.a > 0 || this.b > 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0r0)) {
            return false;
        }
        n0r0 n0r0Var = (n0r0) obj;
        return this.a == n0r0Var.a && this.b == n0r0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersAndGroupsCount(users=");
        sb.append(this.a);
        sb.append(", groups=");
        return vu5.b(sb, this.b, ')');
    }

    public n0r0(int i) {
        this.a = 0;
        this.b = 0;
    }
}
