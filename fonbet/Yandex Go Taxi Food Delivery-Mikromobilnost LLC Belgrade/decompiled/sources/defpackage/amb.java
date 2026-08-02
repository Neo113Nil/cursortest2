package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class amb {
    public final String a;
    public final String b;
    public final String c;

    public amb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amb)) {
            return false;
        }
        amb ambVar = (amb) obj;
        return this.a.equals(ambVar.a) && this.b.equals(ambVar.b) && this.c.equals(ambVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("CheckoutRouteInfo(name=", this.a, ", description=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
    }
}
