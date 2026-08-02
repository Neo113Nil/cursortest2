package com.yandex.passport.data.network.core;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class r {
    public final q a;
    public final String b;
    public final tls c;

    public r(q qVar, String str, tls tlsVar) {
        this.a = qVar;
        this.b = str;
        this.c = tlsVar;
    }

    public final q a() {
        return this.a;
    }

    public final tls b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jl40.l(this.a, rVar.a) && this.b.equals(rVar.b) && this.c.equals(rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(param=" + this.a + ", source=" + this.b + ", request=" + this.c + ')';
    }
}
