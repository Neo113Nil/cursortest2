package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eh70 {
    public final String a;
    public final boolean b;

    public eh70(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh70)) {
            return false;
        }
        eh70 eh70Var = (eh70) obj;
        return jl40.l(this.a, eh70Var.a) && this.b == eh70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Order(orderId=", this.a, ", shouldStayOnDetails=", this.b, Extension.C_BRAKE);
    }
}
