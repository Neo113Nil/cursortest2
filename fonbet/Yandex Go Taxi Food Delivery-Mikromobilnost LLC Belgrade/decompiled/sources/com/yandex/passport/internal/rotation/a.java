package com.yandex.passport.internal.rotation;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class a {
    public final ModernAccount a;
    public final MasterToken b;
    public final Environment c;
    public final long d;
    public final String e;
    public final Uid f;

    public a(ModernAccount modernAccount, MasterToken masterToken, Environment environment, long j, String str, Uid uid) {
        this.a = modernAccount;
        this.b = masterToken;
        this.c = environment;
        this.d = j;
        this.e = str;
        this.f = uid;
    }

    public final MasterToken a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final Environment c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final ModernAccount e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e) && this.f.equals(aVar.f);
    }

    public final Uid f() {
        return this.f;
    }

    public final int hashCode() {
        ModernAccount modernAccount = this.a;
        return this.f.hashCode() + unr0.b(qv10.c((this.c.hashCode() + ((this.b.hashCode() + ((modernAccount == null ? 0 : modernAccount.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(modernAccount=");
        sb.append(this.a);
        sb.append(", badMasterToken=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", locationId=");
        sb.append(this.d);
        sb.append(", clientId=");
        sb.append(this.e);
        sb.append(", uid=");
        return uw51.j(sb, this.f, ')');
    }
}
