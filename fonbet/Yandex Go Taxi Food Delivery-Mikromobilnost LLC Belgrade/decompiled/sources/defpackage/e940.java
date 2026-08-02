package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e940 implements i940 {
    public final String a;
    public final String b;
    public final String c;

    public e940(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e940)) {
            return false;
        }
        e940 e940Var = (e940) obj;
        return jl40.l(this.a, e940Var.a) && this.b.equals(e940Var.b) && jl40.l(this.c, e940Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("OnRoutMoreInformationClick(ticketId=", this.a, ", transportName=", this.b, ", routeDescription="), this.c, Extension.C_BRAKE);
    }
}
