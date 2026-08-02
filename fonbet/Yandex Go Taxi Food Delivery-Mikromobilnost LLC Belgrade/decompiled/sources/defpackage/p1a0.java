package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p1a0 {
    public final String a;
    public final String b;
    public final List c;

    public p1a0(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final List a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1a0)) {
            return false;
        }
        p1a0 p1a0Var = (p1a0) obj;
        return jl40.l(this.a, p1a0Var.a) && jl40.l(this.b, p1a0Var.b) && jl40.l(this.c, p1a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.s(b64.v("PaymentInfo(type=", this.a, ", id=", this.b, ", complements="), this.c, Extension.C_BRAKE);
    }
}
