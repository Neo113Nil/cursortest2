package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class evd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public evd(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evd)) {
            return false;
        }
        evd evdVar = (evd) obj;
        return jl40.l(this.a, evdVar.a) && jl40.l(this.b, evdVar.b) && jl40.l(this.c, evdVar.c) && jl40.l(this.d, evdVar.d) && this.e == evdVar.e && this.f == evdVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return Boolean.hashCode(this.f) + unr0.e((b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("Item(optionName=", this.a, ", iconUrl=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", checked=");
        return smw0.k(", enabled=", Extension.C_BRAKE, v, this.e, this.f);
    }
}
