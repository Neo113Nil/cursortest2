package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fq7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Boolean d;
    public final boolean e;

    public fq7(boolean z, boolean z2, boolean z3, Boolean bool, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = bool;
        this.e = z4;
    }

    public static fq7 a(fq7 fq7Var, boolean z, boolean z2, Boolean bool, boolean z3, int i) {
        boolean z4 = (i & 1) != 0 ? fq7Var.a : true;
        if ((i & 2) != 0) {
            z = fq7Var.b;
        }
        if ((i & 4) != 0) {
            z2 = fq7Var.c;
        }
        if ((i & 8) != 0) {
            bool = fq7Var.d;
        }
        if ((i & 16) != 0) {
            z3 = fq7Var.e;
        }
        boolean z5 = z3;
        fq7Var.getClass();
        Boolean bool2 = bool;
        return new fq7(z4, z, z2, bool2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq7)) {
            return false;
        }
        fq7 fq7Var = (fq7) obj;
        return this.a == fq7Var.a && this.b == fq7Var.b && this.c == fq7Var.c && jl40.l(this.d, fq7Var.d) && this.e == fq7Var.e;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        return Boolean.hashCode(this.e) + ((e + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("CameraState(isActive=", ", isCapturing=", ", isRebinding=", this.a, this.b);
        u.append(this.c);
        u.append(", pendingNightMode=");
        u.append(this.d);
        u.append(", currentNightMode=");
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ fq7(int i) {
        this(false, false, false, null, false);
    }

    public fq7() {
        this(0);
    }
}
