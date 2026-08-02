package com.yandex.passport.internal.upgrader;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final ModernAccount b;

    public a(ModernAccount modernAccount, String str) {
        this.a = str;
        this.b = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ModernAccount modernAccount = this.b;
        return hashCode + (modernAccount == null ? 0 : modernAccount.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUpgradeLaunchResult(url=");
        uw51.y(sb, this.a, ", account=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
