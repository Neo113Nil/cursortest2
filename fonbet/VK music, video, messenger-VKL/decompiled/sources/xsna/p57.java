package xsna;

/* compiled from: BiometricsDialogs.kt */
/* loaded from: classes15.dex */
public final class p57 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public p57() {
        this(false, false, false, false);
    }

    public static p57 a(p57 p57Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = p57Var.a;
        }
        boolean z3 = (i & 2) != 0 ? p57Var.b : true;
        if ((i & 4) != 0) {
            z2 = p57Var.c;
        }
        boolean z4 = (i & 8) != 0 ? p57Var.d : true;
        p57Var.getClass();
        return new p57(z, z3, z2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p57)) {
            return false;
        }
        p57 p57Var = (p57) obj;
        return this.a == p57Var.a && this.b == p57Var.b && this.c == p57Var.c && this.d == p57Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricsDialogs(isTooManyAttemptsVisible=");
        sb.append(this.a);
        sb.append(", isTooManyBiometricsAttemptsVisible=");
        sb.append(this.b);
        sb.append(", isLogoutVisible=");
        sb.append(this.c);
        sb.append(", isBiometricsChangedVisible=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public p57(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
