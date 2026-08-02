package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class aij0 implements kij0, e6v, k1c {
    public final ioj0 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public aij0(ioj0 ioj0Var, String str, boolean z, boolean z2) {
        this.a = ioj0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = ioj0Var.a;
        this.f = ioj0Var.c;
    }

    public static aij0 m(aij0 aij0Var, boolean z, boolean z2) {
        ioj0 ioj0Var = aij0Var.a;
        String str = aij0Var.b;
        aij0Var.getClass();
        return new aij0(ioj0Var, str, z, z2);
    }

    @Override // defpackage.k1c
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aij0)) {
            return false;
        }
        aij0 aij0Var = (aij0) obj;
        return jl40.l(this.a, aij0Var.a) && jl40.l(this.b, aij0Var.b) && this.c == aij0Var.c && this.d == aij0Var.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // defpackage.k1c
    public final boolean isChecked() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderDue(state=");
        sb.append(this.a);
        sb.append(", trailAccessibilityTitle=");
        sb.append(this.b);
        sb.append(", isFirst=");
        return smw0.k(", isLast=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
