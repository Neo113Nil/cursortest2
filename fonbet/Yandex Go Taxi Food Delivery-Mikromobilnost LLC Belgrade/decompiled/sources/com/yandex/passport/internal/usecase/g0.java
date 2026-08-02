package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class g0 {
    public final ModernAccount a;
    public final ClientCredentials b;
    public final boolean c;

    public /* synthetic */ g0(ModernAccount modernAccount, ClientCredentials clientCredentials, int i) {
        this(modernAccount, (i & 2) != 0 ? null : clientCredentials, false);
    }

    public final ModernAccount a() {
        return this.a;
    }

    public final ClientCredentials b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return jl40.l(this.a, g0Var.a) && jl40.l(this.b, g0Var.b) && this.c == g0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ClientCredentials clientCredentials = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (clientCredentials == null ? 0 : clientCredentials.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(account=");
        sb.append(this.a);
        sb.append(", clientCredentials=");
        sb.append(this.b);
        sb.append(", forceNew=");
        return unr0.u(sb, this.c, ')');
    }

    public g0(ModernAccount modernAccount, ClientCredentials clientCredentials, boolean z) {
        this.a = modernAccount;
        this.b = clientCredentials;
        this.c = z;
    }
}
