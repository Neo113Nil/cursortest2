package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ih90 implements kpl {
    public final String a;
    public final String b;

    public ih90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih90)) {
            return false;
        }
        ih90 ih90Var = (ih90) obj;
        return jl40.l(this.a, ih90Var.a) && jl40.l(this.b, ih90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("PartnerOffersItemPayload(id=", this.a, ", requestId=", this.b, Extension.C_BRAKE);
    }
}
