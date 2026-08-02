package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes15.dex */
public final class p0 implements com.yandex.passport.data.models.p {
    public static final o0 Companion = new o0();
    public final kotlinx.serialization.json.c a;
    public final String b;

    public /* synthetic */ p0(int i, String str, kotlinx.serialization.json.c cVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, n0.a.getDescriptor());
            throw null;
        }
        this.a = cVar;
        this.b = str;
    }

    @Override // com.yandex.passport.data.models.p
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return jl40.l(this.a, p0Var.a) && jl40.l(this.b, p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", accessToken=");
        return b64.p(sb, this.b, ')');
    }
}
