package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ne51 extends oe51 {
    public final String a;
    public final String b;
    public final long c;

    public ne51(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.oe51
    public final void a(jwu jwuVar) {
        jwuVar.d("user", this.a);
        jwuVar.d("sign", this.b);
        jwuVar.d("ts", String.valueOf(this.c));
    }

    @Override // defpackage.oe51
    public final void b(t4j0 t4j0Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne51)) {
            return false;
        }
        ne51 ne51Var = (ne51) obj;
        return this.a.equals(ne51Var.a) && jl40.l(this.b, ne51Var.b) && this.c == ne51Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, b64.v("Secret(user=", this.a, ", sign=", this.b, ", ts="));
    }
}
