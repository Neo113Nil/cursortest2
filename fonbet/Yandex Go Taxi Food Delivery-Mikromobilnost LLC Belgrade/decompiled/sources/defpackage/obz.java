package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class obz {
    public final String a;
    public final int b;
    public final int c;

    public obz(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obz)) {
            return false;
        }
        obz obzVar = (obz) obj;
        return this.a.equals(obzVar.a) && this.b == obzVar.b && this.c == obzVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "AgreementParams(agreementHtmlContent=", this.a, ", textColor=", ", linkTextColor="));
    }
}
