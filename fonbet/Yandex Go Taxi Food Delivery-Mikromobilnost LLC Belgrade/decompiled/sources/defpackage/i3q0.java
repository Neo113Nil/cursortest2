package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i3q0 implements h3q0 {
    public final xts0 a;
    public final String b;
    public final String c;

    public i3q0(xts0 xts0Var, String str, String str2) {
        this.a = xts0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3q0)) {
            return false;
        }
        i3q0 i3q0Var = (i3q0) obj;
        return this.a.equals(i3q0Var.a) && jl40.l(this.b, i3q0Var.b) && jl40.l(this.c, i3q0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionPromoModelImpl(slot=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
