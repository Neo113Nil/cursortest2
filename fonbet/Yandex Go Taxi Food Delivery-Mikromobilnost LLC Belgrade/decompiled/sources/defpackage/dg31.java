package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dg31 {
    public final v0f0 a;
    public final v0f0 b;

    public dg31(v0f0 v0f0Var, v0f0 v0f0Var2) {
        this.a = v0f0Var;
        this.b = v0f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg31)) {
            return false;
        }
        dg31 dg31Var = (dg31) obj;
        return this.a.equals(dg31Var.a) && this.b.equals(dg31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VerticalSelectorPriceUi(selector=" + this.a + ", selectorSelected=" + this.b + Extension.C_BRAKE;
    }
}
