package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jsx {
    public final String a;
    public final String b;

    public jsx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsx)) {
            return false;
        }
        jsx jsxVar = (jsx) obj;
        return jl40.l(this.a, jsxVar.a) && this.b.equals(jsxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("IdWithStatus(orderId=", this.a, ", rawStatus=", this.b, Extension.C_BRAKE);
    }
}
