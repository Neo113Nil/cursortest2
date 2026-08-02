package defpackage;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class mfz extends qfz {
    public final NoSuchAlgorithmException a;

    public mfz(NoSuchAlgorithmException noSuchAlgorithmException) {
        this.a = noSuchAlgorithmException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfz) && this.a.equals(((mfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid signature (public key) with ".concat(kca1.g(this.a));
    }
}
