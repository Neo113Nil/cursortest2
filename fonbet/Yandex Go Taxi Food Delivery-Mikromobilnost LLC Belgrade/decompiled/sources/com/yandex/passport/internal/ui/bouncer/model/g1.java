package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g1 {
    public final LoginProperties a;
    public final List b;
    public final Map c;
    public final ModernAccount d;
    public final ModernAccount e;
    public final boolean f;

    public g1(LoginProperties loginProperties, List list, Map map, ModernAccount modernAccount, ModernAccount modernAccount2, boolean z) {
        this.a = loginProperties;
        this.b = list;
        this.c = map;
        this.d = modernAccount;
        this.e = modernAccount2;
        this.f = z;
    }

    public static g1 a(g1 g1Var, LoginProperties loginProperties, List list, int i) {
        if ((i & 1) != 0) {
            loginProperties = g1Var.a;
        }
        LoginProperties loginProperties2 = loginProperties;
        if ((i & 2) != 0) {
            list = g1Var.b;
        }
        Map map = g1Var.c;
        ModernAccount modernAccount = g1Var.d;
        ModernAccount modernAccount2 = g1Var.e;
        boolean z = g1Var.f;
        g1Var.getClass();
        return new g1(loginProperties2, list, map, modernAccount, modernAccount2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.a.equals(g1Var.a) && jl40.l(this.b, g1Var.b) && jl40.l(this.c, g1Var.c) && jl40.l(this.d, g1Var.d) && jl40.l(this.e, g1Var.e) && this.f == g1Var.f;
    }

    public final int hashCode() {
        int d = unr0.d(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ModernAccount modernAccount = this.d;
        int hashCode = (d + (modernAccount == null ? 0 : modernAccount.hashCode())) * 31;
        ModernAccount modernAccount2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (modernAccount2 != null ? modernAccount2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BouncerParameters(loginProperties=");
        sb.append(this.a);
        sb.append(", accounts=");
        sb.append(this.b);
        sb.append(", childInfoAccount=");
        sb.append(this.c);
        sb.append(", selectedAccount=");
        sb.append(this.d);
        sb.append(", bindPhoneAccount=");
        sb.append(this.e);
        sb.append(", isRelogin=");
        return unr0.u(sb, this.f, ')');
    }
}
