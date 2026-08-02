package defpackage;

import java.security.cert.CertificateParsingException;

/* loaded from: classes4.dex */
public final class n79 extends glp0 {
    public final CertificateParsingException a;

    public n79(CertificateParsingException certificateParsingException) {
        this.a = certificateParsingException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n79) && jl40.l(this.a, ((n79) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error parsing cert with: ".concat(kca1.g(this.a));
    }
}
