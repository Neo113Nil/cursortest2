package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class cc41 {
    public static final bc41 Companion = new bc41();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ cc41(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ac41.a.getDescriptor());
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
        if (!(obj instanceof cc41)) {
            return false;
        }
        cc41 cc41Var = (cc41) obj;
        return jl40.l(this.a, cc41Var.a) && jl40.l(this.b, cc41Var.b) && jl40.l(this.c, cc41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("BeforeStartDialog(title=", this.a, ", buttonText=", this.b, ", closeText="), this.c, Extension.C_BRAKE);
    }
}
