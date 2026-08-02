package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nvw0 implements ovw0 {
    public final String a;

    public nvw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvw0) && jl40.l(this.a, ((nvw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }
}
