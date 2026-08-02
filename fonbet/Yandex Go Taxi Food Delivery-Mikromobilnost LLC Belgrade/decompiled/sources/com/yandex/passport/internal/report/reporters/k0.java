package com.yandex.passport.internal.report.reporters;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public final class k0 {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Set i;

    public k0(String str, String str2, String str3, Long l, boolean z, boolean z2, boolean z3, boolean z4, Set set) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = set;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return jl40.l(this.a, k0Var.a) && jl40.l(this.b, k0Var.b) && jl40.l(this.c, k0Var.c) && jl40.l(this.d, k0Var.d) && this.e == k0Var.e && this.f == k0Var.f && this.g == k0Var.g && this.h == k0Var.h && jl40.l(this.i, k0Var.i);
    }

    public final Long f() {
        return this.d;
    }

    public final Set g() {
        return this.i;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        return this.i.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e((hashCode3 + (l != null ? l.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String i() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Account(uid=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", locationId=");
        sb.append(this.d);
        sb.append(", hasUserInfo=");
        sb.append(this.e);
        sb.append(", hasStash=");
        sb.append(this.f);
        sb.append(", hasToken=");
        sb.append(this.g);
        sb.append(", hasTombstone=");
        sb.append(this.h);
        sb.append(", stashKeys=");
        return qv10.s(sb, this.i, ')');
    }

    public /* synthetic */ k0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this(str, null, null, null, z, z2, z3, z4, EmptySet.a);
    }
}
