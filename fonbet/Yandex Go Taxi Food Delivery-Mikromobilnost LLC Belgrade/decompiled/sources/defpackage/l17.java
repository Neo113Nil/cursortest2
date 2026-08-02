package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l17 {
    public final String a;
    public final String b;

    public l17(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l17)) {
            return false;
        }
        l17 l17Var = (l17) obj;
        return jl40.l(this.a, l17Var.a) && jl40.l(this.b, l17Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ButtonModel(title=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
