package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pg11 {
    public final String a;

    public pg11(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg11) && jl40.l(this.a, ((pg11) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("TrustedContactsDeeplink(orderId=", this.a, Extension.C_BRAKE);
    }

    public pg11() {
        this(null);
    }
}
