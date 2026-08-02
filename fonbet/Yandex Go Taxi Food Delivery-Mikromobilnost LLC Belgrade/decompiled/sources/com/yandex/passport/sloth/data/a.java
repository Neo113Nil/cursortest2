package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class a {
    public final Environment a;
    public final String b;
    public final String c;

    public a(Environment environment, String str, String str2) {
        this.a = environment;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && jl40.l(this.b, aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothCookie(environment=");
        sb.append(this.a);
        sb.append(", returnUrl=");
        sb.append(this.b);
        sb.append(", cookies=");
        return b64.p(sb, this.c, ')');
    }
}
