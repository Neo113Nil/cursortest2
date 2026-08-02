package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class aq51 {
    public final String a;
    public final String b;

    public aq51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq51)) {
            return false;
        }
        aq51 aq51Var = (aq51) obj;
        return jl40.l(this.a, aq51Var.a) && jl40.l(this.b, aq51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("YbCardDetailedEntity(number=", this.a, ", cvv=", this.b, Extension.C_BRAKE);
    }
}
