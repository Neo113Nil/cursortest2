package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jij0 implements kij0, lhx0 {
    public final apj0 a;
    public final boolean b;
    public final boolean c;

    public jij0(apj0 apj0Var, boolean z, boolean z2) {
        this.a = apj0Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.lhx0
    public final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jij0)) {
            return false;
        }
        jij0 jij0Var = (jij0) obj;
        return jl40.l(this.a, jij0Var.a) && this.b == jij0Var.b && this.c == jij0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Usual(item=");
        sb.append(this.a);
        sb.append(", isFirst=");
        sb.append(this.b);
        sb.append(", isLast=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
