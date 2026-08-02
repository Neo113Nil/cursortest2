package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class q0x {
    public final ic51 a;
    public final byte[] b;
    public final byo c;
    public final boolean d;

    public q0x(ic51 ic51Var, byte[] bArr, byo byoVar, boolean z) {
        this.a = ic51Var;
        this.b = bArr;
        this.c = byoVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q0x.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        q0x q0xVar = (q0x) obj;
        return Objects.equals(this.a, q0xVar.a) && Arrays.equals(this.b, q0xVar.b) && Objects.equals(this.c, q0xVar.c) && this.d == q0xVar.d;
    }

    public final int hashCode() {
        ic51 ic51Var = this.a;
        int hashCode = (Arrays.hashCode(this.b) + ((ic51Var != null ? ic51Var.hashCode() : 0) * 31)) * 31;
        byo byoVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (byoVar != null ? byoVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssuerInformation(name=");
        sb.append(this.a);
        sb.append(", keyHash=");
        sb.append(Arrays.toString(this.b));
        sb.append(", x509authorityKeyIdentifier=");
        sb.append(this.c);
        sb.append(", issuedByPreCertificateSigningCert=");
        return unr0.u(sb, this.d, ')');
    }
}
