package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class n3m0 implements qas0 {
    public final m3m0 a;
    public final String b;
    public final long c;
    public final j3m0 d;

    public n3m0(m3m0 m3m0Var, String str, long j, j3m0 j3m0Var) {
        this.a = m3m0Var;
        this.b = str;
        this.c = j;
        this.d = j3m0Var;
    }

    public final String a() {
        return this.b;
    }

    public final j3m0 b() {
        return this.d;
    }

    public final long c() {
        return this.c;
    }

    public final m3m0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3m0)) {
            return false;
        }
        n3m0 n3m0Var = (n3m0) obj;
        return this.a.equals(n3m0Var.a) && jl40.l(this.b, n3m0Var.b) && this.c == n3m0Var.c && jl40.l(this.d, n3m0Var.d);
    }

    public final int hashCode() {
        int c = qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        j3m0 j3m0Var = this.d;
        return c + (j3m0Var == null ? 0 : j3m0Var.hashCode());
    }

    public final String toString() {
        return "StartScaryAnimation(minHeight=" + this.a + ", amountPenalty=" + this.b + ", barAnimationDuration=" + this.c + ", balanceAnimationConfig=" + this.d + Extension.C_BRAKE;
    }
}
