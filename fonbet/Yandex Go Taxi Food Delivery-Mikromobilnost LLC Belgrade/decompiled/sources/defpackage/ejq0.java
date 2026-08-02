package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ejq0 {
    public final String a;
    public final String b;

    public ejq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejq0)) {
            return false;
        }
        ejq0 ejq0Var = (ejq0) obj;
        return jl40.l(this.a, ejq0Var.a) && jl40.l(this.b, ejq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CurrencyRate(rate=", this.a, ", currency=", this.b, Extension.C_BRAKE);
    }
}
