package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nbf0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public nbf0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbf0)) {
            return false;
        }
        nbf0 nbf0Var = (nbf0) obj;
        return Float.compare(this.a, nbf0Var.a) == 0 && Float.compare(this.b, nbf0Var.b) == 0 && Float.compare(this.c, nbf0Var.c) == 0 && Float.compare(this.d, nbf0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("AnimationKeyframe(progress=", this.a, ", centerXFraction=", this.b, ", centerYFraction="), this.c, ", radiusFraction=", this.d, Extension.C_BRAKE);
    }
}
