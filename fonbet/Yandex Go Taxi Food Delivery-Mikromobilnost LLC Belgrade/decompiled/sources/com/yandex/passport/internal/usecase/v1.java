package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class v1 {
    public final Uid a;
    public final Uid b;
    public final com.yandex.passport.internal.b c;

    public v1(Uid uid, Uid uid2, com.yandex.passport.internal.b bVar) {
        this.a = uid;
        this.b = uid2;
        this.c = bVar;
    }

    public final com.yandex.passport.internal.b a() {
        return this.c;
    }

    public final Uid b() {
        return this.b;
    }

    public final Uid c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return jl40.l(this.a, v1Var.a) && this.b.equals(v1Var.b) && jl40.l(this.c, v1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UpdateMasterTokenParams(uid=" + this.a + ", masterUid=" + this.b + ", accountSnapshot=" + this.c + ')';
    }
}
