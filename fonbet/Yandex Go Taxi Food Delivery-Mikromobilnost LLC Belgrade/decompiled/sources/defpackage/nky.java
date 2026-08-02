package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class nky {
    public static final mky Companion = new mky();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ nky(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, lky.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nky)) {
            return false;
        }
        nky nkyVar = (nky) obj;
        return jl40.l(this.a, nkyVar.a) && jl40.l(this.b, nkyVar.b) && jl40.l(this.c, nkyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("LinkCardRequest(successUrl=", this.a, ", failUrl=", this.b, ", cancelUrl="), this.c, Extension.C_BRAKE);
    }

    public nky(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
