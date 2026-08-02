package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ph6 implements sh6 {
    public final String a;

    public ph6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph6) && jl40.l(this.a, ((ph6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Pay(deeplink=", this.a, Extension.C_BRAKE);
    }
}
