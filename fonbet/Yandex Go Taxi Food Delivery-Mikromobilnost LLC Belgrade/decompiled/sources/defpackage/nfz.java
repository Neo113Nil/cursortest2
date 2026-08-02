package defpackage;

import java.security.InvalidKeyException;

/* loaded from: classes4.dex */
public final class nfz extends qfz {
    public final InvalidKeyException a;

    public nfz(InvalidKeyException invalidKeyException) {
        this.a = invalidKeyException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfz) && this.a.equals(((nfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid signature (public key) with ".concat(kca1.g(this.a));
    }
}
