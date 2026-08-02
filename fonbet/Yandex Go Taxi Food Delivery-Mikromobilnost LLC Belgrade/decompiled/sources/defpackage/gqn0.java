package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gqn0 {
    public final String a;
    public final String b;

    public gqn0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqn0)) {
            return false;
        }
        gqn0 gqn0Var = (gqn0) obj;
        return jl40.l(this.a, gqn0Var.a) && jl40.l(this.b, gqn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("BottomLegalTerms(text=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
