package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ml70 {
    public final String a;
    public final boolean b;
    public final cw7 c;
    public final String d;

    public ml70(String str, boolean z, cw7 cw7Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = cw7Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml70)) {
            return false;
        }
        ml70 ml70Var = (ml70) obj;
        return jl40.l(this.a, ml70Var.a) && this.b == ml70Var.b && this.c.equals(ml70Var.c) && jl40.l(this.d, ml70Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("OrderCancelScreenButtonModel(title=", this.a, ", highlighted=", ", action=", this.b);
        l.append(this.c);
        l.append(", metricaLabel=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
