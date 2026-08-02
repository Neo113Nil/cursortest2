package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class t0 implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final com.yandex.passport.data.models.g b;
    public final long c;
    public final String d;
    public final long e;

    public t0(MasterToken masterToken, com.yandex.passport.data.models.g gVar, long j, String str, long j2) {
        this.a = masterToken;
        this.b = gVar;
        this.c = j;
        this.d = str;
        this.e = j2;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final long b() {
        return this.e;
    }

    public final com.yandex.passport.data.models.g c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a.equals(t0Var.a) && this.b.equals(t0Var.b) && this.c == t0Var.c && this.d.equals(t0Var.d) && com.yandex.passport.common.time.a.e(this.e, t0Var.e);
    }

    public final MasterToken f() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + unr0.b(qv10.c(oyr.b(this.b.a, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "Params(masterToken=" + this.a + ", environment=" + this.b + ", locationId=" + this.c + ", locale=" + this.d + ", completionPostponedAt=" + ((Object) com.yandex.passport.common.time.a.f(this.e)) + ')';
    }
}
