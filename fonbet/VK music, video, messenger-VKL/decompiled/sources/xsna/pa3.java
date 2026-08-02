package xsna;

/* compiled from: AppUpdateConfig.kt */
/* loaded from: classes6.dex */
public final class pa3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public pa3(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static pa3 a(pa3 pa3Var, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? pa3Var.a : true;
        boolean z4 = (i & 2) != 0 ? pa3Var.b : true;
        if ((i & 4) != 0) {
            z = pa3Var.c;
        }
        if ((i & 8) != 0) {
            z2 = pa3Var.d;
        }
        pa3Var.getClass();
        return new pa3(z3, z4, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa3)) {
            return false;
        }
        pa3 pa3Var = (pa3) obj;
        return this.a == pa3Var.a && this.b == pa3Var.b && this.c == pa3Var.c && this.d == pa3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppUpdateConfig(needMenu=");
        sb.append(this.a);
        sb.append(", needVkConnect=");
        sb.append(this.b);
        sb.append(", needInstallScreen=");
        sb.append(this.c);
        sb.append(", isAppUpdateInProgress=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
