package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bv71 implements ay71 {
    public final String a;

    public bv71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv71) && jl40.l(this.a, ((bv71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 562735108;
    }

    public final String toString() {
        return oyr.p("Warning(title=Warning, message=", this.a, Extension.C_BRAKE);
    }
}
