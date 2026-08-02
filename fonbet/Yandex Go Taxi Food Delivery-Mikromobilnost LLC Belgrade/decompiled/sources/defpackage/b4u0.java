package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b4u0 {
    public final String a;
    public final az6 b;

    public b4u0(String str, az6 az6Var) {
        this.a = str;
        this.b = az6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4u0)) {
            return false;
        }
        b4u0 b4u0Var = (b4u0) obj;
        return jl40.l(this.a, b4u0Var.a) && this.b.equals(b4u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StateButton(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
