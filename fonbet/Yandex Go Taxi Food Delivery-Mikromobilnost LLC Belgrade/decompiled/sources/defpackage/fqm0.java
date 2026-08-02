package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fqm0 implements hqm0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof fqm0) {
            return this.a == ((fqm0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Resource(resource=", Extension.C_BRAKE);
    }
}
