package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bi20 implements b151 {
    public final c0k0 a;
    public final vu0 b;
    public final x2s c;

    public bi20(c0k0 c0k0Var, vu0 vu0Var, x2s x2sVar) {
        this.a = c0k0Var;
        this.b = vu0Var;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi20)) {
            return false;
        }
        bi20 bi20Var = (bi20) obj;
        return jl40.l(this.a, bi20Var.a) && jl40.l(this.b, bi20Var.b) && this.c.equals(bi20Var.c);
    }

    public final int hashCode() {
        c0k0 c0k0Var = this.a;
        int hashCode = (c0k0Var == null ? 0 : c0k0Var.hashCode()) * 31;
        vu0 vu0Var = this.b;
        return this.c.hashCode() + ((hashCode + (vu0Var != null ? vu0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MiniMapWidgetAction(resultPosition=" + this.a + ", addressFlow=" + this.b + ", analyticsData=" + this.c + Extension.C_BRAKE;
    }
}
