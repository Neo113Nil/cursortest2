package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class joz0 {
    public final String a;
    public final String b;

    public joz0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joz0)) {
            return false;
        }
        joz0 joz0Var = (joz0) obj;
        return this.a.equals(joz0Var.a) && this.b.equals(joz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TokenizerInstance(instanceURL=", this.a, ", instanceID=", this.b, Extension.C_BRAKE);
    }
}
