package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class e7q0 {
    public final h7q0 a;
    public final h7q0 b;

    public e7q0(h7q0 h7q0Var, h7q0 h7q0Var2) {
        this.a = h7q0Var;
        this.b = h7q0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e7q0.class == obj.getClass()) {
            e7q0 e7q0Var = (e7q0) obj;
            if (this.a.equals(e7q0Var.a) && this.b.equals(e7q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        h7q0 h7q0Var = this.a;
        sb.append(h7q0Var);
        h7q0 h7q0Var2 = this.b;
        if (h7q0Var.equals(h7q0Var2)) {
            str = "";
        } else {
            str = Extension.FIX_SPACE + h7q0Var2;
        }
        return oyr.t(sb, str, "]");
    }
}
