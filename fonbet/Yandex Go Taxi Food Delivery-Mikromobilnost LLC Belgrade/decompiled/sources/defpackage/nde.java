package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nde {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final s9e g;
    public final tls h;
    public final boolean i;

    public nde(boolean z, String str, String str2, String str3, String str4, String str5, s9e s9eVar, tls tlsVar, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = s9eVar;
        this.h = tlsVar;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nde)) {
            return false;
        }
        nde ndeVar = (nde) obj;
        return this.a == ndeVar.a && jl40.l(this.b, ndeVar.b) && jl40.l(this.c, ndeVar.c) && jl40.l(this.d, ndeVar.d) && jl40.l(this.e, ndeVar.e) && jl40.l(this.f, ndeVar.f) && jl40.l(this.g, ndeVar.g) && this.h.equals(ndeVar.h) && this.i == ndeVar.i;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        s9e s9eVar = this.g;
        return Boolean.hashCode(this.i) + ly3.a((hashCode6 + (s9eVar != null ? s9eVar.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder v = ly3.v("ContactsScreenPayload(isSource=", ", title=", this.b, ", description=", this.a);
        g8e.D(v, this.c, ", userContactTitle=", this.d, ", emptyContactTitle=");
        g8e.D(v, this.e, ", emptyContactSubtitle=", this.f, ", previouslySelectedContact=");
        v.append(this.g);
        v.append(", onContactSelected=");
        v.append(this.h);
        v.append(", useDefaultContactIfNotSelected=");
        return x4e.i(v, this.i, Extension.C_BRAKE);
    }
}
