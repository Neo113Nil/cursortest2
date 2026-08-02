package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m0i {
    public final String a;

    public m0i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0i) && jl40.l(this.a, ((m0i) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("DeliveryConfigParams(zone=", this.a, Extension.C_BRAKE);
    }

    public m0i() {
        this(null);
    }
}
