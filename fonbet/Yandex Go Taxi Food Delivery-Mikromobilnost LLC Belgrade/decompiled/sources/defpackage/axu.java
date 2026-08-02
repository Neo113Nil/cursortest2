package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class axu extends e2b1 {
    public final String a;

    public axu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axu) && jl40.l(this.a, ((axu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("HttpsFullUrl(fullUrl=", this.a, Extension.C_BRAKE);
    }
}
