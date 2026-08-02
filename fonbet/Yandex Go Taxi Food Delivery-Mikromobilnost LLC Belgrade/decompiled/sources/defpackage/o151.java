package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o151 {
    public final g0k a;
    public final n151 b;
    public final int c;

    public /* synthetic */ o151(g0k g0kVar, m151 m151Var, int i) {
        this(g0kVar, (i & 2) != 0 ? omy0.c : m151Var, 17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o151)) {
            return false;
        }
        o151 o151Var = (o151) obj;
        return jl40.l(this.a, o151Var.a) && jl40.l(this.b, o151Var.b) && this.c == o151Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetDisplaySettings(displaySettings=");
        sb.append(this.a);
        sb.append(", widthType=");
        sb.append(this.b);
        sb.append(", gravity=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }

    public o151(g0k g0kVar, n151 n151Var, int i) {
        this.a = g0kVar;
        this.b = n151Var;
        this.c = i;
    }
}
