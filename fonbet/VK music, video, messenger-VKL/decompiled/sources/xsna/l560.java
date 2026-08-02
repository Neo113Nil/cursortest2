package xsna;

/* compiled from: NetworkState.kt */
/* loaded from: classes.dex */
public final class l560 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public l560(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l560)) {
            return false;
        }
        l560 l560Var = (l560) obj;
        return this.a == l560Var.a && this.b == l560Var.b && this.c == l560Var.c && this.d == l560Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
