package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m101 {
    public final xss0 a;
    public final wqs0 b;
    public final kdc c;
    public final int d;

    public m101(xss0 xss0Var, wqs0 wqs0Var, kdc kdcVar, int i) {
        this.a = xss0Var;
        this.b = wqs0Var;
        this.c = kdcVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m101)) {
            return false;
        }
        m101 m101Var = (m101) obj;
        return jl40.l(this.a, m101Var.a) && this.b.equals(m101Var.b) && this.c.equals(m101Var.c) && this.d == m101Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + smw0.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Button(slot=" + this.a + ", properties=" + this.b + ", backgroundColor=" + this.c + ", height=" + this.d + Extension.C_BRAKE;
    }
}
