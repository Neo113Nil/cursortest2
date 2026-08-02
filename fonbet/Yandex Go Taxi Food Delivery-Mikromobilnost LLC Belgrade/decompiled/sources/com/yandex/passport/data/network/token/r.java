package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes15.dex */
public final class r implements com.yandex.passport.data.models.p {
    public static final q Companion = new q();
    public final String a;
    public final String b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // com.yandex.passport.data.models.p
    public final String a() {
        return this.b;
    }

    public final String b() {
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
        return jl40.l(this.a, rVar.a) && jl40.l(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", accessToken=");
        return b64.p(sb, this.b, ')');
    }
}
