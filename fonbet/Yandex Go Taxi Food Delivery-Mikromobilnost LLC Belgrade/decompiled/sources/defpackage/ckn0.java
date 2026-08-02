package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ckn0 implements ekn0 {
    public final int a;

    public /* synthetic */ ckn0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ckn0) {
            return this.a == ((ckn0) obj).a;
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
