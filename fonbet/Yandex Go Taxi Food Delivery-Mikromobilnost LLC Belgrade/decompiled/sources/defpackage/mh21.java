package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mh21 {
    public final String a;
    public final String b;
    public final String c;

    public mh21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh21)) {
            return false;
        }
        mh21 mh21Var = (mh21) obj;
        return jl40.l(this.a, mh21Var.a) && jl40.l(this.b, mh21Var.b) && jl40.l(this.c, mh21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("MentionedUser(guid=", this.a, ", phoneId=", this.b, ", displayName="), this.c, Extension.C_BRAKE);
    }
}
