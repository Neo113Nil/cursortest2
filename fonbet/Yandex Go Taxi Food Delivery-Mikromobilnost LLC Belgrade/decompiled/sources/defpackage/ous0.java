package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ous0 {
    public final float a;
    public final ldc b;
    public final float c;

    public ous0(float f, ldc ldcVar, float f2) {
        this.a = f;
        this.b = ldcVar;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ous0)) {
            return false;
        }
        ous0 ous0Var = (ous0) obj;
        return y7m.b(this.a, ous0Var.a) && jl40.l(this.b, ous0Var.b) && y7m.b(this.c, ous0Var.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        ldc ldcVar = this.b;
        return Float.hashCode(this.c) + ((hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.a);
        String c2 = y7m.c(this.c);
        StringBuilder sb = new StringBuilder("SlotStyle(horizontalInset=");
        sb.append(c);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", backgroundCornerRadius=");
        return oyr.t(sb, c2, Extension.C_BRAKE);
    }
}
