package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kwh {
    public final String a;

    public kwh(int i) {
        this.a = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwh) && jl40.l(this.a, ((kwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Custom(url=", this.a, Extension.C_BRAKE);
    }

    public kwh() {
        this(0);
    }
}
