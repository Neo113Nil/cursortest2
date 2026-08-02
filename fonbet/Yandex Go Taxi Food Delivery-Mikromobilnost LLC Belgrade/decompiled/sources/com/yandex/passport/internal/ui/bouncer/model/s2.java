package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.entities.AccountType;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;
import java.util.List;

/* loaded from: classes2.dex */
public final class s2 extends t2 {
    public final Uid a;
    public final Uid b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final AccountType g;
    public final boolean h;
    public final List i;

    public s2(Uid uid, Uid uid2, String str, String str2, String str3, String str4, AccountType accountType, boolean z, List list) {
        this.a = uid;
        this.b = uid2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = accountType;
        this.h = z;
        this.i = list;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.t2
    public final Uid a() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.t2
    public final Uid b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return this.a.equals(s2Var.a) && this.b.equals(s2Var.b) && jl40.l(this.c, s2Var.c) && jl40.l(this.d, s2Var.d) && jl40.l(this.e, s2Var.e) && jl40.l(this.f, s2Var.f) && this.g == s2Var.g && this.h == s2Var.h && this.i.equals(s2Var.i);
    }

    public final int hashCode() {
        int a = uw51.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        return this.i.hashCode() + unr0.e((this.g.hashCode() + ((b + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberAccount(uid=");
        sb.append(this.a);
        sb.append(", masterUid=");
        sb.append(this.b);
        sb.append(", displayLogin=");
        sb.append(this.c);
        sb.append(", publicName=");
        sb.append(this.d);
        sb.append(", phoneNumber=");
        sb.append(this.e);
        sb.append(", avatarUrl=");
        sb.append(this.f);
        sb.append(", accountType=");
        sb.append(this.g);
        sb.append(", hasPlus=");
        sb.append(this.h);
        sb.append(", badges=");
        return unr0.t(sb, this.i, ')');
    }
}
