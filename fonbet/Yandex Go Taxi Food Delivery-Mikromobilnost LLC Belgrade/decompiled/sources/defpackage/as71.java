package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class as71 {
    public static final zo71 Companion = new zo71();
    public final String a;
    public final String b;

    public as71(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, fm71.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as71)) {
            return false;
        }
        as71 as71Var = (as71) obj;
        return jl40.l(this.a, as71Var.a) && jl40.l(this.b, as71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DebugPanelWaterfallCurrency(name=", this.a, ", symbol=", this.b, Extension.C_BRAKE);
    }
}
