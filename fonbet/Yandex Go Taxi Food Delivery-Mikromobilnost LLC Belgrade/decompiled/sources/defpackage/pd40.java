package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pd40 implements td40 {
    public final String a;
    public final ph40 b;

    public pd40(String str, ph40 ph40Var) {
        this.a = str;
        this.b = ph40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd40)) {
            return false;
        }
        pd40 pd40Var = (pd40) obj;
        return jl40.l(this.a, pd40Var.a) && jl40.l(this.b, pd40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTariffChanged(selectedTariffId=" + this.a + ", tariffItem=" + this.b + Extension.C_BRAKE;
    }
}
