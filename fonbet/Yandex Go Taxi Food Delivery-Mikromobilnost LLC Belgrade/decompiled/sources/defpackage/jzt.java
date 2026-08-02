package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jzt {
    public final ldc a;
    public final double b;

    public jzt(ldc ldcVar, double d) {
        this.a = ldcVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzt)) {
            return false;
        }
        jzt jztVar = (jzt) obj;
        return jl40.l(this.a, jztVar.a) && Double.compare(this.b, jztVar.b) == 0;
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        return Double.hashCode(this.b) + ((ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31);
    }

    public final String toString() {
        return "GradientStopState(color=" + this.a + ", location=" + this.b + Extension.C_BRAKE;
    }
}
