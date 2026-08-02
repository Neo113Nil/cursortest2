package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m07 {
    public final zp1 a;
    public final zp1 b;
    public final jk51 c;
    public final boolean d;

    public m07(zp1 zp1Var, zp1 zp1Var2, jk51 jk51Var, boolean z) {
        this.a = zp1Var;
        this.b = zp1Var2;
        this.c = jk51Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m07) {
            m07 m07Var = (m07) obj;
            if (this.a == m07Var.a && jl40.l(this.b, m07Var.b) && jl40.l(this.c, m07Var.c) && this.d == m07Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zp1 zp1Var = this.b;
        int hashCode2 = (hashCode + (zp1Var == null ? 0 : zp1Var.hashCode())) * 31;
        jk51 jk51Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (jk51Var != null ? jk51Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonItem(title=" + this.a + ", subtitle=" + this.b + ", leadIcon=" + this.c + ", isEnabled=" + this.d + Extension.C_BRAKE;
    }
}
