package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pus0 {
    public final ldc a;
    public final float b;
    public final float c;
    public final ma6 d;

    public pus0(ldc ldcVar, float f, float f2, ma6 ma6Var) {
        this.a = ldcVar;
        this.b = f;
        this.c = f2;
        this.d = ma6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pus0)) {
            return false;
        }
        pus0 pus0Var = (pus0) obj;
        return jl40.l(this.a, pus0Var.a) && y7m.b(this.b, pus0Var.b) && y7m.b(this.c, pus0Var.c) && jl40.l(this.d, pus0Var.d);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        int c = g8e.c(this.c, g8e.c(this.b, (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31, 31), 31);
        ma6 ma6Var = this.d;
        return c + (ma6Var != null ? ma6Var.hashCode() : 0);
    }

    public final String toString() {
        return "SlotStyle(backgroundColor=" + this.a + ", backgroundCornerRadius=" + y7m.c(this.b) + ", horizontalInset=" + y7m.c(this.c) + ", border=" + this.d + Extension.C_BRAKE;
    }
}
