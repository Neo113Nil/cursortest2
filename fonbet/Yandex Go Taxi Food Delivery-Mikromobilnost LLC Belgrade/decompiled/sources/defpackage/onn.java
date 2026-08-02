package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class onn extends s120 {
    public final g720 a;
    public final du21 b;
    public final String c = "Messaging.Arguments.Key.EditStatus";

    public onn(g720 g720Var, du21 du21Var) {
        this.a = g720Var;
        this.b = du21Var;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onn)) {
            return false;
        }
        onn onnVar = (onn) obj;
        return jl40.l(this.a, onnVar.a) && jl40.l(this.b, onnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        du21 du21Var = this.b;
        return hashCode + (du21Var == null ? 0 : du21Var.hashCode());
    }

    public final String toString() {
        return "EditStatusArguments(source=" + this.a + ", customStatus=" + this.b + Extension.C_BRAKE;
    }
}
