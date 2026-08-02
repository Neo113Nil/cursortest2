package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gbg0 extends jbg0 {
    public final String a;
    public final String b;

    public gbg0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbg0)) {
            return false;
        }
        gbg0 gbg0Var = (gbg0) obj;
        return this.a.equals(gbg0Var.a) && jl40.l(this.b, gbg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AuthorizationRequired(trackId=", this.a, ", operationId=", this.b, Extension.C_BRAKE);
    }
}
