package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kmg implements mmg {
    public final String a;

    public kmg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmg) && jl40.l(this.a, ((kmg) obj).a);
    }

    @Override // defpackage.mmg
    public final String getProductId() {
        return "external_member";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("External(memberId=", this.a, Extension.C_BRAKE);
    }
}
