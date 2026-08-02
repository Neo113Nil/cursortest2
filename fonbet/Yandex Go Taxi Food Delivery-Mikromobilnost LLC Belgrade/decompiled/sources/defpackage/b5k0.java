package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b5k0 implements d5k0 {
    public final rre0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof b5k0) {
            return this.a.equals(((b5k0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Preorder(preorderPayload=" + this.a + Extension.C_BRAKE;
    }
}
