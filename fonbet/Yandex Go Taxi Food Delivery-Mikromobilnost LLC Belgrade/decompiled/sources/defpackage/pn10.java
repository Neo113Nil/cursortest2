package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pn10 implements rn10 {
    public final String a;
    public final fv11 b;
    public final qv11 c;

    public pn10(String str, fv11 fv11Var, qv11 qv11Var) {
        this.a = str;
        this.b = fv11Var;
        this.c = qv11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn10)) {
            return false;
        }
        pn10 pn10Var = (pn10) obj;
        return jl40.l(this.a, pn10Var.a) && jl40.l(this.b, pn10Var.b) && jl40.l(this.c, pn10Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "Content(cardAccessibilityText=" + this.a + ", headerState=" + this.b + ", progressBarState=" + this.c + Extension.C_BRAKE;
    }
}
