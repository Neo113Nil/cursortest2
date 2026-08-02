package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b3l0 {
    public final String a;
    public final String b;

    public b3l0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3l0)) {
            return false;
        }
        b3l0 b3l0Var = (b3l0) obj;
        return jl40.l(this.a, b3l0Var.a) && jl40.l(this.b, b3l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("RouteDetailsV2HeaderTexts(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
