package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hq implements fr {
    public final String a;

    public hq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq) && jl40.l(this.a, ((hq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenWebViewAction(url=", this.a, Extension.C_BRAKE);
    }
}
