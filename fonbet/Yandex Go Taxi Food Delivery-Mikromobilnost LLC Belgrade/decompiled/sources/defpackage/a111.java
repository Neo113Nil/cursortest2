package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a111 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public a111(boolean z, String str, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a111)) {
            return false;
        }
        a111 a111Var = (a111) obj;
        return jl40.l(this.a, a111Var.a) && this.b == a111Var.b && this.c == a111Var.c && this.d == a111Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", hasInsufficientFunds=", Extension.C_BRAKE, oo31.l("CardBalanceDomain(totalValue=", this.a, ", hasPendingTopUps=", ", hasDebt=", this.b), this.c, this.d);
    }

    public a111() {
        this(false, "", false, false);
    }
}
