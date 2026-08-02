package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p4w0 extends vib1 {
    public final String a;
    public final String b;
    public final String c;

    public p4w0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4w0)) {
            return false;
        }
        p4w0 p4w0Var = (p4w0) obj;
        return this.a.equals(p4w0Var.a) && jl40.l(this.b, p4w0Var.b) && jl40.l(this.c, p4w0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("OpenOrganizationsAction(screenTitle=", this.a, ", suggestReqId=", this.b, ", geosearchContext="), this.c, Extension.C_BRAKE);
    }
}
