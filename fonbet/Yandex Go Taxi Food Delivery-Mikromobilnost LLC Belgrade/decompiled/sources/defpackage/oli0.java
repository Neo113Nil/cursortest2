package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class oli0 {
    public final String a;
    public final String b;

    public oli0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oli0)) {
            return false;
        }
        oli0 oli0Var = (oli0) obj;
        return jl40.l(this.a, oli0Var.a) && jl40.l(this.b, oli0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("RedirectInfo(tariffClass=", this.a, ", requirement=", this.b, Extension.C_BRAKE);
    }
}
