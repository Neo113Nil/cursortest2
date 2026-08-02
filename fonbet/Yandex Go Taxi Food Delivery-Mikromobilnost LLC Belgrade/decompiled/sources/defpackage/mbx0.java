package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class mbx0 implements nbx0 {
    public final boolean a;
    public final tls b;
    public final tls c;
    public final boolean w;

    public mbx0(boolean z, tls tlsVar, lzu0 lzu0Var, boolean z2, int i) {
        lzu0Var = (i & 4) != 0 ? null : lzu0Var;
        z2 = (i & 8) != 0 ? true : z2;
        this.a = z;
        this.b = tlsVar;
        this.c = lzu0Var;
        this.w = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbx0)) {
            return false;
        }
        mbx0 mbx0Var = (mbx0) obj;
        return this.a == mbx0Var.a && this.b.equals(mbx0Var.b) && jl40.l(this.c, mbx0Var.c) && this.w == mbx0Var.w;
    }

    public final int hashCode() {
        int a = ly3.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        tls tlsVar = this.c;
        return Boolean.hashCode(this.w) + ((a + (tlsVar == null ? 0 : tlsVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Switch(switched=" + this.a + ", checkedChangeAction=" + this.b + ", checkedTextProvider=" + this.c + ", isEnabled=" + this.w + Extension.C_BRAKE;
    }
}
