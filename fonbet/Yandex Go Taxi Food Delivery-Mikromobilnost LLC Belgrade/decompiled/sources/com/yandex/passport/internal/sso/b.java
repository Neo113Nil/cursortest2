package com.yandex.passport.internal.sso;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.AccountRow;
import defpackage.j73;
import defpackage.jl40;
import java.util.Set;

/* loaded from: classes15.dex */
public final class b {
    public static final Set c;
    public final a a;
    public final AccountRow b;

    static {
        int i = Uid.$stable;
        c = j73.f0(new String[]{"name", "uid", "user-info-body"});
    }

    public b(a aVar, AccountRow accountRow) {
        this.a = aVar;
        this.b = accountRow;
    }

    public final a a() {
        return this.a;
    }

    public final AccountRow b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AccountRow accountRow = this.b;
        return hashCode + (accountRow == null ? 0 : accountRow.hashCode());
    }

    public final String toString() {
        return "SsoAccount(accountAction=" + this.a + ", accountRow=" + this.b + ')';
    }
}
