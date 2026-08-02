package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ivj0 {
    public final x4j0 a;
    public final meu b;
    public final int c;
    public final String d;
    public final s76 e;
    public final long f;
    public final long g;

    public ivj0(x4j0 x4j0Var, meu meuVar, int i, String str, s76 s76Var, long j, long j2) {
        this.a = x4j0Var;
        this.b = meuVar;
        this.c = i;
        this.d = str;
        this.e = s76Var;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivj0)) {
            return false;
        }
        ivj0 ivj0Var = (ivj0) obj;
        return jl40.l(this.a, ivj0Var.a) && jl40.l(this.b, ivj0Var.b) && this.c == ivj0Var.c && jl40.l(this.d, ivj0Var.d) && jl40.l(this.e, ivj0Var.e) && this.f == ivj0Var.f && this.g == ivj0Var.g;
    }

    public final int hashCode() {
        int b = oyr.b(this.c, ((this.a.hashCode() * 31) + Arrays.hashCode(this.b.a)) * 31, 31);
        String str = this.d;
        return Long.hashCode(this.g) + qv10.c((this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(request=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", code=");
        smw0.t(this.c, ", message=", this.d, ", body=", sb);
        sb.append(this.e);
        sb.append(", sentRequestAtMillis=");
        sb.append(this.f);
        return g8e.l(this.g, ", receivedResponseAtMillis=", Extension.C_BRAKE, sb);
    }
}
