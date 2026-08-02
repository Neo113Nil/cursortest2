package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f360 {
    public final v4v a;
    public final float b;
    public final float c;
    public final Double d;
    public final ldc e;

    public f360(v4v v4vVar, float f, float f2, Double d, ldc ldcVar) {
        this.a = v4vVar;
        this.b = f;
        this.c = f2;
        this.d = d;
        this.e = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f360)) {
            return false;
        }
        f360 f360Var = (f360) obj;
        return this.a.equals(f360Var.a) && y7m.b(this.b, f360Var.b) && y7m.b(this.c, f360Var.c) && jl40.l(this.d, f360Var.d) && jl40.l(this.e, f360Var.e);
    }

    public final int hashCode() {
        int c = g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31);
        Double d = this.d;
        int hashCode = (c + (d == null ? 0 : d.hashCode())) * 31;
        ldc ldcVar = this.e;
        return hashCode + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        return "NeuroPostcardImageModel(image=" + this.a + ", width=" + y7m.c(this.b) + ", height=" + y7m.c(this.c) + ", dimAmount=" + this.d + ", dimColor=" + this.e + Extension.C_BRAKE;
    }
}
