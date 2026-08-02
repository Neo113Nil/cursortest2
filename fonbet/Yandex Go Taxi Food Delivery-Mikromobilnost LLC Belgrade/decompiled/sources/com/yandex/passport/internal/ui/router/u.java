package com.yandex.passport.internal.ui.router;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class u implements v {
    public final LoginProperties a;
    public final ModernAccount b;

    public u(LoginProperties loginProperties, ModernAccount modernAccount) {
        this.a = loginProperties;
        this.b = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return jl40.l(this.a, uVar.a) && jl40.l(this.b, uVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ModernAccount modernAccount = this.b;
        return hashCode + (modernAccount == null ? 0 : modernAccount.hashCode());
    }

    public final String toString() {
        return "MailGimap(loginProperties=" + this.a + ", selectedAccount=" + this.b + ')';
    }
}
