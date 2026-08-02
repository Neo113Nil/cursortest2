package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dqy0 {
    public final String a;
    public final qa6 b;

    public dqy0(String str, qa6 qa6Var) {
        this.a = str;
        this.b = qa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqy0)) {
            return false;
        }
        dqy0 dqy0Var = (dqy0) obj;
        return jl40.l(this.a, dqy0Var.a) && jl40.l(this.b, dqy0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        qa6 qa6Var = this.b;
        return hashCode + (qa6Var != null ? qa6Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextInputStyleModel(backgroundColor=" + this.a + ", border=" + this.b + Extension.C_BRAKE;
    }
}
