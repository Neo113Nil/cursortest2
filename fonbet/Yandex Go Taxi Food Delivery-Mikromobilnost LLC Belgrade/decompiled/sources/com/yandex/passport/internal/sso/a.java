package com.yandex.passport.internal.sso;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;

/* loaded from: classes15.dex */
public final class a {
    public static final /* synthetic */ int e = 0;
    public final Uid a;
    public final int b;
    public final AccountAction$LastAction c;
    public final long d;

    static {
        int i = Uid.$stable;
    }

    public a(Uid uid, int i, AccountAction$LastAction accountAction$LastAction, long j) {
        this.a = uid;
        this.b = i;
        this.c = accountAction$LastAction;
        this.d = j;
    }

    public final AccountAction$LastAction a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final Uid d() {
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
        return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountAction(uid=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", lastAction=");
        sb.append(this.c);
        sb.append(", localTimestamp=");
        return b64.o(sb, this.d, ')');
    }
}
