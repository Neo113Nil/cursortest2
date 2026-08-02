package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class o181 {
    public static final dy71 Companion = new dy71();
    public final String a;
    public final String b;

    public o181(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ev71.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o181)) {
            return false;
        }
        o181 o181Var = (o181) obj;
        return jl40.l(this.a, o181Var.a) && jl40.l(this.b, o181Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DebugPanelWaterfallParameter(name=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
