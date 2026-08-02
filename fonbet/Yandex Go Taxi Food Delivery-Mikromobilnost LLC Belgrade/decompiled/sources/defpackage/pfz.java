package defpackage;

import java.security.SignatureException;

/* loaded from: classes4.dex */
public final class pfz extends qfz {
    public final SignatureException a;

    public pfz(SignatureException signatureException) {
        this.a = signatureException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfz) && this.a.equals(((pfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid signature (public key) with ".concat(kca1.g(this.a));
    }
}
