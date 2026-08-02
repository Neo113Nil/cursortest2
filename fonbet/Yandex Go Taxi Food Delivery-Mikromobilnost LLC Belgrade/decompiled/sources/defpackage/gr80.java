package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gr80 {
    public final String a;
    public final String b;
    public final int c;

    public gr80(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr80)) {
            return false;
        }
        gr80 gr80Var = (gr80) obj;
        return jl40.l(this.a, gr80Var.a) && jl40.l(this.b, gr80Var.b) && this.c == gr80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.v("OtherItemId(id=", this.a, ", name=", this.b, ", minVisibilitySymbols="));
    }
}
