package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class j6q0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public j6q0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static j6q0 a(j6q0 j6q0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = j6q0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = j6q0Var.b;
        }
        if ((i & 8) != 0) {
            z4 = j6q0Var.d;
        }
        j6q0Var.getClass();
        return new j6q0(z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6q0)) {
            return false;
        }
        j6q0 j6q0Var = (j6q0) obj;
        return this.a == j6q0Var.a && this.b == j6q0Var.b && this.c == j6q0Var.c && this.d == j6q0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", forceDisableScroll=", Extension.C_BRAKE, qv10.u("ScrollState(refreshableByContent=", ", scrollableByContent=", ", scrollableBySetting=", this.a, this.b), this.c, this.d);
    }

    public /* synthetic */ j6q0(boolean z, int i) {
        this(true, true, true, (i & 8) != 0 ? false : z);
    }

    public j6q0() {
        this(false, 15);
    }
}
