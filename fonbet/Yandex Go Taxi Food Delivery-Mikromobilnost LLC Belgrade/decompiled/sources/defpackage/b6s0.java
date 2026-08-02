package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b6s0 implements uni {
    public final String a;
    public final fo b;

    public b6s0(String str, fo foVar) {
        this.a = str;
        this.b = foVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6s0)) {
            return false;
        }
        b6s0 b6s0Var = (b6s0) obj;
        return jl40.l(this.a, b6s0Var.a) && this.b.equals(b6s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowContentArgs(deliveryId=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
