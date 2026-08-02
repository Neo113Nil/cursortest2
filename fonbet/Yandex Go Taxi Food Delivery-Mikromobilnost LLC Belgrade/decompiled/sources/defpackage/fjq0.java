package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fjq0 {
    public final String a;
    public final String b;
    public final String c;

    public fjq0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjq0)) {
            return false;
        }
        fjq0 fjq0Var = (fjq0) obj;
        return jl40.l(this.a, fjq0Var.a) && jl40.l(this.b, fjq0Var.b) && jl40.l(this.c, fjq0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("ReceiverInfo(phone=", this.a, ", partnerId=", this.b, ", receiverFullName="), this.c, Extension.C_BRAKE);
    }
}
