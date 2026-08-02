package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nty0 {
    public final String a;
    public final String b;

    public nty0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nty0)) {
            return false;
        }
        nty0 nty0Var = (nty0) obj;
        return this.a.equals(nty0Var.a) && jl40.l(this.b, nty0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TextSuggestQuery(text=", this.a, ", id=", this.b, Extension.C_BRAKE);
    }
}
