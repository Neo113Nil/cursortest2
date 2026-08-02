package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hzt0 implements sj01 {
    public final gzt0 a;
    public final px11 b;

    public hzt0(gzt0 gzt0Var, px11 px11Var) {
        this.a = gzt0Var;
        this.b = px11Var;
    }

    public final gzt0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzt0)) {
            return false;
        }
        hzt0 hzt0Var = (hzt0) obj;
        return this.a.equals(hzt0Var.a) && jl40.l(this.b, hzt0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        px11 px11Var = this.b;
        return hashCode + (px11Var == null ? 0 : px11Var.hashCode());
    }

    public final String toString() {
        return "StadiumButtonViewItem(state=" + this.a + ", widgetState=" + this.b + Extension.C_BRAKE;
    }
}
