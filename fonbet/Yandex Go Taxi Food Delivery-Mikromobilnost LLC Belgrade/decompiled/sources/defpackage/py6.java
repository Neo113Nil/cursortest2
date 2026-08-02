package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class py6 {
    public final String a;
    public final wyy0 b;
    public final boolean c;

    public py6(String str, wyy0 wyy0Var, boolean z) {
        this.a = str;
        this.b = wyy0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py6)) {
            return false;
        }
        py6 py6Var = (py6) obj;
        return jl40.l(this.a, py6Var.a) && this.b.equals(py6Var.b) && this.c == py6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(text=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", disableAndLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
