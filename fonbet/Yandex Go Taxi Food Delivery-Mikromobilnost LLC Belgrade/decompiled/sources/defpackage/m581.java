package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class m581 {
    public final String a;
    public final vn61 b;

    public m581(String str, vn61 vn61Var) {
        this.a = str;
        this.b = vn61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m581)) {
            return false;
        }
        m581 m581Var = (m581) obj;
        return jl40.l(this.a, m581Var.a) && this.b.equals(m581Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.a + ", size=" + this.b + Extension.C_BRAKE;
    }
}
