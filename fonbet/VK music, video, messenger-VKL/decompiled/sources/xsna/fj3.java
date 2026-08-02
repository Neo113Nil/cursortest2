package xsna;

/* compiled from: ArchiveToolbarState.kt */
/* loaded from: classes6.dex */
public final class fj3 {
    public final boolean a;
    public final boolean b;

    public fj3() {
        this(false, false);
    }

    public static fj3 a(fj3 fj3Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = fj3Var.a;
        }
        if ((i & 2) != 0) {
            z2 = fj3Var.b;
        }
        fj3Var.getClass();
        return new fj3(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj3)) {
            return false;
        }
        fj3 fj3Var = (fj3) obj;
        return this.a == fj3Var.a && this.b == fj3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArchiveToolbarState(showTip=");
        sb.append(this.a);
        sb.append(", selectMode=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public fj3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
