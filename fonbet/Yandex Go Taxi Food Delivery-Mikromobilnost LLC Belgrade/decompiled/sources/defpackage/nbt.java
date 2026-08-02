package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nbt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nbt(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbt)) {
            return false;
        }
        nbt nbtVar = (nbt) obj;
        return jl40.l(this.a, nbtVar.a) && jl40.l(this.b, nbtVar.b) && jl40.l(this.c, nbtVar.c) && jl40.l(this.d, nbtVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("PhoneContact(phoneId=", this.a, ", userId=", this.b, ", shownName="), this.c, ", phone=", this.d, Extension.C_BRAKE);
    }
}
