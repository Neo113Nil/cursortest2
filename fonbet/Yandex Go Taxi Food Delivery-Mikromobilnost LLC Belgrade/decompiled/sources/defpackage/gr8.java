package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class gr8 extends ye0 {
    public final String b;
    public final String c;

    public gr8(String str, String str2) {
        super("care.didShowFailure");
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr8)) {
            return false;
        }
        gr8 gr8Var = (gr8) obj;
        return this.b.equals(gr8Var.b) && jl40.l(this.c, gr8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("ShowFailureScreen(code=", this.b, ", message=", this.c, Extension.C_BRAKE);
    }
}
