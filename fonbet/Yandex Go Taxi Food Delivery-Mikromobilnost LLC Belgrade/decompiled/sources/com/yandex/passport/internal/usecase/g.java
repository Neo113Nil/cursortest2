package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;

/* loaded from: classes2.dex */
public final class g {
    public final Environment a;
    public final long b;

    public g(Environment environment, long j) {
        this.a = environment;
        this.b = j;
    }

    public final Environment a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        return b64.o(sb, this.b, ')');
    }
}
