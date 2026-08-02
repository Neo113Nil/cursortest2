package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e360 {
    public final gia1 a;
    public final int b;
    public final int c;
    public final Double d;
    public final String e;

    public e360(gia1 gia1Var, int i, int i2, Double d, String str) {
        this.a = gia1Var;
        this.b = i;
        this.c = i2;
        this.d = d;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e360)) {
            return false;
        }
        e360 e360Var = (e360) obj;
        return this.a.equals(e360Var.a) && this.b == e360Var.b && this.c == e360Var.c && this.d.equals(e360Var.d) && jl40.l(this.e, e360Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroPostcardImage(reference=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", dimAmount=");
        sb.append(this.d);
        sb.append(", dimColor=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
