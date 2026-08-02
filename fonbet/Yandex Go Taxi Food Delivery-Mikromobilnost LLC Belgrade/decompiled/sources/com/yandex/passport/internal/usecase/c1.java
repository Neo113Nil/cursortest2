package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class c1 {
    public final ModernAccount a;
    public final MasterToken b;
    public final com.yandex.passport.internal.ui.sloth.e c;
    public final Uid d;
    public final RevokePlace e;
    public final boolean f;

    public c1(ModernAccount modernAccount, MasterToken masterToken, com.yandex.passport.internal.ui.sloth.e eVar, Uid uid, RevokePlace revokePlace, boolean z) {
        this.a = modernAccount;
        this.b = masterToken;
        this.c = eVar;
        this.d = uid;
        this.e = revokePlace;
        this.f = z;
    }

    public final ModernAccount a() {
        return this.a;
    }

    public final boolean b() {
        return this.f;
    }

    public final MasterToken c() {
        return this.b;
    }

    public final com.yandex.passport.internal.ui.sloth.e d() {
        return this.c;
    }

    public final RevokePlace e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return jl40.l(this.a, c1Var.a) && jl40.l(this.b, c1Var.b) && jl40.l(this.c, c1Var.c) && jl40.l(this.d, c1Var.d) && this.e == c1Var.e && this.f == c1Var.f;
    }

    public final Uid f() {
        return this.d;
    }

    public final int hashCode() {
        ModernAccount modernAccount = this.a;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + uw51.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((modernAccount == null ? 0 : modernAccount.hashCode()) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(account=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", revokeMode=");
        sb.append(this.c);
        sb.append(", uid=");
        sb.append(this.d);
        sb.append(", revokePlace=");
        sb.append(this.e);
        sb.append(", invalidatePushSubscriptions=");
        return unr0.u(sb, this.f, ')');
    }

    public /* synthetic */ c1(ModernAccount modernAccount, MasterToken masterToken, com.yandex.passport.internal.ui.sloth.e eVar, Uid uid, RevokePlace revokePlace) {
        this(modernAccount, masterToken, eVar, uid, revokePlace, true);
    }
}
