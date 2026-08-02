package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class psv0 {
    public final h1p a;
    public final String b;

    public psv0(h1p h1pVar, String str) {
        this.a = h1pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psv0)) {
            return false;
        }
        psv0 psv0Var = (psv0) obj;
        return jl40.l(this.a, psv0Var.a) && jl40.l(this.b, psv0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SuperAppChatRouterPayload(externalService=" + this.a + ", superAppOrderId=" + this.b + Extension.C_BRAKE;
    }
}
