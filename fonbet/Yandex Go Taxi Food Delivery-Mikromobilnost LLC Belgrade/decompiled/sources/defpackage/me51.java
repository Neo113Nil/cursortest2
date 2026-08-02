package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class me51 extends oe51 {
    public final String a;
    public final String b;

    public me51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.oe51
    public final void a(jwu jwuVar) {
        jwuVar.d("user", this.a);
    }

    @Override // defpackage.oe51
    public final void b(t4j0 t4j0Var) {
        t4j0Var.a("Authorization", "OAuth ".concat(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me51)) {
            return false;
        }
        me51 me51Var = (me51) obj;
        return jl40.l(this.a, me51Var.a) && this.b.equals(me51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OAuth(user=", this.a, ", token=", this.b, Extension.C_BRAKE);
    }
}
