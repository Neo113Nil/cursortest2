package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class mfn0 implements ofn0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof mfn0) {
            return this.a == ((mfn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Resource(res=", Extension.C_BRAKE);
    }
}
