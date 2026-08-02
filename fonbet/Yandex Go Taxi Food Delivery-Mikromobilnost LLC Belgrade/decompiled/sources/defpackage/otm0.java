package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class otm0 implements ttm0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof otm0) {
            return this.a.equals(((otm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenDeeplink(deeplink=", this.a, Extension.C_BRAKE);
    }
}
