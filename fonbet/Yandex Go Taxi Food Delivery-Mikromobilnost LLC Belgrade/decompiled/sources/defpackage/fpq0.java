package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fpq0 extends hpq0 {
    public final String b;

    public fpq0(String str) {
        super("open_support");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpq0) && jl40.l(this.b, ((fpq0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenSupport(url=", this.b, Extension.C_BRAKE);
    }
}
