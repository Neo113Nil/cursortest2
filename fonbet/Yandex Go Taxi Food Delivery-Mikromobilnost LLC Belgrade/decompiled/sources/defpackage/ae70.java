package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ae70 {
    public final String a;
    public final String b;

    public ae70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae70)) {
            return false;
        }
        ae70 ae70Var = (ae70) obj;
        return jl40.l(this.a, ae70Var.a) && this.b.equals(ae70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Option(id=", this.a, ", title=", this.b, Extension.C_BRAKE);
    }
}
