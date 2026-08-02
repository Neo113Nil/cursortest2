package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class c4c0 {
    public final long a;
    public final z1c0 b;
    public final double c;
    public final double d;

    public c4c0(long j, z1c0 z1c0Var, double d, double d2) {
        this.a = j;
        this.b = z1c0Var;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c4c0) {
            c4c0 c4c0Var = (c4c0) obj;
            if (this.a == c4c0Var.a && this.b == c4c0Var.b && Double.compare(this.c, c4c0Var.c) == 0 && Double.compare(this.d, c4c0Var.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + unr0.a((hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacemarkGeometryAnimation(durationMs=");
        sb.append(this.a);
        sb.append(", easing=");
        sb.append(this.b);
        nzs.o(sb, ", maxAnimatedDistance=", this.c, ", minAnimatedDistance=");
        return nzs.c(sb, this.d, Extension.C_BRAKE);
    }
}
