package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f6n extends n351 {
    public final String c;
    public final String d;
    public final String e;

    public f6n(String str, String str2, String str3) {
        super("dynamic-content-postcard-key", false, 14);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6n)) {
            return false;
        }
        f6n f6nVar = (f6n) obj;
        return jl40.l(this.c, f6nVar.c) && jl40.l(this.d, f6nVar.d) && jl40.l(this.e, f6nVar.e);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("DynamicContentPostcardModel(cellTitle=", this.c, ", userMessage=", this.d, ", thumbNailUrl="), this.e, Extension.C_BRAKE);
    }
}
