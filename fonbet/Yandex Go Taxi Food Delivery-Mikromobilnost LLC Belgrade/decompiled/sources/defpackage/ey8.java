package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ey8 {
    public final ux8 a;
    public final int b;

    public ey8(ux8 ux8Var, int i) {
        this.a = ux8Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey8)) {
            return false;
        }
        ey8 ey8Var = (ey8) obj;
        return jl40.l(this.a, ey8Var.a) && this.b == ey8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarouselItemWithIndex(item=" + this.a + ", index=" + this.b + Extension.C_BRAKE;
    }
}
