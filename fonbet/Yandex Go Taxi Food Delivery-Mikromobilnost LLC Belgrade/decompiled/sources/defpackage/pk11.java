package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class pk11 implements sk11 {
    public final String a;
    public final String b;

    public pk11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk11)) {
            return false;
        }
        pk11 pk11Var = (pk11) obj;
        return jl40.l(this.a, pk11Var.a) && jl40.l(this.b, pk11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AuthenticationRequired(trackId=", this.a, ", operationId=", this.b, Extension.C_BRAKE);
    }
}
