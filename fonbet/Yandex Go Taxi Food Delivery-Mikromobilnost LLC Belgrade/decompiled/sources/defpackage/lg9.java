package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lg9 {
    public final String a;
    public final String b;

    public lg9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg9)) {
            return false;
        }
        lg9 lg9Var = (lg9) obj;
        return jl40.l(this.a, lg9Var.a) && jl40.l(this.b, lg9Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Message(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
