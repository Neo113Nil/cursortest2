package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class haq0 implements b151 {
    public final r9x0 a;
    public final vu0 b;
    public final c0k0 c;
    public final x2s d;

    public haq0(r9x0 r9x0Var, vu0 vu0Var, c0k0 c0k0Var, x2s x2sVar) {
        this.a = r9x0Var;
        this.b = vu0Var;
        this.c = c0k0Var;
        this.d = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haq0)) {
            return false;
        }
        haq0 haq0Var = (haq0) obj;
        return jl40.l(this.a, haq0Var.a) && jl40.l(this.b, haq0Var.b) && this.c.equals(haq0Var.c) && jl40.l(this.d, haq0Var.d);
    }

    public final int hashCode() {
        r9x0 r9x0Var = this.a;
        int hashCode = (r9x0Var == null ? 0 : r9x0Var.hashCode()) * 31;
        vu0 vu0Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31)) * 31;
        x2s x2sVar = this.d;
        return hashCode2 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        return "SelectAddressWidgetAction(action=" + this.a + ", addressFlow=" + this.b + ", resultPosition=" + this.c + ", analyticsData=" + this.d + Extension.C_BRAKE;
    }
}
