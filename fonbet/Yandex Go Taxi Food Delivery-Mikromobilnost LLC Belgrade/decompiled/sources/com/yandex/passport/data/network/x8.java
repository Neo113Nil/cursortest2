package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class x8 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;

    public x8(com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final com.yandex.passport.data.models.g b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return this.a.equals(x8Var.a) && jl40.l(this.b, x8Var.b) && jl40.l(this.c, x8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", crsfToken=");
        return b64.p(sb, this.c, ')');
    }
}
