package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class jhg0 {
    public final ihg0 a;
    public final String b;

    public jhg0(ihg0 ihg0Var, String str) {
        this.a = ihg0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhg0)) {
            return false;
        }
        jhg0 jhg0Var = (jhg0) obj;
        return this.a.equals(jhg0Var.a) && jl40.l(this.b, jhg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InternalClientError(reason=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }
}
