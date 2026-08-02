package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dij0 implements kij0 {
    public final anx0 a;
    public final boolean b;
    public final boolean c;

    public dij0(anx0 anx0Var, boolean z, boolean z2) {
        this.a = anx0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dij0)) {
            return false;
        }
        dij0 dij0Var = (dij0) obj;
        return jl40.l(this.a, dij0Var.a) && this.b == dij0Var.b && this.c == dij0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffRule(item=");
        sb.append(this.a);
        sb.append(", isFirst=");
        sb.append(this.b);
        sb.append(", isLast=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
