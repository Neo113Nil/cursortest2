package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m8i0 {
    public final k8i0 a;
    public final float b;
    public final float c;

    public m8i0(i8i0 i8i0Var, int i) {
        k8i0 k8i0Var = (i & 2) != 0 ? j8i0.a : i8i0Var;
        float f = (i & 8) != 0 ? 48.0f : 40.0f;
        float f2 = (i & 16) != 0 ? 4.8f : 3.75f;
        this.a = k8i0Var;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8i0)) {
            return false;
        }
        m8i0 m8i0Var = (m8i0) obj;
        d8i0 d8i0Var = d8i0.a;
        if (!d8i0Var.equals(d8i0Var) || !jl40.l(this.a, m8i0Var.a)) {
            return false;
        }
        l8i0 l8i0Var = l8i0.a;
        return l8i0Var.equals(l8i0Var) && y7m.b(this.b, m8i0Var.b) && y7m.b(this.c, m8i0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, (((this.a.hashCode() - 90333079) * 31) + 1003026285) * 31, 31);
    }

    public final String toString() {
        String c = y7m.c(this.b);
        String c2 = y7m.c(this.c);
        StringBuilder sb = new StringBuilder("RatingBarStarStyle(animationParams=");
        sb.append(d8i0.a);
        sb.append(", selectedStarStyle=");
        sb.append(this.a);
        sb.append(", unselectedStarStyle=");
        sb.append(l8i0.a);
        sb.append(", starSize=");
        sb.append(c);
        sb.append(", starPadding=");
        return oyr.t(sb, c2, Extension.C_BRAKE);
    }
}
