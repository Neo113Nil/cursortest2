package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ezk {
    public final String a;
    public final String b;
    public final long c;

    public ezk(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezk)) {
            return false;
        }
        ezk ezkVar = (ezk) obj;
        return jl40.l(this.a, ezkVar.a) && jl40.l(this.b, ezkVar.b) && this.c == ezkVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, b64.v("OffersEntityMetrica(offerId=", this.a, ", requestId=", this.b, ", startShowTime="));
    }
}
