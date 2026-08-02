package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jwo implements uni {
    public final String a;

    public jwo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwo) && jl40.l(this.a, ((jwo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ExtendExpirationDateArgs(deliveryId=", this.a, Extension.C_BRAKE);
    }
}
