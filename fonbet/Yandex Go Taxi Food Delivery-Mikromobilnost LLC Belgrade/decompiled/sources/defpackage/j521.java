package defpackage;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class j521 extends glp0 {
    public final String a;
    public final NoSuchAlgorithmException b;

    public j521(String str, NoSuchAlgorithmException noSuchAlgorithmException) {
        this.a = str;
        this.b = noSuchAlgorithmException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j521)) {
            return false;
        }
        j521 j521Var = (j521) obj;
        return jl40.l(this.a, j521Var.a) && jl40.l(this.b, j521Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        NoSuchAlgorithmException noSuchAlgorithmException = this.b;
        return hashCode + (noSuchAlgorithmException == null ? 0 : noSuchAlgorithmException.hashCode());
    }

    public final String toString() {
        NoSuchAlgorithmException noSuchAlgorithmException = this.b;
        String str = this.a;
        if (noSuchAlgorithmException == null) {
            return g8e.o("Unsupported signature algorithm ", str);
        }
        StringBuilder x = unr0.x("Unsupported signature algorithm ", str, " with: ");
        x.append(kca1.g(noSuchAlgorithmException));
        return x.toString();
    }
}
