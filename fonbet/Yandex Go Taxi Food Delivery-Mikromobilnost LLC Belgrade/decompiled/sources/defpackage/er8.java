package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class er8 extends ye0 {
    public final String b;

    public er8(String str) {
        super("care.contentStartedLoading");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er8) && jl40.l(this.b, ((er8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("PageStartLoading(path=", this.b, Extension.C_BRAKE);
    }
}
