package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jfp0 extends ye0 {
    public final String b;

    public jfp0(String str) {
        super("COMMON_DIVKIT_".concat(str));
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfp0) && jl40.l(this.b, ((jfp0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("CommonDivkit(path=", this.b, Extension.C_BRAKE);
    }
}
