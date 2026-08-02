package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class eny {
    public final String a;
    public final String b;
    public final String c;

    public eny(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eny)) {
            return false;
        }
        eny enyVar = (eny) obj;
        return jl40.l(this.a, enyVar.a) && jl40.l(this.b, enyVar.b) && jl40.l(this.c, enyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("LinkedOrderInfoItem(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
    }
}
