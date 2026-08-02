package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c7o0 implements f7o0 {
    public final vj90 a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public c7o0(vj90 vj90Var, boolean z, boolean z2, String str) {
        this.a = vj90Var;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c7o0) {
            c7o0 c7o0Var = (c7o0) obj;
            if (this.a == c7o0Var.a && this.b == c7o0Var.b && this.c == c7o0Var.c && jl40.l(this.d, c7o0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassItemModel(pass=");
        sb.append(this.a);
        sb.append(", selected=");
        sb.append(this.b);
        sb.append(", enabled=");
        return n.m(", surgeIconTag=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
