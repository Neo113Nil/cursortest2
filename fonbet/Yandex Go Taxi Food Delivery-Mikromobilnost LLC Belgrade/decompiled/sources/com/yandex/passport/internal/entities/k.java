package com.yandex.passport.internal.entities;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k {
    public final Uid a;
    public final Uid b;
    public final AccountType c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Set h;

    public k(Uid uid, Uid uid2, AccountType accountType, String str, String str2, String str3, String str4, Set set) {
        this.a = uid;
        this.b = uid2;
        this.c = accountType;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = set;
    }

    public final AccountType a() {
        return this.c;
    }

    public final Set b() {
        return this.h;
    }

    public final Uid c() {
        return this.b;
    }

    public final Uid d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b.equals(kVar.b) && this.c == kVar.c && jl40.l(this.d, kVar.d) && jl40.l(this.e, kVar.e) && jl40.l(this.f, kVar.f) && jl40.l(this.g, kVar.g) && this.h.equals(kVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        return this.h.hashCode() + ((b + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberAccount(uid=");
        sb.append(this.a);
        sb.append(", masterUid=");
        sb.append(this.b);
        sb.append(", accountType=");
        sb.append(this.c);
        sb.append(", displayLogin=");
        sb.append(this.d);
        sb.append(", publicName=");
        sb.append(this.e);
        sb.append(", phoneNumber=");
        sb.append(this.f);
        sb.append(", avatarUrl=");
        sb.append(this.g);
        sb.append(", assignedBadges=");
        return qv10.s(sb, this.h, ')');
    }
}
