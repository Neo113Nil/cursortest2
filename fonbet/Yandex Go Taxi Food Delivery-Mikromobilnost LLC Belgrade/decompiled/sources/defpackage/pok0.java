package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pok0 {
    public final String a;
    public final String b;

    public pok0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pok0)) {
            return false;
        }
        pok0 pok0Var = (pok0) obj;
        return jl40.l(this.a, pok0Var.a) && jl40.l(this.b, pok0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TitleInfo(title=", this.a, ", contentDescription=", this.b, Extension.C_BRAKE);
    }
}
