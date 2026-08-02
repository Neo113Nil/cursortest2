package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class jj70 implements qj70 {
    public final String a;

    public jj70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jj70) && jl40.l(this.a, ((jj70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CancelOrderAndOpenDeeplink(deeplink=", this.a, Extension.C_BRAKE);
    }
}
