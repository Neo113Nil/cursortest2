package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dfe {
    public final String a;
    public final String b;
    public final String c;

    public dfe(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfe)) {
            return false;
        }
        dfe dfeVar = (dfe) obj;
        return this.a.equals(dfeVar.a) && this.b.equals(dfeVar.b) && this.c.equals(dfeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ContentComplaintDeeplink(mediaType=", this.a, ", mediaId=", this.b, ", companyId="), this.c, Extension.C_BRAKE);
    }
}
