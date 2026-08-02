package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cg0 {
    public final String a;
    public final String b;
    public final String c;
    public final edc d;
    public final edc e;
    public final Integer f;
    public final Integer g;

    public cg0(String str, String str2, String str3, edc edcVar, edc edcVar2, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = edcVar;
        this.e = edcVar2;
        this.f = num;
        this.g = num2;
    }

    public final kdc a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final Integer c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final Integer e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg0)) {
            return false;
        }
        cg0 cg0Var = (cg0) obj;
        return jl40.l(this.a, cg0Var.a) && jl40.l(this.b, cg0Var.b) && this.c.equals(cg0Var.c) && this.d.equals(cg0Var.d) && this.e.equals(cg0Var.e) && jl40.l(this.f, cg0Var.f) && jl40.l(this.g, cg0Var.g);
    }

    public final kdc f() {
        return this.e;
    }

    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        Integer num = this.f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddPaymentBadgeItem(id=", this.a, ", paymentType=", this.b, ", title=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(", textColor=");
        v.append(this.e);
        v.append(", maxShowCount=");
        v.append(this.f);
        v.append(", showCountResetTime=");
        return oo31.j(v, this.g, Extension.C_BRAKE);
    }
}
