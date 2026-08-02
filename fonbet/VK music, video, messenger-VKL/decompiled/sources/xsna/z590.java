package xsna;

/* compiled from: OwnersListItem.kt */
/* loaded from: classes7.dex */
public final class z590 {
    public final qvw0 a;
    public final boolean b;

    public z590(qvw0 qvw0Var, boolean z) {
        this.a = qvw0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z590)) {
            return false;
        }
        z590 z590Var = (z590) obj;
        return epx.f(this.a, z590Var.a) && this.b == z590Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersListItem(profile=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
