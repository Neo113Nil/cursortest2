package defpackage;

import java.math.BigDecimal;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class il8 {
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final String e;
    public final List f;
    public final boolean g;

    public il8(String str, String str2, String str3, BigDecimal bigDecimal, String str4, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
        this.e = str4;
        this.f = list;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il8)) {
            return false;
        }
        il8 il8Var = (il8) obj;
        return jl40.l(this.a, il8Var.a) && jl40.l(this.b, il8Var.b) && jl40.l(this.c, il8Var.c) && jl40.l(this.d, il8Var.d) && jl40.l(this.e, il8Var.e) && this.f.equals(il8Var.f) && this.g == il8Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        BigDecimal bigDecimal = this.d;
        return Boolean.hashCode(this.g) + unr0.c(unr0.b((b + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardPeriodLimitEntity(settingKey=", this.a, ", periodTitle=", this.b, ", inputTitle=");
        v.append(this.c);
        v.append(", defaultValue=");
        v.append(this.d);
        v.append(", currency=");
        tse0.x(this.e, ", limitHints=", ", selected=", v, this.f);
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
