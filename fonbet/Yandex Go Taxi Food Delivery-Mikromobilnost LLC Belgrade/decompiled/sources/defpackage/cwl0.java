package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class cwl0 implements dwl0 {
    public final String a;
    public final String b;
    public final String c;

    public cwl0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwl0)) {
            return false;
        }
        cwl0 cwl0Var = (cwl0) obj;
        return this.a.equals(cwl0Var.a) && this.b.equals(cwl0Var.b) && this.c.equals(cwl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("NetworkError(networkErrorMessage=", this.a, ", continueButtonText=", this.b, ", tryAgainButtonText="), this.c, Extension.C_BRAKE);
    }
}
