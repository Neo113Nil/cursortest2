package com.yandex.passport.internal;

import com.yandex.passport.common.core.Uid;
import defpackage.oyr;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class v {
    public final Uid a;
    public final String b;
    public final int c;

    static {
        int i = Uid.$stable;
    }

    public v(int i, Uid uid, String str) {
        this.a = uid;
        this.b = str;
        this.c = i;
    }

    public final String a() {
        return this.b;
    }

    public final Uid b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && this.b.equals(vVar.b) && this.c == vVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Revocation(uid=");
        sb.append(this.a);
        sb.append(", masterTokenValue=");
        sb.append(this.b);
        sb.append(", attempts=");
        return oyr.s(sb, this.c, ')');
    }
}
