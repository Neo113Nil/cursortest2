package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class jb21 {
    public final u8j0 a;
    public final ja21 b;
    public final boolean c;
    public final boolean d;
    public final sb21 e;

    public jb21(u8j0 u8j0Var, ja21 ja21Var, boolean z, boolean z2, sb21 sb21Var) {
        this.a = u8j0Var;
        this.b = ja21Var;
        this.c = z;
        this.d = z2;
        this.e = sb21Var;
    }

    public static jb21 a(jb21 jb21Var, u8j0 u8j0Var, ja21 ja21Var, boolean z, boolean z2, sb21 sb21Var, int i) {
        if ((i & 1) != 0) {
            u8j0Var = jb21Var.a;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i & 2) != 0) {
            ja21Var = jb21Var.b;
        }
        ja21 ja21Var2 = ja21Var;
        if ((i & 4) != 0) {
            z = jb21Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = jb21Var.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            sb21Var = jb21Var.e;
        }
        jb21Var.getClass();
        return new jb21(u8j0Var2, ja21Var2, z3, z4, sb21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb21)) {
            return false;
        }
        jb21 jb21Var = (jb21) obj;
        return this.a.equals(jb21Var.a) && jl40.l(this.b, jb21Var.b) && this.c == jb21Var.c && this.d == jb21Var.d && this.e.equals(jb21Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradeState(applicationRequest=");
        sb.append(this.a);
        sb.append(", form=");
        sb.append(this.b);
        sb.append(", showValidationErrors=");
        nnm.v(", isFormSubmissionInProgress=", ", innSuggest=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
