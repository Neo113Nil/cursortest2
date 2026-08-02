package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class co8 implements qas0 {
    public final String a;
    public final String b;

    public co8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co8)) {
            return false;
        }
        co8 co8Var = (co8) obj;
        return jl40.l(this.a, co8Var.a) && jl40.l(this.b, co8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("NavigateToSecondFactor(trackId=", this.a, ", operationId=", this.b, Extension.C_BRAKE);
    }
}
