package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class be {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;

    public be(com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return this.a.equals(beVar.a) && this.b.equals(beVar.b) && jl40.l(this.c, beVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.c, ')');
    }
}
