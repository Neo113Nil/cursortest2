package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a37 {
    public final String a;
    public final String b;

    public a37(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a37)) {
            return false;
        }
        a37 a37Var = (a37) obj;
        return jl40.l(this.a, a37Var.a) && jl40.l(this.b, a37Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ButtonState(title=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
