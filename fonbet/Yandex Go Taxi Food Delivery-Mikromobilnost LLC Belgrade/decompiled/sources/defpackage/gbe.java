package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gbe {
    public final String a;
    public final String b;

    public gbe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbe)) {
            return false;
        }
        gbe gbeVar = (gbe) obj;
        return this.a.equals(gbeVar.a) && jl40.l(this.b, gbeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Header(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
