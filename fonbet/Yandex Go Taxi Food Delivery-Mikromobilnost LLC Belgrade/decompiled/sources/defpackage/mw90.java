package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mw90 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final edc f;
    public final edc g;
    public final Integer h;
    public final Integer i;

    public mw90(String str, String str2, List list, boolean z, String str3, edc edcVar, edc edcVar2, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = str3;
        this.f = edcVar;
        this.g = edcVar2;
        this.h = num;
        this.i = num2;
    }

    public final kdc a() {
        return this.f;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final Integer d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw90)) {
            return false;
        }
        mw90 mw90Var = (mw90) obj;
        return jl40.l(this.a, mw90Var.a) && jl40.l(this.b, mw90Var.b) && jl40.l(this.c, mw90Var.c) && this.d == mw90Var.d && this.e.equals(mw90Var.e) && this.f.equals(mw90Var.f) && this.g.equals(mw90Var.g) && jl40.l(this.h, mw90Var.h) && jl40.l(this.i, mw90Var.i);
    }

    public final Integer f() {
        return this.i;
    }

    public final List g() {
        return this.c;
    }

    public final kdc h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + unr0.b(unr0.e(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
        Integer num = this.h;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentBadgeItem(id=", this.a, ", paymentType=", this.b, ", subtypes=");
        nzs.p(v, this.c, ", canShowInEdit=", this.d, ", title=");
        v.append(this.e);
        v.append(", backgroundColor=");
        v.append(this.f);
        v.append(", textColor=");
        v.append(this.g);
        v.append(", maxShowCount=");
        v.append(this.h);
        v.append(", showCountResetTime=");
        return oo31.j(v, this.i, Extension.C_BRAKE);
    }
}
