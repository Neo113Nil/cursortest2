package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class igr0 {
    public final wp2 a;
    public final float b;
    public final float c;

    public igr0(wp2 wp2Var, float f, float f2) {
        this.a = wp2Var;
        this.b = f;
        this.c = f2;
    }

    public static igr0 a(igr0 igr0Var, wp2 wp2Var, int i) {
        if ((i & 1) != 0) {
            wp2Var = igr0Var.a;
        }
        float f = (i & 2) != 0 ? igr0Var.b : 10.0f;
        igr0Var.getClass();
        float f2 = (i & 8) != 0 ? igr0Var.c : 12.0f;
        igr0Var.getClass();
        return new igr0(wp2Var, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igr0)) {
            return false;
        }
        igr0 igr0Var = (igr0) obj;
        return jl40.l(this.a, igr0Var.a) && y7m.b(this.b, igr0Var.b) && y7m.b(0.0f, 0.0f) && y7m.b(this.c, igr0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(0.0f, g8e.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String c = y7m.c(this.b);
        String c2 = y7m.c(0.0f);
        String c3 = y7m.c(this.c);
        StringBuilder sb = new StringBuilder("ShadowConfig(color=");
        sb.append(this.a);
        sb.append(", radius=");
        sb.append(c);
        sb.append(", offsetX=");
        return g8e.r(sb, c2, ", offsetY=", c3, Extension.C_BRAKE);
    }
}
