package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ni31 {
    public final String a;
    public final String b;

    public ni31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni31)) {
            return false;
        }
        ni31 ni31Var = (ni31) obj;
        return jl40.l(this.a, ni31Var.a) && jl40.l(this.b, ni31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("VerticalTariffClass(tariffClass=", this.a, ", verticalId=", this.b, Extension.C_BRAKE);
    }
}
