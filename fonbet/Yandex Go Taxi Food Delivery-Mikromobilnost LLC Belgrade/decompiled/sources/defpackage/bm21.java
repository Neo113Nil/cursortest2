package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bm21 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final Long h;
    public final Long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public bm21(String str, String str2, String str3, String str4, Long l, String str5, String str6, Long l2, Long l3, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = str5;
        this.g = str6;
        this.h = l2;
        this.i = l3;
        this.j = str7;
        this.k = str8;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm21)) {
            return false;
        }
        bm21 bm21Var = (bm21) obj;
        return jl40.l(this.a, bm21Var.a) && this.b.equals(bm21Var.b) && this.c.equals(bm21Var.c) && jl40.l(this.d, bm21Var.d) && jl40.l(this.e, bm21Var.e) && jl40.l(this.f, bm21Var.f) && jl40.l(this.g, bm21Var.g) && this.h.equals(bm21Var.h) && this.i.equals(bm21Var.i) && jl40.l(this.j, bm21Var.j) && this.k.equals(bm21Var.k) && this.l == bm21Var.l && this.m == bm21Var.m && this.n == bm21Var.n && this.o == bm21Var.o && this.p == bm21Var.p && this.q == bm21Var.q && this.r == bm21Var.r;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int b2 = unr0.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((b2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.j;
        return Boolean.hashCode(this.r) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 29791, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder v = b64.v("UserEntity(userId=", this.a, ", displayName=", this.b, ", avatarUrl=");
        g8e.D(v, this.c, ", website=", this.d, ", averageResponseTime=");
        v.append(this.e);
        v.append(", shownName=");
        v.append(this.f);
        v.append(", nickname=");
        v.append(this.g);
        v.append(", userReducedVersion=");
        v.append(this.h);
        v.append(", version=");
        v.append(this.i);
        v.append(", phoneId=");
        v.append(this.j);
        v.append(", contactId=null, lookupId=null, userSearchKey=");
        tse0.y(this.k, ", robot=", ", cannotBeBlocked=", v, this.l);
        nnm.v(", isSupportBot=", ", isContact=", v, this.m, this.n);
        nnm.v(", disablePrivates=", ", deleted=", v, this.o, this.p);
        return smw0.k(", isFake=", Extension.C_BRAKE, v, this.q, this.r);
    }
}
