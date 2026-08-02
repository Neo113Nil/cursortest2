package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h98 {
    public final String a;
    public final String b;

    public h98(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h98)) {
            return false;
        }
        h98 h98Var = (h98) obj;
        return this.a.equals(h98Var.a) && jl40.l(this.b, h98Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CardActivationApplicationInfoEntity(promoId=", this.a, ", applicationId=", this.b, Extension.C_BRAKE);
    }
}
