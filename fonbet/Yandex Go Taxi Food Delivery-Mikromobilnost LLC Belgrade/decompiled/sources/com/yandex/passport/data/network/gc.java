package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class gc {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final boolean d;

    public gc(com.yandex.passport.data.models.g gVar, String str, String str2, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return this.a.equals(gcVar.a) && jl40.l(this.b, gcVar.b) && this.c.equals(gcVar.c) && this.d == gcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", authBySms=");
        return unr0.u(sb, this.d, ')');
    }
}
