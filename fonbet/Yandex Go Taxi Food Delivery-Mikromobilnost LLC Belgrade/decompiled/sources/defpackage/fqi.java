package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fqi {
    public final String a;
    public final String b;

    public fqi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqi)) {
            return false;
        }
        fqi fqiVar = (fqi) obj;
        return jl40.l(this.a, fqiVar.a) && jl40.l(this.b, fqiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CostDetailsComponent(title=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
