package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ct81 {
    public final String a;
    public final String b;

    public ct81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct81)) {
            return false;
        }
        ct81 ct81Var = (ct81) obj;
        return this.a.equals(ct81Var.a) && this.b.equals(ct81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MediationAdapterSignature(format=", this.a, ", className=", this.b, Extension.C_BRAKE);
    }
}
