package com.yandex.passport.internal.sloth;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class a {
    public final int a;
    public final boolean b;
    public final BaseTransport c;
    public final Long d;

    public a(int i, boolean z, BaseTransport baseTransport, Long l) {
        this.a = i;
        this.b = z;
        this.c = baseTransport;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && jl40.l(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Long l = this.d;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionSnapshot(code=");
        sb.append(this.a);
        sb.append(", isVpn=");
        sb.append(this.b);
        sb.append(", baseTransport=");
        sb.append(this.c);
        sb.append(", networkHandle=");
        return qv10.q(sb, this.d, ')');
    }
}
