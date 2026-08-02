package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mmc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public mmc(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmc)) {
            return false;
        }
        mmc mmcVar = (mmc) obj;
        return this.a.equals(mmcVar.a) && jl40.l(this.b, mmcVar.b) && this.c.equals(mmcVar.c) && this.d.equals(mmcVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("CommentPopup(title=", this.a, ", message=", this.b, ", continueButtonText="), this.c, ", cancelButtonText=", this.d, Extension.C_BRAKE);
    }
}
