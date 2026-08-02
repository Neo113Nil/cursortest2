package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g0s0 {
    public final n351 a;
    public final uo5 b;

    public g0s0(n351 n351Var, uo5 uo5Var) {
        this.a = n351Var;
        this.b = uo5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0s0)) {
            return false;
        }
        g0s0 g0s0Var = (g0s0) obj;
        return this.a.equals(g0s0Var.a) && this.b.equals(g0s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShortcutLayerUiModel(widget=" + this.a + ", verticalAlignment=" + this.b + Extension.C_BRAKE;
    }
}
