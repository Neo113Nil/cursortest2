package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n760 {
    public final String a;
    public final String b;
    public final jbv c;

    public n760(String str, String str2, jbv jbvVar) {
        this.a = str;
        this.b = str2;
        this.c = jbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n760)) {
            return false;
        }
        n760 n760Var = (n760) obj;
        return jl40.l(this.a, n760Var.a) && jl40.l(this.b, n760Var.b) && this.c.equals(n760Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("NfcActionButton(title=", this.a, ", action=", this.b, ", icon=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
