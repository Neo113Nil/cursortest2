package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m9x0 implements r9x0 {
    public final c0k0 a;
    public final vu0 b;
    public final r9x0 c;

    public m9x0(c0k0 c0k0Var, vu0 vu0Var, r9x0 r9x0Var) {
        this.a = c0k0Var;
        this.b = vu0Var;
        this.c = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9x0)) {
            return false;
        }
        m9x0 m9x0Var = (m9x0) obj;
        return this.a.equals(m9x0Var.a) && jl40.l(this.b, m9x0Var.b) && jl40.l(this.c, m9x0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vu0 vu0Var = this.b;
        int hashCode2 = (hashCode + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31;
        r9x0 r9x0Var = this.c;
        return hashCode2 + (r9x0Var != null ? r9x0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SelectAddressAction(resultPosition=" + this.a + ", addressFlow=" + this.b + ", actionOnSelected=" + this.c + Extension.C_BRAKE;
    }
}
