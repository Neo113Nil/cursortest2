package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b8a {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final String d;

    public b8a(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8a)) {
            return false;
        }
        b8a b8aVar = (b8a) obj;
        return jl40.l(this.a, b8aVar.a) && jl40.l(this.b, b8aVar.b) && jl40.l(this.c, b8aVar.c) && jl40.l(this.d, b8aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(vfc.r(this.a, this.b, "Station(number=", ", hint=", ", imageUrl="), this.c, ", iconTag=", this.d, Extension.C_BRAKE);
    }
}
