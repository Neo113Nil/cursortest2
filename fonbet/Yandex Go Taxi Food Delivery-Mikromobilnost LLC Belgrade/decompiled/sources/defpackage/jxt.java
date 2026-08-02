package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jxt {
    public final double a;
    public final String b;
    public final Float c;

    public jxt(double d, String str, Float f) {
        this.a = d;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxt)) {
            return false;
        }
        jxt jxtVar = (jxt) obj;
        return Double.compare(this.a, jxtVar.a) == 0 && jl40.l(this.b, jxtVar.b) && jl40.l(this.c, jxtVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(Double.hashCode(this.a) * 31, 31, this.b);
        Float f = this.c;
        return b + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "GradientColorStop(position=" + this.a + ", color=" + this.b + ", alpha=" + this.c + Extension.C_BRAKE;
    }
}
