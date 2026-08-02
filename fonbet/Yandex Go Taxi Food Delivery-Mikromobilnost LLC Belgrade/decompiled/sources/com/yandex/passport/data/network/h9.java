package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class h9 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final MasterToken d;

    public h9(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = masterToken;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.d.getValue();
    }

    public final com.yandex.passport.data.models.g b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final MasterToken d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return this.a.equals(h9Var.a) && this.b == h9Var.b && jl40.l(this.c, h9Var.c) && jl40.l(this.d, h9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", locationId=" + this.b + ", processTag=" + this.c + ", masterToken=" + this.d + ')';
    }
}
