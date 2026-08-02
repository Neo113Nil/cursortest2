package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gq implements fr {
    public final String a;
    public final boolean b;

    public gq(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq)) {
            return false;
        }
        gq gqVar = (gq) obj;
        return jl40.l(this.a, gqVar.a) && this.b == gqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OpenWebCustomTabsAction(url=", this.a, ", wrapAuthUrl=", this.b, Extension.C_BRAKE);
    }
}
