package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ewz {
    public final String a;

    public ewz(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewz) && jl40.l(this.a, ((ewz) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("LoyaltySelectorDeeplink(useProgram=", this.a, Extension.C_BRAKE);
    }

    public ewz() {
        this(null);
    }
}
