package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class n0d0 extends q0d0 {
    public final String b;

    public n0d0(String str) {
        super("plus_home");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0d0) && jl40.l(this.b, ((n0d0) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("PlusHome(clientSubSource=", this.b, Extension.C_BRAKE);
    }

    public n0d0() {
        this(null);
    }
}
