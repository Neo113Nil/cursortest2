package xsna;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Objects;

/* compiled from: CertificateWithPrivateKey.java */
/* loaded from: classes8.dex */
public final class jcz0 {
    public final X509Certificate a;
    public final PrivateKey b;

    public jcz0(X509Certificate x509Certificate, PrivateKey privateKey) {
        Objects.requireNonNull(x509Certificate);
        Objects.requireNonNull(privateKey);
        this.a = x509Certificate;
        this.b = privateKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcz0)) {
            return false;
        }
        jcz0 jcz0Var = (jcz0) obj;
        return Objects.equals(this.a, jcz0Var.a) && Objects.equals(this.b, jcz0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
