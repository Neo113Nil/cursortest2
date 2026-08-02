package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class mm4 {
    public final wp2 a;
    public final wp2 b;
    public final dm4 c;

    public mm4(wp2 wp2Var, wp2 wp2Var2, dm4 dm4Var) {
        this.a = wp2Var;
        this.b = wp2Var2;
        this.c = dm4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm4)) {
            return false;
        }
        mm4 mm4Var = (mm4) obj;
        return jl40.l(this.a, mm4Var.a) && jl40.l(this.b, mm4Var.b) && jl40.l(this.c, mm4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BadgeStyle(bg=" + this.a + ", content=" + this.b + ", shadow=" + this.c + Extension.C_BRAKE;
    }
}
