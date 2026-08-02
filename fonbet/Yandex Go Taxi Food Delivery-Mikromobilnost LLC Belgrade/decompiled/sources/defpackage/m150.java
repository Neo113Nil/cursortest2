package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m150 {
    public final h3t0 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public m150(h3t0 h3t0Var, String str, String str2, String str3, boolean z) {
        this.a = h3t0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m150)) {
            return false;
        }
        m150 m150Var = (m150) obj;
        return jl40.l(this.a, m150Var.a) && jl40.l(this.b, m150Var.b) && jl40.l(this.c, m150Var.c) && jl40.l(this.d, m150Var.d) && this.e == m150Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Name(point=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", colorKey=");
        g8e.D(sb, this.c, ", avatarUrl=", this.d, ", needSquareAvatar=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
