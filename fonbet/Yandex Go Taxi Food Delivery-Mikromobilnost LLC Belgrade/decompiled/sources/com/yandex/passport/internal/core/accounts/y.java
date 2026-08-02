package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class y {
    public final a0 a;
    public final boolean b;
    public final boolean c;
    public final RevokePlace d;
    public final boolean e;

    public y(a0 a0Var, boolean z, boolean z2, RevokePlace revokePlace, boolean z3) {
        this.a = a0Var;
        this.b = z;
        this.c = z2;
        this.d = revokePlace;
        this.e = z3;
    }

    public final a0 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final RevokePlace d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return jl40.l(this.a, yVar.a) && this.b == yVar.b && this.c == yVar.c && this.d == yVar.d && this.e == yVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(accountSpec=");
        sb.append(this.a);
        sb.append(", ssoAnnouncingRequired=");
        sb.append(this.b);
        sb.append(", shouldRevokeToken=");
        sb.append(this.c);
        sb.append(", revokePlace=");
        sb.append(this.d);
        sb.append(", isRemoveAccountExplicitly=");
        return unr0.u(sb, this.e, ')');
    }
}
