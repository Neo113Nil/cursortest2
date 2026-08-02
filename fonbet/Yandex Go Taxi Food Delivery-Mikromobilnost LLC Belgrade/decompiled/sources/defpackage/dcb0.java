package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dcb0 {
    public final float a;
    public final float b;
    public final float c;

    public dcb0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcb0)) {
            return false;
        }
        dcb0 dcb0Var = (dcb0) obj;
        return Float.compare(this.a, dcb0Var.a) == 0 && Float.compare(this.b, dcb0Var.b) == 0 && Float.compare(this.c, dcb0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uw51.i(oo31.k("FunFactGradientConfig(centerXMultiplier=", this.a, ", centerYMultiplier=", this.b, ", radiusMultiplier="), this.c, Extension.C_BRAKE);
    }
}
