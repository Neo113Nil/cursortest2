package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n630 implements p630 {
    public final rre0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof n630) {
            return this.a.equals(((n630) obj).a);
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
