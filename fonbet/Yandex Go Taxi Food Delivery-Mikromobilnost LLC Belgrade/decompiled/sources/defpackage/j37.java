package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class j37 {
    public final kdc a;
    public final kdc b;
    public final wp2 c;
    public final wp2 d;

    public j37(kdc kdcVar, kdc kdcVar2, wp2 wp2Var, wp2 wp2Var2) {
        this.a = kdcVar;
        this.b = kdcVar2;
        this.c = wp2Var;
        this.d = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j37)) {
            return false;
        }
        j37 j37Var = (j37) obj;
        return this.a.equals(j37Var.a) && this.b.equals(j37Var.b) && jl40.l(this.c, j37Var.c) && jl40.l(this.d, j37Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, smw0.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ButtonStateStyle(bgColor=" + this.a + ", textColor=" + this.b + ", bgAppColor=" + this.c + ", textAppColor=" + this.d + Extension.C_BRAKE;
    }
}
