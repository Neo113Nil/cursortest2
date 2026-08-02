package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cfn {
    public final String a;
    public final h1p b;

    public cfn(h1p h1pVar, String str) {
        this.a = str;
        this.b = h1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfn)) {
            return false;
        }
        cfn cfnVar = (cfn) obj;
        return jl40.l(this.a, cfnVar.a) && this.b.equals(cfnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(orderId=" + this.a + ", service=" + this.b + Extension.C_BRAKE;
    }
}
