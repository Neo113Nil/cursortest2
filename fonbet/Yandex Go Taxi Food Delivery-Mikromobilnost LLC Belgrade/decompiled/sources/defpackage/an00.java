package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class an00 {
    public final fkp a;
    public final vm00 b;
    public final ym00 c;

    public an00(fkp fkpVar, vm00 vm00Var, ym00 ym00Var) {
        this.a = fkpVar;
        this.b = vm00Var;
        this.c = ym00Var;
    }

    public static an00 a(an00 an00Var, ym00 ym00Var) {
        fkp fkpVar = an00Var.a;
        vm00 vm00Var = an00Var.b;
        an00Var.getClass();
        return new an00(fkpVar, vm00Var, ym00Var);
    }

    public final vm00 b() {
        return this.b;
    }

    public final ym00 c() {
        return this.c;
    }

    public final fkp d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an00)) {
            return false;
        }
        an00 an00Var = (an00) obj;
        return jl40.l(this.a, an00Var.a) && jl40.l(this.b, an00Var.b) && jl40.l(this.c, an00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vm00 vm00Var = this.b;
        int hashCode2 = (hashCode + (vm00Var == null ? 0 : vm00Var.hashCode())) * 31;
        ym00 ym00Var = this.c;
        return hashCode2 + (ym00Var != null ? ym00Var.hashCode() : 0);
    }

    public final String toString() {
        return "MapObjectComponentFactoryContext(feature=" + this.a + ", animation=" + this.b + ", bodyComponent=" + this.c + Extension.C_BRAKE;
    }
}
