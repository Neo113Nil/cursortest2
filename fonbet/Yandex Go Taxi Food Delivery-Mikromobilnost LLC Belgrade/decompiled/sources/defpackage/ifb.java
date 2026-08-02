package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ifb {
    public final String a;
    public final String b;
    public final String c;

    public ifb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifb)) {
            return false;
        }
        ifb ifbVar = (ifb) obj;
        return jl40.l(this.a, ifbVar.a) && jl40.l(this.b, ifbVar.b) && jl40.l(this.c, ifbVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("CheckCrossBorderReceiverEntity(phone=", this.a, ", partner=", this.b, ", receiverFullName="), this.c, Extension.C_BRAKE);
    }
}
