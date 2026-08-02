package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes15.dex */
public final class f {
    public static final e d = new e();
    public final Uid a;
    public final List b;
    public final String c;

    public f(Uid uid, List list, String str) {
        this.a = uid;
        this.b = list;
        this.c = str;
    }

    public static f a(f fVar, List list) {
        Uid uid = fVar.a;
        String str = fVar.c;
        fVar.getClass();
        return new f(uid, list, str);
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Uid d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b) && jl40.l(this.c, fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCookieEntity(uid=");
        sb.append(this.a);
        sb.append(", cookies=");
        sb.append(this.b);
        sb.append(", domain=");
        return b64.p(sb, this.c, ')');
    }
}
