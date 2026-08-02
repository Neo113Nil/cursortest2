package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class in21 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Long l;
    public final String m;
    public final boolean n;
    public final boolean o;

    public in21(String str, String str2, String str3, String str4, String str5, Long l, String str6, boolean z, boolean z2, boolean z3, boolean z4, Long l2, String str7, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = l2;
        this.m = str7;
        this.n = z5;
        this.o = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in21)) {
            return false;
        }
        in21 in21Var = (in21) obj;
        return jl40.l(this.a, in21Var.a) && jl40.l(this.b, in21Var.b) && jl40.l(this.c, in21Var.c) && jl40.l(this.d, in21Var.d) && jl40.l(this.e, in21Var.e) && jl40.l(this.f, in21Var.f) && jl40.l(this.g, in21Var.g) && this.h == in21Var.h && this.i == in21Var.i && this.j == in21Var.j && this.k == in21Var.k && jl40.l(this.l, in21Var.l) && jl40.l(this.m, in21Var.m) && this.n == in21Var.n && this.o == in21Var.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.g;
        int e = unr0.e(unr0.e(unr0.e(unr0.e((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Long l2 = this.l;
        int hashCode5 = (e + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.m;
        return Boolean.hashCode(this.o) + unr0.e((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("UserInfo(shownName=", this.a, ", avatarUrl=", this.b, ", guid=");
        g8e.D(v, this.c, ", nickname=", this.d, ", phoneId=");
        v.append(this.e);
        v.append(", contactId=");
        v.append(this.f);
        v.append(", lookupId=");
        tse0.y(this.g, ", isRobot=", ", cannotBeBlocked=", v, this.h);
        nnm.v(", isSupportBot=", ", disablePrivates=", v, this.i, this.j);
        v.append(this.k);
        v.append(", version=");
        v.append(this.l);
        v.append(", displayName=");
        tse0.y(this.m, ", deleted=", ", isFake=", v, this.n);
        return x4e.i(v, this.o, Extension.C_BRAKE);
    }
}
