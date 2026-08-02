package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class glv0 {
    public final String a;
    public final String b;

    public glv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glv0)) {
            return false;
        }
        glv0 glv0Var = (glv0) obj;
        return jl40.l(this.a, glv0Var.a) && jl40.l(this.b, glv0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("OrderButton(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
